package com.company;

public class Main {

    public static void main(String[] args) {
        
        // INT
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); // overflow
        int myMaxIntTest = 2147483647; // if you type a literal number larger than the max, you get an error in intellij
        int myMaxIntWithUnderscores = 2_147_483_647; // underscores are used in place of commas (if that is easier on the eyes)

        // BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min value = " + myMinByteValue);
        System.out.println("byte max value = " + myMaxByteValue);



    }
}
