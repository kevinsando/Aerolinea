Drop Table RUTAS;
Drop Table VUELOS;
Drop Table DESCUENTOS;
CREATE TABLE RUTAS(
identificador varchar2(50),
duracion varchar2(50),
CONSTRAINT rutas_pk PRIMARY KEY (identificador));
 
 CREATE TABLE VUELOS(
 codigo varchar2(50),
 origen varchar2(50),
 destino varchar2(50),
 fIda varchar2(50),
 fRegreso varchar2(50),
 cantPasajeros numeric(10),
 CONSTRAINT vuelos_pk PRIMARY KEY (codigo));
 
CREATE TABLE DESCUENTOS(
rutaIdentificador varchar(50),
codigoDescuento varchar(50),
CONSTRAINT fk_descuentos
FOREIGN KEY (rutaIdentificador)
REFERENCES rutas(rutaIdentificador));

