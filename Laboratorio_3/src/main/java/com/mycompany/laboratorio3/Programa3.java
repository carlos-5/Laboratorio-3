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
public class Programa3 {
    public static void main (String[] args)
    {
        int R,A,E,total;
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Ingrese los dolares que tiene Rodrigo: ");
        R=datos.nextInt();
        A = R/2;
        E = (R+A)/2;
        total = R+A+E;
        System.out.println("Rodrigo tiene: " + R + "dolares");
        System.out.println("Andrea tiene: " + A + "dolares");
        System.out.println("Esteban tiene: " + E + "dolares");
        System.out.println("En total juntos poseen: " +total + "dolares");
        
    }
}
