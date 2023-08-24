create database banco_de_usuario;

use banco_de_usuario;

create table usuario(
	id				integer auto_increment primary key,
    nome			varchar(200) not null,
	email			varchar(50)  not null unique,
	senha			text not null,
    telefone		varchar(15) not null
);

insert into usuario value (null, 'Luis', 'luis@email', 'senhaLuis', '38999063730');


select * from usuario;