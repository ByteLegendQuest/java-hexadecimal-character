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
        if (ch - 'a' >= 0 && ch - 'a' <= 9) {
            return true;
        } else if (ch - 'a' >= 0 && ch - 'f' <= 6) {
            return true;
        } else if (ch - 'A' >= 0 && ch - 'F' <= 6) {
            return true;
        }
        return false;
    }
}
