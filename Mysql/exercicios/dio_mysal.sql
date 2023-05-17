use dio_mysql;

create table cursos(
 id_curso INTEGER(2) not null auto_increment,
 nome VARCHAR(25),
 primary key (id_curso)
 );
 
insert into cursos (nome) values ('MySQL');
insert into cursos (nome) values ('HTML');
insert into cursos (nome) values ('CSS');
 
/* adicionar na tablea */
alter table cursos add carga_horaria int(2); 

/* atualiza carga horaria */
update cursos SET carga_horaria=20
where id_curso = 2 ;

/*Deletar tabela */
drop table usuarios;

update cursos SET carga_horaria=30
where id_curso = 3 ;

update cursos SET carga_horaria=10
where id_curso = 4 ;

/* consulta em multiplas tabelas */
select * from pessoas join cursos on 
pessoas.fk_cursos = cursos.id_cursos;

/* INNER JOIN e OUTTER JOIN			*/
select * from videos_canais as vc join videos as v on vc.fk_canal = v.id
join canais as c on vc.fk_canal = c.id

/* INNER JOIN	(nao trara valor nulo)		*/
select * from videos_canais as vc inner join videos as v on vc.fk_canal = v.id
inner join canais as c on vc.fk_canal = c.id

/* outer JOIN	(trara toda consulta inclusive as sem relacionamento)		*/
select * from videos_canais as vc outer join videos as v on vc.fk_canal = v.id
outer join canais as c on vc.fk_canal = c.id

/* LEFT E RIGHT			*/
select * from videos_canais as vc left outer join videos as v on vc.fk_canal = v.id

select * from videos_canais as vc right outer join videos as v on vc.fk_canal = v.id

/* UNION			*/
select * from videos_canais as vc join videos as v on vc.fk_canal = v.id
join canais as c on vc.fk_canal = c.id
where canais.id = 2