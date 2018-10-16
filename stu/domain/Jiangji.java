package domain;

public class Jiangji {

    private int jjno;
    private int sno;
    private String sname;
    private String shzt;
    private String shren;
    private String shbz;
    private String xy;
    private String sqdate;
    private String sqyy;
    private String pass;

    public int getJjno() {
        return jjno;
    }

    public void setJjno(int jjno) {
        this.jjno = jjno;
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

    public String getSqdate() {
        return sqdate;
    }

    public void setSqdate(String sqdate) {
        this.sqdate = sqdate;
    }

    public String getSqyy() {
        return sqyy;
    }

    public void setSqyy(String sqyy) {
        this.sqyy = sqyy;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Jiangji{" +
                "jjno=" + jjno +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                ", shzt='" + shzt + '\'' +
                ", shren='" + shren + '\'' +
                ", shbz='" + shbz + '\'' +
                ", xy='" + xy + '\'' +
                ", sqdate='" + sqdate + '\'' +
                ", sqyy='" + sqyy + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
