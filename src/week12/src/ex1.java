public class ex1 {
    public int x =1;
    int y = 2;
    private int z =3;
    public void m1(){
        System.out.println("I am method 1");
    }
    void m2(){
        System.out.println("I am method 2");
    }
    private void m3(){
        System.out.println("I am method 3");
    }
    public static void main(String[] args) {
        ex1 e = new ex1();
        System.out.println(e.x);
        System.out.println(e.y);
        System.out.println(e.z);
        e.m1();
        e.m2();
        e.m3();
    }
}
