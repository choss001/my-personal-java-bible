package com.example.core._02_factorymethod._02_after;

public interface ShipFactory {

  default Ship orderShip(String name, String email) {
//    validate(email);
//    prepareFor(name);
    return null;
  }


  private void validate(String name, String email) {

  }

  private static void prepareFor(String name) {
    System.out.println(name + " 만들 중비 중");
  }
}
