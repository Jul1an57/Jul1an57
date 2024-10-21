public class example7 {
    public static void main(String[] args) {
        System.out.println("The maximum od 3 and 4 is "+max(3,4));
        System.out.println("The maximum od 3.0 and 5.4 is "+max(3.0,5.4));
        System.out.println("The maximum od 3.0,5.4 and 10.14 is "+max(3.0,5.4,10.14));
    }

    public static int max(int i, int i1) {
        if(i>i1){
            return i;
        }else {
            return i1;
        }
    }
    public static double max(double n,double m){
        if(n>m){
            return n;
        }else {
            return m;
        }
    }
    public static double max(double n,double m,double q){
        return max(max(n,m),q);
    }
}
