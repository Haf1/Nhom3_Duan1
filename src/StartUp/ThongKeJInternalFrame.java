package StartUp;

import DAO.ChiTietHoaDonNhapHangDAO;
import DAO.ChiTietHoaDonThanhToanDAO;
import DAO.HoaDonNhapHangDAO;
import DAO.HoaDonThanhToanDAO;
import DAO.ThongKeDAO;
import helper.MsgBoxHelper;
import helper.currency;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThongKeJInternalFrame extends javax.swing.JInternalFrame {

    HoaDonThanhToanDAO daott = new HoaDonThanhToanDAO();
    ChiTietHoaDonThanhToanDAO daocttt = new ChiTietHoaDonThanhToanDAO();
    HoaDonNhapHangDAO daonh = new HoaDonNhapHangDAO();
    ChiTietHoaDonNhapHangDAO daoctnh = new ChiTietHoaDonNhapHangDAO();
    ThongKeDAO daotk = new ThongKeDAO();
    
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
        btnChartMonth = new javax.swing.JButton();
        btnChartYear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thống Kê");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblTongDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        lblChiSoDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoDT.setText("1");

        btnNextDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextDT.setText(">>");

        btnChartMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChartMonth.setText("Chart Month");
        btnChartMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartMonthActionPerformed(evt);
            }
        });

        btnChartYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChartYear.setText("Chart Year");
        btnChartYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 489, Short.MAX_VALUE))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPreDT)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoDT)
                .addGap(18, 18, 18)
                .addComponent(btnNextDT)
                .addGap(268, 268, 268))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreDT)
                    .addComponent(lblChiSoDT)
                    .addComponent(btnNextDT))
                .addGap(18, 18, 18)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChartYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("Tổng Doanh Thu", pn1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        tabs.addTab("Sản Phẩm", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChartMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartMonthActionPerformed
        ChartThang.demo();
    }//GEN-LAST:event_btnChartMonthActionPerformed

    private void cboThoiGianDTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThoiGianDTItemStateChanged
        if (cboThoiGianDT.getItemCount() > 1) {
            if (cboThoiGianDT.getSelectedIndex() == 0) {
                fillTableNgay();
            } else if(cboThoiGianDT.getSelectedIndex() == 1){
                fillTableThang();
            } else {
                fillTableNam();
            }
        }
    }//GEN-LAST:event_cboThoiGianDTItemStateChanged

    private void btnChartYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartYearActionPerformed
        ChartNam.demo();
    }//GEN-LAST:event_btnChartYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChartMonth;
    private javax.swing.JButton btnChartYear;
    private javax.swing.JButton btnNextDT;
    private javax.swing.JButton btnPreDT;
    private javax.swing.JComboBox<String> cboThoiGianDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiSoDT;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblTongDoanhThu;
    private javax.swing.JTextField txtLoiNhuanDT;
    // End of variables declaration//GEN-END:variables
    void init() {
        fillTableNgay();
        cboThoiGianDT.removeAllItems();
        cboThoiGianDT.addItem("Ngày");
        cboThoiGianDT.addItem("Tháng");
        cboThoiGianDT.addItem("Năm");
        cboThoiGianDT.setSelectedIndex(0);
    }
    
    void fillTableNgay() {
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            List<Object[]> list = daotk.SelectThongKeNgay();
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? x[0] : x[2], currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban-tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    
    void fillTableThang(){
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            List<Object[]> list = daotk.SelectThongKeThang();
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? "tháng" + x[0] + "" : "tháng" + x[2] + "", currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban-tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableNam(){
        DefaultTableModel mol = (DefaultTableModel) tblTongDoanhThu.getModel();
        mol.setRowCount(0);
        try {
            List<Object[]> list = daotk.SelectThongKeNam();
            for (Object[] x : list) {
                Double tienban = Double.parseDouble(x[1] == null ? "0" : x[1] + "");
                Double tiennhap = Double.parseDouble(x[3] == null ? "0" : x[3] + "");
                mol.addRow(new Object[]{x[0] != null ? "Năm" + x[0] : "Năm" + x[2], currency.toCurrency(tienban), currency.toCurrency(tiennhap), currency.toCurrency(tienban-tiennhap)});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
}
