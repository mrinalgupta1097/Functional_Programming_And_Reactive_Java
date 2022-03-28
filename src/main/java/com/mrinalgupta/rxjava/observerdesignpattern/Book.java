package com.mrinalgupta.rxjava.observerdesignpattern;

import java.util.ArrayList;

public class Book implements Observable {
  private String name;
  private String type;
  private String author;
  private double price;
  private String inStock;
  private ArrayList<Observer> obsList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getInStock() {
    return inStock;
  }

  public void setInStock(String inStock) {
    this.inStock = inStock;
    System.out.println("Availability changes from out of stock to in stock \n");
    notifyObserver();
  }

  public ArrayList<Observer> getObsList() {
    return obsList;
  }

  public void setObsList(ArrayList<Observer> obsList) {
    this.obsList = obsList;
  }

  public Book(String name, String type, String author, double price, String inStock) {
    this.name = name;
    this.type = type;
    this.author = author;
    this.price = price;
    this.inStock = inStock;
  }

  @Override
  public void subscribeObserver(Observer ob) {
    obsList.add(ob);
  }

  @Override
  public void unsubscribeObserver(Observer ob) {
    obsList.remove(ob);
  }

  @Override
  public void notifyObserver() {
    System.out.println(
        "Book Name : "
            + this.name
            + ",Book Type : "
            + this.type
            + ",Price : "
            + this.price
            + ",Author : "
            + this.author
            + ", is now "
            + this.inStock
            + ". So please notifyall users. \n");
    for (Observer o : obsList) {
      o.update(this.inStock);
    }
  }
}
