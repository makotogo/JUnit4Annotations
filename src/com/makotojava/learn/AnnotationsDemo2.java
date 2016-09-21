package com.makotojava.learn;

public class AnnotationsDemo2 implements AnnotationsDemoInterface {

  @Override
  public Integer return1() {
    return Integer.valueOf(1);
  }

  @Override
  public Integer return2() {
    return 10 % 8;
  }

}
