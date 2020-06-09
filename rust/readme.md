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

variables in _Rust_ are inmutable by default

- ```rust
  let x = 11;     // inmutable
  let mut y = 11; // mutable
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
