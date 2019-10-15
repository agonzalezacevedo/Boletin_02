package bolt2_5;

import java.util.Scanner;

public class Bolt2_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double soldoBruto, soldoLiquido , soldoFixo, km, dietas, ventas;
        System.out.println("Canto e o soldo fixo? ");
        soldoFixo = sc.nextDouble();
        System.out.println("Cantos quilometros son? ");
        km = sc.nextDouble();
        System.out.println("Cantos dias de desprazamento? ");
        dietas = sc.nextDouble();
        System.out.println("Canto e o importe total das ventas? ");
        ventas = sc.nextDouble();
        
        soldoBruto= soldoFixo + (ventas*5/100) + (dietas*30) + (km*2);
        soldoLiquido= soldoBruto - (soldoBruto*18/100) - 36;
        
        System.out.println("A cantidade de soldo bruto é "+soldoBruto+" € é o soldo liquido " +soldoLiquido+ "euros");
    }
    
}
