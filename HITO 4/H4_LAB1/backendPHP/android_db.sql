CREATE DATABASE android_db;
USE android_db;

CREATE TABLE usuarios(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

insert into usuarios (nombre, usuario, contrasena) values ('Admin', 'admin', 'admin');
insert into usuarios (nombre, usuario, contrasena) values ('Usuario', 'usuario', 'usuario');

SELECT * FROM usuarios;