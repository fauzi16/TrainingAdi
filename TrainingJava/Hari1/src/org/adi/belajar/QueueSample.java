package org.adi.belajar;

import java.util.ArrayList;
import java.util.List;

public class QueueSample {

    private static List<String> antrian = new ArrayList<String>();


    public static void main(String[] args) {
        masukAntrian("Adi");
        masukAntrian("Ojan");
        masukAntrian("Toni");
        masukAntrian("Rizal");

        // seharusnya nilai yang dihasilkan adalah 3
        System.out.println(periksaJumlahAntrian());

        // nomor urut ojan
        System.out.println("Nomor urut Rizal = " + periksaNomorAntrian("Toni"));
        
        String nama = ambilAntrianBerdasarkanNomorUrut(1);
        System.out.println(nama);
        // process nama yang keluar dalam antrian
        keluarAntrian(nama);

        nama = ambilAntrianBerdasarkanNomorUrut(1);
        System.out.println(nama);
    }

    public static void masukAntrian(String nama){
        antrian.add(nama);
    }

    // mengembalikan nomor urut nama dalam antrian
    public static int periksaNomorAntrian(String nama){
        return antrian.indexOf(nama) + 1;
    }

    public static String ambilAntrianBerdasarkanNomorUrut(int nomorUrut){
        return antrian.get(nomorUrut - 1);
    }

    // mengembalikan berapa banyak nama di dalam antrian
    public static int periksaJumlahAntrian(){
        return antrian.size();
    }

    public static void keluarAntrian(String nama){
        antrian.remove(nama);
    }

    
}
