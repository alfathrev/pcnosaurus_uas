package posa.obj;

import java.sql.Connection;

public class Produk {

    public static Connection Go() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id_produk;
    private int id_kategori;
    private int id_supplier;
    private String nama_produk;
    private String deskripsi;
    private double harga;
    private int stok;
    private String gambar;
    private String status_produk;

    public int getId_produk() { return id_produk; }
    public void setId_produk(int id_produk) { this.id_produk = id_produk; }

    public int getId_kategori() { return id_kategori; }
    public void setId_kategori(int id_kategori) { this.id_kategori = id_kategori; }

    public int getId_supplier() { return id_supplier; }
    public void setId_supplier(int id_supplier) { this.id_supplier = id_supplier; }

    public String getNama_produk() { return nama_produk; }
    public void setNama_produk(String nama_produk) { this.nama_produk = nama_produk; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public String getGambar() { return gambar; }
    public void setGambar(String gambar) { this.gambar = gambar; }

    public String getStatus_produk() { return status_produk; }
    public void setStatus_produk(String status_produk) { this.status_produk = status_produk; }

    public void setGambar_produk(String gambar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setKategori(String kategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
