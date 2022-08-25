-- sql文件记录
CREATE TABLE orders (
	id   int         PRIMARY KEY AUTO_INCREMENT,
	name varchar(10) NULL DEFAULT '' COMMENT '订单名称'
) COMMENT '订单信息表';