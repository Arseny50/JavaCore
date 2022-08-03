package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Student> result = getListOfStudent(5, 3);

        //The first objective
        result.stream().flatMap(student -> student.getCourseList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourseList().stream()).collect(Collectors.toSet());

        //The second objective
        result.stream().sorted((student1, student2) -> student1.getCourseList().size() - student2.getCourseList().size()).limit(3).collect(Collectors.toList());

        //The third objective
        Course paramCourse = new Course("course 1");
        result.stream().filter(student -> student.getCourseList().contains(paramCourse)).collect(Collectors.toList());

        System.out.println();
    }

    private static List<Student> getListOfStudent ( int j, int m){
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < j; i++) {
            ArrayList<Course> courses = new ArrayList<>();
            for (int h = 0; h < m; h++) {
                courses.add(new Course("course" + h));
            }
            result.add(new Student("student" + i, courses));
        }
        return result;
    }




}
