package com.rakx07.configuration;

import com.rakx07.model.Computer;
import com.rakx07.model.Student;
import com.rakx07.model.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Bean class which controls the object creation.
In this case it'll first create supplier object and pass it to Computer method.
Computer method will take supplier object and create computer object and pass it to Student method.
Student method will take computer object and create student object.
 */

/**
This is inversion of control method. Means we're giving the access of creating object to another
 class which will automate the object creation process
 */
@Configuration // Makes it a configuration class and makes it available when the program executes.
public class BeanConfiguration {

    /*
    Bean annotation is used to make sure the below methods are used as bean/object creation
    Bean automatically uses Singleton design pattern.
    But with Scope annotation we can change it to "prototype" design pattern as well "@Scope("prototype")"
     */
    @Bean
    public Student student(Computer computer) {
        Student student = new Student();
        student.setName("Rakib");
        student.setComputer(computer);
        return student;
    }

    /**
     * While we need multiple Bean of the same class.
    //@Bean
    public Student secondStudentBean(Computer computer) {
        Student student = new Student();
        student.setName("Another");
        student.setComputer(computer);
        return student;
    }
     */

    @Bean
    public Computer computer(Supplier supplier) {
        Computer computer = new Computer();
        computer.setBrand("Apple");
        computer.setModel("Mac-Mini");
        computer.setSupplier(supplier);
        return computer;
    }

    @Bean
    public Supplier supplier() {
        Supplier supplier = new Supplier();
        supplier.setName("Apple Computers");
        supplier.setCountry("USA");
        return supplier;
    }
}
