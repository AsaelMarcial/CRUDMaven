# CRUDMaven
Repositorio para EE Desarrollo de aplicaciones, ejercicio CRUD con maven

Script SQL para crear base de datos utilizada en el proeycto con el manejador postgreSQL

CREATE DATABASE escuela;
\c escuela
CREATE TABLE estudiantes(
idestudiante SERIAL NOT NULL,
primer_nom VARCHAR(50) NOT NULL,
primer_ape VARCHAR(50) NOT NULL,
seg_nom VARCHAR(50),
seg_ape VARCHAR(50),
activo BOOLEAN NOT NULL);
