package org.example;

import java.util.Scanner;
import java.time.LocalDate;

public class practicaenclase {
    public static void main(String[] args) {
        Scanner goku = new Scanner(System.in);

        int cantidad;
        System.out.println("INGRESE EL NUMERO DE ESTUDIANTES QUE HAY");
        cantidad = goku.nextInt();
        goku.nextLine();

        String[] nombres = new String[cantidad];
        String[] asistencia = new String[cantidad];
        String[] fecha = new String[cantidad];
        LocalDate FechaActual = LocalDate.now();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE " + (i + 1) + ":");
            nombres[i] = goku.nextLine();
            System.out.println("ASISTIÓ EL ESTUDIANTE " + nombres[i] + " (sí o no):");
            asistencia[i] = goku.nextLine().trim().toLowerCase();
            fecha[i] = FechaActual.toString();

            if (!asistencia[i].equals("si") && !asistencia[i].equals("no")) {
                System.out.println("Entrada inválida para la asistencia. Se asumirá 'no'.");
                asistencia[i] = "no";
            }
        }

        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < cantidad; i++) {
            String estadoAsistencia = asistencia[i].equals("si") ? "Asistió" : "No asistió";
            System.out.println(nombres[i] + "----- " + estadoAsistencia + "------" + fecha[i]);
        }

        goku.close();
    }
}