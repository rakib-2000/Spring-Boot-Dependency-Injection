package com.rakx07;

import com.rakx07.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

		Student student1 = applicationContext.getBean(Student.class);
		student1.printDetails();

		/**
		 * If the student class had two Beans (in BeanConfiguration) then this way should be used.
		Student student2 = (Student) applicationContext.getBean("secondStudentBean");
		student2.printDetails();
		 */

	}

}
