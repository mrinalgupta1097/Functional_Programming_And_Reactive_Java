package com.mrinalgupta.rxjava.observerdesignpattern;

public class ObersverDesignPattern {
  public static void main(String[] args) {
    Book book = new Book("Goosebumps","Horror","XYZ", 200, "SoldOut");
    EndUser enduser1 = new EndUser("Bob", book);
    EndUser enduser2 = new EndUser("John", book);

    System.out.println(book.getInStock());
    book.setInStock("In stock");
    //
  }
}
