package org.adi.belajar;

public class SportCar extends Mobil {

    @Override
    public Integer getJumlahRoda() {
        return 3;
    }

    @Override
    public void menyalahkanEngine() {
        System.out.println("Menekan tombol start");
    }

}
