package com.company;

public class Main {

    public static void main(String[] args) {
        //TASK #1
        MyList<Integer> intList = new MyList();
        intList.add(9);
        intList.add(283097109);
        System.out.println("Array #1.1");
        intList.print();
        if (intList.getLargest() != null) {
            int maxInt = intList.getLargest();
            int minInt = intList.getSmallest();
            System.out.println("The largest number: " + maxInt);
            System.out.println("The smallest number: " + minInt);
        }
        System.out.println();

        MyList<Double> doubleList = new MyList();
        doubleList.add(9.3453);
        doubleList.add(0.983097109);
        System.out.println("Array #1.2");
        doubleList.print();
        if (doubleList.getLargest() != null) {
            double maxDouble = doubleList.getLargest();
            double minDouble = doubleList.getSmallest();
            System.out.println("The largest number: " + maxDouble);
            System.out.println("The smallest number: " + minDouble);
        }
        System.out.println();

        //TASK #2
        MyListComparable<Integer> intListComparable = new MyListComparable<>();
        intListComparable.add(7);
        intListComparable.add(983097109);
        System.out.println("Array #2.1");
        intListComparable.print();
        if (intListComparable.getLargest() != null) {
            int maxIntComparable = intListComparable.getLargest();
            int minIntComparable = intListComparable.getSmallest();
            System.out.println("The largest number of Comparable Integer List: " + maxIntComparable);
            System.out.println("The smallest number of Comparable Integer List: " + minIntComparable);
        }
        System.out.println();

        MyListComparable<String> stringListComparable = new MyListComparable<>();
        stringListComparable.add("Less amount of words");
        stringListComparable.add("There is more amount of words here");
        System.out.println("Array #2.2");
        stringListComparable.print();
        if (stringListComparable.getLargest() != null) {
            String maxStringComparable = stringListComparable.getLargest();
            String minStringComparable = stringListComparable.getSmallest();
            System.out.println("The largest number of Comparable String List: " + maxStringComparable);
            System.out.println("The smallest number of Comparable String List: " + minStringComparable);
        }
        System.out.println();

        //TASK #3
        String[] strings = {"hello", "world"};
        ElementsArray stringArray = new ElementsArray(strings);
        System.out.println("Array #3.1");
        stringArray.print();
        if (stringArray.getHighest().toString() != null) {
            String maxStringArray = stringArray.getHighest().toString();
            String minStringArray = stringArray.getLowest().toString();
            System.out.println("\nThe largest number of Comparable String Array: " + maxStringArray);
            System.out.println("The smallest number of Comparable String Array: " + minStringArray);
        }

        Integer[] integers = {1, 2, 3, 4, 5};
        ElementsArray intArray = new ElementsArray(integers);
        System.out.println("Array #3.2");
        intArray.print();
        if (intArray.getHighest() != null) {
            int maxIntegerArray = Integer.parseInt(intArray.getHighest().toString());
            int minIntegerArray = Integer.parseInt(intArray.getLowest().toString());
            System.out.println("\nThe largest number of Comparable Integer Array: " + maxIntegerArray);
            System.out.println("The smallest number of Comparable Integer Array: " + minIntegerArray);
        }
    }
}
