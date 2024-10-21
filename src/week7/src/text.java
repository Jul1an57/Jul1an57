

public class text {
    public static void main(String[] args) {
        int i=5;
        int j=2;
        int k= max(i,j);
        System.out.println("the maximum of"+i+"and"+j+"is"+k);

    }
    public static int max(int n,int m){
       int r;
       if(n>m){
           r=n;
       }else{
           r=m;
       }
       return r;
    }
}
