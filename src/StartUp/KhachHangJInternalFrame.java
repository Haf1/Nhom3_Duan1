package StartUp;

import DAO.KhachHangDAO;
import model.KhachHang;
import helper.ShareHelper;
import helper.MsgBoxHelper;
import helper.DateHelper;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KhachHangJInternalFrame extends javax.swing.JInternalFrame {

    KhachHangDAO dao = new KhachHangDAO();
    int row = -1;
    int index = 0;
    int check;

    public KhachHangJInternalFrame(String color) {
        initComponents();
        init();
        pn1.setBackground(new Color(Integer.parseInt(color, 16)));
        pn2.setBackground(new Color(Integer.parseInt(color, 16)));
        pn3.setBackground(new Color(Integer.parseInt(color, 16)));
        pn4.setBackground(new Color(Integer.parseInt(color, 16)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn2 = new javax.swing.JPanel();
        pn4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPrePage = new javax.swing.JButton();
        lblChiSo = new javax.swing.JLabel();
        btnNextPage = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiemThuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Qu???n L?? Kh??ch H??ng");
        setToolTipText("");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kh??ch H??ng");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??m Ki???m", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? KH", "T??n KH", "S??T", "Email", "Ng??y Sinh", "Gi???i T??nh", "??i???m", "M?? NV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.setToolTipText("EduSys - Qu???n L?? Kh??ch H??ng");
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach);

        btnPrePage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrePage.setText("<<");
        btnPrePage.setEnabled(false);
        btnPrePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrePageActionPerformed(evt);
            }
        });

        lblChiSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSo.setText("1");

        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText(">>");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        btnXuatExcel.setText("Xu???t File");
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatExcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnPrePage)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSo)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatExcel)))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrePage)
                    .addComponent(lblChiSo)
                    .addComponent(btnNextPage)
                    .addComponent(btnXuatExcel))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        tabs.addTab("Danh S??ch", pn2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("M?? Kh??ch H??ng");

        txtMaKhachHang.setEditable(false);
        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("T??n Kh??ch H??ng");

        txtTenKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("S??? ??i???n Tho???i");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Gi???i T??nh");

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNu.setText("N???");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ng??y Sinh");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("??i???m Th?????ng");

        txtDiemThuong.setEditable(false);
        txtDiemThuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiemThuong.setText("0");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoa.setText("V?? Hi???u H??a");
        btnVoHieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoi.setText("M???i");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPre.setText("<<");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("M?? Nh??n Vi??n");

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoHieuHoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu))
                            .addComponent(jLabel4)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKhachHang)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaKhachHang)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiemThuong, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtMaNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        tabs.addTab("Chi Ti???t", pn3);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        timkiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnPrePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrePageActionPerformed
        prePage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnPrePageActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        nextPage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        checkFormInsert();
        if (check == 1) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        checkFormUpdate();
        if (check == 1) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnVoHieuHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaActionPerformed
        vohieuhoa();
    }//GEN-LAST:event_btnVoHieuHoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        prev();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed


    private void btnXuatExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseClicked
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Kh??ch h??ng");

        XSSFRow row = null;
        Cell cell = null;

        row = sheet.createRow((short) 2);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("M?? kh??ch h??ng");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("T??n kh??ch h??ng");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("S??T");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Email");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Ng??y sinh");
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Gi???i t??nh");
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("T??ch ??i???m");
        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("M?? NV");
        cell = row.createCell(9, CellType.STRING);
        cell.setCellValue("Tr???ng th??i");

