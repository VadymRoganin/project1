package com.other;

public class Data {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        Data other = (Data) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    public static void main(String[] args) {
        String s = "писечка";
        System.out.println(String.format("У меня есть %s и %s!", s,
                s.replace('п', 'с').replace('а', 'и')));
    }

}
