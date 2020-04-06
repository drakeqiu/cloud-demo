package com.jarvis.user.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 12:19 PM 2020/4/4
 * @Modified By:
 */
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String username;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private Date created;

    private Date updated;

    private String note;
}
