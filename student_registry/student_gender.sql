create table student_gender
(
    s_id   int         null,
    s_name varchar(50) null,
    gender char        null,
    constraint fk_student_list_gender
        foreign key (gender) references student_list (gender)
);

