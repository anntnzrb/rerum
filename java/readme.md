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

## :large_orange_diamond: arreglos

son colecciones de elementos

### :small_blue_diamond: características

- elementos del mismo tipo
- tamaño fijo
- multi-dimensionals

### sintaxis

`tipo_dato[] var = new tipo_dato[n]`

- `tipo_dato` -> `short`,`int`,`double`, ...
- `var` -> nombre del arreglo
- `n` -> tamaño del arreglo

```java
/* 1 dimension */

/* declaracion y creacion del arreglo */
int[] arr1 = new int[10]; /* arreglo de tamaño 10 */

/* declaracion */
int[] arr2;
/* creacion */
arr2 = new int[5]; /* arreglo de tamaño 5 */

/* asignacion de valores al crear arreglo */
String[] arr3 = {"uno", "annt", "hey"};
```

## :large_orange_diamond: classes

### :small_blue_diamond: Scanner

la class `Scanner` permite ingresar información através del teclado, ésta
pertenece al paquete `java.util`

- importar class `Scanner`:

  - `import java.util.Scanner;`

- crear una nueva instancia de la class `Scanner`:

  - `Scanner input = new Scanner(System.in);`
  - `input` puede ser cualaquier nombre (similar a crear una variable)

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

## :large_orange_diamond: programación orientada a objetos (poo)

### :small_blue_diamond: características

existen **4** conceptos fundamentos en la programación orientada a objetos:

- encapsulamiento
- herencia
- polimorfismo
- abstraccion

los objetos tienen 2 propiedades:

- atributos
- métodos

asumamos a un :racehorse: **caballo** como un objeto:

- atributos
  - filo (mamifero/anfiobio/etc)
  - peso
  - color
- métodos
  - correr
  - comer
  - dormir

una **class** describe (en macro) lo que es el objeto... se puede generalizar
al :racehorse: caballo como un animal, por lo tanto, la **class** puede
llamarse animal

```java
public class Animal {

    /* atributos */
    String filo;
    String nombre;
    float peso;
    String color;

    public static void
    main(String[] args)
    {
        /*
         * en el primer ejemplo se crea a un caballo, y en el segundo,
         * una rana;
         *
         * notar que ambos (animales) comparten atributos
         *
         */

        /* creación del caballo */
        Animal a1 = new Animal();
        a1.filo = "mamifero";
        a1.nombre = "caballo";
        a1.peso = 3f;
        a1.color = "cafe";

        /* creación de la rana */
        Animal a2 = new Animal();
        a2.filo = "anfiobio";
        a2.nombre = "rana";
        a2.peso = 524.76f;
        a2.color = "verde";

        System.out.printf(
            "animal: %s ; filo: %s ; peso: %.2fkg ; color: %s %n",
            a1.nombre, a1.filo, a1.peso, a1.color);

        System.out.printf(
            "animal: %s ; filo: %s ; peso: %.2fkg ; color: %s %n",
            a2.nombre, a2.filo, a2.peso, a2.color);

    }
}
```

:hash:

```markdown
animal: caballo ; filo: mamifero ; peso: 3.00kg ; color: cafe
animal: rana ; filo: anfiobio ; peso: 524.76kg ; color: verde
```

:information_source: ejemplo de una calculadora se pueden encontrar
[aqui](./prg008/src/)

### :small_blue_diamond: modificadores de acceso

[:information_source:](https://javadesdecero.es/poo/modificadores-de-acceso/)
sirven para restringir el acceso a los miembros de una clase

- ayudan a evitar el mal uso de un objeto
- pueden evitar que se asignen valores incorrectos a esos datos

**classes**

| modificador de acceso | paquete            | class              | sub-class          | todo               |
| --------------------- | ------------------ | ------------------ | ------------------ | ------------------ |
| public                | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| default               | :heavy_check_mark: | :heavy_check_mark: | :x:                | :x:                |

**atributos y metodos**

| modificador de acceso | paquete            | class              | sub-class          | todo |
| --------------------- | ------------------ | ------------------ | ------------------ | ---- |
| public                | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | sí   |
| default               | :heavy_check_mark: | :heavy_check_mark: | :x:                | :x:  |
| private               | :x:                | :heavy_check_mark: | :x:                | :x:  |
| protected             | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x:  |

- es una buena practica manejar variables **privadas**, ya que estas pueden
  ser manipuladas con **getters** y **setters**

### :small_blue_diamond: getters & setters

son usados para proteger efectivamente los datos, específicamente al momento
de crear nuevas clases

los **setters** toman un parametro y se lo asignan al atributo, mientras que
los **getters** son los que retornan el valor del atributo

sintaxis para crear un **setter** y **getter**:

- getter

  - ```java
    public getNombre() {}
    ```

- setter

  - ```java
    public void setNombre(tipo_dato arg) {}
    ```

### :small_blue_diamond: constructores

son metodos especiales que se invocan cuando se crea un objeto, este puede ser
utilizado para inicializar valores a los atributos

### :small_blue_diamond: características

- mismo nombre que la class
- no tienen un return type
- se pueden tener varios constructores
  - estos se diferencian por la cantidad de parametros que reciben
  - esto se llama "sobrecarga de metodos"

```java
public class Animal {

    private String color;

    /*
     * en este caso, cuando se instancie el objeto sin algun argumento, por
     * default se asignara el color "cafe" al atributo color
     */

    public Animal()
    {
        this.setColor("cafe");
    }
    /*
     * por otro lado, cuando se instancie el objeto especificando algun
     * argumento, por ejemplo "verde" se asignara dicho color al atributo color
     */
    public Animal(String c)
    {
        this.setColor(c);
    }

    /* setter */
    public void
    setColor(String c)
    {
        this.color = c;
    }

    /* getter */
    public String
    getColor(String c)
    {
        return this.color;
    }
}
```

:information_source: ejemplo de sobrecarga de metodos se encuentra
[aqui](./prg010/src/)

## :large_orange_diamond: random

:information_source: sección donde se puede encontrar contenido misceláneo

### :small_blue_diamond: programa de ejemplo

en el siguiente bloque de código se muestra un programa básico en Java

```java
public class prog001 {
    public static void
    main(String[] args)
    {
        System.out.println("hey");
    }
}
```

:hash: `hey`

> :exclamation: el nombre del archivo (`prog001.java`) debe ser igual al nombre
> de la class (en el caso de ser una **class pública**)
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

:link: [Hungarian Notation to Java](https://www.developer.com/java/ent/article.php/615891/Applying-Hungarian-Notation-to-Java-programs-Part-1.htm)
