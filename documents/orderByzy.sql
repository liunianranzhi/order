/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/9 11:22:00                           */
/*==============================================================*/


drop table if exists om_goods_eval_reply;

drop table if exists om_goods_evaluate;

drop table if exists om_order;

drop table if exists om_order_coupon;

drop table if exists om_order_evaluate;

drop table if exists om_order_goods;

drop table if exists om_order_logist;

drop table if exists om_order_payment;

drop table if exists om_order_settlement;

drop table if exists om_order_voucher;

/*==============================================================*/
/* User: sy                                                     */
/*==============================================================*/
create user sy;

/*==============================================================*/
/* Table: om_goods_eval_reply                                   */
/*==============================================================*/
create table om_goods_eval_reply
(
   rec_id               int not null comment '��¼id',
   eval_id              int not null comment '����id',
   reply_member_id      int not null comment '�ظ���id',
   reply_member_name    varchar(50) comment '�ظ�������',
   reply_member_image   varchar(50) comment '�ظ���ͷ��',
   reply_time           datetime not null default CURRENT_TIMESTAMP comment '�ظ�ʱ��',
   reply_content        varchar(500) not null comment '�ظ�����',
   reply_range          int comment '�ظ�����
            
            �ƶ�memberid ���Բ鿴
            �մ��������˶����Բ鿴',
   eval_member_id       int not null comment '���ظ���id',
   eval_member_name     varchar(50) comment '���ظ�������',
   eval_member_image    varchar(50) comment '���ظ���ͷ��',
   is_delete            tinyint(1) not null default 0 comment '�Ƿ�ɾ��',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '�޸�ʱ��',
   primary key (rec_id)
);

alter table om_goods_eval_reply comment '��Ʒ���ۻظ���';

/*==============================================================*/
/* Table: om_goods_evaluate                                     */
/*==============================================================*/
create table om_goods_evaluate
(
   rec_id               int not null comment '����id',
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������ID',
   eval_time            datetime not null default CURRENT_TIMESTAMP comment '����ʱ��',
   goods_common_id      int(11) not null comment '��Ʒid',
   goods_id             national varchar(100) not null comment 'skuid',
   ins_id               int(11) not null comment '��ұ��',
   goods_score          national varchar(100) not null comment '�������',
   member_id            int not null comment '������id',
   member_image         varchar(50) comment '������ͷ��',
   member_name          varchar(50) comment '����������',
   is_anonymous         tinyint(1) not null default 5 comment '�Ƿ�����
            0������
            1 ����',
   eval_conent          varchar(500) not null default '5' comment '��Ʒ��������',
   eval_status          tinyint(1) not null default 5 comment '�Ƿ���ʾ����
            0������ʾ
            1����ʾ
            ',
   publisher_id         int(11) not null default 0 comment '������id',
   eval_image1          varchar(100) comment 'ɹ��ͼƬ1',
   eval_image2          varchar(100) comment 'ɹ��ͼƬ2',
   eval_image3          varchar(100) comment 'ɹ��ͼƬ1',
   eval_reply_status    tinyint(1) comment '�ظ�״̬
            0 δ�ظ�
            1 �Ѿ��ظ�',
   eval_type            tinyint(1) not null default 0 comment '��������0:ϵͳ�Զ�����1:�ֶ�����',
   update_time          datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '�޸�ʱ��',
   primary key (rec_id)
);

alter table om_goods_evaluate comment '������Ʒ����';

