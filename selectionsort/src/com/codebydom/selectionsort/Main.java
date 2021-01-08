package com.codebydom.selectionsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        for (int lastUnsortedIndex= intArray.length-1;lastUnsortedIndex >0;
             lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i<=lastUnsortedIndex;i++){
                if(intArray[i]>intArray[largest]){
                    largest = i; // sets the largest value to index if its bigger than current largest
                }
            }
            swap(intArray,largest,lastUnsortedIndex); // sorts based on the index of the largest
        }

        for (int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array,int i,int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; // this is the swap, what is at position i will now be at position j
    }
}

// this divides array into sorted and unsorted partitions
// keep track of the largest sorted element
// when you reach the end of the traverse you swap highest number with last index, then decrement the last unsorted index, and repeat

// selection sort
// inplace algorithm
// o(n^2) time complexity - quadratic
// it will take 100 steps to sort 10 items, 10,000 steps to sort 100, a million for 1000
// not as much swaping as bubble sort but still a lot of steps to compare
// unstable algorithm
