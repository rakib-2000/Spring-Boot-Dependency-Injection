package com.rakx07.configuration;

import com.rakx07.model.Computer;
import com.rakx07.model.Student;
import com.rakx07.model.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Student student(Computer computer) {
        Student student = new Student();
        student.setName("Rakib");
        student.setComputer(computer);
        return student;
    }

    /**
     * While we need multiple Bean of the same class.
    @Bean
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
