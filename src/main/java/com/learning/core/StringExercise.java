package com.learning.core;

/**
 * @author Artur Chernov
 */
public interface StringExercise {

    /**
     * Вернуть длинну входной строки
     */
    int getStringLength(String s);

    /**
     * Посчитать пол-во слов в тексте
     */
    int countOfWords(String s);

    /**
     * Удалить повторяющиеся симполы во входной строке и вернуть строку без повторений
     */
    String removeDuplicates(String s);

    /**
     * Посчитать кол-во вхождений указанного символа в строку
     */
    long countFrequencyOfChar(String s, Character ch);

    /**
     * Добавить в строку пробелы после знаков препинания, если они отсутствуют. В конце пробел ставить не надо.
     * Знаками препинания считаются следующие символы: '.',',','!','?',':'
     */
    String spaceInsert(String s);
}
