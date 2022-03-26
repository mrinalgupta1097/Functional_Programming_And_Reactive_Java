package com.mrinalgupta.rxjava.callbacks;

public interface CallBack {
  void pushData(String data);

  void pushComplete();

  void pushError(Exception ex);
  //    void call();
}
