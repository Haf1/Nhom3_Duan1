package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SanPham;

public class SanPhamDAO extends ShoesSysDAO<SanPham, String> {

    String SQL_Insert = "INSERT INTO dbo.SanPham (MaSP, MaThuongHieu, TenSanPham, GiaBan, GiaNhap, SoLuong, Mau, Size, MaKM, MaNCC, AnhSP, ChiTiet, TrangThai)  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,1)";
    String SQL_Update = "UPDATE dbo.SanPham SET MaThuongHieu=?, TenSanPham=?, GiaBan=?, GiaNhap=?, SoLuong=?, Mau=?, Size=?, MaKM=?, MaNCC=?, AnhSP=?, ChiTiet=? WHERE MaSP=?";
    String SQL_VoHieuHoa = "UPDATE dbo.SanPham SET TrangThai=0 WHERE MaSP = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.SanPham WHERE TrangThai=1";
    String SQL_SelectID = "SELECT * FROM dbo.SanPham WHERE MaSP=?";

    @Override
    public void insert(SanPham entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaSP(), entity.getMaThuongHieu(), entity.getTenSP(),
                    entity.getDonGia(), entity.getGiaNhap(), entity.getSoLuong(), entity.getMau(), entity.getSize(),
                    entity.getMaKM(), entity.getMaNCC(), entity.getAnhSP(), entity.getChiTiet());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SanPham entity) {
        try {
            helper.JdbcHelper.update(SQL_Update, entity.getMaThuongHieu(), entity.getTenSP(),
                    entity.getDonGia(), entity.getGiaNhap(), entity.getSoLuong(), entity.getSoLuong(), entity.getMau(), entity.getSize(),
                    entity.getMaKM(), entity.getMaNCC(), entity.getAnhSP(), entity.getChiTiet(), entity.getMaSP());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setMaThuongHieu(rs.getString("MaThuongHieu"));
                entity.setTenSP(rs.getString("TenSanPham"));
                entity.setDonGia(rs.getDouble("GiaBan"));
                entity.setGiaNhap(rs.getDouble("GiaNhap"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setMau(rs.getString("Mau"));
                entity.setSize(rs.getInt("Size"));
                entity.setMaKM(rs.getString("MaKM"));
                entity.setMaNCC(rs.getString("MaNCC"));
                entity.setAnhSP(rs.getString("AnhSP"));
                entity.setChiTiet(rs.getString("ChiTiet"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPham> selectPage(String maTH, String keyword, int index) {
        String sql = "SELECT * FROM dbo.SanPham\n"
                + "WHERE MaThuongHieu = ? AND TenSanPham LIKE ? AND TrangThai=1\n"
                + "ORDER BY MaSP OFFSET ? * 20 ROWS FETCH NEXT 20 ROWS ONLY;";
        return this.selectBySql(sql, maTH, "%" + keyword + "%", index);
    }

    public List<SanPham> selectPageTrash(int index) {
        String sql = "SELECT * FROM dbo.SanPham WHERE TrangThai = 0\n"
                + "ORDER BY MaSP OFFSET ? * 15 ROWS FETCH NEXT 15 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

    public void khoiphuc(String id) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.SanPham SET TrangThai=1 WHERE MaSP = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SanPham> selectAllTrash() {
        return this.selectBySql("SELECT * FROM dbo.SanPham WHERE TrangThai=0");
    }

    public List<SanPham> selectGioHang(String math, String mau, String size, String giamin, String giamax, String keyword, int index) {
        String sql = "SELECT * FROM dbo.SanPham\n"
                + "WHERE MaThuongHieu LIKE ? AND TrangThai=1 AND SoLuong>0\n"
                + "    AND Mau LIKE ? \n"
                + "	  AND Size LIKE ? \n"
                + "	  AND GiaBan BETWEEN ? AND ? \n"
                + "	  AND TenSanPham LIKE ?\n"
                + "ORDER BY MaSP OFFSET ? * 6 ROWS FETCH NEXT 6 ROWS ONLY;";
        return this.selectBySql(sql, "%" + math + "%", "%" + mau + "%", "%" + size + "%", giamin, giamax, "%" + keyword + "%", index);
    }

    public void capNhatSoLuong(int soluong, String masp) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.SanPham SET SoLuong=SoLuong-? WHERE MaSP=?", soluong, masp);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SanPham> selectNhapHang(String mancc, int index) {
        String sql = "SELECT * FROM dbo.SanPham\n"
                + "WHERE MaNCC=? AND TrangThai=1\n"
                + "ORDER BY MaSP OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, mancc, index);
    }

    public void capNhatSoLuongNhap(int soluong, String masp) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.SanPham SET SoLuong=SoLuong+? WHERE MaSP=?", soluong, masp);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SanPham> selectNCC(String mancc, int index) {
        String sql = "SELECT * FROM dbo.SanPham\n"
                + "WHERE MaNCC=? AND TrangThai=1\n"
                + "ORDER BY MaSP OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY;";
        return this.selectBySql(sql, mancc, index);
    }
    
    public List<SanPham> selectDoiHang(String masp) {
        String sql = "SELECT * FROM dbo.SanPham\n"
                + "WHERE MaSP LIKE ? AND TrangThai=1\n";
        return this.selectBySql(sql, "%" + masp + "%");
    }
}
