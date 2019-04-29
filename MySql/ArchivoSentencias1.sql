
/*SENTENCIAS INSERT*/
insert into persona(nombre,apellido) values('Juan','Perez');

insert into persona (nombre,apellido) values('Karla','Esperanza');

insert into persona(nombre,apellido) values('Eduardo','Alvarez');
/*SENTENCIA SELECT*/
SELECT * FROM persona;



/* SENTENCIA UPDATE */
UPDATE PERSONA SET nombre='Juanito' where id_persona =1;

/*SENTENCIA DELETE*/
DELETE FROM PERSONA WHERE id_persona =3;