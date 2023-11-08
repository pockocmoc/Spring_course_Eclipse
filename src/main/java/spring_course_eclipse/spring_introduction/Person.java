package spring_course_eclipse.spring_introduction;

public class Person {

	private Pet pet;

	public Person(Pet pet) {
		super();
		this.pet = pet;
	}

	public void callYourPet() {
		System.out.println("Hello, my lovely Pet!");
		pet.say();
	}

}
