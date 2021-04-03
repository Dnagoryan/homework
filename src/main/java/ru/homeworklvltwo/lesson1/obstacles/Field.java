package ru.homeworklvltwo.lesson1.obstacles;

public class Field implements CourseInterface {
    private int distance;

    public Field(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
