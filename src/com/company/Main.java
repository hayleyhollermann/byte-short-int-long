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

        // SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short max value = " + myMaxShortValue);

        // LONG
        long myLongValue = 100L; // L declares it is a long value
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);
        long bigLongLiteralValue = 21474836477L; // L is not needed for a number that is within the int range - treated like an int

        // Arithmetic
        int myTotal = (myMinIntValue / 2);
        System.out.println("myTotal = " + myTotal);

        // Casting
        byte myNewByteValue = (byte)(myMinByteValue / 2); // casting - java uses int by default
        short myNewShortValue = (short)(myMinShortValue / 2);

    }
}
