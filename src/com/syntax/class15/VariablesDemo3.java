package com.syntax.class15;

public class VariablesDemo3 {
    static int num=5;
    String name;

    public static void main(String[] args) {

        VariablesDemo3 v1=new VariablesDemo3();
        v1.name="Nemanja";

        VariablesDemo3 v2=new VariablesDemo3();
        v2.name="Loki";

        VariablesDemo3 v3=new VariablesDemo3();
        v3.name="Katarina";

        System.out.println(v1.name);
       // System.out.println(v1.num);
        v1.num=10;
        v1.name="John";
        System.out.println(v2.name);
        System.out.println(v2.num);
    }
}