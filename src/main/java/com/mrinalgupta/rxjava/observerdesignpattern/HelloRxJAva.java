package com.mrinalgupta.rxjava.observerdesignpattern;

import io.reactivex.Observable;

public class HelloRxJAva {
  public static void main(String[] args) {
    Observable<String> source =
        Observable.create(
            e -> {
              e.onNext("Hello");
              e.onNext("RxJava");
            });
    source.subscribe(e -> System.out.println("obersrver 1 : " + e));
    source.subscribe(e -> System.out.println("obeserver 2 : " + e));

    // Observer invokes the subscribe method present in the Observable interface to subscribe to
    // observable.
  }
}
