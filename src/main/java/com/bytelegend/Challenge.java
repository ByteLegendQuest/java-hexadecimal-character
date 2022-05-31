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
        if (ch >= '0' && ch <= '9') //属于0-9集合，返回是
            return true;
        if (ch >= 'A' && ch <= 'F') //属于A-F集合，返回是
            return true;
        if (ch >= 'a' && ch <= 'f') //属于a-f集合，返回是
            return true;
        return false; //否则，返回不是
    }
}
