package ru.homeworklvltwo.lesson1.obstacles;

import ru.homeworklvltwo.lesson1.action.Actions;
import ru.homeworklvltwo.lesson1.action.Team;
import ru.homeworklvltwo.lesson1.action.entity.Cat;

import java.util.ArrayList;

public class Course  {
    public ArrayList<CourseInterface> getCourseList() {
        return courseList;
    }

    public Course() {
    }

    private final ArrayList<CourseInterface> courseList=new ArrayList<>();

    public void  doIt(Team team){
        for (int i = 0; i <courseList.size(); i++) {
            for (int j = 0; j < team.getGroupList().size(); j++) {
                Actions team1 =  team.getGroupList().get(j);

            if (courseList.get(i) instanceof Elevation){

               Elevation elevation= (Elevation) courseList.get(i);

              if (!(team1.jump(elevation.getHeight()))){
                  team.getGroupList().remove(j);
                  j--;
              }
            }

                if (courseList.get(i) instanceof Field) {
                    Field field = (Field) courseList.get(i);
                    team1.run(field.getDistance());
                }

            }
        }

    }
}
