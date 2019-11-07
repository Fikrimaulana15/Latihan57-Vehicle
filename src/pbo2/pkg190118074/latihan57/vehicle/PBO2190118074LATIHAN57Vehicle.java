/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg190118074.latihan57.vehicle;

/**
 *
 * @author ASUS
 * NAMA : FIKRI MAULANA AMIR
 * KELAS : IF-2
 * NIM : 10118074
 */
public class PBO2190118074LATIHAN57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumle Gear : " + bicycle.getMyGearCount());
        
        System.out.println("");
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : " + skate.getMyBrand());
        System.out.println("Model : " + skate.getMyModel());
        System.out.println("Panjang Board : " + skate.getMyBoardLength());
        
        System.out.println("developed by : fikri maulana");
    }
    
}
    

