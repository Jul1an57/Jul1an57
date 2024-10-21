public class example2 {
    public static void main(String[] args) {
        System.out.println("The grade is ");
        printGrade(78.5);
        System.out.println("The grade is ");
        printGrade(59.5);
    }

    private static void printGrade(double v) {
        if(v>=90.0){
            System.out.println('A');
        } else if (v>=80.0) {
            System.out.println('B');
        } else if (v>=70.0) {
            System.out.println('C');
        } else if (v>=60.0) {
            System.out.println('D');
        }else {
            System.out.println('F');
        }
    }
}
