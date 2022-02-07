create table sheet(
    id bigint not null auto_increment,
    title varchar(100),
    primary key (id)
);

insert into sheet values(1, 'Main');