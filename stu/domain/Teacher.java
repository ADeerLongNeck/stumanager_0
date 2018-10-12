package domain;

public class Teacher {

    private int tno;
    private String tname;
    private String ssxy;

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSsxy() {
        return ssxy;
    }

    public void setSsxy(String ssxy) {
        this.ssxy = ssxy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", ssxy='" + ssxy + '\'' +
                '}';
    }
}
