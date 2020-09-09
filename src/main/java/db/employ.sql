create table employee
(
    id                 bigint auto_increment comment '员工id'
        primary key,
    employee_name      varchar(50)                         null comment '员工姓名',
    department_id      bigint                              not null comment '所属部门',
    job                varchar(50)                         not null comment '员工工作岗位',
    salary             varchar(50)                         not null comment '工资',
    server_create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    server_update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间'
)
    comment '员工表' collate = utf8mb4_unicode_ci;