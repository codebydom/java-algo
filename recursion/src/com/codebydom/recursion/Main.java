package com.codebydom.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));
    }
    public static int iterativeFactorial(int num) {
        if (num==0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    // how the factorials can be calculated recursively
    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // n! = n *(n - 1)!

    public static int recursiveFactorial(int num) {
        if (num==0){
            return 1;
        }
        return num * recursiveFactorial(num - 1); // there is a callstack because of this that is the stack of function calls to
        // get the final total call stack
    }

}

// a method is a recursive method when it calls itself
// an example can be a factorial algorithm, keep a repeating until num is equal to 0
// iterative is not recursion, its similar and can achieve the same result in certain cases

