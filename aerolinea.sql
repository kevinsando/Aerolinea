Drop Table VUELOS;
Drop Table AVIONES;
Drop Table HORARIOS;
Drop Table USUARIOS;
Drop Table RUTAS;
Drop Table TIPO_AVIONES;

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
duracion float(20),
PRIMARY KEY (IdRuta));
 
CREATE TABLE HORARIOS(
idHorario varchar2(20) not null,
diaSemana varchar2(20),
hora numeric(20),
minutos numeric(20),
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

 CREATE TABLE VUELOS(
 codigo varchar2(50)not null,
 fIda varchar2(50),
 fRegreso varchar2(50),
 IdRuta varchar2(50) not null,
 idHorario varchar2(20) not null,
 identificadorAv varchar2(20) not null,
PRIMARY KEY (codigo),
FOREIGN KEY (idHorario) REFERENCES horarios(idHorario),
FOREIGN KEY (IdRuta) REFERENCES rutas(IdRuta),
FOREIGN KEY (identificadorAv) REFERENCES aviones(identificadorAv)
 );

CREATE TABLE USUARIOS(
usuario varchar2(50),
contrasena varchar2(16),
nombre varchar2(50),
apellidos varchar2(50),
correo varchar2(50),
fechaNac varchar2(20),
direccion varchar2(50),
telefonoTrab numeric(20),
celular numeric(20),
PRIMARY KEY (usuario));

  CREATE OR REPLACE PACKAGE types 
AS
    TYPE ref_cursor IS REF CURSOR;
    END;
  /

CREATE OR REPLACE PROCEDURE insertarHorario (idh IN horarios.idhorario%TYPE,
dia IN horarios.diasemana%TYPE,
hora IN horarios.hora%TYPE,
minutos IN horarios.minutos%TYPE,
precio IN horarios.precio%TYPE,
descuento IN horarios.descuento%TYPE,
idr IN horarios.idruta%TYPE)
AS
BEGIN
INSERT INTO horarios VALUES(idh,dia,hora,minutos,precio,descuento,idr);
END;
/
show errors
CREATE OR REPLACE FUNCTION CONSULTARHORARIO(idh IN horarios.idhorario%TYPE,
dia IN horarios.diasemana%TYPE,
hora IN horarios.hora%TYPE,
minutos IN horarios.minutos%TYPE,
precio IN horarios.precio%TYPE,
descuento IN horarios.descuento%TYPE,
idr IN horarios.idruta%TYPE)

RETURN Types.ref_cursor
AS
horarios_cur types.ref_cursor;
BEGIN
OPEN horarios_cur FOR
SELECT idhorario,diasemana,hora,minutos,precio,descuento,idRuta FROM horarios WHERE idh = idhorario;
RETURN horarios_cur;
END;
/
CREATE OR REPLACE FUNCTION listarHorarios
RETURN Types.ref_cursor
AS
    horarios_cursor types.ref_cursor;
BEGIN
    OPEN horarios_cursor FOR
    SELECT idhorario,diasemana,hora,minutos,precio,descuento,idRuta FROM horarios;
    Return horarios_cursor;
END;
/
CREATE OR REPLACE PROCEDURE modificarHorario(idh IN horarios.idhorario%TYPE,
dia IN horarios.diasemana%TYPE,
hora IN horarios.hora%TYPE,
minutos IN horarios.minutos%TYPE,
precio IN horarios.precio%TYPE,
descuento IN horarios.descuento%TYPE,
idr IN horarios.idruta%TYPE)
AS
BEGIN UPDATE horarios SET idhorario=idh,diasemana=dia,hora=hora,minutos=minutos,precio=precio,descuento=descuento,idruta=idr WHERE idh=idhorario;
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
CREATE OR REPLACE FUNCTION listarVuelos
RETURN Types.ref_cursor
AS
    vuelos_cursor types.ref_cursor;
BEGIN
    OPEN vuelos_cursor FOR 
    SELECT fIda, fRegreso, IdRuta,IdHorario, identificadorAv FROM vuelos;
    RETURN vuelos_cursor;
    END;
/
show errors


CREATE OR REPLACE PROCEDURE insertarRuta (aidi IN rutas.idruta%TYPE,
orig IN rutas.origen%TYPE,
dest IN rutas.destino %TYPE,
dura IN rutas.duracion %TYPE)
AS
BEGIN
INSERT INTO rutas VALUES(aidi,orig,dest,dura);
END;
/
show errors

CREATE OR REPLACE FUNCTION CONSULTARRUTA(aidi IN rutas.idruta%TYPE)
RETURN Types.ref_cursor
AS
rutas_cur types.ref_cursor;
BEGIN
OPEN rutas_cur FOR
SELECT idRuta,origen, destino, duracion FROM rutas WHERE aidi =idRuta;
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

CREATE OR REPLACE PROCEDURE modificarRuta (aidi IN rutas.idruta%TYPE, orig IN rutas.origen%TYPE,dest IN rutas.destino %TYPE,dura IN rutas.duracion %TYPE)
AS
BEGIN UPDATE rutas SET  origen=orig, destino=dest, duracion = dura WHERE idruta = aidi;
END;
/
