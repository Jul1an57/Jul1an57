public class labtask4 {
    public static void main(String[] args) {
        System.out.println("The grade is "+getGrade(78.5));
        System.out.println("\nThe grade is "+getGrade(59.5));
    }

    private static char getGrade(double v) {
        if(v>=90.0){
            return 'A';
        } else if (v>=80.0) {
           return 'B';
        } else if (v>=70.0) {
            return 'C';
        } else if (v>=60.0) {
            return 'D';
        }else {
            return 'F';
        }
    }
}
