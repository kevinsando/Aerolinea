Drop Table VUELOS;
Drop Table AVIONES;
Drop Table HORARIOS;
Drop Table USUARIOS;
Drop Table RUTAS;
Drop Table TIPO_AVIONES;
Drop Table TIQUETES;

CREATE TABLE TIPO_AVIONES(
identificador varchar2(20) not null,
ano varchar2(10),
modelo varchar2(20),
marca varchar2(20),
filas numeric(10),
asientosFilas numeric(10),
pasajeros numeric(20),
PRIMARY KEY (identificador));
show errors;

CREATE TABLE RUTAS(
IdRuta varchar2(50) not null,
origen varchar2(50),
destino varchar2(50),
duracionH numeric(20),
duracionM numeric(20),
PRIMARY KEY (IdRuta));
 
CREATE TABLE HORARIOS(
idHorario varchar2(20) not null,
diaSemana varchar2(20),
hora numeric(20),
minutos numeric(20),
horaLlegada numeric(20),
minutosLlegada numeric(20),
precio numeric(20),
descuento numeric(10),
IdRuta varchar2(50) not null,
PRIMARY KEY (idHorario),
FOREIGN KEY (IdRuta)
REFERENCES rutas(IdRuta));
show errors;

CREATE TABLE AVIONES(
identificadorAv varchar2(20) not null,
idHorario varchar2(20) not null,
IdRuta varchar2(50) not null,
identificador varchar2(20) not null,
PRIMARY KEY (identificadorAv),
FOREIGN KEY (idHorario) REFERENCES horarios(idHorario),
FOREIGN KEY (IdRuta) REFERENCES rutas(IdRuta),
FOREIGN KEY (identificador) REFERENCES tipo_aviones(identificador)
);
CREATE TABLE TIQUETES(
idTiquete varchar2(20) not null,
idVuelo varchar2(20) not null,
nomUsuario varchar2(20) not null,
asiento varchar2(10) not null,
PRIMARY KEY (idTiquete),
FOREIGN KEY(idVuelo) REFERENCES VUELOS(codigo),
FOREIGN KEY(nomUsuario) REFERENCES USUARIOS(usuario));

 CREATE TABLE VUELOS(
 codigo varchar2(50)not null,
  tipo numeric(2)not null,
 identificadorAvIda varchar2(20) not null,
 identificadorAvRegreso varchar(20),
 idHorario varchar2(20),
PRIMARY KEY (codigo),
FOREIGN KEY (identificadorAvIda) REFERENCES aviones(identificadorAv),
FOREIGN KEY (identificadorAvRegreso) REFERENCES aviones(identificadorAv),
FOREIGN KEY (idHorario) REFERENCES horarios(idHorario)
 );

CREATE TABLE USUARIOS(
usuario varchar2(50),
contrasena varchar2(16),
nombre varchar2(50),
apellidos varchar2(50),
correo varchar2(50),
fechaNac varchar2(30),
direccion varchar2(50),
telefonoTrab numeric(20),
celular numeric(20),
PRIMARY KEY (usuario));

  CREATE OR REPLACE PACKAGE types 
AS
    TYPE ref_cursor IS REF CURSOR;
    END;
  /
  --------------------TIQUETES----------------------
  CREATE OR REPLACE PROCEDURE insertarTiquete(idT IN TIQUETES.idTiquete%TYPE,
  idV IN TIQUETES.idVuelo%TYPE,
  nom IN TIQUETES.nomUsuario%TYPE,
  asi IN TIQUETES.asiento%TYPE)
  AS
  BEGIN
  INSERT INTO TIQUETES VALUES(idT,idV,nom,asi);
  END;
  /
  CREATE OR REPLACE PROCEDURE modificarTiquete(idT IN TIQUETES.idTiquete%TYPE,
  idV IN TIQUETES.idVuelo%TYPE,
  nom IN TIQUETES.nomUsuario%TYPE,
  asi IN TIQUETES.asiento%TYPE
  )
  AS
  BEGIN UPDATE TIQUETES set idTiquete=idT,idVuelo=idV,nomUsuario=nom,asiento=asi WHERE idTiquete=idT;
