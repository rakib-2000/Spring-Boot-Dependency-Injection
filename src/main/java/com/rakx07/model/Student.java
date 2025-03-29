package com.rakx07.model;

public class Student {

    private String name;
    private Computer computer;

    public Student() {
        System.out.println("No arg constructor called - Student Class");
    }

    public Student(String name, Computer computer) {
        System.out.println("All arg constructor called - Student Class");
        this.name = name;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void printDetails() {
        System.out.println("Student " + name + " has a computer of " + computer.getBrand() + " brand.");
        this.computer.printDetails();
    }
}
