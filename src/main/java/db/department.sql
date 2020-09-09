create table department
(
    id                 bigint auto_increment comment '部门编号'
        primary key,
    department_name    varchar(50)                         null comment '部门名称',
    parent_id          bigint                              not null comment '父部门编号',
    server_create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    server_update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    level              int       default 0                 not null
)
    comment '部门表' collate = utf8mb4_unicode_ci;