END;
/
-----------------------AVIONES-------------------------------
CREATE OR REPLACE PROCEDURE insertarAvion(idA IN AVIONES.identificadorAv%TYPE,
idHor IN AVIONES.idHorario%TYPE,
idR IN AVIONES.IdRuta%TYPE,
idTipo IN AVIONES.identificador%TYPE)
AS
BEGIN
INSERT INTO AVIONES VALUES(idA,idHor,idR,idTipo);
END;
/
show errors
CREATE OR REPLACE FUNCTION consultarAvion(idA IN AVIONES.identificadorAv%TYPE)
RETURN Types.ref_cursor
AS
aviones_cur types.ref_cursor;
BEGIN
OPEN aviones_cur FOR
SELECT identificadorAv, idHorario,IdRuta,identificador FROM AVIONES WHERE idA = identificadorAv;
RETURN aviones_cur;
END;
/
CREATE OR REPLACE PROCEDURE modificarAvion(idA IN AVIONES.identificadorAv%TYPE,
idHor IN AVIONES.idHorario%TYPE,
idR IN AVIONES.IdRuta%TYPE,
idTipo IN AVIONES.identificador%TYPE)
AS
BEGIN UPDATE AVIONES SET identificadorAv=idA,idHorario=idHor,IdRuta=idR,identificador=idTipo where identificadorAv=idA;
end;
/
CREATE OR REPLACE PROCEDURE eliminarAvion(idA IN AVIONES.identificadorAv%TYPE)
AS
BEGIN
delete from AVIONES  WHERE idA = identificadorAv;
END;
/
show errors
CREATE OR REPLACE FUNCTION listarAvion
RETURN Types.ref_cursor
AS
    avion_cursor types.ref_cursor;
BEGIN
    OPEN avion_cursor FOR
    SELECT identificadorAv,idHorario,IdRuta,identificador FROM AVIONES;
    Return avion_cursor;
END;
/
------------------------HORARIO------------------------------
CREATE OR REPLACE PROCEDURE insertarHorario (idh IN horarios.idhorario%TYPE,
dia IN horarios.diasemana%TYPE,
hora IN horarios.hora%TYPE,
minutos IN horarios.minutos%TYPE,
horaLL IN horarios.horaLlegada%TYPE,
minutosLL IN horarios.minutosLlegada%TYPE,
precio IN horarios.precio%TYPE,
descuento IN horarios.descuento%TYPE,
idr IN horarios.idruta%TYPE)
AS
BEGIN
INSERT INTO horarios VALUES(idh,dia,hora,minutos,horaLL,minutosLL,precio,descuento,idr);
END;
/
show errors
CREATE OR REPLACE FUNCTION CONSULTARHORARIO(idh IN horarios.idhorario%TYPE)

RETURN Types.ref_cursor
AS
horarios_cur types.ref_cursor;
BEGIN
OPEN horarios_cur FOR
SELECT idhorario,diasemana,hora,minutos,horaLLegada,minutosLlegada,precio,descuento,idRuta FROM horarios WHERE idh = idhorario;
RETURN horarios_cur;
END;
/
CREATE OR REPLACE FUNCTION listarHorarios
RETURN Types.ref_cursor
AS
    horarios_cursor types.ref_cursor;
BEGIN
    OPEN horarios_cursor FOR
    SELECT idhorario,diasemana,hora,minutos,horaLlegada,minutosLlegada,precio,descuento,idRuta FROM horarios;
    Return horarios_cursor;
END;
/
CREATE OR REPLACE PROCEDURE modificarHorario(idh IN horarios.idhorario%TYPE,
dia IN horarios.diasemana%TYPE,
hora IN horarios.hora%TYPE,
minutos IN horarios.minutos%TYPE,
horaLL IN horarios.horaLlegada%TYPE,
minutosLL IN horarios.minutosLLegada%TYPE,
precio IN horarios.precio%TYPE,
descuento IN horarios.descuento%TYPE,
idr IN horarios.idruta%TYPE)
AS
BEGIN UPDATE horarios SET idhorario=idh,diasemana=dia,hora=hora,minutos=minutos,horaLlegada=horaLL,minutosLlegada=minutosLL,precio=precio,descuento=descuento,idruta=idr WHERE idh=idhorario;
END;
/
show errors
CREATE OR REPLACE PROCEDURE borrarHorario (aidi IN horarios.idhorario%TYPE)
AS
BEGIN
delete from horarios  WHERE aidi = idhorario;
END;
/
show errors
-------------USUARIO-------------------------------
CREATE OR REPLACE PROCEDURE insertarUsuario (usuario IN USUARIOS.usuario%TYPE,
cont IN USUARIOS.contrasena%TYPE,
nomb IN USUARIOS.nombre%TYPE,
ape IN USUARIOS.apellidos%TYPE,
correo IN USUARIOS.correo%TYPE,
fechaNac IN USUARIOS.fechaNac%TYPE,
direccion IN USUARIOS.direccion%TYPE,
telefonoTrab IN USUARIOS.telefonoTrab%TYPE,
celular IN USUARIOS.celular%TYPE)
AS
BEGIN
INSERT INTO USUARIOS VALUES(usuario, cont, nomb, ape, correo, fechaNac, direccion, telefonoTrab, celular);
END;
/
show errors

