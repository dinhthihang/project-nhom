package model;

public class KhachHang {
    String userName;
    String sdt;
    String maxacthuc;
    String email;
    String pass;

    public KhachHang(String userName, String sdt, String maxacthuc, String email, String pass) {
        this.userName = userName;
        this.sdt = sdt;
        this.maxacthuc = maxacthuc;
        this.email = email;
        this.pass = pass;
    }

    public KhachHang() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMaxacthuc() {
        return maxacthuc;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "KhachHang [userName=" + userName + ", pass=" + pass + ", sdt=" + sdt + ", email" + email+",maxacthuc=" + maxacthuc +"]";
    }
}
