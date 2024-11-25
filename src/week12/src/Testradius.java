public class Testradius {
    public static void main(String[] args) {
        CircleWithPrivateDataFields cir = new CircleWithPrivateDataFields();
        System.out.println("The area of the circle of radius"+cir.getRadius()+"is "+cir.getArea());
        cir.setRadius(cir.getRadius()*1.1);
        System.out.println("The area of the circle of radius"+cir.getRadius()+"is "+cir.getArea());
        System.out.println("The number od objects created is"+CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
