package com.xuehui.order.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;//主键
    private String name;//姓名
    private int age ;//年龄
    private String passwordencrypt;//密码
    private String address;//地址
    private String telphone;//手机号
    private String qq;//qq
    private String weixin;//微信
    private String email;//邮箱
    private String sex;//性别
    private String account;//用户名
    private String birthday;//生日时间
}
