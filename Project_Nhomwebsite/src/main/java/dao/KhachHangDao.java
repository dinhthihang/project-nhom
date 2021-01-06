package dao;
import model.ConnectionDH;
import model.KhachHang;
import java.sql.ResultSet;
public class KhachHangDao implements  Object{
    @Override
    public boolean themTaiKhoan(KhachHang kh) {
        try {
            new ConnectionDH().thucThiSQL("INSERT INTO khachhang VALUES('"+kh.getUserName()+"','"+kh.getSdt()+"','"+kh.getMaxacthuc()+"','"+ kh.getEmail()+"','"+kh.getPass()+"')");
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public KhachHang layThongTinTaiKhoan(String username){
        try {
            ResultSet  rs=new ConnectionDH().chonDuLieu("select * from khachhang where Username='"+username+"'");
            while(rs.next()){
                String taikhoan = rs.getString(1);
                String sdt = rs.getString(2);
                String maxacthuc = rs.getString(3);
                String email = rs.getString(4);
                String matkhau = rs.getString(5);
                return new KhachHang(taikhoan,sdt,maxacthuc,email,matkhau);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return null;

    }

    @Override
    public boolean kiemTraDangNhap(String username,String pass) {

        try {
            ResultSet  rs=new ConnectionDH().chonDuLieu("select * from khachhang where UserName='"+username+"'");
            while(rs.next()){
                if(rs.getString(1).equals(username) && rs.getString(5).equals(pass)){
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        return false;
    }

    public static void main(String[] args) {
        KhachHang kh = new KhachHang("HuuThang11","0112222111","ada112","hthang@gmail.com","123123");
        System.out.println(new KhachHangDao().themTaiKhoan(kh));
//        System.out.println(new KhachHangDao().kiemTraDangNhap("HuuThang","123123"));
    }

}
