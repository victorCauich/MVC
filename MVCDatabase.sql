drop database if exists persona;
create database persona;
use persona;

create table datosPersona(
	id_persona int not null primary key auto_increment,
    primerNombre varchar (50) not null,
    segundoNombre varchar (50),
    apellidoPaterno varchar (50),
    apellidoMaterno varchar (50)    
);

select * from datosPersona;