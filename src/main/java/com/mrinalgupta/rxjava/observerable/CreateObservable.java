package com.mrinalgupta.rxjava.observerable;

import io.reactivex.Observable;

import java.util.List;

public class CreateObservable {
  public static void main(String[] args) {
    //create
    Observable<Integer> source =
        Observable.create(
            emitter -> {
              emitter.onNext(10);
              emitter.onNext(11);
              emitter.onNext(12);
              emitter.onComplete();
            });
    source.subscribe(System.out::println);

//    just()
      Observable<Integer> just = Observable.just(1,2,3);
      just.subscribe(System.out::println);

//      from Iterable
      List<String> list = List.of("Mike", "John", "Adam");
      Observable<String> fromIterable = Observable.fromIterable(list);
      fromIterable.subscribe(System.out::println);
      list.add("Paul");
      fromIterable.subscribe(System.out::println);
  }
}
