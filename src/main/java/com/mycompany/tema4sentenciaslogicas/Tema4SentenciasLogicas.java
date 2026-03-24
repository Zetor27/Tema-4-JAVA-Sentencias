/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema4sentenciaslogicas;
import java.util.Scanner;

/**
 *
 * @author Hecto
 */
public class Tema4SentenciasLogicas {

    public static void main(String[] args) {
        if(true){
            System.out.println("Esta linea se ejecuto exitosamente");
        }
        //declaración y asignación de variables X,Y
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor de X:");
        int x=sc.nextInt();
        System.out.println("Ingresa el valor de Y:");
        int y=sc.nextInt();
        
        if(x>y){
            System.out.println("X es mayor que Y");
        }else{
            System.out.println("Y es mayor que X");
        }
        
        //Otro ejemplo
        
        int numero=0;
        if(numero>0){
            System.out.println("El número "+numero+" es postivio");
        }
        else{
            System.out.println("El número"+numero+" es negativo");
        }
        
        
        
    }
}
