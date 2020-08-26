/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosarchivosmapas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author rociomera
 * @author j.a gonzalez
 */
public class ContadorPalabrasB {
    static final String RUTA_ARCHIVOS = "./src/hilosarchivosmapas/";
    List<String> archivos;

    public ContadorPalabrasB() {
        archivos =
            Arrays.asList(RUTA_ARCHIVOS + "file1", RUTA_ARCHIVOS + "file2",
                          RUTA_ARCHIVOS + "file3");
    }

    public static void main(String... args) {
        var c = new ContadorPalabrasB();
        c.generarReportes();
    }

    /**
     * Metodo que genera un reporte por cada archivo en la lista archivos el
     * reporte generado por cada archivo contiene una las palabras del archivo y
     * el numero de veces que aparecen
     */
    public void generarReportes() {
        for (var arc : archivos) {
            var t = new Thread(new ProcesaArchivo(arc));
            t.start();
        }

        /* Test Threads */
        System.out.println("-".repeat(44));
        for (var t : Thread.getAllStackTraces().keySet()) {
            System.out.printf("%-20s \t %s\n", t.getName(), t.getState());
        }
        System.out.println("-".repeat(44));
    }

    class ProcesaArchivo implements Runnable {
        String nombre;

        ProcesaArchivo(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void run() {
            /* recorre arreglo de archivos */
            for (var arc : archivos) {
                try (var bW = new BufferedWriter(
                    new FileWriter(arc + "_reporte"))) {
                /* HashMap (diccionario) donde la claves son las palabras y
                los valores asociados el numero de ocurrencias */
                    var hM = new HashMap<String, Integer>();
                    /* arreglo con cada linea de cada archivo */
                    List<String> lineas = Files.readAllLines(Paths.get(arc));
                    /* recorre lineas de los archivos */
                    for (var lin : lineas) {
                    /* arreglo con cada palabra (separadas por un espacio) de
                     cada linea */
                        String[] palabras = lin.split(" ");
                        /* recorre el arreglo de palabras */
                        for (var pal : palabras) {
                        /* si la clave ya existe en el diccionario, entonces
                        actualizarlo (sumando una ocurrencia de palabra mas);
                         */
                            if (hM.containsKey(pal)) {
                                hM.put(pal, hM.get(pal) + 1);
                            /* por otro lado, si no existe la clave, crearla
                            (con una aparicion) */
                            } else {
                                hM.put(pal, 1);
                            }
                        }
                    }
                    /* recorre las claves del HashMap */
                    for (var clave : hM.keySet()) {
                        /* escribe las claves y valores en formato
                        especificado */
                        bW.write(clave + ":" + hM.get(clave));
                        bW.newLine();
                    }
                } catch (IOException ioEx) {
                    System.err.println(ioEx);
                }
            }
        }
    }
}
