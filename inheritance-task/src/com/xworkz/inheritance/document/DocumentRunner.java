package com.xworkz.inheritance.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new Document();
        document.documentAuthor();
        document.documentId();
        document.documentDate();
        document.documentTitle();
        document.documentType();

        Document document1 = new Invoice();
        document1.documentAuthor();
        document1.documentId();
        document1.documentDate();
        document1.documentTitle();
        document1.documentType();

        Invoice invoice = new Invoice();
        invoice.invoiceAmount();
        invoice.invoiceDate();
        invoice.invoiceNumber();
        invoice.invoiceRecipient();
        invoice.invoiceStatus();



    }
}
