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
        // 获取字符的ascii码
        int ascii = (int) ch;
        // 如果ascii码在48-57之间，表示是数字0-9
        // 如果ascii码在65-70之间，表示是大写字母A-F
        // 如果ascii码在97-102之间，表示是小写字母a-f
        return (ascii > 47 && ascii < 58) || (ascii > 64 && ascii < 71) || (ascii > 96 && ascii < 103);
    }
}
