package com.codebydom.array;

public class Main {

    public static void main(String[] args) {
	    int[] intArray =  new int[7]; // specifizing the data type, and the length of  array, it is not a dynamic array, only can be 7 in items size
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for (int i=0;i< intArray.length;i++){
            System.out.println(intArray[i]);
            if (intArray[i]==7){
                index = i;
                break;
            } // when trying to retrieve a element without knowing the position
        }
        System.out.println("index = " + index);

    }
}

// Big O is the measurement of how well an algorithm performs
// time it functions are not a good  measurement of a algo because of hardware the algo can be run on changes how well it
// it performs

// the number of steps it takes to complete an algorithm is the time complexity
// memory complexity is how much memory it takes to run a program, because this is not a problem with modern computer
// people are more interested in time complexity

// always look at the worst case of the algorithm to determine time complexity

// time complexity is O(n)
// linear time complexity


// big o values (order best to worst)

// O(1) = constant
// O(logn) = logarithmic
// O(n) = linear
// O(nlogn) = n log-star n
// O(n^2) = quadratic

// Arrays as a data structure, they  are stored at one continuous block in menu, they are not scattered, thats why we need to specify the length
// because the jvm assigns memory allocated for the memory
// every element occupies the same amount of space, every value in array occupies 4 bites
// if an array starts at memory address x, the size of each element in the array is y, we can calculate the memory address of the ith element by using the
// expression: x + i * y


//example of array above
// start address of array = 12, element size = 4 bytes

//address of array[0]=12
//address of array[1]=12 + (1*4) = 16
//address of array[2]=12 + (2*4) = 20
//address of array[3]=12 + (3*4) = 24
//address of array[4]=12 + (4*4) = 28

// arrays are memory efficient
// (retrieving element with index) from array is o(1), if we know the index to retrieve from

// (retrieve without index) so when looking for 7 in an array the O(n), a linear time complexity, worse cast going through all elements

// add an element to a full array is O(n)
// add an element to end of array (that has space) o(1)
// insert or update an element at a specific index o(1)
// delete an element by setting it to null o(1)
// delete an element by shifting elements o(n)









