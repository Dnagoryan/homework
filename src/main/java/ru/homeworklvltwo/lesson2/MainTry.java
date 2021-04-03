package ru.homeworklvltwo.lesson2;

import java.lang.reflect.Array;

public class MainTry {
    private static final int ARRAY_SIZE = 4;
    private static final String MISTAKE_SIZE_ARRAY = "Ошибка. Массив должен быть 4х4.";
    private static final String MISTAKE_DATA_ARRAY = "Ошибка типа данных.";
    private static final String SUM_ELEM = "Сумма элементов:";

    public static void main(String[] args) {
        String[][] arrayValid = new String[][]
                {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};
        String[][] arrayErrSize = new String[][]
                {{"1", "2", "3", "4"},
                        {"13", "14", "15", "16"}};
        String[][] arrayErrData = new String[][]
                {{"1", "2", "Пролетела", "4"},
                        {"5", "и", "7", "8"},
                        {"9", "10", "упала", "12"},
                        {"13", "14", "на столе", "16"}};

        try {
            System.out.println(finish(arrayValid));

        } catch (MyArrayException myArrayException) {
            myArrayException.printStackTrace();
        }
        try {
            System.out.println(finish(arrayErrSize));
        } catch (MyArrayException myArrayException) {
            myArrayException.printStackTrace();
        }
        try {
            System.out.println(finish(arrayErrData));

        } catch (MyArrayException myArrayException) {
            myArrayException.printStackTrace();
        }
    }

    private static void checkSize(String[][] array) throws MyArraySizeException {
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException(MISTAKE_SIZE_ARRAY);
        }
        if (array[3].length != ARRAY_SIZE) {
            throw new MyArraySizeException(MISTAKE_SIZE_ARRAY);
        }
    }

    private static void checkInt(String[][] array) throws MyArrayDataException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(MISTAKE_DATA_ARRAY + "\n i: " + i + "; j: " + j);
                }
            }
        }
    }

    private static int sumElements(String[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += Integer.parseInt(array[i][j]);
            }
        }
        return result;
    }
    private static String finish(String[][] array)throws MyArrayException{
        checkSize(array);
        checkInt(array);
        return SUM_ELEM+" = "+sumElements(array);
    }
}







