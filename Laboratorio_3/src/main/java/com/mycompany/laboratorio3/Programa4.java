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
public class Programa4 {
    public static void main(String[] args)
    {
        int cant, mont;
        double comision, salario;
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidada de carros vendidos: ");
        cant = dato.nextInt();
        System.out.println("Ingrese el monto total por los carros vendidos: ");
        mont = dato.nextInt();
        comision = mont * 0.05;
        salario = 1000 + (150 * cant) + comision;
        System.out.println("El salario que se debe cobrar es un  total  de: " + salario);
        
    }
}
