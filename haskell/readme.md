---
title: "Haskell"
layout: "paper"
---

<!-- markdownlint-disable MD013 MD024 MD041 -->

![.](./lib/haskell-logo.png)

> There are two ways of constructing a software design: One way is to make it
> so simple that there are obviously no deficiencies, and the other way is to
> make it so complicated that there are no obvious deficiencies. The first
> method is far more difficult.

[_Tony Hoare_]

## why Haskell

- less-verbose & simpler syntax
  - just as powerful as many other languages
- eventually teaches you how to structure programs properly
  - build programs with simpler solutions
  - apply this new way of programming in other languages
- based on the idea of _functional programming_ (now, whether this is good or
  not is a another topic)

## basics

### hi

it is always nice seeing the syntax of a new language:

```hs
main = putStrLn "hi"
```

### data types

- Haskell is a statically typed language
  - it offers _type inference_, it is not needed to explicitly write out the
    types of functions and expressions

| type      | values           | notes                                                                               |
| --------- | ---------------- | ----------------------------------------------------------------------------------- |
| `Bool`    | `True` / `False` | -                                                                                   |
| `Int`     | integer values   | bounded                                                                             |
| `Integer` | integer values   | not bounded (bigger numbers), less efficient than `Int`                             |
| `Float`   | decimal values   | single precision                                                                    |
| `Double`  | decimal values   | double precision                                                                    |
| `Char`    | character value  | accepts 1 character, an array of characters is known as "String" in other languages |

#### type variables

the function `head` takes an array and always returns the first value of that
array:

- `head [1, 2, 3, 4, 5]` prints `1`
- `head "whatever"` prints `'w'`

clearly `head` is able to accept an array of `Int` and `Char` as well, the
definition is: `head :: [a] -> a`

- similar to _generics_ in other languages
- these functions are called _polymorphic_
- parameters usually denoted with letters `a`, `b`, `c`...

### comments

- ```hs
  -- this is a single line comment
  ```

- ```hs
  {-
  This is a multi-line comment
  ...
  useful for documenting
  -}
  ```

## functions

here's a trivial math function called `f` which receives `2` arguments,
in this case, two integer values, i.e `5` or `7` per se:

$f(a, b)$

- `a` and `b` are just variables which (in this case) represent integer values;
  the reason why letters are used is to be generic

calling the function with real numbers, say $f(3, 3)$ is just aggregating both
numbers i.e $3 + 3 = 6$

how is this example accomplished in Haskell?

```hs
-- defining a a function that sums two given numbers
-- note: there is already a function called "sum" built in the language
f :: Int -> Int -> Int
f x y = x + y
```

- `f :: Int -> Int -> Int`
  - `f` is the _name of the function_
  - `Int -> Int -> Int` represents that function `f` receives `2` _parameters_;
    the last statement represents the _return value_
- there can be `n` number of _parameters_ given to the function, but the last
  statement will always be the _return type_
  - this means you can create a function called `g` like this:
    `g :: Int -> Int -> Int -> Int -> Int -> Int -> Int -> Int`
    which receives `7` parameters

## naming conventions

### reserved words & symbols

there are some words (keywords) and symbols you cannot use as they are reserved
for the language itself; [list of of Haskell keywords](https://0x0.st/ZcYa)

### functions

functions and their arguments should start with a **lower-case letter** and can
be followed with upper/lower-case letters, digits, underscores and even single
quotes

e.g:

- `myFunc`, `func1`, `arg0`, `x'` are allowed

### even more conventions

it is always a good practice to follow the official programming guidelines, you
can find Haskell's [here](https://0x0.st/ZcgX)

## references

| :books:                                                                               | :scroll:        | :black_nib:                           |
| ------------------------------------------------------------------------------------- | --------------- | ------------------------------------- |
| :gb: [_Tony Hoare_](https://0x0.st/ZqBs)                                              | :speaking_head: | [Wikiquote](https://0x0.st/ZqBr)      |
| :gb: [_Learn You a Haskell for Great Good!: A Beginner's Guide_](https://0x0.st/ZaHF) | :pencil:        | [Miran Lipovaca]                      |
| :gb: [_Getting Started With Haskell_](https://0x0.st/ZAfv)                            | :movie_camera:  | [DistroTube](https://0x0.st/ZAfx)     |
| :es: [_Curso de Haskell desde cero_](https://0x0.st/ZqaR)                             | :movie_camera:  | [David Giordana](https://0x0.st/ZqBz) |

## notes

### functional vs imperative

tiny example of a function that sums the elements of an array in **C**, later
on **Haskell**

**C**:

- ```c
  int
  sum(int *arr, int lenght)
  {
      int sum = 0;
      for (int i = 0; i < lenght; ++i) { sum += arr[i]; }

      return sum;
  }
  ```

**Haskell**:

- ```hs
  -- approach 1
  sum []       = 0
  sum (x : xs) = x + sum xs

  --approach 2
  sum = foldr (+) 0
  ```

### tips

- patience
- forget about previous programming paradigms
  - everything may seem odd at the beggining, get used to it
