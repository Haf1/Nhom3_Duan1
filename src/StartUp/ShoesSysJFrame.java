 package StartUp;

import DAO.NhanVienDAO;
import helper.ShareHelper;
import helper.MsgBoxHelper;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class ShoesSysJFrame extends javax.swing.JFrame {

    Timer t;
    LSGDJInternalFrame lichsugiaodich;
    SanPhamJInternalFrame quanlisanpham;
    KhachHangJInternalFrame quanlikhachhang;
    NhaCungCapJInternalFrame quanlinhacungcap;
    NhanVienJInternalFrame quanlinhanvien;
    ThungRacJInternalFrame thungrac;
    DoiMatKhauJInternalFrame doimatkhau;
    GioHangJInternalFrame giohang;
    ThongTinJInternalFrame thongtin;
    NhapHangJInternalFrame nhaphang;
    ThongKeJInternalFrame thongke;
    Color color;
    ImageIcon dangnhap = new ImageIcon("src/icon/Key.png");
    ImageIcon quenmk = new ImageIcon("src/icon/Unlock.png");
    ImageIcon up = new ImageIcon("src/icon/startup.png");
    ImageIcon User = new ImageIcon("src/icon/Unknown person.png");
    ImageIcon doimk = new ImageIcon("src/icon/Refresh.png");
    ImageIcon dangxuat = new ImageIcon("src/icon/log out.png");

    NhanVienDAO dao = new NhanVienDAO();

    public ShoesSysJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();
        startDongHo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        pn1 = new javax.swing.JPanel();
        ToolBar = new javax.swing.JToolBar();
        btnGioHang = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnNhaCungCap = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnThongKe = new javax.swing.JButton();
        btnLSGD = new javax.swing.JButton();
        btnQuetQR = new javax.swing.JButton();
        pnNen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu = new javax.swing.JMenu();
        mni = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuThietLap = new javax.swing.JMenu();
        mniThungRac = new javax.swing.JMenuItem();
        mniThongTin = new javax.swing.JMenuItem();
        mnuUser = new javax.swing.JMenu();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoiMatKhau = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ShoesSys StartUp");

        desktop.setPreferredSize(new java.awt.Dimension(0, 531));

        pn1.setBackground(new java.awt.Color(51, 204, 255));

        ToolBar.setBackground(new java.awt.Color(204, 255, 204));
        ToolBar.setForeground(new java.awt.Color(255, 255, 255));
        ToolBar.setRollover(true);

        btnGioHang.setBackground(new java.awt.Color(204, 255, 204));
        btnGioHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Basket.png"))); // NOI18N
        btnGioHang.setText("Gi??? H??ng");
        btnGioHang.setFocusable(false);
        btnGioHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioHang.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnGioHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGioHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGioHangMouseExited(evt);
            }
        });
        btnGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioHangActionPerformed(evt);
            }
        });
        ToolBar.add(btnGioHang);

        btnNhapHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add to basket.png"))); // NOI18N
        btnNhapHang.setText("Nh???p H??ng");
        btnNhapHang.setFocusable(false);
        btnNhapHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhapHang.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnNhapHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });
        ToolBar.add(btnNhapHang);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));
        ToolBar.add(jSeparator2);

        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users.png"))); // NOI18N
        btnNhanVien.setText("Nh??n Vi??n");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        ToolBar.add(btnNhanVien);

        btnKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        btnKhachHang.setText("Kh??ch H??ng");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        ToolBar.add(btnKhachHang);

        btnNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Industry.png"))); // NOI18N
        btnNhaCungCap.setText("Nh?? Cung C???p");
        btnNhaCungCap.setFocusable(false);
        btnNhaCungCap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhaCungCap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });
        ToolBar.add(btnNhaCungCap);

        btnSanPham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Box.png"))); // NOI18N
        btnSanPham.setText("S???n Ph???m");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        ToolBar.add(btnSanPham);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));
        ToolBar.add(jSeparator3);

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        btnThongKe.setText("Th???ng K??");
        btnThongKe.setFocusable(false);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        ToolBar.add(btnThongKe);

        btnLSGD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLSGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lsgd.png"))); // NOI18N
        btnLSGD.setText("L???ch S??? Giao D???ch");
        btnLSGD.setFocusable(false);
        btnLSGD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLSGD.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnLSGD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLSGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLSGDActionPerformed(evt);
            }
        });
        ToolBar.add(btnLSGD);

        btnQuetQR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuetQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QR.png"))); // NOI18N
        btnQuetQR.setText("Qu??t QR");
        btnQuetQR.setFocusable(false);
        btnQuetQR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuetQR.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnQuetQR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar.add(btnQuetQR);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnNen.setBackground(new java.awt.Color(255, 204, 204));
        pnNen.setPreferredSize(new java.awt.Dimension(0, 532));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manhinhchinh.gif"))); // NOI18N

        javax.swing.GroupLayout pnNenLayout = new javax.swing.GroupLayout(pnNen);
        pnNen.setLayout(pnNenLayout);
        pnNenLayout.setHorizontalGroup(
            pnNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNenLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnNenLayout.setVerticalGroup(
            pnNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNenLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn2.setBackground(new java.awt.Color(204, 255, 255));
        pn2.setPreferredSize(new java.awt.Dimension(1180, 39));

        lblDongHo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("00:00:00 PM");

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/out.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        lblInfo.setText("H??? Th???ng B??n Gi??y Start Up");

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 824, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit)
                .addGap(21, 21, 21))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit))
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desktop.setLayer(pn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(pnNen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(pn2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnNen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
                            .addComponent(pn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnNen, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnu.setEnabled(false);
        mnu.setFocusable(false);
        mnu.setPreferredSize(new java.awt.Dimension(880, 30));
        jMenuBar1.add(mnu);

        mni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Help.png"))); // NOI18N
        mni.setText("H??? tr???");
        mni.setPreferredSize(new java.awt.Dimension(100, 24));
        mni.setRequestFocusEnabled(false);

        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        mniHuongDan.setText("H?????ng d???n s??? d???ng");
        mni.add(mniHuongDan);
        mni.add(jSeparator1);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Gi???i thi???u s???n ph???m");
        mni.add(mniGioiThieu);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Problem.png"))); // NOI18N
        jMenuItem1.setText("B??o L???i");
        mni.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Call.png"))); // NOI18N
        jMenuItem2.setText("Li??n H???");
        mni.add(jMenuItem2);

        jMenuBar1.add(mni);

        mnuThietLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Gear.png"))); // NOI18N
        mnuThietLap.setText("Th??ng tin");
        mnuThietLap.setToolTipText("-13382401");
        mnuThietLap.setPreferredSize(new java.awt.Dimension(100, 24));

        mniThungRac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Trash.png"))); // NOI18N
        mniThungRac.setText("Th??ng R??c");
        mniThungRac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThungRacActionPerformed(evt);
            }
        });
        mnuThietLap.add(mniThungRac);

        mniThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mniThongTin.setText("Th??ng Tin NV");
        mniThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongTinActionPerformed(evt);
            }
        });
        mnuThietLap.add(mniThongTin);

        jMenuBar1.add(mnuThietLap);

        mnuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unknown person.png"))); // NOI18N
        mnuUser.setText("NV001");
        mnuUser.setMaximumSize(new java.awt.Dimension(100, 32767));
        mnuUser.setPreferredSize(new java.awt.Dimension(100, 24));

        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        mniDangXuat.setText("????ng Xu???t");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuUser.add(mniDangXuat);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("?????i M???t Kh???u");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuUser.add(mniDoiMatKhau);

        jMenuBar1.add(mnuUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGioHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioHangMouseEntered

    }//GEN-LAST:event_btnGioHangMouseEntered

    private void btnGioHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioHangMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGioHangMouseExited

    private void btnGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioHangActionPerformed
        openGioHang();
    }//GEN-LAST:event_btnGioHangActionPerformed

    private void btnLSGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLSGDActionPerformed
        openLichSuGiaoDich();
    }//GEN-LAST:event_btnLSGDActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        openQuanLiSanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        openQuanLiKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        openNhaCungCap();
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        mniDangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        if (!ShareHelper.isLogin()) {
            new QuenMatKhauJFrame().setVisible(true);
        } else {
            new DoiMatKhauJInternalFrame().setVisible(true);
        }
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void mniThungRacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThungRacActionPerformed
        mniOpenThungRac();
    }//GEN-LAST:event_mniThungRacActionPerformed

    private void mniThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongTinActionPerformed
        mniOpenThongTin();
    }//GEN-LAST:event_mniThongTinActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        OpenNhapHang();
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        OpenThongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShoesSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoesSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoesSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoesSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoesSysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JButton btnGioHang;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLSGD;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnQuetQR;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenu mni;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniThongTin;
    private javax.swing.JMenuItem mniThungRac;
    private javax.swing.JMenu mnu;
    private javax.swing.JMenu mnuThietLap;
    private javax.swing.JMenu mnuUser;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pnNen;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
