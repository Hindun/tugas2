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
public class segitiga {
 int sisi1;
 int sisi2;
 int sisi3;

    public segitiga() {
        sisi1=5;
        sisi2=5;
        sisi3=5;
        
    }
 void cetakinfo (){
     System.out.println("sisi1 : "+sisi1);
     System.out.println("sisi2 : "+sisi2);
     System.out.println("sisi3 : "+sisi3);
     
 }
 
 int hitungkeliling(){
    int keliling;
    keliling=sisi1+sisi2+sisi3;
    return keliling;
 }
 
 void cetakkeliling(){
     System.out.println("kelilingnya adalah: "+hitungkeliling());
 }
}
