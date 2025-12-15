package posa;

import javax.swing.*;
import java.awt.*;
import posa.obj.Produk;

public class AddProduk extends JDialog {

    // ==== Variabel GUI ====
    private JTextField jIDProduk;
    private JTextField jIDKategori;
    private JTextField jNmProduk;
    private JTextField jDeskripsi;
    private JTextField jHarga;
    private JTextField jStok;
    private JTextField jGambar;
    private JButton btnSimpan;
    private JButton btnBatal;

    public AddProduk(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {
        // Panel utama
        JPanel panel = new JPanel(new GridLayout(8, 2, 5, 5));

        panel.add(new JLabel("ID Produk:"));
        jIDProduk = new JTextField();
        panel.add(jIDProduk);

        panel.add(new JLabel("ID Kategori:"));
        jIDKategori = new JTextField();
        panel.add(jIDKategori);

        panel.add(new JLabel("Nama Produk:"));
        jNmProduk = new JTextField();
        panel.add(jNmProduk);

        panel.add(new JLabel("Deskripsi:"));
        jDeskripsi = new JTextField();
        panel.add(jDeskripsi);

        panel.add(new JLabel("Harga:"));
        jHarga = new JTextField();
        panel.add(jHarga);

        panel.add(new JLabel("Stok:"));
        jStok = new JTextField();
        panel.add(jStok);

        panel.add(new JLabel("Gambar:"));
        jGambar = new JTextField();
        panel.add(jGambar);

        btnSimpan = new JButton("Simpan");
        btnBatal = new JButton("Batal");

        panel.add(btnSimpan);
        panel.add(btnBatal);

        // Tambahkan panel ke dialog
        this.getContentPane().add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Tambah Produk");

        // Event tombol batal
        btnBatal.addActionListener(e -> this.dispose());
        // Event tombol simpan bisa ditambahkan sesuai kebutuhan
    }

    // Optional: method untuk mengambil input sebagai objek Produk
    public Produk getProdukFromForm() {
        Produk p = new Produk();
        p.setId_produk(Integer.parseInt(jIDProduk.getText()));
        p.setNama_produk(jNmProduk.getText());
        p.setKategori(jIDKategori.getText());
        p.setDeskripsi(jDeskripsi.getText());
        p.setHarga(Double.parseDouble(jHarga.getText()));
        p.setStok(Integer.parseInt(jStok.getText()));
        p.setGambar_produk(jGambar.getText());
        return p;
    }
}
                                       

    // (kode lain hasil NetBeans biarkan saja)
/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jIDProduk = new javax.swing.JTextField();
        jNmProduk = new javax.swing.JTextField();
        jIDKategori = new javax.swing.JTextField();
        jGambar = new javax.swing.JTextField();
        jHarga = new javax.swing.JTextField();
        jDeskripsi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jStok = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Produk");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("id_produk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("id_kategori");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("nama_produk");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("deskripsi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("harga");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("stok");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("gambar");

        jNmProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNmProdukActionPerformed(evt);
            }
        });

        jIDKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDKategoriActionPerformed(evt);
            }
        });

        jGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGambarActionPerformed(evt);
            }
        });

        jHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHargaActionPerformed(evt);
            }
        });

        jDeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeskripsiActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makaknan kucing.jpg"))); // NOI18N

        btnsimpan.setBackground(new java.awt.Color(51, 255, 51));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(255, 51, 51));
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnbatal)
                .addGap(18, 18, 18)
                .addComponent(btnsimpan)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jNmProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jIDProduk)
                                    .addComponent(jIDKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jStok, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(340, 340, 340))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jIDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jIDKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jNmProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnbatal))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jIDKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDKategoriActionPerformed

    private void jGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGambarActionPerformed

    private void jHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHargaActionPerformed

    private void jDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeskripsiActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
        // Asumsi id_supplier di-hardcode 1 (Ganti jika ada field supplier)
        int id_supplier_default = 1; 

        // 1️⃣ Koneksi ke database (Gunakan Koneksi.Go() jika ada)
        Connection con = posa.obj.Produk.Go(); 

        // 2️⃣ Query SQL: 9 Kolom. Kolom: (1) id_produk, (2) id_kategori, (3) id_supplier, (4) nama_produk, (5) deskripsi, (6) harga, (7) stok, (8) gambar, (9) status_produk
        String sql = "INSERT INTO produk (id_produk, id_kategori, id_supplier, nama_produk, deskripsi, harga, stok, gambar, status_produk) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);

        // 3️⃣ Set Parameter (Pastikan urutan dan tipe data sesuai SQL)
        pst.setInt(1, Integer.parseInt(jIDProduk.getText()));
        pst.setInt(2, Integer.parseInt(jIDKategori.getText()));
        pst.setInt(3, id_supplier_default); // id_supplier
        pst.setString(4, jNmProduk.getText());
        pst.setString(5, jDeskripsi.getText());
        pst.setDouble(6, Double.parseDouble(jHarga.getText()));
        pst.setInt(7, Integer.parseInt(jStok.getText()));
        pst.setString(8, jGambar.getText());
        pst.setString(9, "Aktif"); // status_produk

        // 4️⃣ Eksekusi
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "✅ Data produk berhasil disimpan!");

        // 🟢 Refresh tabel dan tutup
        posa.panels.ManageProduk managePanel = new posa.panels.ManageProduk();
        this.removeAll();
        this.setLayout(new java.awt.BorderLayout());
        this.add(managePanel, java.awt.BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "❌ Gagal: Pastikan ID Produk, ID Kategori, Stok, dan Harga diisi dengan angka. Detail: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "❌ Gagal menyimpan data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jNmProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNmProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNmProdukActionPerformed

    private void jStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStokActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jDeskripsi;
    private javax.swing.JTextField jGambar;
    private javax.swing.JTextField jHarga;
    private javax.swing.JTextField jIDKategori;
    private javax.swing.JTextField jIDProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNmProduk;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jStok;
    // End of variables declaration//GEN-END:variables
*/