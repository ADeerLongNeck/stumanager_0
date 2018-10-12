package domain;

public class Jiangji {

    private int sno;
    private String sname;
    private String shzt;
    private String shr;
    private String shbz;

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
        return "Jiangji{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", shzt='" + shzt + '\'' +
                ", shr='" + shr + '\'' +
                ", shbz='" + shbz + '\'' +
                '}';
    }
}
