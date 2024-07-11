package pro.sky.java.course2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//        arrayList.setArray(new String[]{"zero"});
        System.out.println(arrayList.add("one")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("two")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("three")+" size= "+arrayList.size() );
        System.out.println(arrayList.add("four")+" size= "+arrayList.size() );
        System.out.println(arrayList.add(1,"four"));
        System.out.println(arrayList.add(1,"two"));
        System.out.println("arrayList.remove(item) = " + arrayList.remove("one"));
        System.out.println("arrayList.remove(index) = " + arrayList.remove(3));
        System.out.println("arrayList.contains(item) = " + arrayList.contains("three"));
        System.out.println("arrayList.indexOf() = " + arrayList.indexOf("three"));
        System.out.println("arrayList.lastIndexOf() = " + arrayList.lastIndexOf("three"));
        System.out.println("arrayList.get() = " + arrayList.get(3));

        List<String> list1 = List.of("one", "two", "three");
        List<String> otherList = List.of("one", "two", "three");
        System.out.println("list.equals(otherList) = " + list1.equals(otherList));
        System.out.println("list1.size() = " + list1.size());
    }
}