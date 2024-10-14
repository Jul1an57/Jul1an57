public class LabTask10 {
    public static void main(String[] args) {
        int sum = 0;
        int n =0;
        while(n<20){
            n++;
            sum = sum+n;
            if(sum>=100){
                break;
            }
            System.out.println("The n is"+n);
            System.out.println("The sum is"+sum);
        }
    }
}
