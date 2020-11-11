/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
import java.util.Scanner;
public class If {
    public static void main(String[]args){
    Scanner teclado =new Scanner(System.in);
    
    int n;
    System.out.println("Introduzca entero por teclado: ");
    n=teclado.nextInt();
    
    if (n>=0){
        System.out.println("El número es positivo.");
    }
    else{
        System.out.println("El número es negativo.");
    }
    }
    
}
