package com.xworkz.inheritance.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document base = new Document();
        base.name = "Document Example";
        base.type = "General";
        base.display();
        base.get();

        Invoice sub = new Invoice();
        sub.name = "Invoice Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
