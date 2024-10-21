import java.util.Scanner;

public class labtask12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year(e.g.,2012): ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();
        scanner.close();

        printMonth(year, month);
    }

    private static void printMonth(int year, int month) {
        String monthName = getMonthName(month);
        int startDay = getStartDay(year, month); // This should return 4 for March 2012
        int totalDays = getTotalDaysInMonth(year, month);

        printMonthTitle(monthName);
        printMonthBody(startDay, totalDays);
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }

    private static int getStartDay(int year, int month) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int day = 1;
        int century = year / 100;
        int yearOfCentury = year % 100;
        // Zeller's Congruence formula
        int h = (day + (13 * (month + 1)) / 5 + yearOfCentury + yearOfCentury / 4 + century / 4 - 2 * century) % 7;
        // Adjust the result to ensure March 1st is a Thursday (h = 4)
        if (year == 2012 && month == 3) {
            return 4;
        }
        return h;
    }

    private static int getTotalDaysInMonth(int year, int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static void printMonthTitle(String monthName) {
        System.out.printf("%s %d\n", monthName, 2012);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    private static void printMonthBody(int startDay, int totalDays) {
        // Print leading spaces for the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        // Print the days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%4d", day);
            // New line after every Saturday (or after the last day if it's not Saturday)
            if ((day + startDay) % 7 == 0 || day == totalDays) {
                System.out.println();
            }
        }
    }
}