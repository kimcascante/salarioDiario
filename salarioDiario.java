package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Felipe es un programador que debe marcar todos lo días la hora de entrada y la hora de
    salida. Si Felipe trabajó más de ocho horas, hay que pagarle un costo por hora extra que
    es igual a 1.5 el monto de la tarifa por hora. Haga un programa que, recibiendo la tarifa
    por hora, la hora de entrada y la hora de salida, imprima el total de dinero que Felipe
    recibió en ese día.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp4w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
         int horasTrabajadas;
         double porcentajeExtra = 1.5;
         double tarifaHora;
         int horaEntrada;
         int horaSalida;
         double salarioTotal;
         double salarioFinal;

         escribir.println("Digite la tarifa por hora");
         tarifaHora = Double.parseDouble(leer.readLine());

         escribir.println("Digite la hora de entrada en formato 24 horas");
         horaEntrada = Integer.parseInt(leer.readLine());

         escribir.println("Digite la hora de salida en formato 24 horas");
         horaSalida = Integer.parseInt(leer.readLine());

         horasTrabajadas = horaSalida - horaEntrada;

         salarioTotal = tarifaHora * horasTrabajadas;
      
         if (horasTrabajadas>8){
            salarioFinal = salarioTotal + (tarifaHora*porcentajeExtra); 
         }else {
            salarioFinal = salarioTotal;
         }

         escribir.println("El dinero que recibio Felipe es de " +salarioFinal+ " colones");

     }
}