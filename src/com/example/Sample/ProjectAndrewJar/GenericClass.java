package com.example.Sample.ProjectAndrewJar;

public class GenericClass <T extends String,E extends  Number,K>{
    T mary;
    E ojuku;
    K kamara;

    public GenericClass(T mary, E ojuku, K kamara) {
        this.mary = mary;
        this.ojuku = ojuku;
        this.kamara = kamara;
    }

    public T getMary() {
        return mary;
    }

    public E getOjuku() {
        return ojuku;
    }

    public K getKamara() {
        return kamara;
    }
}
