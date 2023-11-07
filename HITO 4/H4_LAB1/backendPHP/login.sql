create database login;
use login;

CREATE TABLE usuarios
(
    id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre     VARCHAR(255) NOT NULL,
    usuario    VARCHAR(255) NOT NULL,
    contrasena VARCHAR(255) NOT NULL
);

insert into usuarios (nombre, usuario, contrasena) values ('Carlos', 'admin', 'admin');
insert into usuarios (nombre, usuario, contrasena) values ('Daniel', 'user', 'user');

select * from usuarios;

