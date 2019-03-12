package com.qfedu.pojo;

public class Singers {
    private Integer singid;

    private String singname;

    private String singimg;

    public Integer getSingid() {
        return singid;
    }

    public void setSingid(Integer singid) {
        this.singid = singid;
    }

    public String getSingname() {
        return singname;
    }

    public void setSingname(String singname) {
        this.singname = singname == null ? null : singname.trim();
    }

    public String getSingimg() {
        return singimg;
    }

    public void setSingimg(String singimg) {
        this.singimg = singimg == null ? null : singimg.trim();
    }
}