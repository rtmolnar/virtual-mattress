create table expense(
    id bigint not null auto_increment,
    create_date timestamp,
    currency varchar(15),
    title varchar(100),
    value decimal(19,2),
    sheet_id bigint,
    user_id bigint,
    primary key (id),
    foreign key (sheet_id) references sheet,
    foreign key (user_id) references user
);