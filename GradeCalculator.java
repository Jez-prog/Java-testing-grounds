import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args){
        Scanner coolestInput = new Scanner(System.in);


        System.out.print("Enter Student Name: ");
        String name = coolestInput.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubject = coolestInput.nextInt();

        double[] grades = new double[numSubject];
        double sum = 0;

        for (int i = 0; i < numSubject; i++){
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = coolestInput.nextDouble();
            sum += grades[i];
        }

        double average = sum / numSubject;



        String gradeConversion;
            if (average <= 1.2){
                gradeConversion = "You Are a Rizal's Lister";
            } else if(average <= 1.4){
                gradeConversion = "You Are a Chancellor's Lister";
            }else if(average <= 1.6){
                gradeConversion = "You Are a Deans' Lister";
            }else if(average <= 3){
                gradeConversion = "You Just Barely Passed and didn't Fail, youmfs";
            }else if(average <= 5 && average <= 4){
                gradeConversion = "bagsak ka!";
            }else{
                gradeConversion = "Only Applicable to 1-5 grading system. Please enter grades 1-5 only.";
            }

        System.out.println("\n-------Grade result-------\n");
        System.out.println("Student:" + (name));
        System.out.println("Average:" + String.format("%.2f", average));
        System.out.println(gradeConversion);
        
        
            
























    }
}