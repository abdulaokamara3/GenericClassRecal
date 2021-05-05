package com.example.Sample.ProjectAndrewJar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Collection {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(12);
        values.add(12);
        values.add(1,9000);

        values.add(12);


        for (int gg:values){
            System.out.println("the values are: "+gg);
        }



    }


}
