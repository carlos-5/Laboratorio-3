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
public class Programa2 {
    public static void main(String[] args)
    {
       int hrst,sem,total;
       Scanner dato = new Scanner(System.in);
       
       System.out.println("Ingrese las horas que trabajo en la semana: ");
       hrst = dato.nextInt();
       System.out.println("Ingrese su sueldo por hora: ");
       sem = dato.nextInt();
       total = hrst*sem;
       System.out.println("Su sueldo semanal es de: " + total);
       
      
    }
}
