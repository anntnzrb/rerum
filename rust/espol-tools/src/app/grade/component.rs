pub enum ComponentType {
    Theorical,
    Practical,
}

pub struct Component {
    pub grade1: Option<u8>,
    pub grade2: Option<u8>,
    pub grade3: Option<u8>,
    pub weight: u8,
    pub component_type: ComponentType,
}

impl Component {
    pub fn calc(&self) -> u8 {
        let grades = vec![self.grade1, self.grade2, self.grade3]
            .iter_mut()
            .filter_map(|g| g.as_ref())
            .cloned()
            .collect::<Vec<_>>();

        match self.component_type {
            ComponentType::Theorical => self.get_total(self.get_avg_best_grades(&grades)),
            ComponentType::Practical => self.get_total(self.get_avg_best_grades(&grades)),
        }
    }

    fn get_avg_best_grades(&self, grades: &Vec<u8>) -> u8 {
        if grades.len() == 1 {
            return grades[0];
        }

        let mut sorted_grades = grades.clone();
        sorted_grades.sort_unstable();

        let g1 = sorted_grades.pop().unwrap_or_default();
        let g2 = sorted_grades.pop().unwrap_or_default();

        (g1 + g2) / 2
    }

    pub fn get_total(&self, grade: u8) -> u8 {
        (grade as f32 * self.weight as f32 / 100.0).ceil() as u8
    }
}
