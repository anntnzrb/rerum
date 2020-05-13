# notas de Java (poo)

## :large_orange_diamond: tipos de datos

### :small_blue_diamond: datos primitivos

**enteros**:

| tipo de dato | tamaño  | rango                                                          |
| ------------ | ------- | -------------------------------------------------------------- |
| _byte_       | 1 byte  | -128 :left_right_arrow: +127                                   |
| _short_      | 2 bytes | -32768 :left_right_arrow: +32767                               |
| _int_        | 4 bytes | -2147483648 :left_right_arrow: +2147483647                     |
| _long_       | 8 bytes | -9223372036854775808L :left_right_arrow: +9223372036854775807L |

> :exclamation: por defecto, Java considera a todos los números que no tengan
> decimales como `int`, para utilizar específicamente `long` es necesario agregar
> una `l` o `L` al final del dígito

_e.g_ :

- `long numero = 2147483648L;`

---

**decimales**:

| tipo de dato | tamaño  | dígitos significativos                    |
| ------------ | ------- | ----------------------------------------- |
| _float_      | 4 byte  | ~-3.40e-38f :left_right_arrow: ~+3.40e38f |
| _double_     | 8 bytes | ~-1.79e-308 :left_right_arrow: ~+1.79e308 |

> :exclamation: por defecto, Java considera a todos los dígitos decimales
> como `double`, para utilizar específicamente `float` es necesario agregar una
> `f` o `F` al final del dígito

_e.g_ :

- `float decimal = 9.8F;`

**caracteres**:

| tipo de dato | tamaño  | rango                                                                           |
| ------------ | ------- | ------------------------------------------------------------------------------- |
| _char_       | 2 bytes | (UNICODE) '\u0000' :left_right_arrow: '\uffff' **ó** 0 :left_right_arrow: 65535 |

_e.g_ :

- ```java
  char c1 = 'N';  /* N */
  char c2 = 'n';  /* n */
  /* (UNICODE) */
  char c1u_a = 78;       /* N */
  char c2u_a = 110;      /* n */
  char c1u_b = '\u004E'; /* N */
  char c2u_b = '\u006E'; /* n */
  ```

**booleano**:

| tipo de dato | tamaño | características               |
| ------------ | ------ | ----------------------------- |
| _boolean_    | 1 bit  | true :left_right_arrow: false |

![data types in java](./lib/data-types-in-java.jpg)

## :large_orange_diamond: classes

### :small_blue_diamond: Scanner

la class `Scanner` permite ingresar información através del teclado, ésta es
perteneciente al paquete `java.util`

- importar class `Scanner`:

  - `import java.util.Scanner;`

- crear una nueva instancia de la class `Scanner`:

  - `Scanner input = new Scanner(System.in);`
  - donde `input` puede ser cualaquier nombre (similar a crear una variable)

#### :small_red_triangle_down: métodos

es necesario utilizar diferentes métodos para guardar diferentes tipos de datos

- datos numéricos:

  - ```java
    input.nextByte();
    input.nextShort();
    input.nextInt();
    input.nextLong();
    input.nextFloat();
    input.nextDouble();
    ```

- cadenas de caracteres:

  - ```java
    input.next();     /* acepta caracteres hasta encontrar un espacio */
    input.nextLine(); /* acepta múltiples palabras */
    ```

- booleanos:

  - ```java
    input.nextBoolean();
    ```

## :large_orange_diamond: modificadores de acceso

[:information_source:](https://javadesdecero.es/poo/modificadores-de-acceso/)
sirven para restringir el acceso a los miembros de una clase

### :small_blue_diamond: características

- ayudan a evitar el mal uso de un objeto
- pueden evitar que se asignen valores incorrectos a esos datos

| modificador de acceso | paquete | class | sub-class |
| --------------------- | ------- | ----- | --------- |
| public                | sí      | sí    | sí        |
| private               | no      | sí    | no        |

## :large_orange_diamond: random

:information_source: sección donde se puede encontrar contenido misceláneo

### :small_blue_diamond: programa de ejemplo

en el siguiente bloque de código se muestra un programa básico en Java

```java
public class prog001 {
    public static void
    main(String[] args) {
        System.out.println("hey");
    }
}
```

:hash: `hey`

> :exclamation: el nombre del archivo (`prog001.java`) debe ser igual al nombre de
> la class (en el caso de ser una **class pública**)
> [:information_source:](https://stackoverflow.com/a/2324915)

### :small_blue_diamond: qué es System.out?

- `System` es una _clase_

- `out` es un _objeto_

- `print()` ; `println()` ; `...` son _métodos_ del _objeto_ `out`

`System.out.println()`

## :large_orange_diamond: estilo de codificación

:link: [Java Programming Styles](https://youtu.be/OXYT01qrDrc)
:pencil:[Neso Academy](https://www.youtube.com/user/nesoacademy/)

:link: [suckless.org/coding_style](https://suckless.org/coding_style/)

:link: [c-code-style](https://github.com/MaJerle/c-code-style)
:pencil:[MaJerle](https://github.com/MaJerle)
