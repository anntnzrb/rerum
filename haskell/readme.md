---
title: "Haskell"
layout: "paper"
---

<!-- markdownlint-disable MD013 MD041 -->

![.](./lib/haskell-logo.png)

> There are two ways of constructing a software design: One way is to make it
> so simple that there are obviously no deficiencies, and the other way is to
> make it so complicated that there are no obvious deficiencies. The first
> method is far more difficult.

[Tony Hoare]

## why Haskell

- less-verbose & simpler syntax
  - just as powerful as many other languages
- eventually teaches you how to structure programs properly
  - build programs with simpler solutions
  - apply this new way of programming in other languages
- based on the idea of _functional programming_ (now, whether this is good or
  not is a another topic)

## functions

here's a trivial (easy) math function called `f` which receives `2` arguments,
in this case, two integer values, i.e `5` or `7` per se:

$f(a, b)$

- `a` and `b` are just variables which (in this case) represent integer values;
  the reason why letters are used is to be generic

calling the function with real numbers, say $f(3, 3)$ is just aggregating both
numbers i.e $3 + 3 = 6$

how is this trivial example accomplished in Haskell?

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
  - this means you can a function called `g` like this:
    `g :: Int -> Int -> Int -> Int -> Int -> Int -> Int -> Int`
    which receives `7` parameters
- comments are denoted with `--`

## references

| :books:                                              | :scroll:        | :black_nib:                           |
| ---------------------------------------------------- | --------------- | ------------------------------------- |
| [_Tony Hoare_](https://0x0.st/ZqBs)                  | :speaking_head: | [Wikiquote](https://0x0.st/ZqBr)      |
| [_Curso de Haskell desde cero_](https://0x0.st/ZqaR) | :movie_camera:  | [David Giordana](https://0x0.st/ZqBz) |

## notes

### tips

- patience
- forget about previous programming paradigms
  - everything may seem odd at the beggining, get used to it
