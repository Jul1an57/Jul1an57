public class ex2 {
    private boolean x;

    public static void main(String[] args) {
    ex2 object1 = new ex2();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }

    private int convert() {
        return x?1:-1;
    }
}
