use clap::Parser;
use std::ffi::OsString;
use std::path::PathBuf;

#[derive(Parser)]
pub struct Merge {
    #[arg(
        value_parser(clap::value_parser!(PathBuf)), 
        required = true,
        help = "The files to merge. Multiple files can be specified."
    )]
    pub files: Vec<PathBuf>,

    #[arg(
        short, 
        long, 
        value_parser(clap::value_parser!(OsString)), 
        required = true,
        help = "The output file path. A single output file path needs to be specified."
    )]
    pub output: OsString,
}
