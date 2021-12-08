/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import controllers.IOFile;
import controllers.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.Object1;
import models.Object2;
import models.Object3;
/**
 *
 * @author nguyen
 */
public class Main extends javax.swing.JFrame {
    String file1, file2, file3;
    DefaultTableModel tm1, tm2, tm3;    
    List<Object1> list1;
    List<Object2> list2;
    List<Object3> list3;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        initObject1();
        initObject2();
        initObject3();

    }
    
    private void initObject1() {
        // set filename
        file1 = "src/controllers/file1.dat";
        

        // create table model
        String[] titles = { "ma", "ten" }; // TODO: add more columns
        tm1 = new DefaultTableModel(titles, 0);
        jTable1.setModel(tm1);

        // load and show data
        list1 = loadData(file1);
        showObject1(list1);
        
        // jtable row click listener
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = jTable1.getSelectedRow();
                if (row >= 0) {
                    tfMa1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    tfTen1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    //TODO: add more columns
                }
            }
        });  

        // make combobox search field
        for (String title : titles) {
            cbSortField1.addItem(title);
        }
    }

    private void showObject1(List<Object1> list) {
        tm1.setRowCount(0);
        for (Object1 i : list) {
            tm1.addRow(i.toObject());
        }
    }
    
    private void initObject2() {
        // set filename
        file2 = "src/controllers/file2.dat";        

        // create table model
        String[] titles = { "ma", "ten" };
        tm2 = new DefaultTableModel(titles, 0);
        jTable2.setModel(tm2);

        // load and show data
        list2 = loadData(file2);
        showObject2(list2);
        
        // jtable row click listener
        jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = jTable2.getSelectedRow();
                if (row >= 0) {
                    tfMa2.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
                    tfTen2.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
                }
            }
        });  

        // make combobox search field
        for (String title : titles) {
            cbSortField2.addItem(title);
        }
    }

    private void showObject2(List<Object2> list) {
        tm2.setRowCount(0);
        for (Object2 i : list) {
            tm2.addRow(i.toObject());
        }
    }
    
    
    
    private void initObject3() {
        // set filename
        file3 = "src/controllers/file3.dat";
        

        // create table model
        String[] titles = { "ma", "ten" };
        tm3 = new DefaultTableModel(titles, 0);
        jTable3.setModel(tm3);

        // load and show data
        list3 = loadData(file3);
        showObject3(list3);
        
        // jtable row click listener
        jTable3.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = jTable3.getSelectedRow();
                if (row >= 0) {
                    tfMa3.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
                    tfTen3.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString());
                }
            }
        });  

        // make combobox search field
        for (String title : titles) {
            cbSortField3.addItem(title);
        }
    }

    private void showObject3(List<Object3> list) {
        tm3.setRowCount(0);
        for (Object3 i : list) {
            tm3.addRow(i.toObject());
        }
    }
    
    private <T> List<T> loadData(String filename) {
        File f = new File(filename);
        if (f.exists()) {
            return IOFile.doc(filename);
        } else {
            return new ArrayList<T>();
        }
    }

    private void removeRow(javax.swing.JTable table, DefaultTableModel tm, List list) {
        int r = table.getSelectedRow();
        System.out.println(r);
        if (r >= 0 && r < tm.getRowCount()) {
            tm.removeRow(r);
            list.remove(r);
        } else {
            JOptionPane.showMessageDialog(this, "Chon hang bi xoa");
            return;
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewPanel1 = new javax.swing.JPanel();
        lbMa1 = new javax.swing.JLabel();
        tfMa1 = new javax.swing.JTextField();
        lbTab1 = new javax.swing.JLabel();
        lbTen1 = new javax.swing.JLabel();
        tfTen1 = new javax.swing.JTextField();
        controllPanel1 = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnRemove1 = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        tfSearch1 = new javax.swing.JTextField();
        lbSeach1 = new javax.swing.JLabel();
        lbSort1 = new javax.swing.JLabel();
        cbSortField1 = new javax.swing.JComboBox<>();
        cbSortType1 = new javax.swing.JComboBox<>();
        btnSort1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        viewPanel2 = new javax.swing.JPanel();
        lbMa2 = new javax.swing.JLabel();
        tfMa2 = new javax.swing.JTextField();
        lbTab2 = new javax.swing.JLabel();
        lbTen2 = new javax.swing.JLabel();
        tfTen2 = new javax.swing.JTextField();
        controllPanel2 = new javax.swing.JPanel();
        btnAdd2 = new javax.swing.JButton();
        btnRemove2 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        btnSave2 = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        tfSearch2 = new javax.swing.JTextField();
        lbSeach2 = new javax.swing.JLabel();
        lbSort2 = new javax.swing.JLabel();
        cbSortField2 = new javax.swing.JComboBox<>();
        cbSortType2 = new javax.swing.JComboBox<>();
        btnSort2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        viewPanel3 = new javax.swing.JPanel();
        lbMa3 = new javax.swing.JLabel();
        tfMa3 = new javax.swing.JTextField();
        lbTab3 = new javax.swing.JLabel();
        lbTen3 = new javax.swing.JLabel();
        tfTen3 = new javax.swing.JTextField();
        controllPanel3 = new javax.swing.JPanel();
        btnAdd3 = new javax.swing.JButton();
        btnRemove3 = new javax.swing.JButton();
        btnEdit3 = new javax.swing.JButton();
        btnSave3 = new javax.swing.JButton();
        btnSearch3 = new javax.swing.JButton();
        tfSearch3 = new javax.swing.JTextField();
        lbSeach3 = new javax.swing.JLabel();
        lbSort3 = new javax.swing.JLabel();
        cbSortField3 = new javax.swing.JComboBox<>();
        cbSortType3 = new javax.swing.JComboBox<>();
        btnSort3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbMa1.setText("Mã");

        lbTab1.setText("Object1");

        lbTen1.setText("Tên");

        javax.swing.GroupLayout viewPanel1Layout = new javax.swing.GroupLayout(viewPanel1);
        viewPanel1.setLayout(viewPanel1Layout);
        viewPanel1Layout.setHorizontalGroup(
            viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel1Layout.createSequentialGroup()
                .addGroup(viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lbTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMa1)
                            .addComponent(lbTen1))
                        .addGap(40, 40, 40)
                        .addGroup(viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMa1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        viewPanel1Layout.setVerticalGroup(
            viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTab1)
                .addGap(31, 31, 31)
                .addGroup(viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa1)
                    .addComponent(tfMa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(viewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen1)
                    .addComponent(tfTen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnRemove1.setText("Xóa");
        btnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove1ActionPerformed(evt);
            }
        });

        btnEdit1.setText("Sửa");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnSave1.setText("Lưu");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnSearch1.setText("Tìm kiếm");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        lbSeach1.setText("Tìm Kiếm");

        lbSort1.setText("Sắp Xếp");

        cbSortType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));

        btnSort1.setText("Sắp xếp");
        btnSort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controllPanel1Layout = new javax.swing.GroupLayout(controllPanel1);
        controllPanel1.setLayout(controllPanel1Layout);
        controllPanel1Layout.setHorizontalGroup(
            controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSeach1)
                    .addComponent(lbSort1))
                .addGap(27, 27, 27)
                .addGroup(controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controllPanel1Layout.createSequentialGroup()
                        .addComponent(tfSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch1))
                    .addGroup(controllPanel1Layout.createSequentialGroup()
                        .addComponent(cbSortField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSortType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSort1)))
                .addContainerGap())
        );
        controllPanel1Layout.setVerticalGroup(
            controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1)
                    .addComponent(btnRemove1)
                    .addComponent(btnEdit1)
                    .addComponent(btnSave1)
                    .addComponent(btnSearch1)
                    .addComponent(tfSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeach1))
                .addGap(18, 18, 18)
                .addGroup(controllPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSort1)
                    .addComponent(cbSortField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort1))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controllPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controllPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Object1", jPanel1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 400));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        lbMa2.setText("Mã");

        lbTab2.setText("Object2");

        lbTen2.setText("Tên");

        javax.swing.GroupLayout viewPanel2Layout = new javax.swing.GroupLayout(viewPanel2);
        viewPanel2.setLayout(viewPanel2Layout);
        viewPanel2Layout.setHorizontalGroup(
            viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel2Layout.createSequentialGroup()
                .addGroup(viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lbTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMa2)
                            .addComponent(lbTen2))
                        .addGap(40, 40, 40)
                        .addGroup(viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMa2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        viewPanel2Layout.setVerticalGroup(
            viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTab2)
                .addGap(31, 31, 31)
                .addGroup(viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa2)
                    .addComponent(tfMa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(viewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen2)
                    .addComponent(tfTen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd2.setText("Thêm");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnRemove2.setText("Xóa");
        btnRemove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove2ActionPerformed(evt);
            }
        });

        btnEdit2.setText("Sửa");
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
            }
        });

        btnSave2.setText("Lưu");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        btnSearch2.setText("Tìm kiếm");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        lbSeach2.setText("Tìm Kiếm");

        lbSort2.setText("Sắp Xếp");

        cbSortType2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));

        btnSort2.setText("Sắp xếp");
        btnSort2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controllPanel2Layout = new javax.swing.GroupLayout(controllPanel2);
        controllPanel2.setLayout(controllPanel2Layout);
        controllPanel2Layout.setHorizontalGroup(
            controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanel2Layout.createSequentialGroup()
                .addComponent(btnAdd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSeach2)
                    .addComponent(lbSort2))
                .addGap(27, 27, 27)
                .addGroup(controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controllPanel2Layout.createSequentialGroup()
                        .addComponent(tfSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch2))
                    .addGroup(controllPanel2Layout.createSequentialGroup()
                        .addComponent(cbSortField2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSortType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSort2)))
                .addContainerGap())
        );
        controllPanel2Layout.setVerticalGroup(
            controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd2)
                    .addComponent(btnRemove2)
                    .addComponent(btnEdit2)
                    .addComponent(btnSave2)
                    .addComponent(btnSearch2)
                    .addComponent(tfSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeach2))
                .addGap(18, 18, 18)
                .addGroup(controllPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSort2)
                    .addComponent(cbSortField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort2))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controllPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controllPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Object2", jPanel2);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(600, 400));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        lbMa3.setText("Mã");

        lbTab3.setText("Object3");

        lbTen3.setText("Tên");

        javax.swing.GroupLayout viewPanel3Layout = new javax.swing.GroupLayout(viewPanel3);
        viewPanel3.setLayout(viewPanel3Layout);
        viewPanel3Layout.setHorizontalGroup(
            viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel3Layout.createSequentialGroup()
                .addGroup(viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPanel3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lbTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMa3)
                            .addComponent(lbTen3))
                        .addGap(40, 40, 40)
                        .addGroup(viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTen3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMa3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        viewPanel3Layout.setVerticalGroup(
            viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTab3)
                .addGap(31, 31, 31)
                .addGroup(viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa3)
                    .addComponent(tfMa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(viewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen3)
                    .addComponent(tfTen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd3.setText("Thêm");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        btnRemove3.setText("Xóa");
        btnRemove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove3ActionPerformed(evt);
            }
        });

        btnEdit3.setText("Sửa");
        btnEdit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit3ActionPerformed(evt);
            }
        });

        btnSave3.setText("Lưu");
        btnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave3ActionPerformed(evt);
            }
        });

        btnSearch3.setText("Tìm kiếm");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        lbSeach3.setText("Tìm Kiếm");

        lbSort3.setText("Sắp Xếp");

        cbSortType3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));

        btnSort3.setText("Sắp xếp");
        btnSort3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controllPanel3Layout = new javax.swing.GroupLayout(controllPanel3);
        controllPanel3.setLayout(controllPanel3Layout);
        controllPanel3Layout.setHorizontalGroup(
            controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllPanel3Layout.createSequentialGroup()
                .addComponent(btnAdd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSeach3)
                    .addComponent(lbSort3))
                .addGap(27, 27, 27)
                .addGroup(controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controllPanel3Layout.createSequentialGroup()
                        .addComponent(tfSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch3))
                    .addGroup(controllPanel3Layout.createSequentialGroup()
                        .addComponent(cbSortField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSortType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSort3)))
                .addContainerGap())
        );
        controllPanel3Layout.setVerticalGroup(
            controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd3)
                    .addComponent(btnRemove3)
                    .addComponent(btnEdit3)
                    .addComponent(btnSave3)
                    .addComponent(btnSearch3)
                    .addComponent(tfSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeach3))
                .addGap(18, 18, 18)
                .addGroup(controllPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSort3)
                    .addComponent(cbSortField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort3))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controllPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controllPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Object3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        int n = list1.size();
        if (n > 0) {
            Object1.setSma(list1.get(n - 1).getMa() + 1);
        }
        tfMa1.setText(Object1.getSma() + "");
        String ten, nhom;
        double cp, cuoc;
        try {
            ten = tfTen1.getText();
            //TODO: get more text field
            
            Object1 o = new Object1(ten);
            tm1.addRow(o.toObject());
            list1.add(o);
        } catch (TrongException e) {
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            return;
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove1ActionPerformed
        // TODO add your handling code here:
        removeRow(jTable1, tm1, list1);
    }//GEN-LAST:event_btnRemove1ActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        if (r >= 0 && r < jTable1.getRowCount()) {
            tm1.setValueAt(tfTen1.getText(), r, 1);
            // edit list item
            list1.get(r).setTen(tfTen1.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
            return;
        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(file1, list1);
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        String key = tfSearch1.getText().toLowerCase();
        List<Object1> l = new ArrayList<>();
        for (Object1 i : list1) {
            if (i.getTen().toLowerCase().contains(key)) {
                l.add(i);
            }
        }
        showObject1(l);

    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnSort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSort1ActionPerformed
        // TODO add your handling code here:
         int type = cbSortType1.getSelectedIndex();

        // type == 0 asc
        Collections.sort(list1, new Comparator<Object1>() {
            @Override
            public int compare(Object1 o1, Object1 o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        // type == 1 desc
        if (type == 1) {
            Collections.reverse(list1);
        }
        showObject1(list1);

    }//GEN-LAST:event_btnSort1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
        int n = list2.size();
        if (n > 0) {
            Object2.setSma(list2.get(n - 1).getMa() + 1);
        }
        tfMa2.setText(Object2.getSma() + "");
        String ten, nhom;
        double cp, cuoc;
        try {
            ten = tfTen2.getText();
            Object2 dv = new Object2(ten);
            tm2.addRow(dv.toObject());
            list2.add(dv);
        } catch (TrongException e) {
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            return;
        }
        
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnRemove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove2ActionPerformed
        // TODO add your handling code here:
        
        removeRow(jTable2, tm2, list2);
    }//GEN-LAST:event_btnRemove2ActionPerformed

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
        // TODO add your handling code here:
        
        int r = jTable2.getSelectedRow();
        if (r >= 0 && r < jTable2.getRowCount()) {
            tm2.setValueAt(tfTen2.getText(), r, 1);
            // edit list item
            list2.get(r).setTen(tfTen2.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
            return;
        }
        
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(file2, list2);
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        String key = tfSearch2.getText().toLowerCase();
        List<Object2> l = new ArrayList<>();
        for (Object2 i : list2) {
            if (i.getTen().toLowerCase().contains(key)) {
                l.add(i);
            }
        }
        showObject2(l);        
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnSort2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSort2ActionPerformed
        // TODO add your handling code here:
        int type = cbSortType2.getSelectedIndex();

        // type == 0 asc
        Collections.sort(list2, new Comparator<Object2>() {
            @Override
            public int compare(Object2 o1, Object2 o2) {
                return o2.getTen().compareTo(o2.getTen());
            }
        });

        // type == 1 desc
        if (type == 1) {
            Collections.reverse(list2);
        }
        showObject2(list2);
    }//GEN-LAST:event_btnSort2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
        int n = list3.size();
        if (n > 0) {
            Object3.setSma(list3.get(n - 1).getMa() + 1);
        }
        tfMa3.setText(Object1.getSma() + "");
        String ten;

        try {
            ten = tfTen3.getText();
            Object3 dv = new Object3(ten);
            tm3.addRow(dv.toObject());
            list3.add(dv);
        } catch (TrongException e) {
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            return;
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnRemove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove3ActionPerformed
        // TODO add your handling code here:
        removeRow(jTable3, tm3, list3);
    }//GEN-LAST:event_btnRemove3ActionPerformed

    private void btnEdit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit3ActionPerformed
        // TODO add your handling code here:
        int r = jTable3.getSelectedRow();
        if (r >= 0 && r < jTable3.getRowCount()) {
            tm3.setValueAt(tfTen3.getText(), r, 1);
            // edit list item
            list3.get(r).setTen(tfTen3.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
            return;
        }
    }//GEN-LAST:event_btnEdit3ActionPerformed

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(file3, list3);
    }//GEN-LAST:event_btnSave3ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        // TODO add your handling code here:
        String key = tfSearch3.getText().toLowerCase();
        List<Object3> l = new ArrayList<>();
        for (Object3 i : list3) {
            if (i.getTen().toLowerCase().contains(key)) {
                l.add(i);
            }
        }
        showObject3(l);
        
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void btnSort3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSort3ActionPerformed
        // TODO add your handling code here:
        int type = cbSortType3.getSelectedIndex();

        // type == 0 asc
        Collections.sort(list3, new Comparator<Object3>() {
            @Override
            public int compare(Object3 o1, Object3 o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        // type == 1 desc
        if (type == 1) {
            Collections.reverse(list3);
        }
        showObject3(list3);
    }//GEN-LAST:event_btnSort3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnEdit2;
    private javax.swing.JButton btnEdit3;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JButton btnRemove2;
    private javax.swing.JButton btnRemove3;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnSave3;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnSort1;
    private javax.swing.JButton btnSort2;
    private javax.swing.JButton btnSort3;
    private javax.swing.JComboBox<String> cbSortField1;
    private javax.swing.JComboBox<String> cbSortField2;
    private javax.swing.JComboBox<String> cbSortField3;
    private javax.swing.JComboBox<String> cbSortType1;
    private javax.swing.JComboBox<String> cbSortType2;
    private javax.swing.JComboBox<String> cbSortType3;
    private javax.swing.JPanel controllPanel1;
    private javax.swing.JPanel controllPanel2;
    private javax.swing.JPanel controllPanel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lbMa1;
    private javax.swing.JLabel lbMa2;
    private javax.swing.JLabel lbMa3;
    private javax.swing.JLabel lbSeach1;
    private javax.swing.JLabel lbSeach2;
    private javax.swing.JLabel lbSeach3;
    private javax.swing.JLabel lbSort1;
    private javax.swing.JLabel lbSort2;
    private javax.swing.JLabel lbSort3;
    private javax.swing.JLabel lbTab1;
    private javax.swing.JLabel lbTab2;
    private javax.swing.JLabel lbTab3;
    private javax.swing.JLabel lbTen1;
    private javax.swing.JLabel lbTen2;
    private javax.swing.JLabel lbTen3;
    private javax.swing.JTextField tfMa1;
    private javax.swing.JTextField tfMa2;
    private javax.swing.JTextField tfMa3;
    private javax.swing.JTextField tfSearch1;
    private javax.swing.JTextField tfSearch2;
    private javax.swing.JTextField tfSearch3;
    private javax.swing.JTextField tfTen1;
    private javax.swing.JTextField tfTen2;
    private javax.swing.JTextField tfTen3;
    private javax.swing.JPanel viewPanel1;
    private javax.swing.JPanel viewPanel2;
    private javax.swing.JPanel viewPanel3;
    // End of variables declaration//GEN-END:variables
}
