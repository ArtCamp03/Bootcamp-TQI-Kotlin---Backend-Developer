create database youtube_db;

use youtube_db;

create table videos(
	id int auto_increment,
    autor varchar(30),
    titulo varchar(25),
    likes int,
    deslikes int,
    primary key(id)
);

insert into videos (autor, titulo, likes, deslikes) values ('Joa', 'A origem', 2,1);
insert into videos (autor, titulo, likes, deslikes) values ('Andre', 'HTML', 10,1);
insert into videos (autor, titulo, likes, deslikes) values ('Maria', 'CSS', 5,11);

create table playlist(
	id int auto_increment,
    videos varchar(30),
    titulo varchar(25),
    primary key(id)
);

create table seo(
	id int auto_increment,
    categorias varchar(30),
    primary key(id)
);

create table author(
	id int auto_increment,
    nome varchar(30),
    born date,
    primary key(id)
);

insert into author (nome, born) values ('Antonio', '1992-04-26');

update videos set author = '';
update videos set author=3 where id=1;

select * from videos join author on videos.fk_author = autor.id;
select videos.titulo, author.nome from videos join author on videos.fk_author = author.id;

