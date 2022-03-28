package com.mrinalgupta.rxjava.observerdesignpattern;

public class EndUser implements Observer {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndUser(String name, Observable observable) {
    this.name = name;
    observable.subscribeObserver(this);
  }

  @Override
  public void update(String avail) {
    System.out.println("Hello " + name + "! We are glad to notify you that book is now " + avail);
  }
}
