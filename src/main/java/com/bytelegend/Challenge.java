package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("A is valid hex character: " + isValidHexCharacter('A'));
        System.out.println("0 is valid hex character: " + isValidHexCharacter('0'));
        System.out.println("G is valid hex character: " + isValidHexCharacter('G'));
    }

    /**
     * A valid character is: character 0-9 and character A/a/B/b/C/c/D/d/E/e/F/f (case-insensitive).
     *
     * <p>If the given character is a valid hex character, return `true`, otherwise return `false`.
     */
    public static boolean isValidHexCharacter(char ch) {

        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b' || ch == 'C' || ch == 'c' || ch == 'D' || ch == 'd' || ch == 'E' || ch == 'e' || ch == 'F' || ch == 'f';
    }
}
