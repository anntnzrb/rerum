# autónomo #2

## clase "Scanner"

ésta clase permite ingresar información a través del teclado, es perteneciente
al paquete `java.util`

para utilizar esta clase, es necesario importar su respectivo paquete:

- `import java.util.Scanner;`

se debe crear una instancia del objeto `Scanner`, normalmente se pasa como
argumento el objeto `System.in`. se pueden usar diferentes nombres para el
nombre del scanner:

- `Scanner scanf = new Scanner(System.in);`
  - también posible: `Scanner entrada = new Scanner(System.in);`

se requiere utilizar diferentes métodos para guardar distintos tipos de datos

| método         | tipo de dato         |
| -------------- | -------------------- |
| next()         | cadena de caracteres |
| nextLine()     | cadena de caracteres |
| nextInt();     | numérico             |
| nextDouble();  | numérico             |
| nextBoolean(); | booleano             |
| ...            | ...                  |

- existen más métodos que se pueden encontrar [aquí](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)

- al finalizar el uso del objeto Scanner, éste debe cerrarse:
  - `scanf.close();`
    - a partir de esta línea, el scanner ya no estará disponible, por lo tanto,
      ya no es posible solicitar entrada de datos al usuario con ese Scanner

### ejemplo

en este ejemplo se solicita al usuario que ingrese su **nombre**, **edad** y
**salario**

```java
import java.util.Scanner;

public class foo {
    public static void main(String[] args) {
        /* instanciamiento de la clase Scanner */
        Scanner scanf = new Scanner(System.in);

        /*
         * declaracion de variables y solicitud de entrada
         * al mismo tiempo se imprimen ciertos mensajes indicando lo que se
         * esta pidiendo
         */
        System.out.print("ingrese su nombre: ");
        String nombre = scanf.nextLine();
        System.out.print("ingrese su edad: ");
        int edad = scanf.nextInt();
        System.out.print("ingrese su salario: ");
        double salario = scanf.nextDouble();

        /* print */
        System.out.print("\n");
        System.out.printf("su nombre es: %s%n", nombre);
        System.out.printf("su edad es: %d%n", edad);
        System.out.printf("su salario es: %.2f%n", salario);

        /* cerrar Scanner */
        scanf.close();
    }
}
```

### funcionamiento inesperado

- si se ingresa un tipo de dato diferente al solicitado, se producirá un error
- para ingresar un número decimal, se usa el punto (`.`), en vez de la
  coma (`,`)
- al presionar la tecla `Enter` posterior al ingreso de datos en la consola,
  se inserta un salto de línea `\n` al final automáticamente, el método
  `nextLine()` lo elimina, pero `nextInt()` y los demás no lo hacen

  - una posible alternativa para contrarrestar éste comportamiento es agregar
    una sentencia `nextLine()` con el propósito de limpiar el buffer

  - ```java
    System.out.print("ingrese un numero: ");
    int numero = scanf.nextInt();
    scanf.nextLine();
    System.out.print("ingrese su nombre: ");
    String nombre = scanf.nextLine();
    System.out.print("ingrese su edad: ");
    int edad = scanf.nextInt();
    ```

## tarea

```txt
1. Lea la cantidad de kWh que ha consumido una familia y el precio por cada
   kWh.  Si la cantidad es mayor a 700, incremente el precio en 5% para el
   exceso de kWh sobre 700.  Muestre el valor total a pagar

2. Solicitar el ingreso de 5 números enteros y calcular el promedio.
   Realice este ejercicio usando for, while y do-while

3. Escribir un programa que realice lo siguiente:
   Solicite el ingreso de las 3 notas de una materia obtenidas por un estudiante
   durante un semestre en ESPOL. Los datos que debe ingresar son:
   Número de matrícula
   Nota primer parcial
   Nota segundo parcial
   Nota mejoramiento.
   Asuma que los datos ingresados son valores correctos(números enteros en el
   rango apropiado)
      • Deberá mostrar un mensaje si el estudiante aprueba o no la materia.
      Recuerde que un estudiante aprueba una materia si suma 120 puntos en dos
      evaluaciones.
      • Luego del ingreso preguntará si desea realizar más ingresos. Deberá
      volver a solicitar los datos hasta que escriba N.

   Ejemplo de salida:

      Ingrese numero de matricula 201799999
      Ingrese nota primer parcial 60
      Ingrese nota segundo parcial 50
      Ingrese nota mejoramiento 55
      Estudiante reprueba la materia
      Desea continuar (S/N): S
      Ingrese numero de matricula 201788888
      Ingrese nota primer parcial 70
      Ingrese nota segundo parcial 50
      Ingrese nota mejoramiento 0
      Estudiante aprueba la materia
      Desea continuar (S/N): N

4. Construir un programa que simule el juego de la adivinanza de un número.
   El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario
   tiene cinco oportunidades para acertarlo. Después de cada intento el
   programa debe indicarle al usuario si el número introducido por él es
   mayor, menor o igual al número a adivinar, y el número de intentos
   restantes.

   Nota: para generar el valor aleatorio puede emplearse la sentencia:
   short x  = (short) (100*Math.random()+1);
```
