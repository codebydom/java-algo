package com.codebydom.shellsort;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
// shell sort
// variation of insertion sort
// instertion sort chooses which element to insert using a gap of 1
// shell sort starts out using a larger gap value
//donald shell came up with this
// as the algo runs, the gap is reduced
//goal is to reduce the amount of shifting required
// the last gap value is always 1
// gap value of 1 is equivalent to insertion sort
// so the algo does preliminary work (using gap values greater than 1), and then becomes insertion sort
// by the time we get insertion sort, the array has been partially sorted, so theres less shifting required

