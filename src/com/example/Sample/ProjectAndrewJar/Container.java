package com.example.Sample.ProjectAndrewJar;

import java.util.HashSet;
import java.util.Set;

public class Container<i1,i2> {
//    i1 items1;
//    i2 item2;
//
//    public Container(i1 items1, i2 item2) {
//        this.items1 = items1;
//        this.item2 = item2;
//    }
//    public void printItem(){
//        System.out.println("Print the content of the container");
//        System.out.println("item 1:" +items1);
//        System.out.println("item 2: " +item2);
//    }
//
//    public i1 getItems1() {
//        return items1;
//    }
//
//    public i2 getItem2() {
//        return item2;
  //  }
public static void main(String[] args) {
    Set<String > set1 =new HashSet<>();
    set1.add("first");
    set1.add("second");
    set1.add("third");

    Set<String > set2 =new HashSet<>();
    set2.add("first");
    set2.add("makeni");
    set2.add("port loko");
     Set rep = union(set1,set2);
    System.out.println(rep);
}
    public static <E>Set<E> union(Set<E> set1,Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}