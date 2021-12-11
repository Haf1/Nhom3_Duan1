package StartUp;

import DAO.ChiTietHoaDonNhapHangDAO;
import DAO.HoaDonNhapHangDAO;
import DAO.KhuyenMaiDAO;
import DAO.MauSPDAO;
import DAO.NhaCungCapDAO;
import DAO.SanPhamDAO;
import DAO.SizeSPDAO;
import DAO.ThuongHieuDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.ShareHelper;
import helper.XImage;
import helper.currency;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.ChiTietHoaDonNhapHang;
import model.HoaDonNhapHang;
import model.KhuyenMai;
import model.MauSanPham;
import model.NhaCungCap;
import model.SanPham;
import model.SizeSanPham;
import model.ThuongHieu;

public class NhapHangJInternalFrame extends javax.swing.JInternalFrame {

    SanPhamDAO daosp = new SanPhamDAO();
    ThuongHieuDAO daoth = new ThuongHieuDAO();
    MauSPDAO daomau = new MauSPDAO();
    SizeSPDAO daosize = new SizeSPDAO();
    KhuyenMaiDAO daokm = new KhuyenMaiDAO();
    NhaCungCapDAO daoncc = new NhaCungCapDAO();
    HoaDonNhapHangDAO daonh = new HoaDonNhapHangDAO();
    ChiTietHoaDonNhapHangDAO daoctnh = new ChiTietHoaDonNhapHangDAO();

    int row = -1;
    int index = 0;
    int dong;
    String chuoi1 = "";
    int checksp;
    int checkncc;

