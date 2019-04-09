package io.github.morvell;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new SeniorDeveloper();
        Employee employee2 = new SeniorDeveloper(0);

        Employee employee3 = new Intern();

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());
    }
}
