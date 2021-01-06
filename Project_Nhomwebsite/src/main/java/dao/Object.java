package dao;

import model.KhachHang;

public interface Object {
    public boolean themTaiKhoan(KhachHang kh);
    public boolean kiemTraDangNhap(String username,String pass);
}
