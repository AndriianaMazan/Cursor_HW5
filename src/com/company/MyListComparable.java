package com.company;

import java.util.ArrayList;

public class MyListComparable<T extends Comparable> {
    private ArrayList<T> arrayList;

    public MyListComparable() {
        arrayList = new ArrayList<>();
    }

    public void add(T param) {
        arrayList.add(param);
    }

    public void print() {
        try {
            System.out.println();
            for (T i : arrayList)
                System.out.print(i + "; ");
            System.out.println("\b\b");
        } catch (NullPointerException e) {
            System.out.println("Seems like this ArrayList is empty.");
        }
    }

    public T getLargest() {
        T max = null;
        try {
            max = arrayList.get(0);
            for (T i : arrayList) {
                if (max.compareTo(i) < 0)
                    max = (T) i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something goes wrong... Seems like this ArrayList is empty.");
        } finally {
            return max;
        }
    }

    public T getSmallest() {
        T min = null;
        try {
            min = arrayList.get(0);
            for (T i : arrayList) {
                if (min.compareTo(i) > 0)
                    min = (T) i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something goes wrong... Seems like this ArrayList is empty.");
        } finally {
            return min;
        }
    }
}
