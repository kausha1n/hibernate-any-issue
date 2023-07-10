create table property_holder
(
    id            bigint not null,
    property_type varchar(255),
    primary key (id)
);

create table string_property
(
    id      bigint not null,
    "name"  varchar(255),
    "value" varchar(255),
    primary key (id)
);


create table integer_property
(
    id      bigint not null,
    "name"  varchar(255),
    "value" integer,
    primary key (id)
);
