package domain;

public class FuXue {

    private int fxno;
    private int sno;
    private String sname;
    private String sqyy;
    private String sqdate;
    private String fxdate;
    private String shzt;
    private String shr;
    private String shbz;

    public int getFxno() {
        return fxno;
    }

    public void setFxno(int fxno) {
        this.fxno = fxno;
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

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getShbz() {
        return shbz;
    }

    public void setShbz(String shbz) {
        this.shbz = shbz;
    }

    @Override
    public String toString() {
        return "FuXue{" +
                "fxno=" + fxno +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                ", sqyy='" + sqyy + '\'' +
                ", sqdate='" + sqdate + '\'' +
                ", fxdate='" + fxdate + '\'' +
                ", shzt='" + shzt + '\'' +
                ", shr='" + shr + '\'' +
                ", shbz='" + shbz + '\'' +
                '}';
    }
}
