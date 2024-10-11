
import java.util.Scanner;//Scanner is in the java.util package
public class ComputeAreaWithIfElse {
    public static void main(String[]args){//Create a Scanner object
        Scanner input =new Scanner(System.in);//Prompt a user to enter a radius
        System.out.print("Enter a number for radius;");
        double radius =input.nextDouble();
        if(radius >=0){
            double area =radius *radius *3.14159;
            System.out.println("The area for the circle of radius "+radius +" is "+area);
            input.close();
        }else {
            System.out.println("Negative input");
        }
    }
}
