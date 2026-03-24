/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema4sentenciaslogicas;
import java.util.Scanner;//Librería importante que sirve para utilizar el teclado

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
        
        //sentencia if-else-if
        if(x>y){
            System.out.println("X es mayor que Y");
        }
        else if(y>x){
            System.out.println("Y es mayor que X");
        }
        else{
            System.out.println("X, Y tiene el mismo valor");
        }
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
        //Otro ejemplo
        System.out.println("Ingresa un número para saber si es positvo, negativo");
        int numero=sc.nextInt();
        if(numero>0){
            System.out.println("El número "+numero+" es postivio");
        }
        else if(numero<0){
            System.out.println("El número"+numero+" es negativo");
        }else{
            System.out.println("El número es el cero");
        }
        //if-else-if utilizando Strings
        String curso="Matematicas";
        if(curso.equals("Biología")){
            System.out.println("El registro es al curso de Biología");
        }
        else if(curso.equals("Álgebra")){
            System.out.println("El registro es al curso de Álgebra");
        }
        else if(curso.equals("Teatro")){
            System.out.println("El registro es al curso de Teatro");
        }else{
            System.out.println("Curso no encontrado.");
        }
        
        System.out.println("Código creado por Héctor David Galicia Romero");
    }
}
