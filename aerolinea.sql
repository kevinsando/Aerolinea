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
CONSTRAINT tipo_aviones_pk PRIMARY KEY (identificador));
show errors;

CREATE TABLE RUTAS(
IdRuta varchar2(50) not null,
origen varchar2(50),
destino varchar2(50),
duracion float(20),
CONSTRAINT rutas_pk PRIMARY KEY (IdRuta));
 
CREATE TABLE HORARIOS(
idHorario varchar2(20) not null,
diaSemana varchar2(20),
hora numeric(20),
minutos numeric(20),
precio float(20),
descuento float(10),
IdRuta varchar2(50) not null,
CONSTRAINT horarios_pk PRIMARY KEY (idHorario),
CONSTRAINT fk_horarios
  FOREIGN KEY (IdRuta)
  REFERENCES rutas(IdRuta));
show errors;

CREATE TABLE AVIONES(
identificadorAv varchar2(20) not null,
idHorario varchar2(20) not null,
IdRuta varchar2(50) not null,
identificador varchar2(20) not null,
CONSTRAINT aviones_pk PRIMARY KEY (identificadorAv),
CONSTRAINT fk_aviones FOREIGN KEY (idHorario) REFERENCES horarios(idHorario),
CONSTRAINT fk2_aviones FOREIGN KEY (IdRuta) REFERENCES rutas(IdRuta),
CONSTRAINT fk3_aviones FOREIGN KEY (identificador) REFERENCES tipo_aviones(identificador)
);

 CREATE TABLE VUELOS(
 codigo varchar2(50)not null,
 fIda varchar2(50),
 fRegreso varchar2(50),
 IdRuta varchar2(50) not null,
 idHorario varchar2(20) not null,
 identificadorAv varchar2(20) not null,
 CONSTRAINT vuelos_pk PRIMARY KEY (codigo),
  CONSTRAINT fk2_vuelos FOREIGN KEY (idHorario) REFERENCES horarios(idHorario),
 CONSTRAINT fk_vuelos FOREIGN KEY (IdRuta) REFERENCES rutas(IdRuta),
 CONSTRAINT fk3_vuelos FOREIGN KEY (identificadorAv) REFERENCES aviones(identificadorAv)
 );

CREATE TABLE USUARIOS(
usuario varchar2(50),
contrasena numeric(16),
nombre varchar2(50),
apellidos varchar2(50),
correo varchar2(50),
fechaNac varchar2(20),
direccion varchar2(50),
telefonoTrab varchar2(20),
celular varchar2(20),
CONSTRAINT usuarios_pk PRIMARY KEY (usuario));
