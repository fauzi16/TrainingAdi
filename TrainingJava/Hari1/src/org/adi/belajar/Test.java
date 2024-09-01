package org.adi.belajar;

/**
 * Test
 */
public class Test {

    //1. [modifier] 2. [static] 3. [return type] 4. [nama metodenya] (5. [parameter]) {}
    // 1. modifier = private | public | protected | default ""
    // 2. static atau tidak static (static adalah method yang dimiliki oleh class, sedangkan tidak static "" berarti dimiliki oleh instance => pelajari dulu konsep yang namanya instantiation)
    // 3. return type => tipe data apa yang dikembalikan oleh metode yang akan dibuat. (tipe data | void)
    // 5. parameter => data yang dilempar dari luar ke dalam metode untuk kemudian diolah
    
    public static void main(String[] args) {
        Test adi = new Test();
        System.out.println(adi.menerimaAjakanDating(145, true));
    }

    public String menerimaAjakanDating(Integer tinggiBadan, boolean cindoBukan){
        if(tinggiBadan > 160 && tinggiBadan < 175) {
            return "Yuks";
        }

        if(cindoBukan) {
            return "Yuks";
        }

        return "Maaf anda bukan tipe saya";
    }

    public void main2() {
        
    }

    public Integer main3() {
        return 1;
    }

    public String main4() {
        return "1";
    }

    public Truck main5() {
        return new Truck();
    }

    
}