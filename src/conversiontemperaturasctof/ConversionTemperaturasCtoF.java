/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperaturasctof;

import java.util.Scanner;

/**
 *
 * @author DAM116
 */
public class ConversionTemperaturasCtoF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int C,K;
        boolean exit=false;
        char cont;
        do{
        System.out.println("Inserte una temperatura en Cº para convertirla a Fº");
        C=teclado.nextInt();
        K=C+273;
        System.out.println(C+"ºC es equivalente a "+K+"º Kelvin");
        System.out.println("Desea convertir otra temperatura?");
        cont=teclado.next().charAt(0);
        cont=Character.toLowerCase(cont);
            if (cont!='s'&&cont!='y') {
                exit=true;}
        }while(exit==false);
    }
    
}
