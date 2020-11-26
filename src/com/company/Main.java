package com.company;

public class Main {

    public static void main(String[] args) {
        //TASK #1
        MyList<Integer> intList = new MyList();
        intList.add(9);
        intList.add(283097109);
        System.out.println("Array #1.1");
        intList.print();
        if(intList.getLargest() != null) {
            int maxInt = intList.getLargest();
            int minInt = intList.getSmallest();
            System.out.println("The largest number: " + maxInt);
            System.out.println("The smalles}t number: " + minInt);
        }
        System.out.println();

        MyList<Double> myList = new MyList();
        myList.add(9.3453);
        myList.add(0.983097109);
        System.out.println("Array #1.2");
        myList.print();
        if(myList.getLargest() != null) {
            double maxDouble = myList.getLargest();
            double minDouble = myList.getSmallest();
            System.out.println("The largest number: " + maxDouble);
            System.out.println("The getSmallest number: " + minDouble);
        }
        System.out.println();

        //TASK #2
        MyListComparable<Integer> intListComparable = new MyListComparable<>();
        intListComparable.add(7);
        intListComparable.add(983097109);
        System.out.println("Array #2.1");
        intListComparable.print();
        if(intListComparable.getLargest() != null) {
            int maxIntComparable = intListComparable.getLargest();
            int minIntComparable = intListComparable.getSmallest();
            System.out.println("The largest number of Comparable Integer List: " + maxIntComparable);
            System.out.println("The getSmallest number of Comparable Integer List: " + minIntComparable);
        }
        System.out.println();

        MyListComparable<String> stringListComparable = new MyListComparable<>();
        stringListComparable.add("Less amount of words");
        stringListComparable.add("There is more amount of words here");
        System.out.println("Array #2.2");
        stringListComparable.print();
        if(stringListComparable.getLargest() != null) {
            String maxStringComparable = stringListComparable.getLargest();
            String minStringComparable = stringListComparable.getSmallest();
            System.out.println("The largest number of Comparable String List: " + maxStringComparable);
            System.out.println("The getSmallest number of Comparable String List: " + minStringComparable);
        }
        System.out.println();

        //TASK #3
        String[] strings = {"hello", "world"};
        ElementsArray stringArray = new ElementsArray(strings);
        System.out.println("Array #3.1");
        stringArray.print();
        if(stringArray.getHighest() != null) {
            String maxStringArray = stringArray.getHighest();
            String minStringArray = stringArray.getLowest();
            System.out.println("\nThe largest number of Comparable String Array: " + maxStringArray);
            System.out.println("The getSmallest number of Comparable String Array: " + minStringArray);
        }

        Integer[] integers = {1, 2, 3, 4, 5};
        ElementsArray intArray = new ElementsArray(integers);
        System.out.println("Array #3.2");
        intArray.print();
        if(intArray.getHighest() != null) {
            String maxIntegerArray = intArray.getHighest();
            String minIntegerArray = intArray.getLowest();
            System.out.println("\nThe largest number of Comparable Integer Array: " + maxIntegerArray);
            System.out.println("The getSmallest number of Comparable Integer Array: " + minIntegerArray);
        }
    }
}
