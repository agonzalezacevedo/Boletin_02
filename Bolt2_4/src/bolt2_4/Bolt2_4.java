package bolt2_4;

import java.util.Scanner;

public class Bolt2_4 {

    public static void main(String[] args) {
        Scanner UwU = new Scanner(System.in);
    int cantidad_Total;
    int Billetes_100 , Billetes_20,Billetes_5,Monedas_1 ;
    System.out.println("Introducir la cantidad total= ");
    cantidad_Total=UwU.nextInt();
    
    Billetes_100= cantidad_Total/100;
    Billetes_20= cantidad_Total%100/20;
    Billetes_5= cantidad_Total%100%20/5;
    Monedas_1= cantidad_Total%100%20%5/1;
    
    System.out.println("Son "+Billetes_100+" billetes de 100: "+Billetes_20+" billetes de 20: "+Billetes_5+" billetes de 5: "+Monedas_1+ " :monedas de 1");
    }
    
}
