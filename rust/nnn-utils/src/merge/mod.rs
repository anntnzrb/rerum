use color_eyre::eyre::Result;
use std::fs::{self, File};
use std::io::Write;
use std::path::PathBuf;

pub fn merge_files(files: Vec<PathBuf>, output: PathBuf) -> Result<()> {
    let mut output_file = File::create(&output)?;

    for file in files {
        match file.metadata() {
            Ok(meta) if meta.is_file() => {
                let content = fs::read_to_string(&file)?;
                writeln!(
                    output_file,
                    "{}",
                    fmt_file(&file.display().to_string(), &content)
                )?;
            }
            _ => println!("Skipping '{}', it is not a file.", file.display()),
        }
    }

    println!("Files have been merged into '{}'", output.display());

    Ok(())
}

fn fmt_file(file_name: &str, content: &str) -> String {
    let delim = "=".repeat(16);

    format!(
        "{0} FILE: {1} STARTS HERE\n{2}\n{0} {1} ENDS HERE\n",
        delim, file_name, content
    )
}
