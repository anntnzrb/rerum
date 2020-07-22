package sistemaespectaculosui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Funcion;
import modelo.espectaculo.Espectaculo;
import sistemaespectaculos.EspectaculosEcuador;

/**
 *
 * @author rociomera
 * @author j.a gonzalez
 */

public class ProcesarCompra {
    public static void
    main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /* 1. crear instancia EspectaculosEcuador */
        EspectaculosEcuador espec = new EspectaculosEcuador();

        do {
            /* 2. buscar espectaculo por nombre o por equipo
             * y mostrar el resultado en pantalla */
            System.out.println("Bienvenido");
            System.out.println("1. Consultar por nombre");
            System.out.println("2. Consultar por equipo");
            String opcion = sc.nextLine();
            ArrayList < Espectaculo > espectaculos = null;
            if (opcion.equals("1")) {
                System.out.println("Ingrese nombre: ");
                String nombre = sc.nextLine();
                espectaculos = espec.buscarEspectaculo(nombre);
                System.out.println(espectaculos);

            } else if (opcion.equals("2")) {
                System.out.println("Ingrese equipo: ");
                String equipo = sc.nextLine();
                espectaculos = espec.buscarPartido(equipo);
                System.out.println(espectaculos);
            }

            /* 3. pedir el codigo del espectaculo que se desea, obtenerlo
             * y mostrara las funciones del mismo y con sus boletos vendidos
             * asuma que el cliente ingresa un codigo de espectaculo que existe
             * y esta dentro de los espectaculos devueltos por la busqueda
             * anterior */
            System.out.println("Ingrese codigo espectaculo: ");
            String codigoesp = sc.nextLine();
            ArrayList < Funcion > lista_funciones = new ArrayList < > ();
            for (Espectaculo esp : espectaculos) {
                if (esp.getCodigo().equals(codigoesp)) {
                    lista_funciones = esp.getFunciones();
                    for (Funcion f: lista_funciones) {
                        System.out.println(f);
                        System.out.println(espec.obtenerBoletosVendidos(f));
                    }
                }
            }

            /* 4. pedir la fecha del espectaculo que se desea y obtenerlo
             * asuma que el cliente ingresa la fecha en formato correcto y
             * existe  un funcion para esa fecha para el espectaculo
             * seleccionado */
            System.out.println("Ingrese la fecha funcion que desea: ");
            /* "dd-MM-yyyy HH:mm" -> 08-04-1986 12:30; */
            String fecha = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd-MM-yyyy HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);

            Funcion f1 = null;
            for (Funcion f : lista_funciones) {
                if (f.getFecha().equals(dateTime)) { f1 = f; }

            }

            /* 5. pedir la cedula del cliente y obtener le cliente
             * asuma el cliente ingresa una cedula de un cliente registrado */
            System.out.println("Ingrese cedula del cliente: ");
            String cedula = sc.nextLine();
            Cliente c1 = espec.buscarCliente(cedula);

            /* 6. pedir el numero de boletos a adquirir */
            System.out.println("Ingrese numero boletos deseados: ");
            int boletos = Integer.parseInt(sc.nextLine());

            /* 7. proceder a realizar la compra. Al final se debe imprimir
             * si se pudo o no hacer la compra */
            System.out.printf("%s se pudo  realizar la compra%n",
                              espec.comprarBoleto(c1, f1,
                                                  boletos) ? "Si" : "No");

            System.out.println("Desea continuar (si/no)");
        } while(sc.nextLine().equals("si"));
    }
}
