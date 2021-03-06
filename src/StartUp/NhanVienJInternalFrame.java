package StartUp;

import DAO.NhanVienDAO;
import model.NhanVien;

import helper.*;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.ShareHelper;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NhanVienJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;
    int index = 0;
    int check;

    public NhanVienJInternalFrame(String color) {
        initComponents();
        init();
        pn1.setBackground(new Color(Integer.parseInt(color, 16)));
        pn2.setBackground(new Color(Integer.parseInt(color, 16)));
        pn3.setBackground(new Color(Integer.parseInt(color, 16)));
        pn4.setBackground(new Color(Integer.parseInt(color, 16)));
        pn5.setBackground(new Color(Integer.parseInt(color, 16)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPrePage = new javax.swing.JButton();
        btnNextPage = new javax.swing.JButton();
        lblChiSo = new javax.swing.JLabel();
        btnXuatExcel = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn4 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        pn5 = new javax.swing.JPanel();
        rdoNhanVien = new javax.swing.JRadioButton();
        rdoQuanLy = new javax.swing.JRadioButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Qu???n L?? Nh??n Vi??n");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Qu???n L?? Nh??n Vi??n");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn2.setBackground(new java.awt.Color(0, 204, 255));

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? NV", "T??n NV", "S??T", "Email", "Ng??y Sinh", "Gi???i T??nh", "Vai Tr??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText(">>");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        lblChiSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSo.setText("1");

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
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrePage)
                        .addComponent(btnNextPage)
                        .addComponent(lblChiSo))
                    .addComponent(btnXuatExcel))
                .addContainerGap())
        );

        tabs.addTab("Danh S??ch", pn2);

        pn3.setBackground(new java.awt.Color(0, 204, 255));

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("M?? Nh??n Vi??n");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("T??n Nh??n Vi??n");

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("S??? ??i???n Tho???i");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ng??y Sinh");

        pn4.setBackground(new java.awt.Color(0, 204, 255));
        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gi???i T??nh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNu.setText("N???");

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoNam)
                .addGap(18, 18, 18)
                .addComponent(rdoNu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdoNam)
                .addComponent(rdoNu))
        );

        pn5.setBackground(new java.awt.Color(0, 204, 255));
        pn5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vai Tr??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNhanVien.setText("Nh??n Vi??n");

        buttonGroup2.add(rdoQuanLy);
        rdoQuanLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoQuanLy.setSelected(true);
        rdoQuanLy.setText("Qu???n L??");

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addComponent(rdoQuanLy)
                .addGap(18, 18, 18)
                .addComponent(rdoNhanVien))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdoQuanLy)
                .addComponent(rdoNhanVien))
        );

        btnPre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPre.setText("<<");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setText("C???p Quy???n");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoHieuHoa.setText("V?? Hi???u H??a");
        btnVoHieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMoi.setText("M???i");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("?????a Ch???");

        txtDiaChi.setColumns(20);
        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(pn3Layout.createSequentialGroup()
                                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtMaNV))
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(txtTenNV)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        tabs.addTab("Chi Ti???t", pn3);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
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

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void btnXuatExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseClicked
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Nh??n vi??n");

        XSSFRow row = null;
        Cell cell = null;

        row = sheet.createRow((short) 2);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("M?? nh??n vi??n");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("T??n nh??n vi??n");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("?????a ch???");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("S??T");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Email");
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Ng??y sinh");
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Gi???i t??nh");
        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("???nh");
        cell = row.createCell(9, CellType.STRING);
        cell.setCellValue("Tr???ng th??i");
        cell = row.createCell(10, CellType.STRING);
        cell.setCellValue("Vai tr??");
