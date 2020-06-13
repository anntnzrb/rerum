# ![.](./lib/imgs/rust-logo.png) Rust programming notes

the `main()` function is mandatory, it is always the first code that runs
in every executable _Rust_ program

the `!` means you are calling a macro, therefore `println!` is a **macro**,
not a **function** or **method**

- compiling and running are two different things, _Rust_ is an ahead-of-time
  compiled language

  - this means you can give away the executable (binary) file to someone else
    and they will be able to execute the program without even having _Rust_
    installed

- compiling programs with `rustc` is fine for small projects, if you are
  thinking big, you will want to use `cargo` which allows you to write
  real-world _Rust_ programs

## Cargo ![.](./lib/imgs/cargo-logo.png)

**Cargo** is _Rust_’s build system and package manager, most _Rust_ users use
this tool to manage their projects

- **Cargo** handles a lot of tasks for you:

  - building your code
  - downloading and building the libraries your code depends on

- obviously using **Cargo** is not needed to build _Rust_ programs, however this
  "notes" will create most projects with it, as it is very handy

- essential **Cargo** commands:
  - **build** a project: `cargo build`
  - **check** code for possible compiling errors: `cargo check`
  - **build** & **run** a project in one step: `cargo run`
  - **update** crates: `cargo update`

more information about **Cargo** can be found at
[_Rust's Book (Cargo)_](https://0x0.st/HYol)
as this guide will not cover this topic in detail

## variables

**variables in are inmutable by default**, this is to take advantage of the safety
and easy concurrency that _Rust_ offers. you are still able to make mutable
variables by appending the `mut` keyword next to the `let` keyword

- ```rust
  let x = 11;     // inmutable
  let mut y = 11; // mutable
  ```

### constants

just like **inmutable variables** constants are not allowed to change.

- propierties:
  - `const mut` cannot be used (this would defeat the purpose)
  - must specify a data typ
  - may be used in any scope, tbis is useful for variables
    shared across many parts of the code
  - may only be set to a **constant expression**, not the result of a
    function call for example
  - naming convention for **constants** is to use all uppercase with
    underscore (`_`) words
    - underscores can be inserted in numeric literals in order to improve
      readability

```rust
const HEALTH: u8 = 100;
const MAX_POINTS: u32 = 100_000;
```

### shadowing

it is possible to declare a new variable with the same name as a
previously-declared variable, the newly-declared-variable will shadow the old
one, hence the name shadowing.

```rust
fn main() {
    let x = 5;     // declaring variable `x` for the first time | x = 5

    let x = x + 1; // second time | (new x) = 6

    let x = x - 2; // third time | (new new x) = 4

    println!("value of x is: {}", x);
}
```

#### shadowing vs mutable variables

this may be confusing, but this this two are different; by using the `let`
keyword to perform shadowing, you are now able to transform the value, changing
the data type is now even possible maintaining the _inmutability_ trait of the
variable

there are many use casesfor shadowing, it really depends on what you are doing.

here's a simple example:

```rust
let ident = "    ";      // 4 spaces | this is a string
let ident = ident.len(); // len() returns the amount of characters of the string
```

on the other hand this would not be possible:

```rust
let mut ident = "    "; // initially a variable of the String type
ident = ident.len();    // somehow wants to change from type String -> int ???
```

### data types

since _Rust_ is a statically typed language, it must know the types of all
variables at compile time. the compiler is **sometimes** able to infer what
type you want to use based on its value.

data types will be divided in two subsets:

- scalar
- compound

#### scalar type

scalar types represent a **single value**; the four primary scalar types are
**integers**, **floating-point** numbers, **booleans** and **characters**

##### integers `890`

| signed | un-signed | lenght   |
| ------ | --------- | -------- |
| i8     | u8        | 8 bits   |
| i16    | u16       | 16 bits  |
| i32    | u32       | 32 bits  |
| i64    | u64       | 64 bits  |
| i128   | u128      | 128 bits |
| isize  | usize     | _arch_   |

- `isize` and `usize` (_arch_) types depend on the machine the program is being
  executed, 32 bits if you are running a 32-bit machine or 64 bit if (...)

```rust
let unum: u8 = 11;
let inum: i16 = -10101;
// also possible
let inum: i16 = -10_101; // same as above, meant for readability
```

- _Rust_ defaults **integers** to `i32`

##### floating-point types `2x.877x`

`f32` type is single-precision, meanwhile `f64` type is double-precision float

| type | lenght  |
| ---- | ------- |
| f32  | 32 bits |
| f64  | 64 bits |

```rust
let decimal: f32 = 18.9;
```

- _Rust_ defaults **floating-points** to `f64` as modern on CPUs it's almost the same
  speed as `f32` with the trait of being more precise

##### booleans `true/false`

_Rust_'s booleans (just like many other languages) have two possible values

| type | value |
| ---- | ----- |
| bool | true  |
| bool | false |

```rust
let b: bool = false;
```

##### characters `'a'/'C'`

`char` in _Rust_ allows you to store literal symbols, in order to declare a
**character**, the literal must be surrounded by single quotes (`''`)

| type | value                        | lenght  |
| ---- | ---------------------------- | ------- |
| char | letters/emojis/unicode/ASCII | 32 bits |

```rust
let emoji = '🦂';
let c = 'A';
```

#### compound types

these are able to store multiple values into one type. _Rust_ has two primitive
compound types: **arrays** and **tuples**

##### tuples `()`

this compund type allows you to store together values with different types into
one compound type; **tuples** have a fixed lenght, once declared, they cannot
grow or shrink its size. denoted by `()`

```rust
let tup: (u8, i32, f64) = (11, 10_101, 18.9);
```

it is also possible to use pattern matching in order to destructure a tuple by
value and assign it independently:

```rust
let tup: (u8, i32, f64) = (11, 10_101, 18.9);
let (p, q, r) = tup;
// p: 11 | q: 10_101 | r: 18.9
```

interacting with **tuple** values can be done by using its indexes

```rust
let tup: (i32, f64, u8) = (100, 9.8, 0);

let f = tup.0; // 100
let t = tup.2; // 0
```

##### arrays `[]`

these are very similar to the **tuples**, the main difference is that are
values of the array must be the same type. denoted by `[]`
(_arrays in Rust are lenght-fixed, unlike other programming languages_)

```rust
let arr: [5, 6, 7, 8, 9];
let arr: [i32; 5] = [1, 2, 3, 4, 5]; // data type and lenght specified
let months = ["January", "February", "March", "April", "May", "June", "July",
              "August", "September", "October", "November", "December"];
```

it is also possible to create an array without explicitely specifying its
values; you can create an array of **5** elements like this

```rust
let arr: [0; 5];
```

interacting with **array** values can be done by using its indexes

```rust
let arr = [1, 2, 3, 4, 5];

let f = arr[0]; // 1
let t = arr[2]; // 3
```

## functions

_Rust_ uses **snake case** as naming convention for **functions** and
**variable** names; all words are lower-cased and words are separated by
underscore (`_`). functions in _Rust_ start with the `fn` keyword

```rust
fn main() {
    println!("hello from main");
    new_function();
}

fn new_function() {
    println!("hello from another function");
}
```

note that `new_function()` was defined under the `main()` function, this is not
neccesary, order does not matter

### parameters

**functions** are able to receive parameters, these are special variables used in
the functions themselves

in **function signatures**, specifying the type of each parameter is a must;
this is to ensure _Rust_ does exactly what you ask him to do

```rust
fn main() {
    println!("hey");
    new_function(11);
}

fn new_function(i: u8) {
    println!("heya, number is {}", i);
}
```

- you may also use as many parameters as you like, this can also be an example

  - ```rust
    fn another_function(p: i16, q: bool) { ... }
    ```

## references

| :books:                                                | :scroll:       | :black_nib:                          |
| ------------------------------------------------------ | -------------- | ------------------------------------ |
| [_The Rust Programming Language_](https://0x0.st/HYoI) | :pencil:       | [rust-lang.org](https://0x0.st/HYo6) |
| [_Let's Learn Rust_](https://0x0.st/HYoj)              | :movie_camera: | [Engineer Man](https://0x0.st/HYoe)  |

### examples/projects/etc

| :books:                                  | :scroll: | :black_nib:                          |
| ---------------------------------------- | -------- | ------------------------------------ |
| [_Rust by Example_](https://0x0.st/HkBo) | :pencil: | [rust-lang.org](https://0x0.st/HYo6) |

- :scroll::

  - media type:
  - :pencil: document
  - :movie_camera: video

- :black_nib::
  - author(s)

```

```
