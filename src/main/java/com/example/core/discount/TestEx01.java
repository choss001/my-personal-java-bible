package com.example.core.discount;


import java.util.Vector;

import static ch.qos.logback.core.util.StatusPrinter.print;

public class TestEx01 {
  public static void main(String[] args) {
    Vector v = new Vector(5);
    v.add("1");
    v.add("2");
    v.add("3");
    print(v);

    v.trimToSize();
    System.out.println("=== After trimToSize() ===");
    print(v);

    v.ensureCapacity(6);
    System.out.println("=== After ensureCapacity(6) ===");
    print(v);

    v.setSize(7);
    System.out.println("=== After setSize(7) === ");
    print(v);

    v.clear();
    System.out.println("=== After clear() ===");
    print(v);

  }

  public static void print(Vector vector) {
    System.out.println(vector);
    System.out.println("size :" + vector.size());
    System.out.println("capacity :" + vector.capacity());
  }

}