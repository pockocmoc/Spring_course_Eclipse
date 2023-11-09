package spring_course_eclipse.spring_introduction;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
			Dog myDog = context.getBean("myPet", Dog.class);
			Dog yourDog = context.getBean("myPet", Dog.class);
			Dog ourDog = context.getBean("myPet", Dog.class);
			
			myDog.setName("Belka");
			yourDog.setName("Strelka");
			ourDog.setName("Laika");
			
			System.out.println(myDog.getName());
			System.out.println(yourDog.getName());
			System.out.println(ourDog.getName());

//			System.out.println(myDog == yourDog);
//			System.out.println(myDog);
//			System.out.println(yourDog);
			
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
