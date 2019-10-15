package bolt2_2;

import java.util.Scanner;

public class Bolt2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos grados celsius son?");
        float celsius = sc.nextFloat();
        float farhenheit = (celsius*1.8f)+32;
        float kelvin = celsius + 273.15f;
        System.out.println("El valor de Cº en farhenheit es= "+farhenheit+"ºF"+"\nY en Kelvin= " + kelvin+"K");
    }
    
}
