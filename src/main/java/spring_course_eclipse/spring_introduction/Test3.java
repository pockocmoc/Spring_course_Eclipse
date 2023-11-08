package spring_course_eclipse.spring_introduction;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		//		Pet pet = new Cat();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Pet pet = context.getBean("myPet", Pet.class);
			Person person = new Person(pet);
			person.callYourPet();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
