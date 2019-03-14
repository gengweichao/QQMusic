package com.qfedu.vo;

/**
 * @author gengweichao
 * @date 2019/3/13 17:35
 */
public class SongsVO {

    private String Mname;
    private String Mimg;
    private String Mcul;
    private String Murl;
    private Integer times;
    private String Sname;
    private String Simg;

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getMimg() {
        return Mimg;
    }

    public void setMimg(String mimg) {
        Mimg = mimg;
    }

    public String getMcul() {
        return Mcul;
    }

    public void setMcul(String mcul) {
        Mcul = mcul;
    }

    public String getMurl() {
        return Murl;
    }

    public void setMurl(String murl) {
        Murl = murl;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSimg() {
        return Simg;
    }

    public void setSimg(String simg) {
        Simg = simg;
    }
}
