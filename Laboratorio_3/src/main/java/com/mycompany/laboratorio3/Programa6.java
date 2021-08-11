/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Carlos Donis 
 */
public class Programa6 {
    public static void main(String[] args)
    {
        double a,b,res;
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A: ");
        a=datos.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b=datos.nextInt();
        res=Math.pow(a,2)+ Math.pow(b,2) + (2*a*b);
        System.out.println("El resultado de la suma al cuadrado es: " + res);
        
        
    }
}
