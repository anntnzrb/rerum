use crate::{file, util};
use std::io;

fn merge(files: &[file::File], output: &str, is_overwrite: bool) -> Result<file::File, io::Error> {
    file::File::create(
        output.to_owned(),
        files.iter().map(fmt_data).collect(),
        is_overwrite,
    )
}

fn fmt_data(file: &file::File) -> String {
    let separator = "=".repeat(16);
    format!(
        "{0} {1} STARTS HERE\n{2}\n{0} {1} ENDS HERE\n\n",
        separator, file.name, file.data
    )
}

pub fn run() {
    let args: Vec<String> = std::env::args().skip(1).collect();

    if args.is_empty() {
        eprintln!("Not enough arguments.");
        std::process::exit(1);
    }

    let files: Result<Vec<file::File>, io::Error> = args
        .iter()
        .filter_map(|f| util::is_file(f).then(|| file::File::new(f.to_string())))
        .collect();

    let name = String::from("merged.out");
    let is_overwrite = true;

    match files {
        Ok(files) => {
            match merge(&files, &name, is_overwrite) {
                Ok(_) => println!("=> Merged files into {}", name),
                Err(e) => {
                    eprintln!("=> Error: {}", e);
                    std::process::exit(1);
                }
            };
        }
        Err(e) => {
            eprintln!("Error reading file: {}", e);
            std::process::exit(1);
        }
    }
}
