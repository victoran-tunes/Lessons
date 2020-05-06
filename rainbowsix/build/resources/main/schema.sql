drop table if exists personagem;

create table personagem(
id_personagem bigint auto_increment,
nome varchar(100) not null,
armor int not null,
speed int not null,
skill varchar(100) not null,
primary key (id_personagem));