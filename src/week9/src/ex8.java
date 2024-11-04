public class ex8 {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);


        System.out.println("Rectangle 1:");
        System.out.println("Width = " + rect1.width + ", Height = " + rect1.height);
        System.out.println("Area = " + rect1.getArea());
        System.out.println("Perimeter = " + rect1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + rect2.width + ", Height = " + rect2.height);
        System.out.println("Area = " + rect2.getArea());
        System.out.println("Perimeter = " + rect2.getPerimeter());
    }
}