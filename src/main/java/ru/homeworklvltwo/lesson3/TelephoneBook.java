package ru.homeworklvltwo.lesson3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    private final Map<String ,LinkedList<String>> phoneBook=new HashMap<>();


    public TelephoneBook() {
    }

    public void add (String surname, String phone) {

        if (!(phoneBook.containsKey(surname))) {
            LinkedList list = new LinkedList<>();
            list.add(phone);
            phoneBook.put(surname, list);
        } else if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phone);
        }
    }

    public List<String> getPhone(String surname){
        return phoneBook.get(surname);
    }
}

