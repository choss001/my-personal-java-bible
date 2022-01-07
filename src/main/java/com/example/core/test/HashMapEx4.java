package com.example.core.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx4 {
  public static void main(String[] args) {
    String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
    HashMap<String, Integer> map = new HashMap();
    for (int i = 0; i < data.length; i++) {
      if (map.containsKey(data[i])) {
        Integer value = map.get(data[i]);
        map.put(data[i], value.intValue() + 1);
      } else {
        map.put(data[i], i);
      }
    }
//    Iterator it = map.entrySet().iterator();
//    while (it.hasNext()) {
//      Map.Entry entry = (Map.Entry)it.next();
//      int value = ((Integer)entry.getValue()).intValue();
//      System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
//    }
    map.entrySet().stream()
        .forEach(i -> System.out.println(i.getKey() + " : " + printBar('#', i.getValue()) + " " + i.getValue() + "!!!!"));
  }

  public static String printBar(char ch, int value) {
    char[] bar = new char[value];
    for (int i = 0; i < bar.length; i++) {
      bar[i] = ch;
    }
    return new String(bar);
  }
}
