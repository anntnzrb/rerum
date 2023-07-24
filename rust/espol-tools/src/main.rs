use espol_tools::app::grade::{
    component::{Component, ComponentType},
    grade::Grade,
};

fn main() {
    let c1 = Component {
        grade1: Some(48),
        grade2: Some(50),
        grade3: Some(0),
        weight: 70,
        component_type: ComponentType::Theorical,
    };

    let c2 = Component {
        grade1: Some(50),
        grade2: None,
        grade3: None,
        weight: 30,
        component_type: ComponentType::Practical,
    };

    let g = Grade::new(vec![c1, c2]);

    println!("Grade: {}", g.calc());
    println!("Can pass?: {}", g.can_pass());
    println!("You need {} to pass", g.get_needed_to_pass());
}