    public NhapHangJInternalFrame(String color) {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pn8 = new javax.swing.JPanel();
        pn7 = new javax.swing.JPanel();
        btnPrePage = new javax.swing.JButton();
        lblChiSo = new javax.swing.JLabel();
        btnNextPage = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        pn6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGio = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        pn2 = new javax.swing.JPanel();
        pn3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnThemNCC = new javax.swing.JButton();
        btnSuaNCC = new javax.swing.JButton();
        btnVoHieuHoaNCC = new javax.swing.JButton();
        btnMoiNCC = new javax.swing.JButton();
        pn4 = new javax.swing.JPanel();
        cboThuongHieu = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboKhuyenMai = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtGiaSP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cboMau = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboSize = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtChiTiet = new javax.swing.JTextField();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnVoHieuHoaSP = new javax.swing.JButton();
        btnMoiSP = new javax.swing.JButton();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pn5 = new javax.swing.JPanel();
        cboNCC = new javax.swing.JComboBox<>();
        btnNhapHang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(665, 606));

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnPrePage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrePage.setText("<<");
        btnPrePage.setEnabled(false);
        btnPrePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrePagebtnPrePageActionPerformed(evt);
            }
        });

        lblChiSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSo.setText("1");

        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText(">>");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPagebtnNextPageActionPerformed(evt);
            }
        });

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Thương Hiệu", "Mã SP", "Tên SP", "Màu ", "Size", "Giá Nhập", "SL", "Chi Tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachtblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDanhSach);

        javax.swing.GroupLayout pn7Layout = new javax.swing.GroupLayout(pn7);
        pn7.setLayout(pn7Layout);
        pn7Layout.setHorizontalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnPrePage)
                .addGap(18, 18, 18)
                .addComponent(lblChiSo)
                .addGap(18, 18, 18)
                .addComponent(btnNextPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn7Layout.setVerticalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrePage)
                    .addComponent(lblChiSo)
                    .addComponent(btnNextPage)))
        );

        pn6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblGio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thương Hiệu", "Mã SP", "Tên SP", "Màu ", "Size", "Giá Nhập", "SL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGio.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGio);

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnXacNhan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addGroup(pn6Layout.createSequentialGroup()
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn8Layout = new javax.swing.GroupLayout(pn8);
        pn8.setLayout(pn8Layout);
        pn8Layout.setHorizontalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn6, javax.swing.GroupLayout.PREFERRED_SIZE, 644, Short.MAX_VALUE)
        );
        pn8Layout.setVerticalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn8Layout.createSequentialGroup()
                .addComponent(pn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", pn8);

        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Nhà Cung Cấp");

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên Nhà Cung Cấp");

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Địa Chỉ");

        btnThemNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemNCC.setText("Thêm");
        btnThemNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNCCActionPerformed(evt);
            }
        });

        btnSuaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaNCC.setText("Sửa");
        btnSuaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNCCActionPerformed(evt);
            }
        });

        btnVoHieuHoaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoaNCC.setText("Vô Hiệu Hóa");
        btnVoHieuHoaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaNCCActionPerformed(evt);
            }
        });

        btnMoiNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoiNCC.setText("Mới");
        btnMoiNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaNCC))
                                .addGap(35, 35, 35)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtDiaChi)))
                        .addContainerGap())))
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemNCC)
                .addGap(18, 18, 18)
                .addComponent(btnSuaNCC)
                .addGap(18, 18, 18)
                .addComponent(btnVoHieuHoaNCC)
                .addGap(18, 18, 18)
                .addComponent(btnMoiNCC)
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtTenNCC)
                    .addComponent(txtSDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtDiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoiNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThuongHieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Thương Hiệu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã Sản Phẩm");

        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tên Sản Phẩm");

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Khuyến Mãi");

        cboKhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Giá Sản Phẩm");

        txtGiaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Số Lượng");

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("0");

        cboMau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Màu");

        cboSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Size");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Chi Tiết Sản Phẩm");

        txtChiTiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnSuaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaSP.setText("Sửa");
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnVoHieuHoaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoaSP.setText("Vô Hiệu Hóa");
        btnVoHieuHoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaSPActionPerformed(evt);
            }
        });

        btnMoiSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoiSP.setText("Mới");
        btnMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiSPActionPerformed(evt);
            }
        });

        txtGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Giá Nhập");

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn4Layout.createSequentialGroup()
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cboKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboThuongHieu, javax.swing.GroupLayout.Alignment.LEADING, 0, 108, Short.MAX_VALUE))
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn4Layout.createSequentialGroup()
                                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn4Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(108, 108, 108))
                                            .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn4Layout.createSequentialGroup()
                                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pn4Layout.createSequentialGroup()
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pn4Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(101, 101, 101))
                                    .addGroup(pn4Layout.createSequentialGroup()
                                        .addComponent(cboMau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtChiTiet))))
                        .addGap(9, 9, 9)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addComponent(btnThemSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoHieuHoaSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoiSP)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn4Layout.createSequentialGroup()
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSP)
                    .addComponent(btnSuaSP)
                    .addComponent(btnVoHieuHoaSP)
                    .addComponent(btnMoiSP)))
        );

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Mới", pn2);

        pn5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNCC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNCCItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboNCC, 0, 345, Short.MAX_VALUE)
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addComponent(cboNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNhapHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNhapHang.setText("Nhập Hàng");
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nhập Hàng");

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(242, 242, 242))
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrePagebtnPrePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrePagebtnPrePageActionPerformed
        prePage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnPrePagebtnPrePageActionPerformed

    private void btnNextPagebtnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPagebtnNextPageActionPerformed
        nextPage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextPagebtnNextPageActionPerformed

    private void tblDanhSachtblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachtblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachtblDanhSachMouseClicked

    private void tblGioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioMouseClicked
        if (evt.getClickCount() == 2) {
            suaSL();
        }
    }//GEN-LAST:event_tblGioMouseClicked

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (tblGio.getRowCount() > 0) {
            String kytu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            int soluong = 6;
            Random rd = new Random();
            char[] text1 = new char[soluong];
            for (int i = 0; i < soluong; i++) {
                text1[i] = kytu.charAt(rd.nextInt(kytu.length()));
            }
            for (int i = 0; i < text1.length; i++) {
                chuoi1 += text1[i];
            }
            while (true) {
                HoaDonNhapHang hd = daonh.selectById(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
                if (hd != null) {
                    chuoi1 = "";
                    for (int i = 0; i < soluong; i++) {
                        text1[i] = kytu.charAt(rd.nextInt(kytu.length()));
                    }
                    for (int i = 0; i < text1.length; i++) {
                        chuoi1 += text1[i];
                    }
                } else {
                    break;
                }
            }
            insertHoaDonNH();
            for (int i = 0; i < tblGio.getRowCount(); i++) {
                capNhatSoLuong(i);
            }
            for (int i = 0; i < tblGio.getRowCount(); i++) {
                insertChiTietHoaDonNH(i);
            }
            DefaultTableModel mol = (DefaultTableModel) tblGio.getModel();
            mol.setRowCount(0);
            cboNCC.setEnabled(true);
            MsgBoxHelper.alert(this, "Thành công !!");
            fillTable(0);
            lblChiSo.setText(1 + "");
            btnPrePage.setEnabled(false);
            btnNextPage.setEnabled(true);
        } else {
            MsgBoxHelper.alert(this, "Không có sản phẩm nào cần nhập thêm !!");
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        dong = tblGio.getSelectedRow();
        if (dong >= 0) {
            xoaSP();
        } else {
            MsgBoxHelper.alert(this, "Mời bạn chọn sản phẩm cần xóa !!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNCCActionPerformed
        checkFormInsertNCC();
        if (checkncc == 1) {
            insertNCC();
        }
    }//GEN-LAST:event_btnThemNCCActionPerformed

    private void btnSuaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNCCActionPerformed
        checkFormUpdateNCC();
        if (checkncc == 1) {
            updateNCC();
        }
    }//GEN-LAST:event_btnSuaNCCActionPerformed

    private void btnVoHieuHoaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaNCCActionPerformed
        vohieuhoaNCC();
    }//GEN-LAST:event_btnVoHieuHoaNCCActionPerformed

    private void btnMoiNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiNCCActionPerformed
        clearFormNCC();
    }//GEN-LAST:event_btnMoiNCCActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        checkFormInsertSP();
        if (checksp == 1) {
            insertSP();
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        checkFormUpdateSP();
        if (checksp == 1) {
            updateSP();
        }
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnVoHieuHoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaSPActionPerformed
        vohieuhoaSP();
    }//GEN-LAST:event_btnVoHieuHoaSPActionPerformed

    private void btnMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiSPActionPerformed
        clearFormSP();
    }//GEN-LAST:event_btnMoiSPActionPerformed

    private void cboNCCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNCCItemStateChanged
        if (cboNCC.getItemCount() > 1) {
            fillTable(0);
            tabs.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cboNCCItemStateChanged

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        dong = tblDanhSach.getSelectedRow();
        if (dong >= 0) {
            int j = 0;
            if (tblGio.getRowCount() == 0) {
                fillTableGio();
            } else {
                for (int i = 0; i < tblGio.getRowCount(); i++) {
                    if (tblDanhSach.getValueAt(dong, 1).equals(tblGio.getValueAt(i, 1))) {
                        try {
                            int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Bạn muốn nhập về cửa hàng bao nhiêu sản phẩm này ??"));
                            if (value > 0) {
                                int soluong = value + Integer.parseInt(tblGio.getValueAt(i, 6).toString());
                                tblGio.setValueAt(soluong, i, 6);
                                j++;
                            } else {
                                MsgBoxHelper.alert(this, "Giá trị phải là số nguyên dương !!");
                                return;
                            }
                        } catch (Exception e) {
                            MsgBoxHelper.alert(this, "Dữ liệu không hợp lệ !!");
                            return;
                        }
                    }
                }
                if (j == 0) {
                    fillTableGio();
                }
            }
        } else {
            MsgBoxHelper.alert(this, "Mời bạn chọn sản phẩm !!");
            return;
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoiNCC;
    private javax.swing.JButton btnMoiSP;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnPrePage;
    private javax.swing.JButton btnSuaNCC;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemNCC;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnVoHieuHoaNCC;
    private javax.swing.JButton btnVoHieuHoaSP;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboKhuyenMai;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboNCC;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JComboBox<String> cboThuongHieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblChiSo;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JPanel pn7;
    private javax.swing.JPanel pn8;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTable tblGio;
    private javax.swing.JTextField txtChiTiet;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtGiaSP;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
    void init() {
        tabs.setSelectedIndex(0);
        this.row = -1;
        this.updateStatus();
        this.updateStatusNCC();
        lblChiSo.setText(1 + "");
        fillComboBoxThuongHieu();
        fillComboBoxMauSac();
        fillComboBoxSize();
        fillComboBoxNCC();
        fillComboBoxKhuyenMai();
        fillTable(0);

        TableColumnModel mol_ds = tblDanhSach.getColumnModel();
        mol_ds.getColumn(0).setMaxWidth(100);
        mol_ds.getColumn(1).setMaxWidth(100);
        mol_ds.getColumn(2).setMaxWidth(170);
        mol_ds.getColumn(3).setMaxWidth(80);
        mol_ds.getColumn(4).setMaxWidth(40);
        mol_ds.getColumn(5).setMaxWidth(80);
        mol_ds.getColumn(6).setMaxWidth(40);
        mol_ds.getColumn(7).setMaxWidth(55);
        tblDanhSach.setColumnModel(mol_ds);

        TableColumnModel mol_gio = tblGio.getColumnModel();
        mol_gio.getColumn(0).setMaxWidth(95);
        mol_gio.getColumn(1).setMaxWidth(100);
        mol_gio.getColumn(2).setMaxWidth(160);
        mol_gio.getColumn(3).setMaxWidth(80);
        mol_gio.getColumn(4).setMaxWidth(40);
        mol_gio.getColumn(5).setMaxWidth(80);
        mol_gio.getColumn(6).setMaxWidth(40);
        tblGio.setColumnModel(mol_gio);
    }

    List<SanPham> listsp;
    List<ThuongHieu> listth;
    List<MauSanPham> listmau;
    List<SizeSanPham> listsize;
    List<KhuyenMai> listkm;
    List<NhaCungCap> listncc;

    void fillComboBoxNCC() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboNCC.getModel();
        mol_cbo.removeAllElements();
        listncc = daoncc.selectAll();
        for (NhaCungCap ncc : listncc) {
            mol_cbo.addElement(ncc.getMaNCC() + "-" + ncc.getTenNCC());
        }
    }

    void fillComboBoxThuongHieu() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboThuongHieu.getModel();
        mol_cbo.removeAllElements();
        listth = daoth.selectAll();
        for (ThuongHieu th : listth) {
            mol_cbo.addElement(th.getTenThuongHieu());
        }
    }

    void fillComboBoxMauSac() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboMau.getModel();
        mol_cbo.removeAllElements();
        listmau = daomau.selectAll();
        for (MauSanPham mau : listmau) {
            mol_cbo.addElement(mau.getTenMau());
        }
    }

    void fillComboBoxSize() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboSize.getModel();
        mol_cbo.removeAllElements();
        listsize = daosize.selectAll();
        for (SizeSanPham sz : listsize) {
            mol_cbo.addElement(sz.getSize());
        }
    }

    void fillComboBoxKhuyenMai() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboKhuyenMai.getModel();
        mol_cbo.removeAllElements();
        listkm = daokm.selectAll();
        for (KhuyenMai km : listkm) {
            mol_cbo.addElement(km.getMaKM());
        }
    }

    void fillTable(int index) {
        DefaultTableModel mol_tbl = (DefaultTableModel) tblDanhSach.getModel();
        mol_tbl.setRowCount(0);
        try {
            String ncc = listncc.get(cboNCC.getSelectedIndex()).getMaNCC();
            List<SanPham> list = daosp.selectNhapHang(ncc, index);
            for (SanPham sp : list) {
                Object[] row = {daoth.selectById(sp.getMaThuongHieu()).getTenThuongHieu(), sp.getMaSP(), sp.getTenSP(),
                    sp.getMau(), sp.getSize(), currency.toCurrency(sp.getGiaNhap()), sp.getSoLuong(), sp.getChiTiet()};
                mol_tbl.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<SanPham> list = daosp.selectAll();
    double count = (list.size() / 20);

    void updatePage() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblDanhSach.getRowCount() <= 18);
        btnNextPage.setEnabled(page && !lpage);
        btnPrePage.setEnabled(page && !fpage);
    }

    void prePage() {
        if (index > 0) {
            index--;
            fillTable(index);
            updatePage();
            btnNextPage.setEnabled(true);
        }
    }

    void nextPage() {
        if (index < count) {
            index++;
            fillTable(index);
            updatePage();
        }
    }

    void fillTableGio() {
        try {
            int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Bạn muốn nhập về cửa hàng bao nhiêu sản phẩm này ??"));
            if (value > 0) {
                dong = tblDanhSach.getSelectedRow();
                DefaultTableModel mol_tbl = (DefaultTableModel) tblGio.getModel();
                try {
                    Object[] row = {tblDanhSach.getValueAt(dong, 0), tblDanhSach.getValueAt(dong, 1), tblDanhSach.getValueAt(dong, 2),
                        tblDanhSach.getValueAt(dong, 3), tblDanhSach.getValueAt(dong, 4), tblDanhSach.getValueAt(dong, 5), value};
                    mol_tbl.addRow(row);
                    cboNCC.setEnabled(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                MsgBoxHelper.alert(this, "Giá trị phải là số nguyên dương !!");
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Dữ liệu không hợp lệ !!");
            return;
        }

    }

    HoaDonNhapHang getFormNH() {
        HoaDonNhapHang nh = new HoaDonNhapHang();
        nh.setMaHDNhapHang(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
        nh.setMaNV(ShareHelper.user.getMaNV());
        nh.setMaNCC(listncc.get(cboNCC.getSelectedIndex()).getMaNCC());
        nh.setNgayNhapHang(DateHelper.toString(new java.util.Date(), "yyyy/MM/dd"));
        nh.setGhiChu(null);
        return nh;
    }

    void insertHoaDonNH() {
        HoaDonNhapHang hd = getFormNH();
        try {
            daonh.insert(hd);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    ChiTietHoaDonNhapHang getFormCTNH(int a) {
        ChiTietHoaDonNhapHang ctnh = new ChiTietHoaDonNhapHang();
        ctnh.setMaHDNhapHang(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
        ctnh.setMaSP(tblGio.getValueAt(a, 1).toString());
        ctnh.setGiaNhap(currency.toInt(tblGio.getValueAt(a, 5).toString()));
        ctnh.setSoLuong(Integer.parseInt(tblGio.getValueAt(a, 6).toString()));
        return ctnh;
    }

    void insertChiTietHoaDonNH(int a) {
        ChiTietHoaDonNhapHang cthd = getFormCTNH(a);
        try {
            daoctnh.insert(cthd);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    void capNhatSoLuong(int b) {
        try {
            daosp.capNhatSoLuongNhap(Integer.parseInt(tblGio.getValueAt(b, 6).toString()), tblGio.getValueAt(b, 1).toString());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    void xoaSP() {
        dong = tblGio.getSelectedRow();
        DefaultTableModel mol_tbl = (DefaultTableModel) tblGio.getModel();
        mol_tbl.removeRow(dong);
        if (tblGio.getRowCount() == 0) {
            cboNCC.setEnabled(true);
        }
    }

    void suaSL() {
        dong = tblGio.getSelectedRow();
        try {
            int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Bạn muốn sửa lại thành con số bao nhiêu ?"));
            if (value > 0) {
                tblGio.setValueAt(value, dong, 6);
            } else {
                MsgBoxHelper.alert(this, "Dữ liệu không hợp lệ !!");
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Dữ liệu không hợp lệ !!");
            return;
        }
    }

    void edit() {
        String masp = tblDanhSach.getValueAt(row, 1).toString();
        String mancc = listncc.get(cboNCC.getSelectedIndex()).getMaNCC();
        SanPham sp = daosp.selectById(masp);
        NhaCungCap ncc = daoncc.selectById(mancc);
        setFormSP(sp);
        setFormNCC(ncc);
        tabs.setSelectedIndex(1);
    }

    void setFormNCC(NhaCungCap ncc) {
        dong = tblDanhSach.getSelectedRow();
        txtMaNCC.setText(ncc.getMaNCC());
        txtTenNCC.setText(ncc.getTenNCC());
        txtSDT.setText(ncc.getsDT());
        txtEmail.setText(ncc.getEmail());
        txtDiaChi.setText(ncc.getDiaChi());
    }

    void setFormSP(SanPham sp) {
        dong = tblDanhSach.getSelectedRow();
        cboThuongHieu.setSelectedItem(daoth.selectById(sp.getMaThuongHieu()).getTenThuongHieu());
        txtMaSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        cboKhuyenMai.setSelectedItem(sp.getMaKM());
        txtGiaSP.setText(sp.getDonGia() + "");
        txtGiaNhap.setText(sp.getGiaNhap() + "");
        txtSoLuong.setText(sp.getSoLuong() + "");
        cboMau.setSelectedItem(sp.getMau());
        cboSize.setSelectedItem(sp.getSize());
        txtChiTiet.setText(sp.getChiTiet());
        if (sp.getAnhSP() != null) {
            lblHinhAnh.setToolTipText(sp.getAnhSP());
//            lblHinhAnh.setIcon(XImage.read(cd.getHinhAnh()));
            try {
                BufferedImage img;
                img = ImageIO.read(new File("C:\\Nhom3_Duan1\\src\\AnhSP", sp.getAnhSP()));
                Image dimg = img.getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                lblHinhAnh.setIcon(imageIcon);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            lblHinhAnh.setIcon(null);
        }
    }

    SanPham getFormSP() {
        SanPham sp = new SanPham();
        sp.setMaThuongHieu(listth.get(cboThuongHieu.getSelectedIndex()).getMaThuongHieu());
        sp.setMaSP(txtMaSP.getText());
        sp.setTenSP(txtTenSP.getText());
        sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        sp.setDonGia(Double.parseDouble(txtGiaSP.getText()));
        sp.setGiaNhap(Double.parseDouble(txtGiaNhap.getText()));
        sp.setMau(cboMau.getSelectedItem().toString());
        sp.setSize(Integer.parseInt(cboSize.getSelectedItem().toString()));
        sp.setMaKM(cboKhuyenMai.getSelectedItem().toString());
        sp.setMaNCC(cboNCC.getSelectedItem().toString().substring(0, 6));
        sp.setChiTiet(txtChiTiet.getText());
        if (lblHinhAnh.getIcon() != null) {
            sp.setAnhSP(lblHinhAnh.getToolTipText());
        } else {
            sp.setAnhSP(null);
        }
        return sp;
    }

    NhaCungCap getFormNCC() {
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(txtMaNCC.getText());
        ncc.setTenNCC(txtTenNCC.getText());
        ncc.setDiaChi(txtDiaChi.getText());
        ncc.setsDT(txtSDT.getText());
        ncc.setEmail(txtEmail.getText());
        return ncc;
    }

    void chonAnh() {
        JFileChooser jfc = new JFileChooser("C:\\Nhom3_Duan1\\src\\AnhSP");
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            BufferedImage img;
            try {
                img = ImageIO.read(file);
                Image dimg = img.getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                lblHinhAnh.setIcon(imageIcon);

            } catch (IOException e) {
                e.printStackTrace();
            }
            XImage.save(file); //lưu hình vào thư mục logo
            ImageIcon icon = XImage.read(file.getName()); //đọc hình từ logo
            lblHinhAnh.setToolTipText(file.getName());
        }
    }

    void clearFormSP() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtSoLuong.setText("0");
        txtGiaSP.setText("");
        txtGiaNhap.setText("");
        txtChiTiet.setText("");
        lblHinhAnh.setIcon(null);
        lblHinhAnh.setText("");
        this.row = -1;
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        txtMaSP.setEditable(!edit);
        btnThemSP.setEnabled(!edit);
        btnSuaSP.setEnabled(edit);
        btnVoHieuHoaSP.setEnabled(edit);
    }

    void insertSP() {
        SanPham sp = getFormSP();
        try {
            daosp.insert(sp);
            this.fillTable(0);
            this.clearFormSP();
            MsgBoxHelper.alert(this, "Thêm mới SP thành công !!");
            lblChiSo.setText(1 + "");
            tabs.setSelectedIndex(0);
            btnNextPage.setEnabled(true);
            btnPrePage.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới SP thất bại !!");
        }
    }

    void updateSP() {
        SanPham sp = getFormSP();
        try {
            daosp.update(sp);
            this.fillTable(0);
            MsgBoxHelper.alert(this, "Sửa SP thành công !!");
            lblChiSo.setText(1 + "");
            tabs.setSelectedIndex(0);
            btnNextPage.setEnabled(true);
            btnPrePage.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa SP thất bại !!");
        }
    }

    void vohieuhoaSP() {
        String masp = txtMaSP.getText();
        try {
            daosp.vohieuhoa(masp);
            this.fillTable(0);
            MsgBoxHelper.alert(this, "Vô hiệu SP thành công !!");
            clearFormSP();
            lblChiSo.setText(1 + "");
            tabs.setSelectedIndex(0);
            btnNextPage.setEnabled(true);
            btnPrePage.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Vô hiệu SP thất bại !!");
        }
    }

    void clearFormNCC() {
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        this.row = -1;
        this.updateStatusNCC();
    }

    void updateStatusNCC() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        txtMaNCC.setEditable(!edit);
        btnThemNCC.setEnabled(!edit);
        btnSuaNCC.setEnabled(edit);
        btnVoHieuHoaNCC.setEnabled(edit);
    }

    void insertNCC() {
        NhaCungCap ncc = getFormNCC();
        try {
            daoncc.insert(ncc);
            this.fillComboBoxNCC();
            this.clearFormNCC();
            MsgBoxHelper.alert(this, "Thêm mới NCC thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới NCC thất bại !!");
        }
    }

    void updateNCC() {
        NhaCungCap ncc = getFormNCC();
        try {
            daoncc.update(ncc);
            this.fillComboBoxNCC();
            MsgBoxHelper.alert(this, "Sửa NCC thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa NCC thất bại !!");
        }
    }

    void vohieuhoaNCC() {
        String mancc = txtMaNCC.getText();
        if (MsgBoxHelper.confirm(this, "Bạn thực sự muốn vô hiệu hóa nhà cung cấp này ?")) {
            try {
                daoncc.vohieuhoa(mancc);
                this.fillComboBoxNCC();
                clearFormNCC();
                MsgBoxHelper.alert(this, "Vô hiệu hóa thành công !!");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBoxHelper.alert(this, "Vô hiệu hóa thất bại !!");
            }
        }
    }

    void checkFormInsertSP() {
        SanPham sp = daosp.selectById(txtMaSP.getText());
        if (sp != null) {
            MsgBoxHelper.alert(this, "Sản phẩm đã tồn tại !!");
            txtMaSP.requestFocus();
            checksp = 0;
            return;
        } else if (txtMaSP.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã sản phẩm !!");
            txtMaSP.requestFocus();
            checksp = 0;
            return;
        } else {
            checksp = 1;
        }
        if (txtTenSP.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên sản phẩm !!");
            txtTenSP.requestFocus();
            checksp = 0;
            return;
        } else {
            checksp = 1;
        }
        try {
            Double giaban = Double.parseDouble(txtGiaSP.getText());
            if (txtGiaSP.getText().equals("")) {
                MsgBoxHelper.alert(this, "Không để trống giá sản phẩm !!");
                txtGiaSP.requestFocus();
                checksp = 0;
                return;
            } else {
                checksp = 1;
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Giá sản phẩm phải ở dạng số !!");
            txtGiaSP.requestFocus();
            checksp = 0;
            return;
        }
        try {
            Double gianhap = Double.parseDouble(txtGiaNhap.getText());
            if (txtGiaNhap.getText().equals("")) {
                MsgBoxHelper.alert(this, "Không để trống giá nhap !!");
                txtGiaNhap.requestFocus();
                checksp = 0;
                return;
            } else {
                checksp = 1;
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Giá nhập phải ở dạng số !!");
            txtGiaNhap.requestFocus();
            checksp = 0;
            return;
        }
    }

    void checkFormUpdateSP() {
        SanPham sp = daosp.selectById(txtMaSP.getText());
        if (sp == null) {
            MsgBoxHelper.alert(this, "Mã sản phẩm không tồn tại !!");
            txtMaSP.requestFocus();
            checksp = 0;
            return;
        } else if (txtMaSP.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã sản phẩm !!");
            txtMaSP.requestFocus();
            checksp = 0;
            return;
        } else {
            checksp = 1;
        }
        if (txtTenSP.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên sản phẩm !!");
            txtTenSP.requestFocus();
            checksp = 0;
            return;
        } else {
            checksp = 1;
        }
        try {
            Double giaban = Double.parseDouble(txtGiaSP.getText());
            if (txtGiaSP.getText().equals("")) {
                MsgBoxHelper.alert(this, "Không để trống giá sản phẩm !!");
                txtGiaSP.requestFocus();
                checksp = 0;
                return;
            } else {
                checksp = 1;
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Giá sản phẩm phải ở dạng số !!");
            txtGiaSP.requestFocus();
            checksp = 0;
            return;
        }
        try {
            Double gianhap = Double.parseDouble(txtGiaNhap.getText());
            if (txtGiaNhap.getText().equals("")) {
                MsgBoxHelper.alert(this, "Không để trống giá nhap !!");
                txtGiaNhap.requestFocus();
                checksp = 0;
                return;
            } else {
                checksp = 1;
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Giá nhập phải ở dạng số !!");
            txtGiaNhap.requestFocus();
            checksp = 0;
            return;
        }
    }

    void checkFormInsertNCC() {
        NhaCungCap ncc = daoncc.selectById(txtMaNCC.getText());
        if (ncc != null) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp đã tồn tại !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else if (txtMaNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã nhà cung cấp !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else if (txtMaNCC.getText().length() != 6) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp phải đủ 6 kí tự !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
        if (txtTenNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên nhà cung cấp !!");
            txtTenNCC.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
        if (txtSDT.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống số điện thoại nhà cung cấp !!");
            txtSDT.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
    }

    void checkFormUpdateNCC() {
        NhaCungCap ncc = daoncc.selectById(txtMaNCC.getText());
        if (ncc == null) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp không tồn tại !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else if (txtMaNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã nhà cung cấp !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else if (txtMaNCC.getText().length() != 6) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp phải đủ 6 kí tự !!");
            txtMaNCC.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
        if (txtTenNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên nhà cung cấp !!");
            txtTenNCC.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
        if (txtSDT.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống số điện thoại nhà cung cấp !!");
            txtSDT.requestFocus();
            checkncc = 0;
            return;
        } else {
            checkncc = 1;
        }
    }
}
