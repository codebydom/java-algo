package com.codebydom.shellsort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = {20,35,-15,7,55,1,-22};

        for (int gap = intArray.length/2;gap>0;gap/=2){ // determining the gap value
            for(int i = gap; i< intArray.length;i++){ // interating thru the array
                int newElement = intArray[i];
                int j = i;
                while(j>=gap && intArray[j-gap]> newElement){
                    intArray[j] = intArray[j-gap]; // using the gap to jump place to place while still within the length of the array
                    j-=gap;
                }
                intArray[j] = newElement; // element getting switched
            }
        }
        for (int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
// shell sort
// variation of insertion sort
// instertion sort chooses which element to insert using a gap of 1
// shell sort starts out using a larger gap value
// donald shell came up with this
// as the algo runs, the gap is reduced
// goal is to reduce the amount of shifting required
// the last gap value is always 1
// gap value of 1 is equivalent to insertion sort
// so the algo does preliminary work (using gap values greater than 1), and then becomes insertion sort
// by the time we get insertion sort, the array has been partially sorted, so theres less shifting required

// knuth sequence calculate the gap value using (3^k-1)/2, k is the length of the array
// we want the gap to e close as possible to the length of the array we want to sort without going over

// in place algorithm, difficult to nail down the time complexity cause it will depend on the gap, worst case O(n^2), but it can
// perform much better than that
// doesnt require as much shifting as insertion sort so it usually performs better
// unstable algorithm

