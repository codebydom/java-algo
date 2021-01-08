package com.codebydom.bubblesort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22}; // define int array to be sorted

        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){ // repeating the traverses
            for(int i=0;i<lastUnsortedIndex;i++){ // traversing through the array
                if (intArray[i] > intArray[i+1]){ // doing the comparison of each number while traversing the array
                    swap(intArray,i,i+1); // calling the swap method bellow
                }
            }
        }
        for (int i = 0; i< intArray.length;i++){
            System.out.println(intArray[i]); // printing out the results
        }
    }
    public static void swap(int[] array,int i,int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; // this is the swap, what is at position i will now be at position j

    }// swap that takes in three args (array being traversed thru, the current index, the index infront of i (j))
}

// algorithm degrades quickly as the array grows
// as it progresses, it creates a sorted partition and an unsorted partition
// as i increases, it compare the current array[i] to array[i+1], it bigger, swaps, if not, goes to next index
// the traverse will happen until array[i+1] is always bigger than array[i] through a whole traverse

// bubble sort
// in place algorithm
// O(n^2) time complexity, quadratic
// it will take 100 steps to sort 10 items, 10,000 steps to sort 100 item, 1,000,000 to sort 10000 items

// stable vs unstable sort algorithms
// this happens when you have duplicate values in the array trying to be sorted
// when the same elements in the array are not sorted by relativity then it is an unstable sort
// stable sort is better than an unstable sort




