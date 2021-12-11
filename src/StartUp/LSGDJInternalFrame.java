package StartUp;

import DAO.ChiTietHoaDonNhapHangDAO;
import DAO.ChiTietHoaDonThanhToanDAO;
import DAO.HoaDonNhapHangDAO;
import DAO.HoaDonThanhToanDAO;
import DAO.KhachHangDAO;
import DAO.SanPhamDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.currency;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.ChiTietHoaDonNhapHang;
import model.ChiTietHoaDonThanhToan;
import model.HoaDonNhapHang;
import model.HoaDonThanhToan;

public class LSGDJInternalFrame extends javax.swing.JInternalFrame {

    HoaDonThanhToanDAO daott = new HoaDonThanhToanDAO();
    ChiTietHoaDonThanhToanDAO daoct = new ChiTietHoaDonThanhToanDAO();
    HoaDonNhapHangDAO daonh = new HoaDonNhapHangDAO();
    ChiTietHoaDonNhapHangDAO daoctnh = new ChiTietHoaDonNhapHangDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    SanPhamDAO daosp = new SanPhamDAO();
    int row = -1;
    int row1 = -1;
    int index = 0;
    int index1 = 0;
    int index2 = 0;

    public LSGDJInternalFrame(String color) {
        initComponents();
        init();
        pn1.setBackground(new Color(Integer.parseInt(color, 16)));
        pn2.setBackground(new Color(Integer.parseInt(color, 16)));
        pn3.setBackground(new Color(Integer.parseInt(color, 16)));
        pn4.setBackground(new Color(Integer.parseInt(color, 16)));
        pn5.setBackground(new Color(Integer.parseInt(color, 16)));
        pn6.setBackground(new Color(Integer.parseInt(color, 16)));
        pn7.setBackground(new Color(Integer.parseInt(color, 16)));
        pn8.setBackground(new Color(Integer.parseInt(color, 16)));
        pn9.setBackground(new Color(Integer.parseInt(color, 16)));
        pn10.setBackground(new Color(Integer.parseInt(color, 16)));
        pn11.setBackground(new Color(Integer.parseInt(color, 16)));
        pn12.setBackground(new Color(Integer.parseInt(color, 16)));
        pn13.setBackground(new Color(Integer.parseInt(color, 16)));
        pn14.setBackground(new Color(Integer.parseInt(color, 16)));
        pn15.setBackground(new Color(Integer.parseInt(color, 16)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn5 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        pn3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnPreHD = new javax.swing.JButton();
        btnNextHD = new javax.swing.JButton();
        lblChiSoHD = new javax.swing.JLabel();
        btnXuatHD = new javax.swing.JButton();
        DCNgayBD = new com.toedter.calendar.JDateChooser();
        DCNgayKetThuc = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();
        pn2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        pn4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnXuatFileEX = new javax.swing.JButton();
        txtDiemThuong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNgayThanhToan = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDiemDoi = new javax.swing.JTextField();
        btnTraHang = new javax.swing.JButton();
        btnDoiHang = new javax.swing.JButton();
        pn10 = new javax.swing.JPanel();
        pn11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DCNgayKTNH = new com.toedter.calendar.JDateChooser();
        DCNgayBDNH = new com.toedter.calendar.JDateChooser();
        pn6 = new javax.swing.JPanel();
        txtTimKiemNH = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoaDonNH = new javax.swing.JTable();
        btnPreHDNH = new javax.swing.JButton();
        lblChiSoHDNH = new javax.swing.JLabel();
        btnNextHDNH = new javax.swing.JButton();
        btnLocNH = new javax.swing.JButton();
        pn12 = new javax.swing.JPanel();
        txtMaHoaDonNH = new javax.swing.JTextField();
        txtMaNhanVienNH = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNhaCungCap = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JTextField();
        pn7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanPhamNH = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtTongTienNH = new javax.swing.JTextField();
        pn13 = new javax.swing.JPanel();
        pn14 = new javax.swing.JPanel();
        pn15 = new javax.swing.JPanel();
        btnNextHDTH = new javax.swing.JButton();
        lblChiSoHDTH = new javax.swing.JLabel();
        btnPreHDTH = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHoaDonTH = new javax.swing.JTable();
        pn8 = new javax.swing.JPanel();
        txtTimKiemTH = new javax.swing.JTextField();
        txtMaHoaDonTH = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtMaKhachHangTH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtMaNhanVienTH = new javax.swing.JTextField();
        txtNgayThanhToanTH = new javax.swing.JTextField();
        pn9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSanPhamTH = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Lịch Sử Giao Dịch");

        pn5.setBackground(new java.awt.Color(255, 204, 204));

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn1.setBackground(new java.awt.Color(0, 153, 102));

        pn3.setBackground(new java.awt.Color(0, 153, 102));
        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày Bắt Đầu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Kết Thúc");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Ngày Thanh Toán", "Điểm Thưởng", "Đổi Điểm", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(4).setHeaderValue("Điểm Thưởng");
            tblHoaDon.getColumnModel().getColumn(5).setHeaderValue("Đổi Điểm");
        }

        btnPreHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreHD.setText("<<");
        btnPreHD.setEnabled(false);
        btnPreHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreHDActionPerformed(evt);
            }
        });

        btnNextHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextHD.setText(">>");
        btnNextHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextHDActionPerformed(evt);
            }
        });

        lblChiSoHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoHD.setText("1");

        btnXuatHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXuatHD.setText("Xuất hóa đơn");
        btnXuatHD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnPreHD)
                                .addGap(18, 18, 18)
                                .addComponent(lblChiSoHD)
                                .addGap(18, 18, 18)
                                .addComponent(btnNextHD)
                                .addGap(131, 131, 131)
                                .addComponent(btnXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(DCNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreHD)
                    .addComponent(btnNextHD)
                    .addComponent(lblChiSoHD)
                    .addComponent(btnXuatHD))
                .addContainerGap())
        );

        tabs.addTab("HĐ Thanh Toán", pn1);

        pn2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mã Hóa Đơn");

        txtMaHoaDon.setEditable(false);
        txtMaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã Khách Hàng");

        txtMaKhachHang.setEditable(false);
        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn4.setBackground(new java.awt.Color(255, 204, 204));
        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Màu", "Size", "Đơn Giá", "Số Lượng", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mã Nhân Viên");

        txtMaNhanVien.setEditable(false);
        txtMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Điểm Thưởng");

        btnXuatFileEX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXuatFileEX.setText("Xuất file Excel");
        btnXuatFileEX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatFileEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileEXActionPerformed(evt);
            }
        });

        txtDiemThuong.setEditable(false);
        txtDiemThuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ngày Thanh Toán");

        txtNgayThanhToan.setEditable(false);
        txtNgayThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtGhiChu.setEditable(false);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Ghi Chú");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tổng Tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Điểm Đổi");

        txtDiemDoi.setEditable(false);
        txtDiemDoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTraHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraHang.setText("Trả Hàng");
        btnTraHang.setEnabled(false);
        btnTraHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraHangActionPerformed(evt);
            }
        });

        btnDoiHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoiHang.setText("Đổi Hàng");
        btnDoiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDoiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTraHang)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatFileEX, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtMaHoaDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiemDoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemDoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatFileEX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        tabs.addTab("CT Thanh Toán", pn2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Bắt Đầu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ngày Kết Thúc");

        pn6.setBackground(new java.awt.Color(255, 255, 255));
        pn6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiemNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiemNH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemNHKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemNH)
                .addContainerGap())
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiemNH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblHoaDonNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Nhà Cung Cấp", "Mã Nhân Viên", "Ngày Nhập", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDonNH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDonNH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonNHMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHoaDonNH);

        btnPreHDNH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreHDNH.setText("<<");
        btnPreHDNH.setEnabled(false);
        btnPreHDNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreHDNHActionPerformed(evt);
            }
        });

        lblChiSoHDNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoHDNH.setText("1");

        btnNextHDNH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextHDNH.setText(">>");
        btnNextHDNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextHDNHActionPerformed(evt);
            }
        });

        btnLocNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLocNH.setText("Lọc");
        btnLocNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocNHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn11Layout = new javax.swing.GroupLayout(pn11);
        pn11.setLayout(pn11Layout);
        pn11Layout.setHorizontalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                            .addComponent(pn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn11Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgayBDNH, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DCNgayKTNH, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLocNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pn11Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(btnPreHDNH)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoHDNH)
                .addGap(18, 18, 18)
                .addComponent(btnNextHDNH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn11Layout.setVerticalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DCNgayBDNH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn11Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)))
                    .addComponent(jLabel8)
                    .addComponent(DCNgayKTNH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocNH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreHDNH)
                    .addComponent(btnNextHDNH)
                    .addComponent(lblChiSoHDNH))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn10Layout = new javax.swing.GroupLayout(pn10);
        pn10.setLayout(pn10Layout);
        pn10Layout.setHorizontalGroup(
            pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn10Layout.setVerticalGroup(
            pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabs.addTab("HĐ Nhập Hàng", pn10);

        txtMaHoaDonNH.setEditable(false);
        txtMaHoaDonNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMaNhanVienNH.setEditable(false);
        txtMaNhanVienNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Mã Nhân Viên");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Mã Hóa Đơn");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Nhà Cung Cấp");

        txtNhaCungCap.setEditable(false);
        txtNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Ngày Nhập");

        txtNgayNhap.setEditable(false);
        txtNgayNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn7.setBackground(new java.awt.Color(255, 204, 204));
        pn7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPhamNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Màu", "Size", "Giá Nhập", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamNH.setName(""); // NOI18N
        tblSanPhamNH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tblSanPhamNH);

        javax.swing.GroupLayout pn7Layout = new javax.swing.GroupLayout(pn7);
        pn7.setLayout(pn7Layout);
        pn7Layout.setHorizontalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pn7Layout.setVerticalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Tổng Tiền");

        txtTongTienNH.setEditable(false);
        txtTongTienNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pn12Layout = new javax.swing.GroupLayout(pn12);
        pn12.setLayout(pn12Layout);
        pn12Layout.setHorizontalGroup(
            pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn12Layout.createSequentialGroup()
                        .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn12Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel15))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNhaCungCap)
                            .addComponent(txtMaHoaDonNH, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayNhap)
                            .addComponent(txtMaNhanVienNH, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongTienNH, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn12Layout.setVerticalGroup(
            pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMaHoaDonNH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtMaNhanVienNH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTienNH, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        tabs.addTab("CT Nhập Hàng", pn12);

        pn15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Có Sản Phẩm Bị Trả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNextHDTH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextHDTH.setText(">>");
        btnNextHDTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextHDTHActionPerformed(evt);
            }
        });

        lblChiSoHDTH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoHDTH.setText("1");

        btnPreHDTH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreHDTH.setText("<<");
        btnPreHDTH.setEnabled(false);
        btnPreHDTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreHDTHActionPerformed(evt);
            }
        });

        tblHoaDonTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Ngày Thanh Toán", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDonTH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDonTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonTHMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblHoaDonTH);

        javax.swing.GroupLayout pn15Layout = new javax.swing.GroupLayout(pn15);
        pn15.setLayout(pn15Layout);
        pn15Layout.setHorizontalGroup(
            pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(pn15Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(btnPreHDTH)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoHDTH)
                .addGap(18, 18, 18)
                .addComponent(btnNextHDTH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn15Layout.setVerticalGroup(
            pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn15Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreHDTH)
                    .addComponent(btnNextHDTH)
                    .addComponent(lblChiSoHDTH))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn8.setBackground(new java.awt.Color(255, 255, 255));
        pn8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiemTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiemTH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTHKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn8Layout = new javax.swing.GroupLayout(pn8);
        pn8.setLayout(pn8Layout);
        pn8Layout.setHorizontalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemTH)
                .addContainerGap())
        );
        pn8Layout.setVerticalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiemTH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtMaHoaDonTH.setEditable(false);
        txtMaHoaDonTH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Mã Hóa Đơn");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Mã Khách Hàng");

        txtMaKhachHangTH.setEditable(false);
        txtMaKhachHangTH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Ngày Thanh Toán");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Mã Nhân Viên");

        txtMaNhanVienTH.setEditable(false);
        txtMaNhanVienTH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNgayThanhToanTH.setEditable(false);
        txtNgayThanhToanTH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pn9.setBackground(new java.awt.Color(255, 204, 204));
        pn9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPhamTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Màu", "Size", "Đơn Giá", "Số Lượng", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamTH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(tblSanPhamTH);

        javax.swing.GroupLayout pn9Layout = new javax.swing.GroupLayout(pn9);
        pn9.setLayout(pn9Layout);
        pn9Layout.setHorizontalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        pn9Layout.setVerticalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn14Layout = new javax.swing.GroupLayout(pn14);
        pn14.setLayout(pn14Layout);
        pn14Layout.setHorizontalGroup(
            pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn14Layout.createSequentialGroup()
                        .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn14Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel20))
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKhachHangTH)
                            .addComponent(txtMaHoaDonTH, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayThanhToanTH)
                            .addComponent(txtMaNhanVienTH, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addComponent(pn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn14Layout.setVerticalGroup(
            pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn14Layout.createSequentialGroup()
                .addComponent(pn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtMaHoaDonTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtMaNhanVienTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtMaKhachHangTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtNgayThanhToanTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn13Layout = new javax.swing.GroupLayout(pn13);
        pn13.setLayout(pn13Layout);
        pn13Layout.setHorizontalGroup(
            pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn13Layout.setVerticalGroup(
            pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabs.addTab("Trả Hàng", pn13);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Lịch Sử Giao Dịch");

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(215, 215, 215))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatFileEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatFileEXActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTableHD(0);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblHoaDon.getSelectedRow();
            this.editHD();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        this.row = tblSanPham.getSelectedRow();
        this.editSP();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnNextHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextHDActionPerformed
        nextPageHD();
        lblChiSoHD.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextHDActionPerformed

    private void btnPreHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreHDActionPerformed
        prePageHD();
        lblChiSoHD.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreHDActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        int ngaybd;
        int ngaykt;
        if (DCNgayBD.getDate() == null) {
            ngaybd = 100101;
        } else {
            ngaybd = Integer.parseInt(DateHelper.toString(DCNgayBD.getDate(), "yyMMdd"));
        }
        if (DCNgayKetThuc.getDate() == null) {
            ngaykt = 990101;
        } else {
            ngaykt = Integer.parseInt(DateHelper.toString(DCNgayKetThuc.getDate(), "yyMMdd"));
        }
        if (ngaykt < ngaybd) {
            MsgBoxHelper.alert(this, "Ngày kết thúc phải nằm sau ngày bắt đầu !!");
            return;
        } else {
            fillTableHD(0);
            lblChiSoHD.setText(1 + "");
            btnNextHD.setEnabled(true);
            btnPreHD.setEnabled(false);
        }
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        row = tblSanPham.getSelectedRow();
        row1 = tblHoaDon.getSelectedRow();
        if (tblSanPham.getRowCount() == 1) {
            if (tblSanPham.getValueAt(row, 5).toString().equals("1")) {
                traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                truDiem(txtMaKhachHang.getText());
                voHieuHoa(txtMaHoaDon.getText());
                clearForm();
                fillTableHD(0);
            } else {
                int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Xin mời nhập số lượng sản phẩm cần trả !!"));
                if (value > Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    MsgBoxHelper.alert(this, "Số lượng trả hàng không hợp lệ !!");
                } else if (value == Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    truDiem(txtMaKhachHang.getText());
                    voHieuHoa(txtMaHoaDon.getText());
                    clearForm();
                    fillTableHD(0);
                } else {
                    traHang1(value, txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), daosp.selectById(ct.getMaSP()).getTenSP(),
                                daosp.selectById(ct.getMaSP()).getMau(), daosp.selectById(ct.getMaSP()).getSize(),
                                currency.toCurrency(ct.getDonGia()), ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                }
            }
        } else {
            if (tblSanPham.getValueAt(row, 5).toString().equals("1")) {
                traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                mol.setRowCount(0);
                try {
                    String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                    List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                    for (ChiTietHoaDonThanhToan ct : listct) {
                        Object[] row = {ct.getMaSP(), daosp.selectById(ct.getMaSP()).getTenSP(),
                            daosp.selectById(ct.getMaSP()).getMau(), daosp.selectById(ct.getMaSP()).getSize(),
                            currency.toCurrency(ct.getDonGia()), ct.getSoLuong(), ct.getKhuyenMai()};
                        mol.addRow(row);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                }
                List<Double> tiensp = new ArrayList<>();
                double thanhtoan = 0;
                for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                    tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                    thanhtoan = thanhtoan + tiensp.get(i);
                }
                txtTongTien.setText(currency.toCurrency(thanhtoan));
            } else {
                int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Xin mời nhập số lượng sản phẩm cần trả !!"));
                if (value > Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    MsgBoxHelper.alert(this, "Số lượng trả hàng không hợp lệ !!");
                } else if (value == Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), daosp.selectById(ct.getMaSP()).getTenSP(),
                                daosp.selectById(ct.getMaSP()).getMau(), daosp.selectById(ct.getMaSP()).getSize(),
                                currency.toCurrency(ct.getDonGia()), ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                } else {
                    traHang1(value, txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), daosp.selectById(ct.getMaSP()).getTenSP(),
                                daosp.selectById(ct.getMaSP()).getMau(), daosp.selectById(ct.getMaSP()).getSize(),
                                currency.toCurrency(ct.getDonGia()), ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                }
            }
        }
        fillTableTraHang(0);
        btnPreHDTH.setEnabled(false);
        btnNextHDTH.setEnabled(true);
        lblChiSoHDTH.setText(1 + "");
    }//GEN-LAST:event_btnTraHangActionPerformed

    private void txtTimKiemNHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemNHKeyReleased
        this.fillTableHDNhap(0);
    }//GEN-LAST:event_txtTimKiemNHKeyReleased

    private void tblHoaDonNHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonNHMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblHoaDonNH.getSelectedRow();
            this.editNH();
        }
    }//GEN-LAST:event_tblHoaDonNHMouseClicked

    private void btnPreHDNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreHDNHActionPerformed
        prePageHDNH();
        lblChiSoHDNH.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnPreHDNHActionPerformed

    private void btnNextHDNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextHDNHActionPerformed
        nextPageHDNH();
        lblChiSoHDNH.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnNextHDNHActionPerformed

    private void tblHoaDonTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonTHMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblHoaDonTH.getSelectedRow();
            this.editTH();
        }
    }//GEN-LAST:event_tblHoaDonTHMouseClicked

    private void btnPreHDTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreHDTHActionPerformed
        prePageHDTH();
        lblChiSoHDTH.setText(index2 + 1 + "");
    }//GEN-LAST:event_btnPreHDTHActionPerformed

    private void btnNextHDTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextHDTHActionPerformed
        nextPageHDTH();
        lblChiSoHDTH.setText(index2 + 1 + "");
    }//GEN-LAST:event_btnNextHDTHActionPerformed

    private void txtTimKiemTHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTHKeyReleased
        this.fillTableTraHang(0);
    }//GEN-LAST:event_txtTimKiemTHKeyReleased

    private void btnLocNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocNHActionPerformed
        int ngaybd;
        int ngaykt;
        if (DCNgayBDNH.getDate() == null) {
            ngaybd = 100101;
        } else {
            ngaybd = Integer.parseInt(DateHelper.toString(DCNgayBDNH.getDate(), "yyMMdd"));
        }
        if (DCNgayKTNH.getDate() == null) {
            ngaykt = 990101;
        } else {
            ngaykt = Integer.parseInt(DateHelper.toString(DCNgayKTNH.getDate(), "yyMMdd"));
        }
        if (ngaykt < ngaybd) {
            MsgBoxHelper.alert(this, "Ngày kết thúc phải nằm sau ngày bắt đầu !!");
            return;
        } else {
            fillTableHDNhap(0);
            lblChiSoHDNH.setText(1 + "");
            btnNextHDNH.setEnabled(true);
            btnPreHDNH.setEnabled(false);
        }
    }//GEN-LAST:event_btnLocNHActionPerformed

    private void btnDoiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiHangActionPerformed
        row = tblSanPham.getSelectedRow();
        String masp = tblSanPham.getValueAt(row, 0).toString();
        String mahdtt = txtMaHoaDon.getText();
        new DoiHangJFrame(masp, mahdtt).setVisible(true);
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_btnDoiHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgayBD;
    private com.toedter.calendar.JDateChooser DCNgayBDNH;
    private com.toedter.calendar.JDateChooser DCNgayKTNH;
    private com.toedter.calendar.JDateChooser DCNgayKetThuc;
    private javax.swing.JButton btnDoiHang;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnLocNH;
    private javax.swing.JButton btnNextHD;
    private javax.swing.JButton btnNextHDNH;
    private javax.swing.JButton btnNextHDTH;
    private javax.swing.JButton btnPreHD;
    private javax.swing.JButton btnPreHDNH;
    private javax.swing.JButton btnPreHDTH;
    private javax.swing.JButton btnTraHang;
    private javax.swing.JButton btnXuatFileEX;
    private javax.swing.JButton btnXuatHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblChiSoHD;
    private javax.swing.JLabel lblChiSoHDNH;
    private javax.swing.JLabel lblChiSoHDTH;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn10;
    private javax.swing.JPanel pn11;
    private javax.swing.JPanel pn12;
    private javax.swing.JPanel pn13;
    private javax.swing.JPanel pn14;
    private javax.swing.JPanel pn15;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JPanel pn7;
    private javax.swing.JPanel pn8;
    private javax.swing.JPanel pn9;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblHoaDonNH;
    private javax.swing.JTable tblHoaDonTH;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblSanPhamNH;
    private javax.swing.JTable tblSanPhamTH;
    private javax.swing.JTextField txtDiemDoi;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaHoaDonNH;
    private javax.swing.JTextField txtMaHoaDonTH;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaKhachHangTH;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaNhanVienNH;
    private javax.swing.JTextField txtMaNhanVienTH;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNgayThanhToan;
    private javax.swing.JTextField txtNgayThanhToanTH;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiemNH;
    private javax.swing.JTextField txtTimKiemTH;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTienNH;
    // End of variables declaration//GEN-END:variables
    void init() {
        tabs.setSelectedIndex(0);
        this.fillTableHD(0);
        this.fillTableHDNhap(0);
        this.fillTableTraHang(0);
        lblChiSoHD.setText(index + 1 + "");
        lblChiSoHDNH.setText(index1 + 1 + "");
        lblChiSoHDTH.setText(index2 + 1 + "");
        this.row = -1;
        editSP();

        TableColumnModel mol = tblHoaDon.getColumnModel();
        mol.getColumn(0).setMaxWidth(115);
        mol.getColumn(1).setMaxWidth(115);
        mol.getColumn(2).setMaxWidth(95);
        mol.getColumn(3).setMaxWidth(130);
        mol.getColumn(4).setMaxWidth(100);
        mol.getColumn(5).setMaxWidth(65);
        mol.getColumn(6).setMaxWidth(55);
        tblHoaDon.setColumnModel(mol);

        TableColumnModel mol_1 = tblSanPham.getColumnModel();
        mol_1.getColumn(0).setMaxWidth(120);
        mol_1.getColumn(1).setMaxWidth(165);
        mol_1.getColumn(2).setMaxWidth(80);
        mol_1.getColumn(3).setMaxWidth(45);
        mol_1.getColumn(4).setMaxWidth(90);
        mol_1.getColumn(5).setMaxWidth(65);
        mol_1.getColumn(6).setMaxWidth(75);
        tblSanPham.setColumnModel(mol_1);

        TableColumnModel mol_2 = tblSanPhamNH.getColumnModel();
        mol_2.getColumn(0).setMaxWidth(115);
        mol_2.getColumn(1).setMaxWidth(170);
        mol_2.getColumn(2).setMaxWidth(80);
        mol_2.getColumn(3).setMaxWidth(80);
        mol_2.getColumn(4).setMaxWidth(100);
        mol_2.getColumn(5).setMaxWidth(65);
        tblSanPhamNH.setColumnModel(mol_2);
        
        TableColumnModel mol_3 = tblSanPhamTH.getColumnModel();
        mol_3.getColumn(0).setMaxWidth(95);
        mol_3.getColumn(1).setMaxWidth(170);
        mol_3.getColumn(2).setMaxWidth(80);
        mol_3.getColumn(3).setMaxWidth(60);
        mol_3.getColumn(4).setMaxWidth(100);
        mol_3.getColumn(5).setMaxWidth(65);
        mol_3.getColumn(6).setMaxWidth(75);
        tblSanPhamTH.setColumnModel(mol_3);
    }

    List<HoaDonThanhToan> listtt;
    List<HoaDonNhapHang> listnh;

    void fillTableHD(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblHoaDon.getModel();
        mol.setRowCount(0);
        try {
            String key = txtTimKiem.getText();
            String ngaybd = "";
            String ngaykt = "";
            if (DCNgayBD.getDate() == null) {
                ngaybd = "19000101";
            } else {
                ngaybd = DateHelper.toString(DCNgayBD.getDate(), "yyyy-MM-dd");
            }
            if (DCNgayKetThuc.getDate() == null) {
                ngaykt = "21000101";
            } else {
                ngaykt = DateHelper.toString(DCNgayKetThuc.getDate(), "yyyy-MM-dd");
            }
            List<HoaDonThanhToan> listtt = daott.selectPage(key, ngaybd, ngaykt, index);
            for (HoaDonThanhToan tt : listtt) {
                Object[] row = {tt.getMaHDThanhToan(), tt.getMaKH(), tt.getMaNV(),
                    tt.getNgayThanhToan(), tt.getDiemThuong(), tt.getDoiDiem(), tt.getGhiChu()};
                mol.addRow(row);
            }
            lblChiSoHD.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void editHD() {
        String matt = tblHoaDon.getValueAt(row, 0).toString();
        HoaDonThanhToan tt = daott.selectById(matt);
        setFormTT(tt);
        tabs.setSelectedIndex(1);
    }

    void setFormTT(HoaDonThanhToan tt) {
        row = tblHoaDon.getSelectedRow();
        txtMaHoaDon.setText(tt.getMaHDThanhToan());
        txtMaKhachHang.setText(tt.getMaKH());
        txtMaNhanVien.setText(tt.getMaNV());
        txtDiemThuong.setText(tt.getDiemThuong() + "");
        txtNgayThanhToan.setText(tt.getNgayThanhToan());
        txtDiemDoi.setText(tt.getDoiDiem() + "");
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
        try {
            String mahd = tblHoaDon.getValueAt(row, 0).toString();
            List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
            for (ChiTietHoaDonThanhToan ct : listct) {
                Object[] row = {ct.getMaSP(), daosp.selectById(ct.getMaSP()).getTenSP(),
                    daosp.selectById(ct.getMaSP()).getMau(), daosp.selectById(ct.getMaSP()).getSize(),
                    currency.toCurrency(ct.getDonGia()), ct.getSoLuong(), ct.getKhuyenMai()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
        List<Double> tiensp = new ArrayList<>();
        double thanhtoan = 0;
        for (int i = 0; i < tblSanPham.getRowCount(); i++) {
            tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
            thanhtoan = thanhtoan + tiensp.get(i);
        }
        txtTongTien.setText(currency.toCurrency(thanhtoan));
    }

    void editSP() {
        boolean edit = (this.row >= 0);
        btnTraHang.setEnabled(edit);
        btnDoiHang.setEnabled(edit);
    }

    List<HoaDonThanhToan> list = daott.selectAll();
    double count = (list.size() / 20);

    void updatePageHD() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblHoaDon.getRowCount() <= 18);
        btnNextHD.setEnabled(page && !lpage);
        btnPreHD.setEnabled(page && !fpage);
    }

    void prePageHD() {
        if (index > 0) {
            index--;
            fillTableHD(index);
            updatePageHD();
            btnNextHD.setEnabled(true);
        }
    }

    void nextPageHD() {
        if (index < count) {
            index++;
            fillTableHD(index);
            updatePageHD();
        }
    }

    void traHang1(int soluong, String mact, String masp) {
        try {
            daoct.traHang1(soluong, mact, masp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void traHang2(String mact, String masp) {
        try {
            daoct.traHang2(mact, masp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void clearForm() {
        txtMaHoaDon.setText("");
        txtMaKhachHang.setText("");
        txtMaNhanVien.setText("");
        txtNgayThanhToan.setText("");
        txtDiemDoi.setText("");
        txtDiemThuong.setText("");
        txtTongTien.setText("");
        txtGhiChu.setText("");
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
    }

    void truDiem(String makh) {
        try {
            daokh.truDiem(makh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void voHieuHoa(String mahd) {
        try {
            daott.vohieuhoa(mahd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTableHDNhap(int index1) {
        DefaultTableModel mol = (DefaultTableModel) tblHoaDonNH.getModel();
        mol.setRowCount(0);
        try {
            String key = txtTimKiemNH.getText();
            String ngaybd = "";
            String ngaykt = "";
            if (DCNgayBDNH.getDate() == null) {
                ngaybd = "19000101";
            } else {
                ngaybd = DateHelper.toString(DCNgayBDNH.getDate(), "yyyy-MM-dd");
            }
            if (DCNgayKTNH.getDate() == null) {
                ngaykt = "21000101";
            } else {
                ngaykt = DateHelper.toString(DCNgayKTNH.getDate(), "yyyy-MM-dd");
            }
            List<HoaDonNhapHang> listnh = daonh.selectPage(key, ngaybd, ngaykt, index1);
            for (HoaDonNhapHang nh : listnh) {
                Object[] row = {nh.getMaHDNhapHang(), nh.getMaNCC(), nh.getMaNV(),
                    nh.getNgayNhapHang(), nh.getGhiChu()};
                mol.addRow(row);
            }
            lblChiSoHDNH.setText(index1 + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void editNH() {
        String manh = tblHoaDonNH.getValueAt(row, 0).toString();
        HoaDonNhapHang nh = daonh.selectById(manh);
        setFormNH(nh);
        tabs.setSelectedIndex(3);
    }

    void setFormNH(HoaDonNhapHang nh) {
        row = tblHoaDonNH.getSelectedRow();
        txtMaHoaDonNH.setText(nh.getMaHDNhapHang());
        txtNhaCungCap.setText(nh.getMaNCC());
        txtMaNhanVienNH.setText(nh.getMaNV());
        txtNgayNhap.setText(nh.getNgayNhapHang());
        DefaultTableModel mol = (DefaultTableModel) tblSanPhamNH.getModel();
        mol.setRowCount(0);
        try {
            String mahdnh = tblHoaDonNH.getValueAt(row, 0).toString();
            List<ChiTietHoaDonNhapHang> listctnh = daoctnh.selectPage(mahdnh);
            for (ChiTietHoaDonNhapHang ctnh : listctnh) {
                Object[] row = {ctnh.getMaSP(), daosp.selectById(ctnh.getMaSP()).getTenSP(),
                    daosp.selectById(ctnh.getMaSP()).getMau(), daosp.selectById(ctnh.getMaSP()).getSize(),
                    currency.toCurrency(ctnh.getGiaNhap()), ctnh.getSoLuong()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
        List<Double> tiensp = new ArrayList<>();
        double thanhtoannh = 0;
        for (int i = 0; i < tblSanPhamNH.getRowCount(); i++) {
            tiensp.add(currency.toInt(tblSanPhamNH.getValueAt(i, 4).toString()) * Double.parseDouble(tblSanPhamNH.getValueAt(i, 5).toString()));
            thanhtoannh = thanhtoannh + tiensp.get(i);
        }
        txtTongTienNH.setText(currency.toCurrency(thanhtoannh));
    }

    List<HoaDonNhapHang> list1 = daonh.selectAll();
    double count1 = (list1.size() / 20);

    void updatePageHDNH() {
        boolean page = (this.index1 >= 0);
        boolean fpage = (this.index1 == 0);
        boolean lpage = (tblHoaDonNH.getRowCount() <= 18);
        btnNextHDNH.setEnabled(page && !lpage);
        btnPreHDNH.setEnabled(page && !fpage);
    }

    void prePageHDNH() {
        if (index1 > 0) {
            index1--;
            fillTableHDNhap(index1);
            updatePageHDNH();
            btnNextHDNH.setEnabled(true);
        }
    }

    void nextPageHDNH() {
        if (index1 < count1) {
            index1++;
            fillTableHDNhap(index1);
            updatePageHDNH();
        }
    }

    void fillTableTraHang(int index2) {
        DefaultTableModel mol = (DefaultTableModel) tblHoaDonTH.getModel();
        mol.setRowCount(0);
        try {
            String key = txtTimKiemTH.getText();
            List<ChiTietHoaDonThanhToan> listct = daoct.selectTraHang1("0");
            for (ChiTietHoaDonThanhToan ct : listct) {
                String mahd = ct.getMaHD();
                if (mahd != null) {
                    List<HoaDonThanhToan> listtt = daott.selectTraHang(key, mahd, index2);
                    for (HoaDonThanhToan tt : listtt) {
                        Object[] row = {tt.getMaHDThanhToan(), tt.getMaKH(), tt.getMaNV(),
                            tt.getNgayThanhToan(), tt.getGhiChu()};
                        mol.addRow(row);
                    }
                    lblChiSoHDTH.setText(index2 + 1 + "");
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void editTH() {
        String mahdtt = tblHoaDonTH.getValueAt(row, 0).toString();
        HoaDonThanhToan tt = daott.selectById(mahdtt);
        setFormTH(tt);
    }

    void setFormTH(HoaDonThanhToan tt) {
        row = tblHoaDonTH.getSelectedRow();
        txtMaHoaDonTH.setText(tt.getMaHDThanhToan());
        txtMaKhachHangTH.setText(tt.getMaKH());
        txtMaNhanVienTH.setText(tt.getMaNV());
        txtNgayThanhToanTH.setText(tt.getNgayThanhToan());
        DefaultTableModel mol = (DefaultTableModel) tblSanPhamTH.getModel();
        mol.setRowCount(0);
        try {
            String mahd = tblHoaDonTH.getValueAt(row, 0).toString();
            List<ChiTietHoaDonThanhToan> listcttt = daoct.selectTraHang(mahd);
            for (ChiTietHoaDonThanhToan cttt : listcttt) {
                Object[] row = {cttt.getMaSP(), daosp.selectById(cttt.getMaSP()).getTenSP(),
                    daosp.selectById(cttt.getMaSP()).getMau(), daosp.selectById(cttt.getMaSP()).getSize(),
                    currency.toCurrency(cttt.getDonGia()), cttt.getSoLuong(), cttt.getKhuyenMai()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<HoaDonThanhToan> list2 = daott.selectAll();
    double count2 = (list2.size() / 5);

    void updatePageHDTH() {
        boolean page = (this.index2 >= 0);
        boolean fpage = (this.index2 == 0);
        boolean lpage = (tblHoaDonTH.getRowCount() <= 3);
        btnNextHDTH.setEnabled(page && !lpage);
        btnPreHDTH.setEnabled(page && !fpage);
    }

    void prePageHDTH() {
        if (index2 > 0) {
            index2--;
            fillTableTraHang(index2);
            updatePageHDTH();
            btnNextHDTH.setEnabled(true);
        }
    }

    void nextPageHDTH() {
        if (index2 < count2) {
            index2++;
            fillTableTraHang(index2);
            updatePageHDTH();
        }
    }

}
