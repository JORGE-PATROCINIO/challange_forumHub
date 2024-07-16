create table usuarios(

    id bigint not null auto_increment,
    login varchar(30) not null,
    senha varchar(20) not null,

    primary key(id)

);