import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Oleg", 24,1000, Student.Position.ENGINEER);
        Student student2 = new Student("Igor", 27,2000, Student.Position.ENGINEER);
        Student student3 = new Student("Alex", 50,3000, Student.Position.ENGINEER);
        Student student4 = new Student("Olga", 35,4000, Student.Position.DEVELOPER);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println(students);

       List<Student> unicEngineers = students.stream()
               .sorted(((o1, o2) -> (int) (o1.course - o2.course)))
               .collect(Collectors.toList());


       System.out.println(unicEngineers.size());

       String[] names = {"Igor", "Ignat", "Igor", "Aleksei"};

       Stream<String> stream = Arrays.stream(names);


       System.out.println(
               stream.filter(name -> name.startsWith("I"))
               .distinct()
               .collect(Collectors.joining(" и ", "Уникальные имена на букву \"И\": ", " получены"))
       );
       
    }
}
