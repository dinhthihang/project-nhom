package controller;

import dao.KhachHangDao;
import model.KhachHang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "/XuLyDangKy" , urlPatterns = )
public class XuLyDangKy extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public XuLyDangKy() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String taikhoan = request.getParameter("uname");
        String sodienthoai = request.getParameter("sdt");
        String maxacthuc= request.getParameter("maxacthuc");
        String email = request.getParameter("email");
        String matkhau = request.getParameter("password");

        KhachHang kh = new KhachHang(taikhoan,sodienthoai,maxacthuc,email,matkhau);

        if(new KhachHangDao().themTaiKhoan(kh)){
            HttpSession session = request.getSession();
            session.setAttribute("user",kh);
            response.sendRedirect("dangki.jsp");
        }else{
            System.out.println("Lỗi đăng kí");
        }



    }
}