/*==============================================================*/
/* Table: om_order                                              */
/*==============================================================*/
create table om_order
(
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������id',
   order_code           bigint(20) not null comment '����code',
   member_id            int not null comment '��Աid',
   store_id             int not null comment '����id',
   seller_id            int not null comment '������id',
   agent_id             int comment '������id',
   poor_id              int comment 'ƶ�໧id',
   ope_center_id        int comment '������Ӫ����id',
   order_type           tinyint(2) not null default 10 comment '��������
            10���󰮳��У�
            20����Դ�̳���
            31�����˼��ɣ�
            32����λ����',
   order_channel         varchar(10) not null default 'app' comment '����������Ϣ
            app:�����й���
            wechar:΢�Ź��ں�',
   goods_project_type   tinyint(10) not null default 17 comment '��Ʒ����
            17���󰮳���
            24����Դ�̳�
            ',
   order_status         tinyint(2) not null default 10 comment '����״̬
            10:�����ύ�ɹ���
            20:����������
            30:�����������
          
  40:�����ɹ����
            50:����ȡ��
            ',
   order_cancle_reason  varchar(40) comment '����ȡ��ԭ��',
   pay_type             tinyint(1) not null default 20 comment '֧������
            10:offline
            20:online
            ',
   pay_center           varchar(10) comment '֧������
            boc������֧��
            alipayna:֧����ԭ��֧��
            alipayh5:֧����wap֧��
            wechatna��΢��app֧��
            wechatmp��΢�Ź��ں�
            ',
   pay_status           tinyint(1) not null default 10 comment '֧��״̬
            10:������
            19:����ɹ�
            20:���˿�
            29:�˿�ɹ�
            ',
   order_message        varchar(200) comment '��������',
   cust_service_status  tinyint(1) not null default 0 comment '�ۺ�״̬
            0:δ�ύ�ۺ���Ϣ
            10:�ύ�ۺ�����
            20:���ۺ󷢻�
            29:������ȷ��
            30:�˻����
            40:�˻��ܾ�',
   order_all_price      int not null default 0 comment '����ȫ������',
   order_goods_price    int not null default 0 comment '������Ʒ����',
   order_logist_price   int not null default 0 comment '������������',
   order_voucher_price  int not null default 0 comment '�����Ż�ȯ����',
   order_coupon_price   int not null default 0 comment '����ʹ�÷�ƶ�����',
   order_used_point     int not null default 0 comment '����ʹ�û�����',
   order_pay_fee        int not null default 0 comment '����֧������',
   order_create_time    datetime not null default CURRENT_TIMESTAMP comment '��������ʱ��',
   order_pay_time       datetime comment '����֧��ʱ��',
   order_send_time      datetime comment '��������ʱ��',
   order_check_time     datetime comment '����ǩ��ʱ��',
   order_eva_status     tinyint(1) not null default 0 comment '��������״̬
            0:δ����
            10:�Ѿ�����
            12:��ʱ��Ĭ�Ϻ���',
   is_delete            tinyint(1) not null default 0 comment '����ɾ����־λ',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '�������ʱ��',
   other_info1          varchar(20) comment '���������ֶ�1',
   other_info2          varchar(100) comment '���������ֶ�2',
   primary key (order_id)
);

alter table om_order comment '������Ϣ��';

/*==============================================================*/
/* Table: om_order_coupon                                       */
/*==============================================================*/
create table om_order_coupon
(
   rec_id               int not null auto_increment comment '��¼id',
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������id',
   coupon_id            int not null comment '��ƶ��id',
   coupon_code          varchar(20) not null comment '��ƶ��code',
   member_id            int not null comment '��ƶ���û�id',
   coupon_price         int not null comment '��ƶ��ʹ�ý��',
   coupon_batch_sn      varchar(20) comment '��ƶ�����κ�',
   use_time             datetime not null default CURRENT_TIMESTAMP comment 'ʹ��ʱ��',
   remark               varchar(50) comment '��ע',
   is_delete            tinyint(1) not null default 0 comment '�Ƿ�ɾ�� 0 δɾ��
            1 ɾ��',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '����ʱ��',
   primary key (rec_id)
);

alter table om_order_coupon comment '����ʹ�÷�ƶ��';

/*==============================================================*/
/* Table: om_order_evaluate                                     */
/*==============================================================*/
create table om_order_evaluate
(
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������ID',
   eval_time           datetime not null default CURRENT_TIMESTAMP comment '����ʱ��',
   store_id             int(11) unsigned not null comment '���̱��',
   store_name           varchar(100) not null comment '��������',
   member_id            int(11) unsigned not null comment '��ұ��',
   member_name          varchar(100) not null comment '�������',
   desccredit           tinyint(1) unsigned not null default 5 comment '�����������',
   servicecredit        tinyint(1) unsigned not null default 5 comment '����̬������',
   deliverycredit       tinyint(1) unsigned not null default 5 comment '�����ٶ�����',
   publisher_id         int(11) unsigned not null default 0 comment '������id',
   eval_type            tinyint(1) not null default 0 comment '��������0:ϵͳ�Զ�����1:�ֶ�����',
   is_delete            tinyint(1) comment '�Ƿ�ɾ��',
   update_time          datetime comment '�޸�ʱ��',
   primary key (order_id)
);


/*==============================================================*/
/* Table: om_order_goods                                        */
/*==============================================================*/
create table om_order_goods
(
   ins_id               int not null auto_increment comment 'ʵ��id',
   order_id             varchar(32) not null comment '����id',
   buyer_id             int(11) not null comment '���id',
   main_id              varchar(32) not null comment '������id',
   goods_common_id      int not null comment '��Ʒid',
   goods_id             int not null default 0 comment 'skuid',
   goods_name           varchar(50) not null comment '��Ʒ����',
   goods_point          int default 0 comment '��Ʒ��Ҫ��������',
   goods_price          int not null comment '��Ʒ����',
   goods_num            int not null comment '��Ʒ����',
   goods_image          varchar(100) not null comment '��ƷͼƬ',
   goods_amount_price   int not null comment '��Ʒ�ܼ�',
   goods_amount_point   int default 0 comment '��Ʒ�����������',
   goods_help_rate      int not null comment '��Ʒ�������� ����1000',
   share_id             int comment '������id',
   goods_spec           varchar(20) not null comment '��Ʒ���',
   goods_unit           varchar(20) not null comment '��Ʒ��λ',
   store_discount_fee   int comment '�����ۼ����',
   plat_discount_fee    int comment 'ƽ̨�ۼ����',
   purchase_price       int comment '��Ʒ�ɹ���',
   remark               varchar(200) comment '��Ʒ����',
   create_time          datetime not null  default CURRENT_TIMESTAMP comment '����ʱ��',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '�޸�ʱ��',
   primary key (ins_id)
);

