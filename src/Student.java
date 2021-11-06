import java.util.Objects;

public class Student {

   String name;
   int age;
   double course;
   Position position;


   enum Position {
       ENGINEER, DEVELOPER;
   }

   public Student(String name, int age, double course, Position position) {
      this.name = name;
      this.age = age;
      this.course = course;
      this.position = position;
   }

   @Override
   public String toString() {
      return name + " " + age + " " + course + " " + position;
   }

   public double getCourse() {
      return course;
   }

   public void setCourse(double course) {
      this.course = course;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return age == student.course && name == student.name;
   }


}
