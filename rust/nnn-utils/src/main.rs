use clap::Parser;
use color_eyre::eyre::Result;
use nnn_utils::{
    cli::{Opts, SubCommand::Merge},
    merge::merge_files,
};

fn main() -> Result<()> {
    color_eyre::install()?;

    let opts = Opts::parse();

    match opts.subcmd {
        Merge(m) => {
            merge_files(m.files, m.output.into())?;
        }
    }

    Ok(())
}
