/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Ndunh
 */
public class segitigaaksi {
    public static void main(String[] args) {
        segitiga S1 = new segitiga();
        S1.sisi1 = 10;
        S1.sisi2 = 10;
        S1.sisi3 = 10;
        
        S1.cetakinfo();
        System.out.println("keliling segitiga ="+S1.hitungkeliling());
        S1.cetakkeliling();
        
        segitiga S2 = new segitiga();
        S2.cetakinfo();
        
        segitiga S3 = new segitiga(5,5,5);
        S3.cetakinfo();
    }
  
}
