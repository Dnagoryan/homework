package ru.homeworklvltwo.lesson1.action;

import ru.homeworklvltwo.lesson1.action.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public ArrayList<Actions> getGroupList() {
        return groupList;
    }

    private final ArrayList<Actions> groupList=new ArrayList<>();
    private final ArrayList<Actions> resultList=new ArrayList<>();

    public Team() {

    }


}
