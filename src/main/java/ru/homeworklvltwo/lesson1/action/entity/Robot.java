package ru.homeworklvltwo.lesson1.action.entity;

import ru.homeworklvltwo.lesson1.action.Actions;
import ru.homeworklvltwo.lesson1.action.Jump;
import ru.homeworklvltwo.lesson1.action.Run;

public class Robot implements Actions {
    private String name;
    private int maxDistanse;
    private int maxJump;

    public Robot(String name, int maxDistanse, int maxJump) {
        this.name = name;
        this.maxDistanse = maxDistanse;
        this.maxJump = maxJump;
    }


    @Override
    public boolean run(int distanceRun) {
        if (distanceRun<maxDistanse){
            System.out.println(name+" - пробежал");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int distanseHeight) {
        if (distanseHeight<maxJump)   {
            System.out.println(name+" - перепрыгнул");
            return true;
        }
        return false;
    }
}
