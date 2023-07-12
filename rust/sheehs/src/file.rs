use std::{fs, io, io::ErrorKind};

use crate::util;

pub struct File {
    pub name: String,
    pub data: String,
}

impl File {
    pub fn new(name: String) -> Result<Self, io::Error> {
        let data = fs::read_to_string(&name)?;

        Ok(Self { name, data })
    }

    pub fn create(name: String, data: String, is_overwrite: bool) -> Result<File, io::Error> {
        if util::is_file(&name) && !is_overwrite {
            return Err(io::Error::new(
                ErrorKind::AlreadyExists,
                format!("File {} already exists.", name),
            ));
        }

        fs::write(&name, data)?;

        Self::new(name)
    }
}
