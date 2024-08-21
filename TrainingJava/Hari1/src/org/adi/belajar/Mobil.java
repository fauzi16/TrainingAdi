package org.adi.belajar;

public class Mobil {
    
    public String name;
    private String jenisTransmisi;
    private String nomorMesin;
    
    public void menyalahkanEngine(){
        System.out.println("Mengaktifkan Switch");
        System.out.println("Menekan tombol start engine");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJenisTransmisi() {
        return jenisTransmisi;
    }
    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }
    public Integer getJumlahRoda() {
        return 4;
    }
    
    public String getNomorMesin() {
        return nomorMesin;
    }
    public void setNomorMesin(String nomorMesin) {
        this.nomorMesin = nomorMesin;
    }
    

    
}
