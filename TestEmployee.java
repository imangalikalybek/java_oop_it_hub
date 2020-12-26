package com.company.oop;

// Imangali Kalybek

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(66, "Kairosh", "Suetolog", 300_000);

        System.out.println("id=" + e1.getId() +
                ", name=" + e1.getName() +
                ", salary=" + e1.getSalary() +
                ", annual salary=" + e1.getAnnualSalary());

        e1.setSalary(500_000);
        e1.raiseSalary(10);

        System.out.println(e1.toString());

    }
}
