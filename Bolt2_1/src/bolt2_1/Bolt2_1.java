package bolt2_1;

import java.util.Scanner;

public class Bolt2_1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Canto e o porcentaxe da tarifa?");
       float tarifa = sc.nextFloat();
       System.out.println("Canto e o prezo do producto?");
       float precio = sc.nextFloat();
       float descuento = (100-(precio*100)/tarifa);
       System.out.println("O desconto da tarifa no prezo es=" + descuento +"%");
    }
    
}
