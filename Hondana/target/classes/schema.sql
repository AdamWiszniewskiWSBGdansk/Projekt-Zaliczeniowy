create table books
(
    id                   int auto_increment
        primary key,
    title                varchar(45) not null,
    author               varchar(45) null,
    number_of_volumes    varchar(45) null,
    destination_group_id int null,
    genre_id             int null,
    constraint id_UNIQUE
        unique (id)
)
    comment 'table that storage informations about books';

create index id_idx
    on books (genre_id);

create index id_idx1
    on books (destination_group_id);

create table destination_group
(
    id   int auto_increment,
    name varchar(45) not null,
    primary key (id, name),
    constraint id_UNIQUE
        unique (id),
    constraint name_UNIQUE
        unique (name)
);

create table genre
(
    id   int auto_increment,
    name varchar(15) not null,
    primary key (id, name),
    constraint id
        unique (id),
    constraint name_UNIQUE
        unique (name)
);


