package posa.obj;

public class Pegawai {
    private int id_pegawai;
    private String nama;
    private String username;
    private String jabatan;
    private String password_khusus; // kita pakai ini untuk mapping password_khusus

    public int getId(){ return id_pegawai; }
    public void setId(int id){ this.id_pegawai = id; }

    public String getNama(){ return nama; }
    public void setNama(String nama){ this.nama = nama; }

    public String getUsername(){ return username; }
    public void setUsername(String username){ this.username = username; }

    public String getJabatan(){ return jabatan; }
    public void setJabatan(String jabatan){ this.jabatan = jabatan; }

    public String getPassword(){ return password_khusus; }
    public void setPassword(String password){ this.password_khusus = password; }
}
