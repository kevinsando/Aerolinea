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
precio float(20),
descuento float(10),
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


