package StartUp;

import DAO.ChiTietHoaDonNhapHangDAO;
import DAO.ChiTietHoaDonThanhToanDAO;
import DAO.HoaDonNhapHangDAO;
import DAO.HoaDonThanhToanDAO;
import DAO.SanPhamDAO;
import DAO.ThongKeDAO;
import DAO.ThuongHieuDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.currency;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThongKeJInternalFrame extends javax.swing.JInternalFrame {

    HoaDonThanhToanDAO daott = new HoaDonThanhToanDAO();
    ChiTietHoaDonThanhToanDAO daocttt = new ChiTietHoaDonThanhToanDAO();
    HoaDonNhapHangDAO daonh = new HoaDonNhapHangDAO();
    ChiTietHoaDonNhapHangDAO daoctnh = new ChiTietHoaDonNhapHangDAO();
    ThongKeDAO daotk = new ThongKeDAO();
    ThuongHieuDAO daoth = new ThuongHieuDAO();
    SanPhamDAO daosp = new SanPhamDAO();
    int index = 0;
    int index1 = 0;
    CardLayout card;

    public ThongKeJInternalFrame(String color) {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTongDoanhThu = new javax.swing.JTable();
        pn2 = new javax.swing.JPanel();
        cboThoiGianDT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtLoiNhuanDT = new javax.swing.JTextField();
        btnPreDT = new javax.swing.JButton();
        lblChiSoDT = new javax.swing.JLabel();
        btnNextDT = new javax.swing.JButton();
        pn4 = new javax.swing.JPanel();
        pncard2 = new javax.swing.JPanel();
        pncard1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DCNgayBD = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        DCNgayKT = new com.toedter.calendar.JDateChooser();
        btnCheck = new javax.swing.JButton();
        pncard3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboThangBD = new javax.swing.JComboBox<>();
        cboThangBD1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCheck1 = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnPreSP = new javax.swing.JButton();
        lblChiSoSP = new javax.swing.JLabel();
        btnNextSP = new javax.swing.JButton();
        btnXuatExcel1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(733, 535));
        setPreferredSize(new java.awt.Dimension(733, 535));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thống Kê");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblTongDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Thời Gian", "Tiền Bán Hàng", "Tiền Nhập Hàng", "Tổng Doanh Thu"
            }
        ));
        jScrollPane1.setViewportView(tblTongDoanhThu);

        pn2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời Gian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThoiGianDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThoiGianDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThoiGianDT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThoiGianDTItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianDT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianDT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lợi Nhuận");

        txtLoiNhuanDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnPreDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPreDT.setText("<<");
        btnPreDT.setEnabled(false);
        btnPreDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreDTActionPerformed(evt);
            }
        });

        lblChiSoDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoDT.setText("1");

        btnNextDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextDT.setText(">>");
        btnNextDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDTActionPerformed(evt);
            }
        });

        pn4.setLayout(new java.awt.CardLayout());

        pncard2.setName("pncard2"); // NOI18N

        javax.swing.GroupLayout pncard2Layout = new javax.swing.GroupLayout(pncard2);
        pncard2.setLayout(pncard2Layout);
        pncard2Layout.setHorizontalGroup(
            pncard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pncard2Layout.setVerticalGroup(
            pncard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pn4.add(pncard2, "pncard2");

        pncard1.setName("pncard1"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày Bắt Đầu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Kết Thúc");

        btnCheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCheck.setText("CHECK");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pncard1Layout = new javax.swing.GroupLayout(pncard1);
        pncard1.setLayout(pncard1Layout);
        pncard1Layout.setHorizontalGroup(
            pncard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(DCNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(DCNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        );
        pncard1Layout.setVerticalGroup(
            pncard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pncard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DCNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DCNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn4.add(pncard1, "pncard2");

        pncard3.setName("pncard3"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tháng Bắt Đầu");

        cboThangBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThangBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboThangBD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThangBD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tháng Kết Thúc");

        btnCheck1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCheck1.setText("CHECK");
        btnCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pncard3Layout = new javax.swing.GroupLayout(pncard3);
        pncard3.setLayout(pncard3Layout);
        pncard3Layout.setHorizontalGroup(
            pncard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncard3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cboThangBD, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboThangBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheck1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pncard3Layout.setVerticalGroup(
            pncard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pncard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cboThangBD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheck1))
                    .addGroup(pncard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cboThangBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn4.add(pncard3, "pncard3");

        btnXuatExcel.setText("Xuất File");
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatExcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(btnPreDT)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoDT)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextDT)
                        .addGap(66, 66, 66)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXuatExcel)))
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPreDT)
                                .addComponent(lblChiSoDT)
                                .addComponent(btnNextDT))
                            .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatExcel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Tổng Doanh Thu", pn1);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Thương Hiệu", "Mã Sản Phẩm", "Tên Sản Phẩm", "SL Nhập", "SL Bán", "SL Trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        btnPreSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPreSP.setText("<<");
        btnPreSP.setEnabled(false);
        btnPreSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreSPActionPerformed(evt);
            }
        });

        lblChiSoSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoSP.setText("1");

        btnNextSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextSP.setText(">>");
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });

        btnXuatExcel1.setText("Xuất File");
        btnXuatExcel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatExcel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btnPreSP)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoSP)
                .addGap(18, 18, 18)
                .addComponent(btnNextSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuatExcel1)
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreSP)
                    .addComponent(lblChiSoSP)
                    .addComponent(btnNextSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnXuatExcel1)
                .addContainerGap())
        );

        tabs.addTab("Sản Phẩm", pn3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        nextPageSP();
        lblChiSoSP.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnPreSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreSPActionPerformed
        prePageSP();
        lblChiSoSP.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreSPActionPerformed

    private void btnNextDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDTActionPerformed
        nextPage();
        lblChiSoDT.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnNextDTActionPerformed

    private void btnPreDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreDTActionPerformed
        prePage();
        lblChiSoDT.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnPreDTActionPerformed

    private void cboThoiGianDTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThoiGianDTItemStateChanged
        if (cboThoiGianDT.getItemCount() > 1) {
            if (cboThoiGianDT.getSelectedIndex() == 0) {
                fillTableNgay(0);
                lblChiSoDT.setText(1 + "");
                btnPreDT.setEnabled(false);
                btnNextDT.setEnabled(true);
                pncard1.setVisible(true);
                pncard2.setVisible(false);
                pncard3.setVisible(false);
            } else if (cboThoiGianDT.getSelectedIndex() == 1) {
                fillTableThang();
                lblChiSoDT.setText(1 + "");
                btnPreDT.setEnabled(false);
                btnNextDT.setEnabled(false);
                pncard1.setVisible(false);
                pncard2.setVisible(false);
                pncard3.setVisible(true);
            } else {
                fillTableNam();
                lblChiSoDT.setText(1 + "");
                btnPreDT.setEnabled(false);
                btnNextDT.setEnabled(false);
                pncard1.setVisible(false);
                pncard2.setVisible(true);
                pncard3.setVisible(false);
            }
        }
    }//GEN-LAST:event_cboThoiGianDTItemStateChanged

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        int ngaybd;
        int ngaykt;
        if (DCNgayBD.getDate() == null) {
            ngaybd = 100101;
        } else {
            ngaybd = Integer.parseInt(DateHelper.toString(DCNgayBD.getDate(), "yyMMdd"));
        }
        if (DCNgayKT.getDate() == null) {
            ngaykt = 990101;
        } else {
            ngaykt = Integer.parseInt(DateHelper.toString(DCNgayKT.getDate(), "yyMMdd"));
        }
        if (ngaykt < ngaybd) {
            MsgBoxHelper.alert(this, "Ngày kết thúc phải nằm sau ngày bắt đầu !!");
            return;
        } else {
            fillTableNgay(0);
            lblChiSoDT.setText(1 + "");
            btnNextDT.setEnabled(true);
            btnPreDT.setEnabled(false);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck1ActionPerformed
        int thangbd = cboThangBD.getSelectedIndex() + 1;
        int thangkt = cboThangBD1.getSelectedIndex() + 1;
        if (thangbd > thangkt) {
            MsgBoxHelper.alert(this, "Tháng bắt đầu phải nhỏ hơn tháng kết thúc !!");
            return;
        } else {
            fillTableThang();
            lblChiSoDT.setText(1 + "");
        }
    }//GEN-LAST:event_btnCheck1ActionPerformed

    private void btnXuatExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseClicked
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Thống kê doanh thu");

        XSSFRow row = null;
        Cell cell = null;

        row = sheet.createRow((short) 2);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Thời gian");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Tiền bán hàng");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Tiền nhập hàng");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Tổng doanh thu");

        if (tblTongDoanhThu != null) {
            FileOutputStream fis = null;
            try {
                DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
                for (int i = 0; i < tblTongDoanhThu.getRowCount(); i++) {

                    row = sheet.createRow((short) 4 + i);
                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 0).toString());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 1).toString());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 2).toString());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 3).toString());

                }
                //save file
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(this);
                File f = fc.getSelectedFile();
                fis = new FileOutputStream(f + ".xlsx");
                workbook.write(fis);
                fis.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXuatExcelMouseClicked

    private void btnXuatExcel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcel1MouseClicked
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Thống kê sản phẩm");

        XSSFRow row = null;
        Cell cell = null;

        row = sheet.createRow((short) 2);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Thương hiệu");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Mã sản phẩm");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Tên sản phẩm");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("SL nhập");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Sl bán");
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Sl trả");

        if (tblTongDoanhThu != null) {
            FileOutputStream fis = null;
            try {
                DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
                for (int i = 0; i < tblTongDoanhThu.getRowCount(); i++) {

                    row = sheet.createRow((short) 4 + i);
                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 0).toString());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 1).toString());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 2).toString());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 3).toString());
                    
                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 3).toString());
                    
                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(mol.getValueAt(i, 3).toString());

                }
                //save file
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(this);
                File f = fc.getSelectedFile();
                fis = new FileOutputStream(f + ".xlsx");
                workbook.write(fis);
                fis.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXuatExcel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgayBD;
    private com.toedter.calendar.JDateChooser DCNgayKT;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCheck1;
    private javax.swing.JButton btnNextDT;
    private javax.swing.JButton btnNextSP;
    private javax.swing.JButton btnPreDT;
    private javax.swing.JButton btnPreSP;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JButton btnXuatExcel1;
    private javax.swing.JComboBox<String> cboThangBD;
    private javax.swing.JComboBox<String> cboThangBD1;
    private javax.swing.JComboBox<String> cboThoiGianDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiSoDT;
    private javax.swing.JLabel lblChiSoSP;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pncard1;
    private javax.swing.JPanel pncard2;
    private javax.swing.JPanel pncard3;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblTongDoanhThu;
    private javax.swing.JTextField txtLoiNhuanDT;
    // End of variables declaration//GEN-END:variables
    void init() {
        fillTableNgay(0);
        pncard1.setVisible(true);
        pncard2.setVisible(false);
        pncard3.setVisible(false);
        fillTableSanPham(0);
        cboThoiGianDT.removeAllItems();
        cboThoiGianDT.addItem("Ngày");
        cboThoiGianDT.addItem("Tháng");
        cboThoiGianDT.addItem("Năm");
        cboThoiGianDT.setSelectedIndex(0);
        cboThangBD.removeAllItems();
        cboThangBD1.removeAllItems();
        for (int i = 1; i < 13; i++) {
            cboThangBD.addItem("Tháng " + i);
        }
        for (int i = 1; i < 13; i++) {
            cboThangBD1.addItem("Tháng " + i);
        }

        TableColumnModel mol = tblSanPham.getColumnModel();
        mol.getColumn(0).setMaxWidth(105);
        mol.getColumn(0).setMinWidth(105);
        mol.getColumn(1).setMaxWidth(170);
        mol.getColumn(1).setMinWidth(130);
        mol.getColumn(2).setMaxWidth(190);
        mol.getColumn(2).setMinWidth(130);
        mol.getColumn(3).setMaxWidth(80);
        mol.getColumn(4).setMaxWidth(80);
        mol.getColumn(5).setMaxWidth(80);
        tblSanPham.setColumnModel(mol);
    }

    void fillTableNgay(int index1) {
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            String ngaybd = "";
            String ngaykt = "";
            if (DCNgayBD.getDate() == null) {
                ngaybd = "19000101";
            } else {
                ngaybd = DateHelper.toString(DCNgayBD.getDate(), "yyyy-MM-dd");
            }
            if (DCNgayKT.getDate() == null) {
                ngaykt = "21000101";
            } else {
                ngaykt = DateHelper.toString(DCNgayKT.getDate(), "yyyy-MM-dd");
            }
            List<Object[]> list = daotk.SelectThongKeNgay(ngaybd, ngaykt, ngaybd, ngaykt, index1);
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? x[0] : x[2], currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban - tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<Object[]> list1 = daotk.SelectThongKeNgay1();
    double count1 = (list1.size() / 15);

    void updatePage() {
        boolean page = (this.index1 >= 0);
        boolean fpage = (this.index1 == 0);
        boolean lpage = (tblTongDoanhThu.getRowCount() <= 13);
        btnNextDT.setEnabled(page && !lpage);
        btnPreDT.setEnabled(page && !fpage);
    }

    void prePage() {
        if (index1 > 0) {
            index1--;
            fillTableNgay(index1);
            updatePage();
            btnNextDT.setEnabled(true);
        }
    }

    void nextPage() {
        if (index1 < count1) {
            index1++;
            fillTableNgay(index1);
            updatePage();
        }
    }

    void fillTableThang() {
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            String thangbdn = cboThangBD.getSelectedIndex() + 1 + "";
            String thangktn = cboThangBD1.getSelectedIndex() + 1 + "";
            String thangbdt = cboThangBD.getSelectedIndex() + 1 + "";
            String thangktt = cboThangBD1.getSelectedIndex() + 1 + "";
            List<Object[]> list = daotk.SelectThongKeThang(thangbdn, thangktn, thangbdt, thangktt);
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? "tháng " + x[0] + "" : "tháng " + x[2] + "", currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban - tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableNam() {
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            List<Object[]> list = daotk.SelectThongKeNam();
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? "Năm " + x[0] : "Năm " + x[2], currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban - tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableSanPham(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
        try {
            List<Object[]> list = daotk.SelectThongKeSanPham(index);
            for (Object[] x : list) {
                mol.addRow(new Object[]{daoth.selectById(daosp.selectById(x[0] + "").getMaThuongHieu()).getTenThuongHieu(),
                    x[0], daosp.selectById(x[0] + "").getTenSP(), x[1], x[3] != null ? x[3] : "0", x[5] != null ? x[5] : "0"});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<Object[]> list = daotk.SelectThongKeSanPham1();
    double count = (list.size() / 20);

    void updatePageSP() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblSanPham.getRowCount() <= 18);
        btnNextSP.setEnabled(page && !lpage);
        btnPreSP.setEnabled(page && !fpage);
    }

    void prePageSP() {
        if (index > 0) {
            index--;
            fillTableSanPham(index);
            updatePageSP();
            btnNextSP.setEnabled(true);
        }
    }

    void nextPageSP() {
        if (index < count) {
            index++;
            fillTableSanPham(index);
            updatePageSP();
        }
    }

    void chuyenDoi() {

    }
}
