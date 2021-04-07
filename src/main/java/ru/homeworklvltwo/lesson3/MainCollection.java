package ru.homeworklvltwo.lesson3;

import ru.homeworklvltwo.lesson1.obstacles.CourseInterface;

import java.util.*;
import java.util.stream.Stream;

public class MainCollection {

    public static void main(String[] args) {
    setOfWord();
    TelephoneBook telephoneBook=new TelephoneBook();
    telephoneBook.add("Кей","007");
    telephoneBook.add("Кей","008");
    telephoneBook.add("Джей","009");
        System.out.println(telephoneBook.getPhone("Кей").toString());
        System.out.println(telephoneBook.getPhone("Джей").toString());
    }

    public static void setOfWord() {

        List<String> word = new ArrayList<>(List.of("лосось", "камбала", "корюшка", "карась", "лосось", "камбала", "корюшка", "лосось", "камбала", "корюшка", "рыбки"));
        Map<String, Integer>  duplicate= new HashMap<>();
        for (int i = 0; i < word.size(); i++) {
            String si = word.get(i);
            int count = 1;
            for (int j = (1 + i); j < word.size(); j++) {
                String sj = word.get(j);
                if (si.equals(sj)) {
                    count++;
                    word.remove(j);
                    j--;
                }
            }
            if (count > 1) {
                duplicate.put(si, count);
                word.remove(i);
                i--;
            }
        }
        System.out.println("Уникальный список:\n"+ word);
        System.out.println("Дубликаты:\n"+duplicate);
        }
}



