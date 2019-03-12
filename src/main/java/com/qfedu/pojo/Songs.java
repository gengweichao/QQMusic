package com.qfedu.pojo;

import java.util.Date;

public class Songs {
    private Integer songid;

    private String songname;

    private String songimgurl;

    private String songlrcurl;

    private String songurl;

    private Date time;

    private Integer singerid;

    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname == null ? null : songname.trim();
    }

    public String getSongimgurl() {
        return songimgurl;
    }

    public void setSongimgurl(String songimgurl) {
        this.songimgurl = songimgurl == null ? null : songimgurl.trim();
    }

    public String getSonglrcurl() {
        return songlrcurl;
    }

    public void setSonglrcurl(String songlrcurl) {
        this.songlrcurl = songlrcurl == null ? null : songlrcurl.trim();
    }

    public String getSongurl() {
        return songurl;
    }

    public void setSongurl(String songurl) {
        this.songurl = songurl == null ? null : songurl.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSingerid() {
        return singerid;
    }

    public void setSingerid(Integer singerid) {
        this.singerid = singerid;
    }
}