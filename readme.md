# notas de java (poo)

## programa de ejemplo

en el siguiente bloque de código se muestra un programa básico en java

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

[:link: suckless.org/coding_style](https://suckless.org/coding_style/)
