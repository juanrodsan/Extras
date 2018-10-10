/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    float r=0, longitud=0, area=0, volumen=0;
    System.out.println("teclea radio");
    r=ler.nextFloat();
    volumen= (float)(4F/3*Math.PI*Math.pow(r, 3));
    area= (float) (Math.PI*Math.pow(r, 2));
    longitud= 2*r;
    System.out.println("Longitud = "+longitud+"\nÁrea = "+area+"\nVolumen = "+volumen);
    }
    
}