//        List<nhanVien> listItem = dao.select();
        if (list != null) {
            FileOutputStream fis = null;
            try {
                int s = list.size();
                for (int i = 0; i < s; i++) {
                    NhanVien nv1 = list.get(i);
                    row = sheet.createRow((short) 4 + i);
                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(nv1.getMaNV());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(nv1.getTenNV());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(nv1.getDiaChi());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(nv1.getsDT());

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(nv1.getEmail());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(nv1.getNgaySinh());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(nv1.isGioiTinh());

                    cell = row.createCell(8, CellType.STRING);
                    cell.setCellValue(nv1.getAnhNV());

                    cell = row.createCell(9, CellType.STRING);
                    cell.setCellValue(nv1.isTrangThai());

                    cell = row.createCell(10, CellType.STRING);
                    cell.setCellValue(nv1.isVaiTro());
                }
                //save file
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(this);
                File f = fc.getSelectedFile();
                fis = new FileOutputStream(f+".xlsx");
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
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiSo;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillTable(0);
        lblChiSo.setText(index + 1 + "");
        this.row = -1;
        updateStatus();

        TableColumnModel mol_nv = tblDanhSach.getColumnModel();
        mol_nv.getColumn(0).setMaxWidth(65);
        mol_nv.getColumn(0).setMinWidth(65);
        mol_nv.getColumn(1).setMaxWidth(160);
        mol_nv.getColumn(1).setMinWidth(130);
        mol_nv.getColumn(2).setMaxWidth(80);
        mol_nv.getColumn(2).setMinWidth(80);
        mol_nv.getColumn(3).setMaxWidth(180);
        mol_nv.getColumn(4).setMaxWidth(75);
        mol_nv.getColumn(5).setMaxWidth(65);
        mol_nv.getColumn(6).setMaxWidth(70);
        tblDanhSach.setColumnModel(mol_nv);
    }

    void insert() {
        NhanVien nv = getForm();
        if (!ShareHelper.isManager()) {
            MsgBoxHelper.alert(this, "B???n kh??ng c?? quy???n th??m nh??n vi??n !!");
        } else {
            try {
                dao.insert(nv);
                this.fillTable(0);
                btnPrePage.setEnabled(false);
                btnNextPage.setEnabled(true);
                this.clearForm();
                tabs.setSelectedIndex(0);
                MsgBoxHelper.alert(this, "Th??m m???i th??nh c??ng !!");
                lblChiSo.setText(1 + "");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBoxHelper.alert(this, "M?? NV ???? t???n t???i !!");
            }
        }
    }

    void update() {
        NhanVien nv = getForm();
        if (!ShareHelper.isManager()) {
            MsgBoxHelper.alert(this, "B???n kh??ng c?? quy???n s???a nh??n vi??n !!");
        } else {
            try {
                dao.update(nv);
                this.fillTable(0);
                btnPrePage.setEnabled(false);
                btnNextPage.setEnabled(true);
                tabs.setSelectedIndex(0);
                MsgBoxHelper.alert(this, "S???a th??nh c??ng !!");
                lblChiSo.setText(1 + "");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBoxHelper.alert(this, "S???a th???t b???i !!");
            }
        }
    }

    void vohieuhoa() {
        if (!ShareHelper.isManager()) {
            MsgBoxHelper.alert(this, "B???n kh??ng c?? quy???n v?? hi???u h??a nh??n vi??n !!");
        } else {
            String maNV = txtMaNV.getText();
            if (maNV.equals(ShareHelper.user.getMaNV())) {
                MsgBoxHelper.alert(this, "B???n kh??ng c?? th??? v?? hi???u h??a ch??nh b???n !!");
            } else if (MsgBoxHelper.confirm(this, "B???n th???c s??? mu???n v?? hi???u h??a nh??n vi??n n??y ?")) {
                try {
                    dao.vohieuhoa(maNV);
                    fillTable(0);
                    btnPrePage.setEnabled(false);
                    btnNextPage.setEnabled(true);
                    clearForm();
                    tabs.setSelectedIndex(0);
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
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        DCNgaySinh.setDate(null);
        txtDiaChi.setText("");
        lblHinhAnh.setIcon(null);
        lblHinhAnh.setText("");
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String manv = (String) tblDanhSach.getValueAt(row, 0);
        NhanVien nv = dao.selectById(manv);
        setForm(nv);
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
        try {
            List<NhanVien> list = dao.selectPage(index);
            for (NhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getTenNV(), nv.getsDT(), nv.getEmail(), nv.getNgaySinh(),
                    nv.isGioiTinh() ? "Nam" : "N???", nv.isVaiTro() ? "Qu???n L??" : "Nh??n Vi??n"};
                mol.addRow(row);
            }
            lblChiSo.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "L???i truy v???n d??? li???u !");
        }
    }
    List<NhanVien> list = dao.selectAll();
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

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getTenNV());
        txtSDT.setText(nv.getsDT());
        txtEmail.setText(nv.getEmail());
        DCNgaySinh.setDate(DateHelper.toDate(nv.getNgaySinh(), "yyyy-MM-dd"));
        rdoNam.setSelected(nv.isGioiTinh());
        rdoNu.setSelected(!nv.isGioiTinh());
        rdoQuanLy.setSelected(nv.isVaiTro());
        rdoNhanVien.setSelected(!nv.isVaiTro());
        txtDiaChi.setText(nv.getDiaChi());
        if (nv.getAnhNV() != null) {
            lblHinhAnh.setToolTipText(nv.getAnhNV());
//            lblHinhAnh.setIcon(XImage.read(cd.getHinhAnh()));
            try {
                BufferedImage img;
                img = ImageIO.read(new File("C:\\Nhom3_Duan1\\src\\AnhNV", nv.getAnhNV()));
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

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setsDT(txtSDT.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(DateHelper.toString(DCNgaySinh.getDate(), "yyyy-MM-dd"));
        nv.setGioiTinh(rdoNam.isSelected());
        if (lblHinhAnh.getIcon() != null) {
            nv.setAnhNV(lblHinhAnh.getToolTipText());
        } else {
            nv.setAnhNV(null);
        }
        nv.setVaiTro(rdoQuanLy.isSelected());
        nv.setMauNen(ShareHelper.user.getMauNen());
        return nv;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //tr???ng th??i form
        txtMaNV.setEditable(!edit);
        txtEmail.setEditable(!edit);
        txtTenNV.setEditable(!edit);
        txtSDT.setEditable(!edit);
        DCNgaySinh.setEnabled(!edit);
        rdoNam.setEnabled(!edit);
        rdoNu.setEnabled(!edit);
        lblHinhAnh.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
        //tr???ng th??i ??i???u h?????ng
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void checkFormInsert() {
        NhanVien nv = dao.selectById(txtMaNV.getText());
        if (nv != null) {
            MsgBoxHelper.alert(this, "M?? nh??n vi??n ???? t???n t???i !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else if (txtMaNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng m?? nh??n vi??n !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng h??? t??n !!");
            txtTenNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtSDT.getText().matches("0[0-9]{9}")) {
            NhanVien nv1 = dao.selectBySDT(txtSDT.getText());
            if (nv1 != null) {
                MsgBoxHelper.alert(this, "S??? ??i???n tho???i n??y thu???c quy???n c???a nh??n vi??n kh??c !!");
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
        if (txtEmail.getText().matches("^([a-zA-Z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")) {
            NhanVien nv2 = dao.selectByEmail(txtEmail.getText());
            if (nv2 != null) {
                MsgBoxHelper.alert(this, "Email n??y thu???c quy???n c???a nh??n vi??n kh??c !!");
                txtEmail.requestFocus();
                check = 0;
                return;
            } else {
                check = 1;
            }
        } else {
            MsgBoxHelper.alert(this, "Email kh??ng ????ng ?????nh d???ng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        }

        if (DCNgaySinh.getDate()
                == null) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng ng??y sinh!!");
            check = 0;
            return;
        } else {
            check = 1;
        }
    }

    void checkFormUpdate() {
        NhanVien nv = dao.selectById(txtMaNV.getText());
        if (nv == null) {
            MsgBoxHelper.alert(this, "M?? nh??n vi??n kh??ng t???n t???i !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtMaNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng m?? nh??n vi??n !!");
            txtMaNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenNV.getText().equals("")) {
            MsgBoxHelper.alert(this, "Kh??ng ????? tr???ng h??? t??n !!");
            txtTenNV.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (!txtSDT.getText().matches("0[0-9]{9}")) {
            MsgBoxHelper.alert(this, "S??? ??i???n tho???i kh??ng ????ng ?????nh d???ng !!");
            txtSDT.requestFocus();
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
            XImage.save(file); //l??u h??nh v??o th?? m???c logo
            ImageIcon icon = XImage.read(file.getName()); //?????c h??nh t??? logo
            lblHinhAnh.setToolTipText(file.getName());
        }
    }
}
