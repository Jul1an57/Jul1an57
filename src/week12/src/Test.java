public class Test {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(Circle c) {
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }
    public static void printAreas(
            CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius\t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}