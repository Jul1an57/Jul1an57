public class Week5Task4 {
    public static void main(String[] args) {

        System.out.println("Math.max(2,3) returns " + Math.max(2, 3)); // returns 3
        System.out.println("Math.min(2.5,4.6) returns " + Math.min(2.5, 4.6)); // returns 2.5
        System.out.println("Math.max(Math.max(2.5,4.6),Math.min(3,5.6)) returns " + Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6))); // returns 4.6
        System.out.println("Math.abs(-2) returns " + Math.abs(-2)); // returns 2
        System.out.println("Math.abs(-2.1) returns " + Math.abs(-2.1)); // returns 2.1


        int randomIntBetween0And9 = (int) (Math.random() * 10);
        System.out.println("Random integer between 0 and 9: " + randomIntBetween0And9);

        int randomIntBetween50And99 = 50 + (int) (Math.random() * 50);
        System.out.println("Random integer between 50 and 99: " + randomIntBetween50And99);

        int lowerBound = 10;
        int upperBound = 20;
        int randomIntBetweenLowerAndUpper = lowerBound + (int) (Math.random() * (upperBound - lowerBound));
        System.out.println("Random integer between " + lowerBound + " and " + upperBound + ": " + randomIntBetweenLowerAndUpper);
    }
}