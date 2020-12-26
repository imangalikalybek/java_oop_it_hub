package com.company.oop;

// Imangali Kalybek

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("45", "home", 1000);

        System.out.println("id=" + a1.getId() +
                ", name=" + a1.getName() +
                ", balance=" + a1.getBalance());

        a1.credit(5000);
        a1.debit(1000);
        a1.transferTo(a1, 7000);

        System.out.println(a1.toString());

    }
}