CREATE OR REPLACE FUNCTION CONSULTARUSUARIO(usuar IN usuarios.usuario%TYPE, contrase IN usuarios.contrasena%TYPE)
RETURN Types.ref_cursor
AS
usuarios_cur types.ref_cursor;
BEGIN
OPEN usuarios_cur FOR
SELECT usuario, contrasena, nombre, apellidos, correo, fechaNac, direccion, telefonoTrab, celular FROM usuarios WHERE usuar =usuario and contrase = contrasena;
RETURN usuarios_cur;
END;
/
CREATE OR REPLACE PROCEDURE modificarUsuario(usu IN USUARIOS.usuario%TYPE,
cont IN USUARIOS.contrasena%TYPE,
nomb IN USUARIOS.nombre%TYPE,
ape IN USUARIOS.apellidos%TYPE,
corre IN USUARIOS.correo%TYPE,
fechaNacimiento IN USUARIOS.fechaNac%TYPE,
direc IN USUARIOS.direccion%TYPE,
telefonoTrabajo IN USUARIOS.telefonoTrab%TYPE,
cel IN USUARIOS.celular%TYPE)
AS
BEGIN
UPDATE USUARIOS set contrasena=cont, nombre=nomb, apellidos=ape, correo=corre, fechaNac=fechaNacimiento, direccion=direc, telefonoTrab=telefonoTrabajo,celular=cel WHERE usuario=usu;
END;
/
show errors
CREATE OR REPLACE FUNCTION listarUsuario
RETURN TYPES.ref_cursor
AS
    user_cursor types.ref_cursor;
BEGIN 
    OPEN user_cursor FOR 
    SELECT usuario,contrasena,nombre,
    apellidos,correo,fechaNac,
    direccion,telefonoTrab,celular 
    FROM USUARIOS;
    RETURN user_cursor;
END;
/
-----------------------TIPO AVIONES-----------------------
CREATE OR REPLACE PROCEDURE insertarTipoAviones(ident IN TIPO_AVIONES.identificador%TYPE,
anno IN TIPO_AVIONES.ano%TYPE,
modelOP IN TIPO_AVIONES.modelo%TYPE,
marc IN TIPO_AVIONES.marca%TYPE,
fil IN TIPO_AVIONES.filas%TYPE,
asiFilas IN TIPO_AVIONES.asientosFilas%TYPE,
pasaj IN TIPO_AVIONES.pasajeros%TYPE
)
AS
BEGIN
INSERT INTO TIPO_AVIONES VALUES(ident,anno,modelOP,marc,fil,asiFilas,pasaj);
END;
/
show errors

CREATE OR REPLACE FUNCTION listarTipos
RETURN Types.ref_cursor
AS
    tipos_cursor types.ref_cursor;
BEGIN
    OPEN tipos_cursor FOR
    SELECT identificador,ano,modelo,marca,filas,asientosFilas,pasajeros FROM TIPO_AVIONES;
    Return tipos_cursor;
END;
/

show errors
CREATE OR REPLACE PROCEDURE modificarTipo(ident IN TIPO_AVIONES.identificador%TYPE,
anno IN TIPO_AVIONES.ano%TYPE,
modelOP IN TIPO_AVIONES.modelo%TYPE,
marc IN TIPO_AVIONES.marca%TYPE,
fil IN TIPO_AVIONES.filas%TYPE,
asiFilas IN TIPO_AVIONES.asientosFilas%TYPE,
pasaj IN TIPO_AVIONES.pasajeros%TYPE)
AS
BEGIN UPDATE TIPO_AVIONES SET ano=anno,modelo=modelOP,marca=marc,filas=fil,asientosFilas=asiFilas,pasajeros=pasaj WHERE identificador=ident;
END;
/
show errors
CREATE OR REPLACE PROCEDURE borrarTipo(ident IN TIPO_AVIONES.identificador%TYPE)
AS
BEGIN
delete from TIPO_AVIONES  WHERE ident = identificador;
END;
/
show errors
------------------------VUELOS-------------------
CREATE OR REPLACE PROCEDURE insertarVuelo(cod IN VUELOS.codigo%TYPE,
tip IN VUELOS.tipo%TYPE,
avionIda IN VUELOS.identificadorAvIda%TYPE,
avionRegreso IN VUELOS.identificadorAvRegreso%TYPE,
idHor IN VUELOS.idHorario%TYPE
)
AS
BEGIN 
INSERT INTO VUELOS VALUES(cod,tip,avionIda,avionRegreso,idHor);
END;
/
show errors
CREATE OR REPLACE FUNCTION listarVuelos
RETURN Types.ref_cursor
AS
    vuel_cursor types.ref_cursor;
