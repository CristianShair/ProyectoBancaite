CREATE DATABASE BANCAITE;

USE BANCAITE;

CREATE TABLE Clientes(
ID_Clientes INT(22) AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR (12),
Apellido VARCHAR (12),
Edad INT(12),
Numerodetelefono VARCHAR (25));

CREATE TABLE Administradores(
ID_Administradores INT(12) AUTO_INCREMENT PRIMARY KEY,
Codigo INT(10) NOT NULL,
Nombre VARCHAR(12),
Apellido VARCHAR(12),
Edad VARCHAR(12),
Numerodetelefono VARCHAR (14),
FOREIGN KEY(Codigo) REFERENCES Codigosdeseguridad(ID_Codigo));

DROP TABLE Administradores;


ALTER TABLE Administradores ADD COLUMN Codigos INT (10);

CREATE TABLE Movimientos(
ID_Movimiento INT(12) AUTO_INCREMENT PRIMARY KEY,
ID_Cliente INT(22) NOT NULL,
Concepto VARCHAR(25),
Monto INT(4),
FOREIGN KEY(ID_Cliente) REFERENCES Clientes(ID_Clientes));

DROP TABLE Movimientos;

CREATE TABLE Transferncias(
ID_Transferencia INT (9) AUTO_INCREMENT PRIMARY KEY,
ID_Remitente INT(22)NOT NULL,
ID_Destinatario INT(12)NOT NULL,
Monto INT(4));

CREATE TABLE Codigosdeseguridad(
ID_Codigo INT (10) AUTO_INCREMENT PRIMARY KEY,
Codigo VARCHAR(8));














 
 