//        this.setIconImage(XImage.getAppIcon());
        new ManHinhChaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        this.setVisible(true);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        if (!ShareHelper.isLogin()) {
            mnuUser.setText("StartUp");
            mnuUser.setIcon(up);
            mniDangXuat.setText("????ng Nh???p");
            mniDangXuat.setIcon(dangnhap);
            mniDoiMatKhau.setText("Qu??n M???t Kh???u");
            mniDoiMatKhau.setIcon(quenmk);
            ToolBar.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            pn2.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnGioHang.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnNhapHang.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnNhanVien.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnKhachHang.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnNhaCungCap.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnSanPham.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnThongKe.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
            btnLSGD.setBackground(new Color(Integer.parseInt("CCFFFF", 16)));
        } else {
            ToolBar.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            pn2.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnGioHang.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnNhapHang.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnNhanVien.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnKhachHang.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnNhaCungCap.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnSanPham.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnThongKe.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            btnLSGD.setBackground(new Color(Integer.parseInt(dao.selectById(ShareHelper.user.getMaNV()).getMauNen(), 16)));
            mnuUser.setText(ShareHelper.user.getMaNV());
            mnuUser.setIcon(User);
            mniDangXuat.setIcon(dangxuat);
            mniDangXuat.setText("????ng Xu???t");
            mniDoiMatKhau.setText("?????i M???t Kh???u");
            mniDoiMatKhau.setIcon(doimk);
        }
    }

    private void startDongHo() {
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String text = sdf.format(date);
                lblDongHo.setText(text);
            }
        }
        );
        t.start();
    }

    private void openLichSuGiaoDich() {
        if (ShareHelper.isLogin()) {
            if (!ShareHelper.isManager()) {
                MsgBoxHelper.alert(this, "B???n ko c?? quy???n truy c???p !");
            } else {
                try {
                    lichsugiaodich.setClosed(true);
                } catch (Exception e) {
                }
                lichsugiaodich = new LSGDJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
                int x = this.getWidth() / 2 - lichsugiaodich.getWidth() / 2;
                int y = (this.getHeight() - 40) / 2 - lichsugiaodich.getHeight() / 2 - 40;
                lichsugiaodich.setLocation(x, y);
                desktop.add(lichsugiaodich);
                lichsugiaodich.setVisible(true);
            }
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void openQuanLiSanPham() {
        if (ShareHelper.isLogin()) {
            if (!ShareHelper.isManager()) {
                MsgBoxHelper.alert(this, "B???n ko c?? quy???n truy c???p !");
            } else {
                try {
                    quanlisanpham.setClosed(true);
                } catch (Exception e) {
                }
                quanlisanpham = new SanPhamJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
                int x = this.getWidth() / 2 - quanlisanpham.getWidth() / 2;
                int y = (this.getHeight() - 40) / 2 - quanlisanpham.getHeight() / 2 - 40;
                quanlisanpham.setLocation(x, y);
                desktop.add(quanlisanpham);
                quanlisanpham.setVisible(true);
            }
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void openQuanLiKhachHang() {
        if (ShareHelper.isLogin()) {
            try {
                quanlikhachhang.setClosed(true);
            } catch (Exception e) {
            }
            quanlikhachhang = new KhachHangJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
            int x = this.getWidth() / 2 - quanlikhachhang.getWidth() / 2;
            int y = (this.getHeight() - 40) / 2 - quanlikhachhang.getHeight() / 2 - 40;
            quanlikhachhang.setLocation(x, y);
            desktop.add(quanlikhachhang);
            quanlikhachhang.setVisible(true);
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void openNhaCungCap() {
        if (ShareHelper.isLogin()) {
            if (!ShareHelper.isManager()) {
                MsgBoxHelper.alert(this, "B???n ko c?? quy???n truy c???p !");
            } else {
                try {
                    quanlinhacungcap.setClosed(true);
                } catch (Exception e) {
                }
                quanlinhacungcap = new NhaCungCapJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
                int x = this.getWidth() / 2 - quanlinhacungcap.getWidth() / 2;
                int y = (this.getHeight() - 40) / 2 - quanlinhacungcap.getHeight() / 2 - 40;
                quanlinhacungcap.setLocation(x, y);
                desktop.add(quanlinhacungcap);
                quanlinhacungcap.setVisible(true);
            }
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void openNhanVien() {
        if (ShareHelper.isLogin()) {
            if (!ShareHelper.isManager()) {
                MsgBoxHelper.alert(this, "B???n ko c?? quy???n truy c???p !");
            } else {
                try {
                    quanlinhanvien.setClosed(true);
                } catch (Exception e) {
                }
                quanlinhanvien = new NhanVienJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
                int x = this.getWidth() / 2 - quanlinhanvien.getWidth() / 2;
                int y = (this.getHeight() - 40) / 2 - quanlinhanvien.getHeight() / 2 - 40;
                quanlinhanvien.setLocation(x, y);
                desktop.add(quanlinhanvien);
                quanlinhanvien.setVisible(true);
            }
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void mniOpenThungRac() {
        if (ShareHelper.isLogin()) {
            try {
                thungrac.setClosed(true);
            } catch (Exception e) {
            }
            thungrac = new ThungRacJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
            int x = this.getWidth() / 2 - thungrac.getWidth() / 2;
            int y = (this.getHeight() - 40) / 2 - thungrac.getHeight() / 2 - 40;
            thungrac.setLocation(x, y);
            desktop.add(thungrac);
            thungrac.setVisible(true);
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    private void mniDangXuat() {
        if (ShareHelper.user == null) {
            mnuUser.setText("StartUp");
            mnuUser.setIcon(up);
            mniDangXuat.setText("????ng Nh???p");
            mniDangXuat.setIcon(dangnhap);
            mniDoiMatKhau.setText("Qu??n M???t Kh???u");
            mniDoiMatKhau.setIcon(quenmk);
            new DangNhapJDialog(this, true).setVisible(true);
            mnuUser.setText(ShareHelper.user.getMaNV());
            mnuUser.setIcon(User);
            mniDangXuat.setText("????ng Xu???t");
            mniDangXuat.setIcon(dangxuat);
            mniDoiMatKhau.setText("?????i M???t Kh???u");
            mniDoiMatKhau.setIcon(doimk);
        } else if (ShareHelper.isLogin()) {
            mnuUser.setText("StartUp");
            mnuUser.setIcon(up);
            mniDangXuat.setText("????ng Nh???p");
            mniDangXuat.setIcon(dangnhap);
            mniDoiMatKhau.setText("Qu??n M???t Kh???u");
            mniDoiMatKhau.setIcon(quenmk);
            new DangNhapJDialog(this, true).setVisible(true);
            mnuUser.setText(ShareHelper.user.getMaNV());
            mnuUser.setIcon(User);
            mniDangXuat.setText("????ng Xu???t");
            mniDangXuat.setIcon(dangxuat);
            mniDoiMatKhau.setText("?????i M???t Kh???u");
            mniDoiMatKhau.setIcon(doimk);
        } else {
            new DangNhapJDialog(this, true).setVisible(true);
            mnuUser.setText(ShareHelper.user.getMaNV());
            mnuUser.setIcon(User);
            mniDangXuat.setText("????ng Xu???t");
            mniDangXuat.setIcon(dangxuat);
            mniDoiMatKhau.setText("?????i M???t Kh???u");
            mniDoiMatKhau.setIcon(doimk);
        }
    }

    void openGioHang() {
        if (ShareHelper.isLogin()) {
            try {
                giohang.setClosed(true);
            } catch (Exception e) {
            }
            giohang = new GioHangJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
            int x = this.getWidth() / 2 - giohang.getWidth() / 2;
            int y = (this.getHeight() - 40) / 2 - giohang.getHeight() / 2 - 40;
            giohang.setLocation(x, y);
            desktop.add(giohang);
            giohang.setVisible(true);
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    void mniOpenThongTin() {
        if (ShareHelper.isLogin()) {
            try {
                thongtin.setClosed(true);
            } catch (Exception e) {
            }
            thongtin = new ThongTinJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
            int x = this.getWidth() / 2 - thongtin.getWidth() / 2;
            int y = (this.getHeight() - 40) / 2 - thongtin.getHeight() / 2 - 40;
            thongtin.setLocation(x, y);
            desktop.add(thongtin);
            thongtin.setVisible(true);
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }

    void OpenNhapHang() {
        if (ShareHelper.isLogin()) {
            try {
                nhaphang.setClosed(true);
            } catch (Exception e) {
            }
            nhaphang = new NhapHangJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
            int x = this.getWidth() / 2 - nhaphang.getWidth() / 2;
            int y = (this.getHeight() - 40) / 2 - nhaphang.getHeight() / 2 - 40;
            nhaphang.setLocation(x, y);
            desktop.add(nhaphang);
            nhaphang.setVisible(true);
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }
    
    void OpenThongKe(){
        if (ShareHelper.isLogin()) {
            if (!ShareHelper.isManager()) {
                MsgBoxHelper.alert(this, "B???n ko c?? quy???n truy c???p !");
            } else {
                try {
                    thongke.setClosed(true);
                } catch (Exception e) {
                }
                thongke = new ThongKeJInternalFrame(dao.selectById(ShareHelper.user.getMaNV()).getMauNen());
                int x = this.getWidth() / 2 - thongke.getWidth() / 2;
                int y = (this.getHeight() - 40) / 2 - thongke.getHeight() / 2 - 40;
                thongke.setLocation(x, y);
                desktop.add(thongke);
                thongke.setVisible(true);
            }
        } else {
            MsgBoxHelper.alert(this, "Vui l??ng ????ng nh???p !");
        }
    }
}
