package ru.homeworklvltwo.lesson1;

import ru.homeworklvltwo.lesson1.action.Actions;
import ru.homeworklvltwo.lesson1.action.Jump;
import ru.homeworklvltwo.lesson1.action.Team;
import ru.homeworklvltwo.lesson1.action.entity.Cat;
import ru.homeworklvltwo.lesson1.action.entity.Human;
import ru.homeworklvltwo.lesson1.action.entity.Robot;
import ru.homeworklvltwo.lesson1.obstacles.Course;
import ru.homeworklvltwo.lesson1.obstacles.CourseInterface;
import ru.homeworklvltwo.lesson1.obstacles.Elevation;
import ru.homeworklvltwo.lesson1.obstacles.Field;

import java.util.Objects;

public class MainApp {
    public static void main(String[] args) {
    Team team=new Team();
    team.getGroupList().add(new Cat("Борис", 5,5));
    team.getGroupList().add(new Human("Иисус",999,999));
    team.getGroupList().add(new Robot("R2-D2", 999,0));
    team.getGroupList().add(new Cat("Meow",7,7));
        Course course=new Course();
        course.getCourseList().add( new Elevation(6));
        course.getCourseList().add(new Field(6));

    course.doIt(team);

    }
}
