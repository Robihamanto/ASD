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
public class QuickSorter {

    private int[] L = {29, 27, 10, 8, 76, 21};
    private static int count = 1;

    public void quickSort() {
        recoursiveQuickSort(L, 0, (L.length - 1));
        System.out.println("Langkah " + count);
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i] + " index:" + (i + 1));
        }
        print();
    }

    private void recoursiveQuickSort(int array[], int startIdx, int endIdx) {
        int i = startIdx;
        int z = endIdx;
        if (endIdx - startIdx >= 1) {
            int pivot = array[startIdx];
            while (z > i) {
                System.out.println("Langkah " + count);
                while (array[i] <= pivot && i <= endIdx && z > i) {
                    i++;
                }
                while (array[z] > pivot && z >= startIdx && z >= i) {
                    z--;
                }
                if (z > i) {
                    swap(array, i, z);
                }
                for (int j = 0; j < L.length; j++) {
                    System.out.println(array[j] + " index:" + (j + 1));
                }
                count++;
            }
            swap(array, startIdx, z);
            recoursiveQuickSort(array, startIdx, z - 1);
            recoursiveQuickSort(array, z + 1, endIdx);
        } else {
            return;
        }
    }

    private void swap(int array[], int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public void print() {
        System.out.println("Hasil Akhir : ");
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i] + " index : " + (i + 1));
        }
    }

    public static void main(String j[]) {
        QuickSorter sorter = new QuickSorter();
        System.out.println("-[ Quick Sorter ]-");
        sorter.quickSort();
    }
}
