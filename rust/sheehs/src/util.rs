use std::path;

pub fn is_file(file: &String) -> bool {
    path::Path::new(file).is_file()
}
