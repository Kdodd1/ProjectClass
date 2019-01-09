public class ProjectTest{
    public static void main(String[]agrs){
        Project project1 = new Project();
        project1.setName("Do homework");
        project1.setDescription("Math Homework");
        Project project2 = new Project("Clean Room");
        project2.setDescription("Make my bed");
        Project project3 = new Project("Wash Car", "Take car to the car wash");
       
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}