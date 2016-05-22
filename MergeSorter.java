/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Robi
 */
public class MergeSorter {

    private int[] L = {29, 27, 10, 8, 76, 21};
    private int[] temp;
    private static int count = 1;

    public void mergeSort() {
        this.temp = new int[L.length];
        recursiveMergeSort(0, L.length - 1);
        System.out.println("Langkah " + count);
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i] + " index:" + (i + 1));
        }
        print();
    }

    private void recursiveMergeSort(int lowerIdx, int higherIdx) {
        if (lowerIdx < higherIdx) {
            int middle = lowerIdx + (higherIdx - lowerIdx) / 2;
            recursiveMergeSort(lowerIdx, middle);
            recursiveMergeSort(middle + 1, higherIdx);
            System.out.println("Langkah " + count);
            mergeParts(lowerIdx, middle, higherIdx);
        }
    }

    private void mergeParts(int lowerIdx, int middle, int higherIdx) {
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i] + " index:" + (i + 1));
        }
        for (int i = lowerIdx; i <= higherIdx; i++) {
            temp[i] = L[i];
        }
        int i = lowerIdx;
        int j = middle + 1;
        int k = lowerIdx;
        while (i <= middle && j <= higherIdx) {
            if (temp[i] <= temp[j]) {
                L[k] = temp[i];
                i++;
            } else {
                L[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            L[k] = temp[i];
            k++;
            i++;
        }
        ++count;
    }

    public void print() {
        System.out.println("Hasil Akhir : ");
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i] + " index : " + (i + 1));
        }
    }

    public static void main(String j[]) {
        MergeSorter sorter = new MergeSorter();
        System.out.println("-[ Merge Sorter ]-");
        sorter.mergeSort();
    }
}
