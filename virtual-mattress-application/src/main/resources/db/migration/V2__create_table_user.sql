create table user (
    id bigint not null auto_increment,
    name varchar(255),
    primary key (id)
);

insert into user values(1, 'Ronaldo');