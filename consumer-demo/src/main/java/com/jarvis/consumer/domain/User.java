package com.jarvis.consumer.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 12:19 PM 2020/4/4
 * @Modified By:
 */
@Data
public class User {

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
