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
public class Programa7 {
    public static void main(String[] args)
    {
       int ttlh,sem,dia,hrs;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("Ingrese el total de horas");
       ttlh=Teclado.nextInt();
       sem=ttlh/(24*7);
       dia=ttlh % (24*7)/24;
       hrs=ttlh % 24;
       System.out.println("las horas totales son: " + sem + " semanas " + dia + " dias y " + hrs + " horas");
       
    }
}