alter table om_order_goods comment '������Ʒʵ��';

/*==============================================================*/
/* Table: om_order_logist                                       */
/*==============================================================*/
create table om_order_logist
(
   rec_id               int not null auto_increment comment '��¼id',
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������id',
   reciver_addr_id      int not null comment '��ַid',
   reciver_name         varchar(20) not null comment '�ջ�������',
   reciver_phone        varchar(12) not null comment '�ջ����ֻ���',
   reciver_prov_id      int not null comment '�ջ�ʡ��',
   reciver_city_id      int not null comment '�ջ�����',
   reciver_area_id      int not null comment '�ջ�����',
   reciver_addr_info    varchar(200) not null comment '�ջ��ַ��ϸ',
   deliver_addr_id      int comment '������ַid',
   deliver_msg          varchar(200) comment '������ע',
   deliver_time         datetime comment '����ʱ��',
   shipping_id          varchar(16) comment '���͹�˾',
   shipping_sn          varchar(32) comment '��������',
   remark               varchar(200) comment '��ע',
   create_time          datetime not null default CURRENT_TIMESTAMP comment '����ʱ��',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '�޸�ʱ��',
   primary key (rec_id)
);

alter table om_order_logist comment '����������Ϣ';

/*==============================================================*/
/* Table: om_order_payment                                      */
/*==============================================================*/
create table om_order_payment
(
   pay_id               varchar(32) not null comment '֧����id',
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������id',
   pay_center           varchar(10) not null comment '֧������
            boc������֧��
            alipayna:֧����ԭ��֧��
            alipayh5:֧����wap֧��
            wechatna��΢��app֧��
            wechatmp��΢�Ź��ں�
            ',
   pay_status           tinyint not null default 10 comment '֧��״̬
            10:������
            19:����ɹ�
            20:���˿�
            29:�˿�ɹ�
            ',
   pay_fee              int not null comment '֧�����',
   outtrade_id          varchar(32) comment 'ͳһ�µ�id',
   pay_serial           varchar(32) comment '֧����ˮ��',
   pay_req_time         datetime not null comment '֧������ʱ��',
   pay_req_msg          varchar(500) not null comment '֧��������',
   pay_notify_time      datetime comment '֧��֪ͨʱ��',
   pay_notify_msg       varchar(500) comment '֧��֪ͨ����',
   pay_check            tinyint comment '֧������״̬
            0:δ����
            1:���˳ɹ�',
   refund_serial        varchar(32) comment '�˿���ˮ��',
   refund_req_time      datetime comment '�˿��ʱ��',
   refund_req_msg       varchar(500) comment '�˿�������',
   refund_resp_time     datetime comment '�˿�Ӧ��ʱ��',
   refund_resp_msg      varchar(500) comment '�˿�Ӧ����',
   refund_check         tinyint comment '�˿����״̬
            0:δ����
            1:���˳ɹ�',
   create_time          datetime not null comment '��¼����ʱ��',
   update_time          datetime not null comment '��¼����ʱ��',
   primary key (pay_id)
);

alter table om_order_payment comment '����֧����Ϣ��';

/*==============================================================*/
/* Table: om_order_settlement                                   */
/*==============================================================*/
create table om_order_settlement
(
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) comment '������id',
   handing_rate         int comment '֧�����ط��� ǧ��λ',
   handing_fee          int comment '֧��������',
   base_fee             int comment '�������� ��',
   send_point_rate      int comment '���ͻ��ֱ���',
   send_point           int comment '���ͷ�����',
   help_rate            int comment 'ƶ����������� ǧ��λ',
   help_fee             int comment 'ƶ����������',
   fund_rate           int comment '����������� ǧ��λ',
   fund_fee            int comment '����������׽��',
   seller_income        int comment '���һ�÷��� f��',
   primary key (order_id)
);

alter table om_order_settlement comment '�������ý�����Ϣ';

/*==============================================================*/
/* Table: om_order_voucher                                      */
/*==============================================================*/
create table om_order_voucher
(
   rec_id               int not null auto_increment comment '��¼id',
   order_id             varchar(32) not null comment '����id',
   main_id              varchar(32) not null comment '������id',
   voucher_id           int not null comment '�Ż�ȯid',
   voucher_code         varchar(32) not null comment '�Ż�ȯ����',
   use_time             datetime not null comment 'ʹ��ʱ��',
   voucher_price        int not null default 0 comment 'ʹ�ý��',
   member_id            int not null comment 'ӵ����id',
   voucher_tpl_id       int not null comment '����ȯģ��id',
   remark               varchar(50) comment '��ע',
   is_delete            tinyint not null default 0 comment '�Ƿ�ɾ��',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '����ʱ��',
   primary key (rec_id)
);

alter table om_order_voucher comment '�����Ż�ȯ';

