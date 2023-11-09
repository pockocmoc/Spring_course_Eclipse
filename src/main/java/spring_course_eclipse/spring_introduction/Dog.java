package spring_course_eclipse.spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("prototype")
public class Dog implements Pet {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog() {
		super();
		System.out.println("Dog bean is created");
	}

	@Override
	public void say() {
		System.out.println("Bow-wow");

	}
	
	@PostConstruct
	private void init() {
		System.out.println("Class Dog: init method");

	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Class Dog: destroy method");

	}

}
