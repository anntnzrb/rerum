---
author: "Juan Antonio González Orbe"
title: "Control de lectura #2"
layout: "paper"
---

<!-- markdownlint-disable MD013 MD024 -->

## modelo de bases de datos relacional

### tablas

una relación es una construcción matemática, es mas fácil pensar en una
relación como una tabla; esta contiene a un grupo de ocurrencias de entidades
relacionadas

#### características

- estructura de dos dimensiones compuesta de filas y columnas
- cada **fila** (**tupla**)[^fn1] representa una ocurrencia de entidad
- cada **columna** tiene un nombre distintivo y representa un atributo
- cada interacción entre una **fila** y **columna** representa un solo valor de
  datos
- todos los valores de una **columna** deben estar compuestos de un mismo
  formato
- cada **columna** tiene un rango especifico de valores conocido como el
  _dominio del atributo_
- cada tabla debe tener un atributo o combinación de atributos que identifique
  de forma única cada **fila**

### claves (keys)

las clases son importantes en el modelo relacional porque estas son empleadas
para asegurar que cada fila de una tabla sea identificable fácilmente. una
clave consiste de uno o mas atributos que determinan a otros atributos.

#### dependencias

el rol de una clave es basado en el concepto de _determinación_. la
_determinación_ es el estado en el cual se puede conocer el valor de un
atributo **B** si es que se conoce el valor del atributo **A**.

por ejemplo, a partir de conocer `EST_ID`, se puede conocer `EST_NOMBRE` (_a
partir de conocer el ID de un estudiante se puede conocer su nombre..._);
esto se representa: `EST_ID -> EST_NOMBRE`

- `EST_ID` es llamado _determinante_[^fn2]
- `EST_NOMBRE` es llamado _dependiente_[^fn3]

los valores nulos (**null**)[^fn4] son problemáticos; se puede decir que una
tabla que contiene un valor null, no es si quiera una tabla relacional. A
pesar de esto, algunos nulls son inevitables, por ejemplo, no todos los
estudiantes tienen 2 nombres, sin embargo, es necesario hacer lo posible por
evitarlos.

un null puede representar lo siguiente:

- atributo desconocido
- atributo conocido, pero se omitió (no se asignó)
- condición no aplicable

debido a esta ambigüedad, se intenta evitarlos.

## normalización de tablas de bases de datos

la normalización es el proceso de suprimir o reducir las anomalías de datos
mediante la eliminación de redundancias innecesarias.

entre algunos beneficios:

- eliminar duplicados
- incremento en la consistencia de datos

### proceso de normalización

se puede guiar a partir de [este vídeo](https://www.youtube.com/playlist?list=PLTd6ceoshprdZIu24-_u00-m2Vf9o5aVC)
del canal [ComputerScienceLessons](https://www.youtube.com/c/ComputerScienceLessons)

#### conversión a 1NF

- cada fila debe ser única
- no debe haber columnas repetidas
- todos los elementos de una columna deben significar lo mismo
- no debe contener atributos compuestos o multi-valuados
  - cada campo debe tener 1 solo ítem
- no debe contener grupos de atributos repetidos

##### pasos

1. eliminar grupos repetidos
2. identificar la clave primaria
3. identificar todas las dependencias

#### conversión a 2NF

- debe estar convertida en **1NF**
- no deben existir dependencias parciales
- la tabla debe contener información únicamente de una cosa (entidad)

##### pasos

1. hacer tablas nuevas
   i. eliminar dependencias parciales
2. reasignar atributos dependientes correspondientemente

#### conversión a 3NF

- debe estar convertida en **1NF**
- no deben existir dependencias transitivas

##### pasos

1. hacer tablas nuevas
   i. eliminar dependencias transitivas
2. reasignar atributos dependientes correspondientemente

[^fn1]: bajo el contexto del modelo relación, esto es la fila de una tabla
[^fn2]: atributo que puede determinar el valor de otro atributo
[^fn3]:
    atributo el cual obtiene su valor a partir de ser determinado por otro
    atributo

[^fn4]: es la ausencia de un valor; no significa "0" o "espacio en blanco"
