create table student_list
(
    id           int auto_increment
        primary key,
    student_name varchar(50) null,
    location     varchar(50) null,
    email        varchar(50) null,
    gender       char        null,
    course       varchar(50) null,
    constraint fk_branch_course
        foreign key (course) references branch (course)
);

create index idx_student_gender
    on student_list (gender);

