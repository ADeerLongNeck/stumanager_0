package domain;

public class XiuXue {

    private int xxno;

    private int sno;

    private String sname;
    private String sqyy;
    private String sqdate;
    private String fxdate;
    private String shzt;
    private String shren;
    private String shbz;
    private String xy;

    public int getXxno() {
        return xxno;
    }

    public void setXxno(int xxno) {
        this.xxno = xxno;
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

    public String getSqyy() {
        return sqyy;
    }

    public void setSqyy(String sqyy) {
        this.sqyy = sqyy;
    }

    public String getSqdate() {
        return sqdate;
    }

    public void setSqdate(String sqdate) {
        this.sqdate = sqdate;
    }

    public String getFxdate() {
        return fxdate;
    }

    public void setFxdate(String fxdate) {
        this.fxdate = fxdate;
    }

    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt;
    }

    public String getShren() {
        return shren;
    }

    public void setShren(String shren) {
        this.shren = shren;
    }

    public String getShbz() {
        return shbz;
    }

    public void setShbz(String shbz) {
        this.shbz = shbz;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "XiuXue{" +
                "xxno=" + xxno +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                ", sqyy='" + sqyy + '\'' +
                ", sqdate='" + sqdate + '\'' +
                ", fxdate='" + fxdate + '\'' +
                ", shzt='" + shzt + '\'' +
                ", shren='" + shren + '\'' +
                ", shbz='" + shbz + '\'' +
                ", xy='" + xy + '\'' +
                '}';
    }
}
