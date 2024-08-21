package org.adi.belajar;

public class Main {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.menyalahkanEngine();

        System.out.println();
        Truck truck = new Truck();
        truck.menyalahkanEngine();

        System.out.println();
        SportCar sportCar = new SportCar();
        sportCar.menyalahkanEngine();
    }

}
