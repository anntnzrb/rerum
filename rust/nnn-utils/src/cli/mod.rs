use clap::Parser;

pub mod merge;

#[derive(Parser)]
#[command(author, version, about)]
pub struct Opts {
    #[clap(subcommand)]
    pub subcmd: SubCommand,
}

#[derive(Parser)]
pub enum SubCommand {
    /// Merge multiple files into one
    Merge(merge::Merge),
}
