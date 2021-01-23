DROP TABLE IF EXISTS carrera;

create table carrera(
id int auto_increment,
nombre varChar(250),
materias int,
tipo varChar(250),
facultad varChar(250));

insert into carrera(nombre, materias,tipo, facultad) values
('INGENIERIA EN SISTEMAS', 64, 'INGENIERIA', 'UNTREF'),
('LICENCIATURA EN COMPUTACION',43, 'LICENCIATURA', 'UNSAM');

