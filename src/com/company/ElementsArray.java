package com.company;

public class ElementsArray<T extends Comparable<T>> {
    private T[] array;

    public ElementsArray(T[] array) {
        this.array = array;
    }

    public void print() {
        try {
            for (T i : array)
                System.out.print(i + "; ");
            System.out.print("\b\b");
        } catch (NullPointerException e) {
            System.out.println("Seems like this ArrayList is empty.");
        }
    }

    public T getHighest() {
        T max = null;
        try {
            max = array[0];
            for (T i : array) {
                if (max.compareTo(i) < 0)
                    max = (T) i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something goes wrong... Seems like this ArrayList is empty.");
        } finally {
            return max;
        }
    }

    public T getLowest() {
        T min = null;
        try {
            min = array[0];
            for (T i : array) {
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
