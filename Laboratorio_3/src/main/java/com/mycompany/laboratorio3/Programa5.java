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
public class Programa5 {
    public static void main(String[] args)
    {
        int part,par1,par2,examenf;
        double pond1,pond2,pond3,pond4,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de participacion: ");
        part=Teclado.nextInt();
        System.out.println("Ingrese la nota del primer parcial: ");
        par1=Teclado.nextInt();
        System.out.println("Ingrese la nota del segundo parcial: ");
        par2=Teclado.nextInt();
        System.out.println("Ingrese la nota del examen final: ");
        examenf=Teclado.nextInt();
        pond1=part*0.1;
        pond2=par1*0.25;
        pond3=par2*0.25;
        pond4=examenf*0.4;
        total=pond1+pond2+pond3+pond4;
        System.out.println("La nota final es de:" + total);
        
       
    }
}
