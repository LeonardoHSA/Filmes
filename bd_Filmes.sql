create table Filmes
(
	idFilme smallint generated always as identity primary key,
	nome varchar(250) not null,
	genero varchar(250) not null,
	direcao varchar(250) not null,
	ano smallint check(ano > 1888) not null,
	streamer varchar(250)
)

alter table Filmes add column assistiu char(3);

select * from public.Filmes

create table Series
(
	idSerie smallint generated always as identity primary key,
	nome varchar(250) not null,
	genero varchar(250) not null,
	direcao varchar(250) not null, 
	anoLancamento smallint check(anoLancamento > 1946) not null, 
	temporadas varchar(250) not null, 
	streamer varchar(250)
)

alter table Series add column assistiu char(3);

select * from public.Series