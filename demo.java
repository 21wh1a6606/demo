import java.util.Scanner;
public class GetStudentDetails
{
      public static void main(String args[])
      {
          String name;
          int roll, marks;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter marks : ");
          math=SC.nextInt();
 
           
          int total=math+eng+phy;
          float perc=(float)total/300*100;
           
          System.out.println("Roll Number:" + roll +"\tName: "+name);
          System.out.println("Marks "+marks);
        
            
      }
          
}
