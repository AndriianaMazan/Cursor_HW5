package com.company;

import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> arrayList;

    public MyList() {
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
                if (max.doubleValue() < i.doubleValue())
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
                if (min.doubleValue() > i.doubleValue())
                    min = (T) i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something goes wrong... Seems like this ArrayList is empty.");
        } finally {
            return min;
        }
    }
}
