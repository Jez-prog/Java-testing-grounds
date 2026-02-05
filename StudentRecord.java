import java.util.Scanner;



public class StudentRecord {
    

    static String[] names = new String[50];
    static String[] id = new String [50];
    static double[] gpa = new double[50];
    static int studentCount = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void addStudent(){
      

        if (studentCount < 50){
           
           System.out.print("Enter Student Name: ");
           String studentNames = scanner.nextLine();

           System.out.print("Enter Student ID: ");
           String studentId = scanner.nextLine();
        
           System.out.print("Enter Student GPA: ");
           double studentGpa = scanner.nextDouble();
           scanner.nextLine();

           names[studentCount] = studentNames;
           id[studentCount] = studentId;
           gpa[studentCount] = studentGpa;

           studentCount++;

           System.out.print("Student added Successfully.");
           System.out.print("Total Students: " + (studentCount) + " \n");



        }else{
            System.out.print("Error: Cant add more students!");
        }

    }







    public static void main(String[] args){
        System.out.println("Student Reacord System");

        addStudent();
        addStudent();

        scanner.close();

        return;
    }






















    
}
