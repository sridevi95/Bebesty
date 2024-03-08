create table branch
(
    branch_id          int         not null
        primary key,
    course             varchar(50) null,
    number_of_students int         null
);

create index idx_course
    on branch (course);

