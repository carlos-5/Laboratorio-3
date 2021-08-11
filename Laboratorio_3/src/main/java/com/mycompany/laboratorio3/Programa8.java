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
public class Programa8 {
    public static void main(String[] args)
    {
      double A,B,C;
      double D,R,RDOS,GT;
      Scanner dato = new Scanner(System.in);
      
      System.out.println("Ingrese el valor de a: ");
      A=dato.nextDouble();
      System.out.println("Ingrese el valor de b: ");
      B=dato.nextDouble();
      System.out.println("Ingrese el valor de c: ");
      C=dato.nextDouble();
      
      D=((Math.pow(B,2))-((4*A*C)));
      R=((-B+Math.sqrt(Math.pow(B, 2)-((4*A*C)))));
      RDOS=((-B-(Math.sqrt(Math.pow(B, 2)-((4*A*C))))));
      GT=(-((B)/(2*A)));
      
      if(D>0){
          System.out.println("x1 = " +R/(2*A));
          System.out.println("x2 = " +RDOS/(2*A));
      }else if(D==0) {
          System.out.println("x1 = " +GT);
          System.out.println("x2 = " +GT);      
      }else if(D<0){
          System.out.println("No hay solucion");
      }
      
      
    }
}
