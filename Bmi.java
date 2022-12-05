package bmi;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

         double height ,weight,bmi;
         
         Scanner i = new Scanner(System.in);

         System.out.print("Boyunuzu giriniz (metre) : ");

         height = i.nextDouble();

         System.out.print("Kilonuzu giriniz : ");

         weight = i.nextDouble();

         i.close();
         

          bmi = weight/(height * height);

         System.out.println("Vucut Kitle Indeksiniz : "+ bmi);
        
    }
    
}
      // boy kısımına metre olarak yazınız ayrıca küsüratların 
      // arasına virgül koyunuz
      // örnek : 1,83 şeklinde