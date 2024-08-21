package org.adi.belajar;

public class Truck extends Mobil {
    
    private Integer containerCapacity;

    public Integer getContainerCapacity() {
        return containerCapacity;
    }

    public void setContainerCapacity(Integer containerCapacity) {
        this.containerCapacity = containerCapacity;
    }

    @Override
    public Integer getJumlahRoda() {
        return 8;
    }

    @Override
    public void menyalahkanEngine() {
        super.menyalahkanEngine();
        System.out.println("Mengaktifkan rem tangan");
    }

    
}
