package domain;

import java.util.Date;

public class Student {

    private int sno;

    private String sname;

    private String szy;

    private String sxy;

    private String csdate;

    private String rxdate;

    private String bydate;

    private String zzmm;

    private String jtzz;

    private String mz;

    private String jhr;

    private String sex;

    private String sfzno;

    private String phone;

    private String extra;

    private int nj;

    private String xiuxue;

    public Student() {
        this.xiuxue = "no";
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSzy() {
        return szy;
    }

    public void setSzy(String szy) {
        this.szy = szy;
    }

    public String getSxy() {
        return sxy;
    }

    public void setSxy(String sxy) {
        this.sxy = sxy;
    }

    public String getCsdate() {
        return csdate;
    }

    public void setCsdate(String csdate) {
        this.csdate = csdate;
    }

    public String getRxdate() {
        return rxdate;
    }

    public void setRxdate(String rxdate) {
        this.rxdate = rxdate;
    }

    public String getBydate() {
        return bydate;
    }

    public void setBydate(String bydate) {
        this.bydate = bydate;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    public String getJtzz() {
        return jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getJhr() {
        return jhr;
    }

    public void setJhr(String jhr) {
        this.jhr = jhr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSfzno() {
        return sfzno;
    }

    public void setSfzno(String sfzno) {
        this.sfzno = sfzno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getNj() {
        return nj;
    }

    public void setNj(int nj) {
        this.nj = nj;
    }

    public String getXiuxue() {
        return xiuxue;
    }

    public void setXiuxue(String xiuxue) {
        this.xiuxue = xiuxue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", szy='" + szy + '\'' +
                ", sxy='" + sxy + '\'' +
                ", csdate='" + csdate + '\'' +
                ", rxdate='" + rxdate + '\'' +
                ", bydate='" + bydate + '\'' +
                ", zzmm='" + zzmm + '\'' +
                ", jtzz='" + jtzz + '\'' +
                ", mz='" + mz + '\'' +
                ", jhr='" + jhr + '\'' +
                ", sex='" + sex + '\'' +
                ", sfzno='" + sfzno + '\'' +
                ", phone='" + phone + '\'' +
                ", extra='" + extra + '\'' +
                ", nj=" + nj +
                ", xiuxue='" + xiuxue + '\'' +
                '}';
    }
}
