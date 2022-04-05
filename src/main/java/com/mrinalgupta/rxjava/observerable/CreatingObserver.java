package com.mrinalgupta.rxjava.observerable;

import io.reactivex.Observable;

public class CreatingObserver {
  public static void main(String[] args) {
    //
    Observable<String> source = Observable.just("Orange", "Black", "Green");
    source.subscribe(
            System.out::println,
        Throwable::printStackTrace,
        () -> System.out.println("completed"));
    System.out.println();

    source.subscribe(System.out::println, Throwable::printStackTrace);

    System.out.println();

    source.subscribe(System.out::println);
  }
}
