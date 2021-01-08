package com.codebydom.insertionsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};

        // unsorted index starts at one, increases each traverse
        for (int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i=firstUnsortedIndex;i>0 && intArray[i-1] > newElement;i--){
                intArray[i] = intArray[i-1]; // this is shifting the elements

            }
            intArray[i] = newElement; // stores value into new element
        }

        for (int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        } // no need for swap method because the algorithm shifts the elements
    }
}
// insertion sort
// partitions the array into sorted and unsorted however grow it from left to right
// selection sort grew it right to left
// it says the first element is sorted
// on each iteration, the next element gets inserted into the sorted array

// in place algorithm
// O(n^2) time complexity - quadratic
// it will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items

// stable algorithm
// shell short is a way to improve this algorithm