BEGIN
    OPEN vuel_cursor FOR
    SELECT codigo,tipo,identificadorAvIda,identificadorAvRegreso FROM VUELOS;
    RETURN  vuel_cursor;
END;
/
show errors
CREATE OR REPLACE FUNCTION listarVuelosPublico
RETURN Types.ref_cursor
AS
    vuelos_cursor types.ref_cursor;
BEGIN
    OPEN vuelos_cursor FOR 
    SELECT Unique v.codigo,v.tipo,r.origen,r.destino,h.diaSemana,h.hora,h.minutos,h.horaLlegada,h.minutosLlegada,t.pasajeros,h.descuento FROM VUELOS v,rutas r,horarios h,Tipo_Aviones t WHERE r.IdRuta=h.IdRuta AND h.idHorario=v.idHorario;
    RETURN vuelos_cursor;
    END;
/
show errors

---------------------RUTAS---------------------
CREATE OR REPLACE PROCEDURE insertarRuta (aidi IN rutas.idruta%TYPE,
orig IN rutas.origen%TYPE,
dest IN rutas.destino %TYPE,
duraH IN rutas.duracionH %TYPE,
duraM IN rutas.duracionM%TYPE)
AS
BEGIN
INSERT INTO rutas VALUES(aidi,orig,dest,duraH,duraM);
END;
/
show errors
CREATE OR REPLACE FUNCTION listarRutas
RETURN Types.ref_cursor
AS
    rutas_cursor types.ref_cursor;
BEGIN
    OPEN rutas_cursor FOR
    SELECT IdRuta,origen,destino,duracionH,duracionM FROM RUTAS;
    return rutas_cursor;
    END;
    /
CREATE OR REPLACE FUNCTION CONSULTARRUTA(aidi IN rutas.idruta%TYPE)
RETURN Types.ref_cursor
AS
rutas_cur types.ref_cursor;
BEGIN
OPEN rutas_cur FOR
SELECT idRuta,origen, destino, duracionH,duracionM FROM rutas WHERE aidi =idRuta;
RETURN rutas_cur;
END;
/
--borrar ruta
--modificar ruta

CREATE OR REPLACE PROCEDURE borrarRutaG
AS
BEGIN
execute immediate 'truncate table rutas';
END;
/
show errors

CREATE OR REPLACE PROCEDURE borrarRuta (aidi IN rutas.idruta%TYPE)
AS
BEGIN
delete from rutas  WHERE aidi = idRuta;
END;
/
show errors

CREATE OR REPLACE PROCEDURE modificarRuta (aidi IN rutas.idruta%TYPE, orig IN rutas.origen%TYPE,dest IN rutas.destino %TYPE,duraH IN rutas.duracionH %TYPE,duraM IN rutas.duracionM%TYPE)
AS
BEGIN UPDATE rutas SET  origen=orig, destino=dest, duracionH = duraH,duracionM=duraM WHERE idruta = aidi;
END;
/
---------------------CONSULTAS FILTRO-----------------------------
CREATE OR REPLACE FUNCTION consultaTipoVuelo(tip IN vuelos.tipo%TYPE)
RETURN Types.ref_cursor
AS
consultex_cur types.ref_cursor;
BEGIN
OPEN consultex_cur FOR
    SELECT codigo,tipo,origen,destino,diaSemana,hora,minutos,horaLlegada,minutosLlegada,pasajeros FROM VUELOS,rutas,horarios,Tipo_Aviones
 WHERE tip=tipo;
RETURN consultex_cur;
END;
/
show errors;
CREATE OR REPLACE FUNCTION consultaOrigenVuelo()