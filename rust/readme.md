# ![.](./lib/imgs/rust-logo.png) Rust programming notes

the `main()` function is mandatory, it is always the first code that runs
in every executable _Rust_ program

the `!` means you're calling a macro, therefore `println!` is a **macro**,
not a **function** or **method**

- compiling and running are two different things, _Rust_ is an ahead-of-time
  compiled language

  - this means you can give away the executable (binary) file to someone else
    and they will be able to execute the program without even having _Rust_
    installed

- compiling programs with `rustc` is fine for small projects, if you're
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

on the other hand this wouldn't be possible:

```rust
let mut ident = "    "; // initially a variable of the String type
ident = ident.len();    // somehow wants to change from type String -> int ???
```

## references

| :books:                                                | :scroll:       | :black_nib:                          |
| ------------------------------------------------------ | -------------- | ------------------------------------ |
| [_The Rust Programming Language_](https://0x0.st/HYoI) | :pencil:       | [rust-lang.org](https://0x0.st/HYo6) |
| [_Let's Learn Rust_](https://0x0.st/HYoj)              | :movie_camera: | [Engineer Man](https://0x0.st/HYoe)  |

- :scroll::

  - media type:
  - :pencil: document
  - :movie_camera: video

- :black_nib::
  - author(s)

```

```
