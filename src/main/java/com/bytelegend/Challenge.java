package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("A is valid hex character: " + isValidHexCharacter('A'));
        System.out.println("0 is valid hex character: " + isValidHexCharacter('0'));
        System.out.println("G is valid hex character: " + isValidHexCharacter('G'));
    }

    /**
     * A valid character is: charactehr 0-9 and character A/a/B/b/C/c/D/d/E/e/F/f (case-insensitive).
     *
     * <p>If the given character is a valid hex character, return `true`, otherwise return `false`.
     */
    public static boolean isValidHexCharacter(char ch) {
        char validChar = 48;
        for (; validChar < 58; validChar++) {
            System.out.println(validChar);
            if (validChar == ch) {
                return true;
            }
        }
        validChar = 65;
        for (; validChar < 71; validChar++) {
            System.out.println(validChar);
            if (validChar == ch) {
                return true;
            }
        }
        validChar = 97;
        for (; validChar < 103; validChar++) {
            System.out.println(validChar);
            if (validChar == ch) {
                return true;
            }
        }
        return false;
    }
}
;