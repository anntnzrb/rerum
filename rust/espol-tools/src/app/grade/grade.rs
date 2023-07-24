use crate::app::grade::component::Component;

pub struct Grade {
    components: Vec<Component>,
}

impl Grade {
    pub fn new(components: Vec<Component>) -> Self {
        Self { components }
    }

    pub fn calc(&self) -> u8 {
        self.components.iter().map(|c| c.calc()).sum()
    }

    pub fn can_pass(&self) -> bool {
        self.calc() >= 60
    }

    pub fn get_needed_to_pass(&self) -> u8 {
        60 - self.calc()
    }
}
