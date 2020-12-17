package com.learning.core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Artur Chernov
 */
class StringExerciseTest {

    private final StringExercise stringExercise = new StringExerciseRomanImpl();

    @Test
    void getStringLength() {
        assertThat(stringExercise.getStringLength("Don't Panic")).isEqualTo(11);
        assertThat(stringExercise.getStringLength("Don't Panic")).isNotEqualTo(6);
    }

    @Test
    void countWords() {
        String text = "The Total Perspective Vortex derives its picture of the whole Universe on the principle " +
                "of extrapolated matter analyses.To explain — since every piece of matter in the Universe is in " +
                "some way affected by every other piece of matter in the Universe, it is in theory possible to " +
                "extrapolate the whole of creation — every sun, every planet, their orbits, their composition and " +
                "their economic and social history from, say, one small piece of fairy cake. The man who invented " +
                "the Total Perspective Vortex did so basically in order to annoy his wife";
        assertThat(stringExercise.countOfWords(text)).isEqualTo(93);
        assertThat(stringExercise.countOfWords("")).isEqualTo(0);
        assertThat(stringExercise.countOfWords("Roma")).isEqualTo(1);
        assertThat(stringExercise.countOfWords("Roma and pink pony")).isEqualTo(4);
        assertThat(stringExercise.countOfWords(" ")).isEqualTo(0);
        assertThat(stringExercise.countOfWords("        ")).isEqualTo(0);
    }

    @Test
    void removeDuplicates() {
        assertThat(stringExercise.removeDuplicates("Funny")).isEqualTo("Funy");
        assertThat(stringExercise.removeDuplicates("aaaaaa")).isEqualTo("a");
        assertThat(stringExercise.removeDuplicates("aaaaaa")).isNotEqualTo("b");
        assertThat(stringExercise.removeDuplicates("ababababababa")).isEqualTo("ab");
        assertThat(stringExercise.removeDuplicates("")).isEqualTo("");
    }

    @Test
    void countFrequencyOfChar() {
        String text = "He was staring at the instruments with the air of one who is trying to convert " +
                "Fahrenheit to centigrade in his head while his house is burning down";
        assertThat(stringExercise.countFrequencyOfChar(text, 'e')).isEqualTo(13L);
        assertThat(stringExercise.countFrequencyOfChar(text, 'a')).isEqualTo(7L);
        assertThat(stringExercise.countFrequencyOfChar(text, 'k')).isEqualTo(0L);
        assertThat(stringExercise.countFrequencyOfChar("", 'a')).isEqualTo(0L);
    }

    @Test
    void spaceInsert() {
        String inputText = "Shee,you guys are so unhip it’s a wonder your bums don’t fall off.";
        String outputText = "Shee, you guys are so unhip it’s a wonder your bums don’t fall off.";
        assertThat(stringExercise.spaceInsert(inputText)).isEqualTo(outputText);
    }
}