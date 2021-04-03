package ru.homeworklvltwo.lesson1.obstacles;

public class Elevation implements CourseInterface {
    private int height;

    public Elevation(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
