import com.workintech.university.*;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        Faculty engineeringFaculty = new Faculty(1, "Engineering", "Dec 7, 2024", "Izmir", "Mr.Paul");
        Faculty iktisadiBirimlerFakultesi = new Faculty(2, "Iktisadi Birimler Fakultesi", "Dec 7, 2024", "Izmir", "Mr.Remedy");

        Department comptEngineering = new ComputerEngineering(1, "Computer Engineering", "Mr.Klein", engineeringFaculty);
        Department electricalEngineering = new ElectricalEngineering(3, "Electrical Engineering", "Mr.Ahmet", engineeringFaculty);

        //Department medicalDept = new Medical(2, "Medical", "Mr.Tali", iktisadiBirimlerFakultesi);

        //iktisadiBirimlerFakultesi.addDepartment(comptEngineering);
        //iktisadiBirimlerFakultesi.getDepartments().add(comptEngineering);

        Course introToProgramming = new Course(1, "Intro to Programming", 4.0, comptEngineering);
        comptEngineering.addCourse(introToProgramming);
        Course algorithms = new Course(2, "Algorithms", 3.4, comptEngineering);
        comptEngineering.addCourse(algorithms);

        Course dataStructures = new Course(4, "Data Structures", 6.0, comptEngineering);
        comptEngineering.addCourse(dataStructures);

        Course microChipProgramming = new Course(3, "Microchip Programming", 5.0, electricalEngineering);
        electricalEngineering.addCourse(microChipProgramming);
        //comptEngineering.addCourse(course);

        //medicalDept.addCourse(course);

        //Instructor instructor = new PhdInstructor();
        // course.addInstructor(instructor);

        engineeringFaculty.addDepartment(comptEngineering);
        engineeringFaculty.addDepartment(electricalEngineering);

        System.out.println("Faculty : " + engineeringFaculty.getName());

        for(Department dept : engineeringFaculty.getDepartments()){
            System.out.println("   Department : " + dept.getName());
            for(Course course: dept.getCourses()){
                System.out.println("      Course : " + course.getName());
            }
        }

        //Collections.reverseOrder()
        Set<Course> courseSet = new TreeSet<>(new CourseSortedByID());
        courseSet.add(microChipProgramming);
        courseSet.add(dataStructures);
        courseSet.add(introToProgramming);
        courseSet.add(algorithms);
        System.out.println(courseSet);

    }
}