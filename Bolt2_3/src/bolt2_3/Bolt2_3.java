package bolt2_3;

import java.util.Scanner;

public class Bolt2_3 {

    public static void main(String[] args) {
      Scanner contar = new Scanner(System.in);
      System.out.println("Cantos billetes de 100€?");
      int Billetes_100 = contar.nextInt();
      System.out.println("Cantos billetes de 20€?");
      int Billetes_20 = contar.nextInt();
      System.out.println("Cantos billetes de 5€?");
      int Billetes_5 = contar.nextInt();
      System.out.println("Cantas monedas de 1€?");
      int Monedas_1 = contar.nextInt();
        
      int euros100, euros20, euros5;
        euros100=Billetes_100*100;
        euros20=Billetes_20*20;
        euros5= Billetes_5*5;
        
      int cantidad_total= euros100+euros20+euros5+Monedas_1;
        
      System.out.println("O numero de euros que teño son= "+cantidad_total);
        
        
        
        
        
    }
    
}
