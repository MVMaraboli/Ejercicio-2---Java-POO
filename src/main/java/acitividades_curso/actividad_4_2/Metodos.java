/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.actividad_4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public void cuentaPrestados(ArrayList<Publicaciones> listaPublicaciones) {
        int e = 0;
        int prest = 0;
        for (e = 0; e < listaPublicaciones.size(); e++) {
            if (listaPublicaciones.get(e).isPrestado() == true) {
                prest++;
            }}
        System.out.println("Hay " + prest + " Publicaciones prestados");
        

    }

    public void publicacionesAnterioresA(ArrayList<Publicaciones> anteri) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese año para buscar las publicaciones anteriores a este");
        int anio2 = entrada.nextInt();
        int o = 0;
        int ant = 0;
        for (o = 0; o < anteri.size(); o++) {
            if (anteri.get(o).getAnio() < anio2) {
                ant++;
            }
        }
        System.out.println("Hay " + ant + " publicaciones anteriores al anio "+anio2);

    }
}
