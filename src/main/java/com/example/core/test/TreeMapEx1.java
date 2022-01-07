package com.example.core.test;

import java.util.*;

public class TreeMapEx1 {
  public static void main(String[] args) {
    String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

    TreeMap map = new TreeMap();

    for (int i = 0; i < data.length; i++) {
      if (map.containsKey(data[i])) {
        Integer value = (Integer) map.get(data[i]);
        map.put(data[i], new Integer(value.intValue() + 1));
      }else {
        map.put(data[i], new Integer(1));
      }
    }
    Iterator<Object> it = map.entrySet().iterator();
    System.out.println("= 기본정렬 =");
    while (it.hasNext()) {
      Map.Entry<String, Integer> entry = (Map.Entry)it.next();
      int value = ((Integer) entry.getValue()).intValue();
      System.out.println(entry.getKey() + " : " + printB);
    }
    System.out.println();
    // map을 ArrayList로 변환한 다음에 Collections.sort() 정렬
    Set set = map.entrySet();
    List list = new ArrayList(set);

    //static void sort(List list, Comparator c)
    Collections.sort(list, new Value);
  }

  static class ValueComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
      return 0;
    }
  }

}
