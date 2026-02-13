import java.util.*;

interface Resume {
     void displayInfo();
}

class Teacher implements Resume {
    private String name;
    private String subject;
    private int experienceYears;

    Teacher(String name, String subject, int experienceYears) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + subject);
System.out.println("Experience: " + experienceYears + " years");
    }

}


public class InterfaceResume {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      String subject = input.nextLine();
      int experienceYears = input.nextInt();
      Resume teacherResume = new Teacher(name, subject, experienceYears);
      teacherResume.displayInfo();
      input.close(); 

   }  
}
