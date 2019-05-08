package com.mycompany.test;

public class Calculator {

  pubic static void main(String[] args) {
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b));
  }

private static int sum(int a, int b) {
  return a + b;
}
private static int minus(int a, int b) {
  return a - b;
}
private static int multiplication(int a, int b) {
  return a * b;
}
private static int divide(int a, int b) {
  return a / b;
}
}
