package posa.panels;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import posa.AddProduk;
import posa.DeleteProduk;
import posa.EditProduk;
import posa.obj.Koneksi;
import posa.obj.Produk;

public class ManageProduk extends javax.swing.JPanel {

    private Produk Px;

    public ManageProduk() {
        initComponents();
        RefreshData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(932, 90));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Tambah Data");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Hapus Data");
        jButton2.setEnabled(false);
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Edit Data");
        jButton3.setEnabled(false);
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x32/search-icon-32.png"))); 
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 15, 290, 40));

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jButton1, BorderLayout.WEST);
        jPanel1.add(jButton2, BorderLayout.CENTER);
        jPanel1.add(jButton3, BorderLayout.EAST);
        jPanel1.add(jPanel2, BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID_PRODUK", "NAMA_PRODUK", "KATEGORI", "STOK", "HARGA", "GAMBAR_PRODUK", "ID_SUPPLIER"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }

    // Tombol Tambah Data
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        AddProduk ap = new AddProduk(
            (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this), true
        );
        ap.setVisible(true);
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int n = jTable1.getSelectedRow();
        if (n != -1) {
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);

            Px = new Produk();
            Px.setId_produk(Integer.parseInt(jTable1.getValueAt(n, 0).toString()));
            Px.setNama_produk(jTable1.getValueAt(n, 1).toString());
            Px.setKategori(jTable1.getValueAt(n, 2).toString());
            Px.setStok(Integer.parseInt(jTable1.getValueAt(n, 3).toString()));
            Px.setHarga(Double.parseDouble(jTable1.getValueAt(n, 4).toString()));
            Px.setGambar_produk(jTable1.getValueAt(n, 5).toString());
            Px.setId_supplier(Integer.parseInt(jTable1.getValueAt(n, 6).toString()));
        }
    }                                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        EditProduk ep = new EditProduk(
            (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this), true
        );
        ep.setProduk(Px);
        ep.setVisible(true);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DeleteProduk dp = new DeleteProduk(
            (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this), true
        );
        dp.setProduk(Px);
        dp.setVisible(true);
    }                                        

    // ========== Refresh Data ==========
    public static void RefreshData() {
        try {
            jTable1.setRowHeight(30);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM produk");

            while (R.next()) {
                model.addRow(new Object[]{
                    R.getInt("id_produk"),
                    R.getString("nama_produk"),
                    R.getInt("id_kategori"),
                    R.getInt("stok"),
                    R.getDouble("harga"),
                    R.getString("gambar"),
                    R.getInt("id_supplier")
                });
            }

            R.close();
            S.close();
            K.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}

/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(932, 90));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Tambah Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Hapus Data");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Edit Data");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x32/search-icon-32.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 15, 290, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(79, 79, 79))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRODUK", "NAMA_PRODUK", "KATEGORI", "STOK", "HARGA", "GAMBAR_PRODUK", "ID_SUPPLIER"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AddProduk panelAdd = new AddProduk();
    this.removeAll();
    this.setLayout(new BorderLayout());
    this.add(panelAdd, BorderLayout.CENTER);
    this.revalidate();
    this.repaint();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int n = jTable1.getSelectedRow();
        if(n != -1){
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);

            Px = new Produk();
            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
            String nama = jTable1.getValueAt(n, 1).toString();
            String kategori = jTable1.getValueAt(n, 2).toString();
            int stok = Integer.parseInt(jTable1.getValueAt(n, 3).toString());
            double harga = Double.parseDouble(jTable1.getValueAt(n, 4).toString());
            String gambar = jTable1.getValueAt(n, 5).toString();
            int id_supplier = Integer.parseInt(jTable1.getValueAt(n, 6).toString());

            Px.setId_produk(id);
            Px.setNama_produk(nama);
            Px.setKategori(kategori);
            Px.setStok(stok);
            Px.setHarga(harga);
            Px.setGambar_produk(gambar);
            Px.setId_supplier(id_supplier);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddProduk ap = new AddProduk((java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this), true);
        ap.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DeleteProduk dm = new DeleteProduk(null,true);
       dm. P = Px;
       dm.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public static void RefreshData(){
        try {
            jTable1.setRowHeight(30);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM produk");

            while (R.next()) {
                model.addRow(new Object[]{
                        R.getInt("id_produk"),
                        R.getInt("id_kategori"),
                        R.getInt("id_supplier"),
                        R.getString("nama_produk"),
                        R.getString("deskripsi"),
                        R.getDouble("harga"),
                        R.getInt("stok"),
                        R.getString("gambar"),
                        
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/