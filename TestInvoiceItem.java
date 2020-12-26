package com.company.oop;

// Imangali Kalybek

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("969", "desc1", 8, 450);

        System.out.println("id=" + i1.getId() +
                ", desc=" + i1.getDesc() +
                ", qty=" + i1.getQty() +
                ", unit price=" + i1.getUnitPrice() +
                ", total=" + i1.getTotal());

        i1.setQty(5);
        i1.setUnitPrice(570);

        System.out.println(i1.toString());


    }
}
