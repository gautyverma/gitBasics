package com.matuga;

public class Feature {
  private static int age = 0;

  public static int getAge() {
    return age;
  }

  public static void setAge(int age) {
    Feature.age = age;
  }

  public void display() {
    System.out.println("Cherry-pick-feature-dev-2");
  }
}