//        List<nhanVien> listItem = dao.select();
        if (list != null) {
            FileOutputStream fis = null;
            try {
                int s = list.size();
                for (int i = 0; i < s; i++) {
                    KhachHang kh1 = list.get(i);
                    row = sheet.createRow((short) 4 + i);
                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(kh1.getMaKH());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(kh1.getTenKH());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(kh1.getsDT());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(kh1.getEmail());

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(kh1.getNgaySinh());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(kh1.isGioiTinh());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(kh1.getDiemThuong());

                    cell = row.createCell(8, CellType.STRING);
                    cell.setCellValue(kh1.getMaNV());

                    cell = row.createCell(9, CellType.STRING);
                    cell.setCellValue(kh1.isTrangThai());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgaySinh;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPrePage;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnVoHieuHoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiSo;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillTable(0);
        lblChiSo.setText(index + 1 + "");
        this.row = -1;
        updateStatus();
        txtMaNV.setText(ShareHelper.user.getMaNV());

        TableColumnModel mol = tblDanhSach.getColumnModel();
        mol.getColumn(0).setMaxWidth(105);
        mol.getColumn(0).setMinWidth(105);
        mol.getColumn(1).setMaxWidth(160);
        mol.getColumn(1).setMinWidth(120);
        mol.getColumn(2).setMaxWidth(80);
        mol.getColumn(2).setMinWidth(80);
        mol.getColumn(3).setMaxWidth(150);
        mol.getColumn(4).setMaxWidth(80);
        mol.getColumn(5).setMaxWidth(60);
        mol.getColumn(6).setMaxWidth(45);
        mol.getColumn(7).setMaxWidth(65);
        tblDanhSach.setColumnModel(mol);

    }

    void insert() {
        KhachHang kh = getForm();
        try {
            dao.insert(kh);
            this.fillTable(0);
            btnPrePage.setEnabled(false);
            btnNextPage.setEnabled(true);
            this.clearForm();
            MsgBoxHelper.alert(this, "Th??m m???i th??nh c??ng !!");
            lblChiSo.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "M?? KH ???? t???n t???i !!");
        }
    }

    void update() {
        KhachHang kh = getForm();
        try {
            dao.update(kh);
            this.fillTable(0);
            btnPrePage.setEnabled(false);
            btnNextPage.setEnabled(true);
            MsgBoxHelper.alert(this, "S???a th??nh c??ng !!");
            lblChiSo.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "S???a th???t b???i !!");
        }

    }

    void vohieuhoa() {
        if (!ShareHelper.isManager()) {
            MsgBoxHelper.alert(this, "B???n kh??ng c?? quy???n v?? hi???u h??a kh??ch h??ng !!");
        } else {
            String maKH = txtMaKhachHang.getText();
            if (MsgBoxHelper.confirm(this, "B???n th???c s??? mu???n v?? hi???u h??a nh??n vi??n n??y ?")) {
                try {
                    dao.vohieuhoa(maKH);
                    fillTable(0);
                    btnPrePage.setEnabled(false);
                    btnNextPage.setEnabled(true);
                    clearForm();
                    MsgBoxHelper.alert(this, "V?? hi???u h??a th??nh c??ng !!");
                    lblChiSo.setText(1 + "");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBoxHelper.alert(this, "V?? hi???u h??a th???t b???i !!");
                }
            }
        }
    }

    void clearForm() {
        String kytu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String chuoi1 = "";
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
            KhachHang kh = dao.selectById(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
            if (kh != null) {
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
        txtMaKhachHang.setText(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
        txtTenKhachHang.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        DCNgaySinh.setDate(null);
        txtDiemThuong.setText("0");
        txtMaNV.setText(ShareHelper.user.getMaNV());
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String makh = (String) tblDanhSach.getValueAt(row, 0);
        KhachHang kh = dao.selectById(makh);
        setForm(kh);
        tabs.setSelectedIndex(1);
        updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblDanhSach.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblDanhSach.getRowCount() - 1;
        this.edit();
    }

    void fillTable(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSach.getModel();
        mol.setRowCount(0);
        String key = txtTimKiem.getText();
        try {
            List<KhachHang> listkh = dao.selectPage(key, index);
            for (KhachHang kh : listkh) {
                Object[] row = {kh.getMaKH(), kh.getTenKH(), kh.getsDT(), kh.getEmail(), kh.getNgaySinh(),
                    kh.isGioiTinh() ? "Nam" : "N???", kh.getDiemThuong(), kh.getMaNV()};
                mol.addRow(row);
            }
            lblChiSo.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "L???i truy v???n d??? li???u !");
        }
    }
    List<KhachHang> list = dao.selectAll();
    double count = (list.size() / 10);

    void updatePage() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblDanhSach.getRowCount() <= 8);
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

    void setForm(KhachHang kh) {
        txtMaKhachHang.setText(kh.getMaKH());
        txtTenKhachHang.setText(String.valueOf(kh.getTenKH()));
        rdoNam.setSelected(kh.isGioiTinh());
        rdoNu.setSelected(!kh.isGioiTinh());
        DCNgaySinh.setDate(DateHelper.toDate(kh.getNgaySinh(), "yyyy-MM-dd"));
        txtSDT.setText(kh.getsDT());
        txtEmail.setText(kh.getEmail());
        txtDiemThuong.setText(kh.getDiemThuong() + "");
        txtMaNV.setText(kh.getMaNV());
    }

    KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKhachHang.getText());
        kh.setTenKH(txtTenKhachHang.getText());
        kh.setGioiTinh(rdoNam.isSelected());
        kh.setGioiTinh(!rdoNu.isSelected());
        kh.setNgaySinh(DateHelper.toString(DCNgaySinh.getDate(), "yyyy-MM-dd"));
        kh.setsDT(txtSDT.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiemThuong(Integer.parseInt(txtDiemThuong.getText()));
        kh.setMaNV(ShareHelper.user.getMaNV());
        return kh;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //tr???ng th??i form
        txtMaKhachHang.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
        //tr???ng th??i ??i???u h?????ng
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void timkiem() {
        this.fillTable(0);
        this.row = -1;
        this.updateStatus();
    }

    void checkFormUpdate() {
        KhachHang kh = dao.selectById(txtMaKhachHang.getText());
        if (kh == null) {
            MsgBoxHelper.alert(this, "M?? kh??ch h??ng kh??ng t???n t???i !!");
            txtMaKhachHang.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenKhachHang.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng h??? t??n kh??ch h??ng !!");
            txtTenKhachHang.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (DCNgaySinh.getDate() == null) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng ng??y sinh!!");
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtSDT.getText().matches("0[0-9]{9}")) {
            KhachHang kh1 = dao.selectBySDT(txtSDT.getText());
            if (kh1 != null) {
                if (!txtMaKhachHang.getText().equals(kh1.getMaKH())) {
                    MsgBoxHelper.alert(this, "S??? ??i???n tho???i n??y thu???c quy???n c???a nh??n vi??n kh??c !!");
                    txtSDT.requestFocus();
                    check = 0;
                    return;
                } else {
                    check = 1;
                }
            } else {
                check = 1;
            }
        } else {
            MsgBoxHelper.alert(this, "S??? ??i???n tho???i kh??ng ????ng ?????nh d???ng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        }
    }

    void checkFormInsert() {
        KhachHang kh = dao.selectById(txtMaKhachHang.getText());
        if (kh != null) {
            MsgBoxHelper.alert(this, "M?? kh??ch h??ng ???? t???n t???i !!");
            txtMaKhachHang.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenKhachHang.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng h??? t??n kh??ch h??ng !!");
            txtTenKhachHang.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (DCNgaySinh.getDate() == null) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng ng??y sinh!!");
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtSDT.getText().matches("0[0-9]{9}")) {
            KhachHang kh2 = dao.selectBySDT(txtSDT.getText());
            if (kh2 != null) {
                MsgBoxHelper.alert(this, "S??? ??i???n tho???i ???? ???????c li??n k???t v???i m???t kh??ch h??ng kh??c !!");
                txtSDT.requestFocus();
                check = 0;
                return;
            } else {
                check = 1;
            }
        } else {
            MsgBoxHelper.alert(this, "S??? ??i???n tho???i kh??ng ????ng ?????nh d???ng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        }
    }
}
