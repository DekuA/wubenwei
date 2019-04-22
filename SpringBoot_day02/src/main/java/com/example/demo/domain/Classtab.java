package com.example.demo.domain;

public class Classtab {
    private Integer cid;

    private String cname;

    private String ruxue;

    private String biye;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getRuxue() {
        return ruxue;
    }

    public void setRuxue(String ruxue) {
        this.ruxue = ruxue == null ? null : ruxue.trim();
    }

    public String getBiye() {
        return biye;
    }

    public void setBiye(String biye) {
        this.biye = biye == null ? null : biye.trim();
    }
}