create table topicos (
    id bigint auto_increment not null primary key,
    titulo varchar(80) not null,
    mensagem text not null,
    data timestamp not null,
    boolean varchar(10) not null,
    nome varchar(30) not null,
    email varchar(50) not null
);