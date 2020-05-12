# notas de Java (poo)

## programa de ejemplo

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
> la class (en el caso de ser un **class pública**)
> [:information_source:](https://stackoverflow.com/a/2324915)

:question: **qué es System.out?**

- `System` es una _clase_

- `out` es un _objeto_

- `print()` ; `println()` ; `...` son _métodos_ del _objeto_ `out`

`System.out.println()`

## [:link:](https://www.geeksforgeeks.org/data-types-in-java/) tipos de datos

### datos primitivos

**enteros**:

| tipo de dato | tamaño  | rango                                            |
| ------------ | ------- | ------------------------------------------------ |
| _byte_       | 1 byte  | -128 :left_right_arrow: +127                     |
| _short_      | 2 bytes | -32768 :left_right_arrow: +32767                 |
| _int_        | 4 bytes | -2,147,483,648 :left_right_arrow: +2,147,483,647 |
| _long_       | 8 bytes | ~-9e18 :left_right_arrow: ~+9e18                 |

---

**decimales**:

| tipo de dato | tamaño  | rango              |
| ------------ | ------- | ------------------ |
| _float_      | 4 byte  | hasta 7 decimales  |
| _double_     | 8 bytes | hasta 16 decimales |

> :exclamation: por defecto, Java considera a todos los dígitos decimales
> como double, para utilizar específicamente `float` es necesario agregar una `f`
> al final del dígito.

_e.g_ :

- `float decimal = 9.8f;`

**caracteres**:

| tipo de dato | tamaño | rango                     |
| ------------ | ------ | ------------------------- |
| _char_       | 2 byte | exclusivamente 1 caracter |

**booleano**:

| tipo de dato | tamaño | rango                         |
| ------------ | ------ | ----------------------------- |
| _boolean_    | 1 bit  | true :left_right_arrow: false |

![data types in java](/lib/Data-types-in-Java.png)

## modificadores de acceso

:question: sirven para restringir el acceso a los miembros de una clase
[:information_source:](https://javadesdecero.es/poo/modificadores-de-acceso/)

**características**:

- ayudan a evitar el mal uso de un objeto
- pueden evitar que se asignen valores incorrectos a esos datos

| modificador de acceso | paquete | class | sub-class |
| --------------------- | ------- | ----- | --------- |
| public                | sí      | sí    | sí        |
| private               | no      | sí    | no        |

## estilo de codificación

:link: [Java Programming Styles](https://youtu.be/OXYT01qrDrc)
:pencil:[Neso Academy](https://www.youtube.com/user/nesoacademy/)

:link: [suckless.org/coding_style](https://suckless.org/coding_style/)

:link: [c-code-style](https://github.com/MaJerle/c-code-style)
:pencil:[MaJerle](https://github.com/MaJerle)
