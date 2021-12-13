package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> SelectThongKeNgay(String ngaybdn, String ngayktn, String ngaybdt, String ngayktt, int index) {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT B.NgayNhapHang, SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap'\n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY B.NgayNhapHang HAVING B.NgayNhapHang BETWEEN ? AND ?) D FULL JOIN (SELECT B.NgayThanhToan, SUM(A.SoLuong*A.DonGia) AS 'TienBan'\n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY B.NgayThanhToan HAVING B.NgayThanhToan BETWEEN ? AND ?) C ON D.NgayNhapHang = C.NgayThanhToan\n"
                + ") ORDER BY C.NgayThanhToan OFFSET ? * 15 ROWS FETCH NEXT 15 ROWS ONLY";
        String tongtien[] = {"NgayThanhToan", "TienBan", "NgayNhapHang", "TienNhap"};
        return getListOfArray(sql, tongtien, ngaybdn, ngayktn, ngaybdt, ngayktt, index);
    }

    public List<Object[]> SelectThongKeNgay1() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT B.NgayNhapHang, SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap'\n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY B.NgayNhapHang) D FULL JOIN (SELECT B.NgayThanhToan, SUM(A.SoLuong*A.DonGia) AS 'TienBan'\n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY B.NgayThanhToan) C ON D.NgayNhapHang = C.NgayThanhToan\n"
                + ")";
        String tongtien[] = {"NgayThanhToan", "TienBan", "NgayNhapHang", "TienNhap"};
        return getListOfArray(sql, tongtien);
    }

    public List<Object[]> SelectThongKeThang(String thangbdn, String thangktn, String thangbdt, String thangktt) {
        String sql = "SELECT * FROM\n"
                + "(\n"
                + "(SELECT MONTH(B.NgayNhapHang) AS 'Tháng', SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap'\n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY MONTH(B.NgayNhapHang) HAVING MONTH(B.NgayNhapHang) BETWEEN ? AND ?) D FULL JOIN (SELECT MONTH(B.NgayThanhToan) AS 'Thang', SUM(A.SoLuong*A.DonGia) AS 'TienBan'\n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY MONTH(B.NgayThanhToan) HAVING MONTH(B.NgayThanhToan) BETWEEN ? AND ?) C ON D.Tháng = C.Thang\n"
                + ")";
        String tongtien[] = {"Thang", "TienBan", "Tháng", "TienNhap"};
        return getListOfArray(sql, tongtien, thangbdn, thangktn, thangbdt, thangktt);
    }

    public List<Object[]> SelectThongKeNam() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT YEAR(B.NgayThanhToan) AS 'Năm', SUM(A.SoLuong*A.DonGia) AS 'TienBan' \n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY YEAR(B.NgayThanhToan)) C FULL JOIN (SELECT YEAR(B.NgayNhapHang) AS 'Năm', SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap' \n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY YEAR(B.NgayNhapHang)) D ON D.Năm = C.Năm\n"
                + ")";
        String tongtien[] = {"Năm", "TienBan", "Năm", "TienNhap"};
        return getListOfArray(sql, tongtien);
    }

    public List<Object[]> SelectThongKeSanPham(int index) {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT A.MaSP, SUM(A.SoLuong) AS 'Nhập' FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.SanPham B ON B.MaSP = A.MaSP\n"
                + "GROUP BY A.MaSP, B.MaSP) C \n"
                + "FULL JOIN (SELECT A.MaSanPham, SUM(A.SoLuong) AS 'Bán' FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham\n"
                + "GROUP BY A.MaSanPham, B.MaSP, A.TrangThai HAVING A.TrangThai = 1) D ON C.MaSP = D.MaSanPham \n"
                + "FULL JOIN (SELECT A.MaSanPham, SUM(A.SoLuong) AS 'Trả' FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham\n"
                + "GROUP BY A.MaSanPham, B.MaSP, A.TrangThai HAVING A.TrangThai = 0) E ON E.MaSanPham = D.MaSanPham\n"
                + ") ORDER BY C.MaSP OFFSET ? * 20 ROWS FETCH NEXT 20 ROWS ONLY";
        String sanpham[] = {"MaSP", "Nhập", "MaSanPham", "Bán", "MaSanPham", "Trả"};
        return getListOfArray(sql, sanpham, index);
    }

    public List<Object[]> SelectThongKeSanPham1() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT A.MaSP, SUM(A.SoLuong) AS 'Nhập' FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.SanPham B ON B.MaSP = A.MaSP\n"
                + "GROUP BY A.MaSP, B.MaSP) C \n"
                + "FULL JOIN (SELECT A.MaSanPham, SUM(A.SoLuong) AS 'Bán' FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham\n"
                + "GROUP BY A.MaSanPham, B.MaSP, A.TrangThai HAVING A.TrangThai = 1) D ON C.MaSP = D.MaSanPham \n"
                + "FULL JOIN (SELECT A.MaSanPham, SUM(A.SoLuong) AS 'Trả' FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham\n"
                + "GROUP BY A.MaSanPham, B.MaSP, A.TrangThai HAVING A.TrangThai = 0) E ON E.MaSanPham = D.MaSanPham\n"
                + ")";
        String sanpham[] = {"MaSP", "Nhập", "MaSanPham", "Bán", "MaSanPham", "Trả"};
        return getListOfArray(sql, sanpham);
    }
}
