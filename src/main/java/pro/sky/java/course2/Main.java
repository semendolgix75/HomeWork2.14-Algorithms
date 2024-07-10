package pro.sky.java.course2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.setArray(new String[]{"zero"});
        System.out.println(arrayList.add("one")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("two")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("three")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("four")+" size= "+arrayList.size() );
        System.out.println(arrayList.add(1,"four")+" = "+arrayList.get(1));
        System.out.println(arrayList.add(1,"two")+" = "+arrayList.get(1));
        System.out.println("arrayList.remove(\"one\") = " + arrayList.remove("one"));


    }
}