package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertTrue(
                IntStream.range('0', '9' + 1)
                        .mapToObj(i -> (char) i)
                        .allMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('A', 'G')
                        .mapToObj(i -> (char) i)
                        .allMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('a', 'g')
                        .mapToObj(i -> (char) i)
                        .allMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('G', 'Z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Challenge::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('!', '0')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Challenge::isValidHexCharacter));
    }

    @Test
    public void noMagicNumbers() {
        String sourceCode = ProjectSourceFileReader.readAsString(Challenge.class);
        Assertions.assertTrue(
                Stream.of(
                                "48", "57", "65", "70", "97", "102", "0x30", "0x39", "0x41", "0x46",
                                "0x61", "0x66")
                        .noneMatch(sourceCode::contains));
    }
}
