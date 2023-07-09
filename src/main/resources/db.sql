show databases;
CREATE
DATABASE db_prueba2;
CREATE
USER 'userprueba2'@'%' IDENTIFIED BY 'admin2022$';
GRANT ALL PRIVILEGES ON db_prueba2 . * TO
'userprueba2'@'%';

use db_prueba2;
show tables;
commit;

select * from clientsdb;