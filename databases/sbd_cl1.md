---
author: "Juan Antonio González Orbe"
title: "Control de lectura #1"
layout: "paper"
---

## Modelo de relación de entidades

Componentes principales de las bases de datos:

- entidades
- atributos
- relaciones

## Entidades

Representan objetos de la vida real. El nombre de la entidad es un sustantivo,
usualmente escrito en `MAYUSCULAS`.

## Atributos

Son las características de las entidades; por ejemplo, la entidad `ESTUDIANTE`
tiene atributos como `EST_NOMBRE` y `EST_APELLIDO`, entre otros.
Existen atributos de único y múltiple valor.

### Atributos requeridos y opcionales

Existen atributos _requeridos_ que tienen que contener un valor, no pueden
estar vacíos. Así mismo, pueden no tener un atributo, por ejemplo, un
estudiante puede no tener un e-mail ni numero telefónico, por lo tanto, estos
son atributos _opcionales_.

### Dominios

Los atributos tienen un dominio, este es un set de posibles valores para un
atributo. Por ejemplo, el atributo `genero`, puede ser `M` o `F`.

### Identificadores

Uno o mas atributos que identifican de manera única a una entidad, normalmente
se subrayan para identificarlos.

### Atributos simples y compuestos

El diseñador de la base de datos siempre debe estar pendiente de atributos
compuestos, el uso de estos es frecuente. Así mismo, este debe reconocer como
descomponer dichos atributos compuestos en atributos simples.

#### Compuestos

Un atributo compuesto es aquel que puede ser subdividido en atributos
adicionales. Por ejemplo `DIRECCION` puede ser subdividido en calle, ciudad,
estado...

#### Simples

Un atributo compuesto no puede ser subdividido, por ejemplo, edad y genero son
atributos simples. Para facilitar las _queries_, es mejor emplear atributos
simples.

### Atributos derivados

Un atributo derivado es aquel que obtiene su valor a partir del calculo de otro
atributo. Este atributo derivado no tiene la necesidad estar físicamente
almacenado en la base de datos, este puede ser obtenido a través de un
algoritmo.

Por ejemplo, el atributo "edad" puede ser obtenido a partir de la resta de la
fecha actual menos la fecha de nacimiento de la persona.

## Relaciones

Es la asociación entre las entidades; también conocidas como "participantes".
El nombre de la relación es un verbo activo o pasivo. Por ejemplo, `ESTUDIANTE`
_toma_ una `CLASE`; `AVION` es _usado_ por los `TRIPULANTES`.

Las relaciones entre entidades deben operador en ambas direcciones:

- Un `CLIENTE` puede generar muchos `RECIBOS`
- Cada `RECIBO` es generador por un `CLIENTE`

## Conectividad y cardinalidad

### Conectividad

Es empleada para describir la clasificación de relación.

### Cardinalidad

Representa el numero mínimo y máximo de entidades asociadas a una ocurrencia de
las entidades relacionadas.
Se expresa usando el formato `(x,y)`
