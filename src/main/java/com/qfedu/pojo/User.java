package com.qfedu.pojo;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String userphone;

    private String userpassword;

    private String useraddr;

    private Integer usersex;

    private Date userbath;

    private String userimg;

    private String usertatu;

    private String usercommon;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Date getUserbath() {
        return userbath;
    }

    public void setUserbath(Date userbath) {
        this.userbath = userbath;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public String getUsertatu() {
        return usertatu;
    }

    public void setUsertatu(String usertatu) {
        this.usertatu = usertatu == null ? null : usertatu.trim();
    }

    public String getUsercommon() {
        return usercommon;
    }

    public void setUsercommon(String usercommon) {
        this.usercommon = usercommon == null ? null : usercommon.trim();
    }
}