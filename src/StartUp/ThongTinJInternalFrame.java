package StartUp;

import DAO.NhanVienDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.ShareHelper;
import helper.XImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import model.NhanVien;

public class ThongTinJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO dao = new NhanVienDAO();
    Color color;
    int check;
    String hexcolor = dao.selectById(ShareHelper.user.getMaNV()).getMauNen();

    public ThongTinJInternalFrame(String color) {
        initComponents();
        init();
        pn4.setBackground(new Color(Integer.parseInt(color, 16)));
        pn5.setBackground(new Color(Integer.parseInt(color, 16)));
        pn2.setBackground(new Color(Integer.parseInt(color, 16)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pn5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        pn4 = new javax.swing.JPanel();
        rdoNam2 = new javax.swing.JRadioButton();
        rdoNu2 = new javax.swing.JRadioButton();
        pn2 = new javax.swing.JPanel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        lblHinhAnh = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSuaThongTin = new javax.swing.JButton();
        btnMauGiaoDien = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thông Tin Nhân Viên");

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ Và Tên");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Số ĐT");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày Sinh");

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giới Tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup1.add(rdoNam2);
        rdoNam2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNam2.setText("Nam");

        buttonGroup1.add(rdoNu2);
        rdoNu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNu2.setText("Nữ");

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addComponent(rdoNam2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rdoNu2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdoNam2)
                .addComponent(rdoNu2))
        );

        pn2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vai Trò", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup2.add(rdoQuanLy);
        rdoQuanLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoQuanLy.setSelected(true);
        rdoQuanLy.setText("Quản Lý");
        rdoQuanLy.setEnabled(false);

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNhanVien.setText("Nhân Viên");
        rdoNhanVien.setEnabled(false);

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(rdoQuanLy)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rdoNhanVien)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdoQuanLy)
                .addComponent(rdoNhanVien))
        );

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        btnSuaThongTin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaThongTin.setText("Sửa Thông Tin");
        btnSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinActionPerformed(evt);
            }
        });

        btnMauGiaoDien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMauGiaoDien.setText("Màu Giao Diện");
        btnMauGiaoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMauGiaoDienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSuaThongTin)
                        .addGap(18, 18, 18)
                        .addComponent(btnMauGiaoDien)
                        .addGap(20, 20, 20))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi)
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn5Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn5Layout.createSequentialGroup()
                                                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pn5Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(pn5Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMauGiaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinActionPerformed
        update();
    }//GEN-LAST:event_btnSuaThongTinActionPerformed

    private void btnMauGiaoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMauGiaoDienActionPerformed
        chonMau();
    }//GEN-LAST:event_btnMauGiaoDienActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhAnhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgaySinh;
    private javax.swing.JButton btnMauGiaoDien;
    private javax.swing.JButton btnSuaThongTin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JRadioButton rdoNam2;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu2;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        edit();
    }

    void edit() {
        String manv = ShareHelper.user.getMaNV();
        NhanVien nv = dao.selectById(manv);
        setForm(nv);
    }

    void update() {
        NhanVien nv = getForm();
        try {
            dao.update(nv);
            edit();
            MsgBoxHelper.alert(this, "Sửa thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa thất bại !!");
        }
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setsDT(txtSDT.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(DateHelper.toString(DCNgaySinh.getDate(), "yyyy-MM-dd"));
        nv.setGioiTinh(rdoNam2.isSelected());
        if (lblHinhAnh.getIcon() != null) {
            nv.setAnhNV(lblHinhAnh.getToolTipText());
        } else {
            nv.setAnhNV(null);
        }
        nv.setVaiTro(rdoQuanLy.isSelected());
        nv.setMauNen(hexcolor);
        return nv;
    }

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(String.valueOf(nv.getTenNV()));
        rdoNam2.setSelected(nv.isGioiTinh());
        rdoNu2.setSelected(!nv.isGioiTinh());
        DCNgaySinh.setDate(DateHelper.toDate(nv.getNgaySinh(), "yyyy-MM-dd"));
        txtSDT.setText(nv.getsDT());
        txtEmail.setText(nv.getEmail());
        txtDiaChi.setText(nv.getDiaChi());
        rdoQuanLy.setSelected(nv.isVaiTro());
        rdoNhanVien.setSelected(!nv.isVaiTro());
        if (nv.getAnhNV() != null) {
            lblHinhAnh.setToolTipText(nv.getAnhNV());
//            lblHinhAnh.setIcon(XImage.read(cd.getHinhAnh()));
            try {
                BufferedImage img;
                img = ImageIO.read(new File("src/AnhNV", nv.getAnhNV()));
                Image dimg = img.getScaledInstance(185, 240,
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

    void chonAnh() {
        JFileChooser jfc = new JFileChooser("C:\\Nhom3_Duan1\\src\\AnhNV");
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
    
    void chonMau() {
        color = JColorChooser.showDialog(this, "Chọn Màu", null);
        if (color == null) {
        } else {
            hexcolor = Integer.toHexString(color.getRGB()).substring(2);
            System.out.println(hexcolor);
            pn5.setBackground(new Color(Integer.parseInt(hexcolor,16)));
            pn2.setBackground(new Color(Integer.parseInt(hexcolor,16)));
            pn4.setBackground(new Color(Integer.parseInt(hexcolor,16)));
        }
    }

    void checkFormUpdate() {
        NhanVien nv = dao.selectById(txtMaNV.getText());
        if (nv == null) {
            MsgBoxHelper.alert(this, "Mã nhân viên không tồn tại !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtMaNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã nhân viên !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống họ tên !!");
            txtTenNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (!txtSDT.getText().matches("0[0-9]{9}")) {
            MsgBoxHelper.alert(this, "Số điện thoại không đúng định dạng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtEmail.getText().matches("^[a-zA-Z][a-zA-Z0-9_\\\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\\\.[a-zA-Z0-9]{2,4}){1,2}$")) {
            String manv = dao.selectByEmail(txtEmail.getText()).getMaNV();
            if (manv != null) {
                if (!txtMaNV.getText().equals(manv)) {
                    MsgBoxHelper.alert(this, "Email này thuộc quyền của nhân viên khác !!");
                    txtEmail.requestFocus();
                    check = 0;
                    return;
                } else {
                    check = 1;
                }
            }
        } else {
            MsgBoxHelper.alert(this, "Email không đúng định dạng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        }
        if (DCNgaySinh.getDate() == null) {
            MsgBoxHelper.alert(this, "Không để trống ngày sinh!!");
            check = 0;
            return;
        } else {
            check = 1;
        }
    }
}
