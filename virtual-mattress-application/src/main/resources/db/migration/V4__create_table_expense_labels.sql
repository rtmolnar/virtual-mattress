create table expense_labels (
    expense_id bigint not null auto_increment,
    labels varchar(255),
    foreign key(expense_id) references expense
);