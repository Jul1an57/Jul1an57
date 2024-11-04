public class ex2 {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        System.out.println("The area of the circle of radius "+cir1.radius+" is "+cir1.getArea());
        Circle cir2 = new Circle(25);
        System.out.println("The area of the circle of radius "+cir2.radius+" is "+cir2.getArea());
        Circle cir3 = new Circle(125);
        System.out.println("The area of the circle of radius "+cir3.radius+" is "+cir3.getArea());
        cir2.radius=100;
        System.out.println("The area of the circlr of radius "+cir2.radius+" is "+cir2.getArea());
    }
}

