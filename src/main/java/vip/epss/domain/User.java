package vip.epss.domain;

import lombok.Data;

import java.util.Date;


@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private Date addTime;
}
