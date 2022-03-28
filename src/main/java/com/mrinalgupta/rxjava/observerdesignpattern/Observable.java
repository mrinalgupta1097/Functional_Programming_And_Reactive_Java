package com.mrinalgupta.rxjava.observerdesignpattern;

public interface Observable {
    void subscribeObserver(Observer ob);
    void unsubscribeObserver(Observer ob);
    void notifyObserver();
}
