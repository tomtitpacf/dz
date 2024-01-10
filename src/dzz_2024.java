import java.time.LocalDate;

public class dzz_2024 {

    // task 1

    public static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // task 2

    public static void checkDeviceVersion(int osType, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (releaseYear > currentYear) {
            System.out.println("Install lightweight version for " + (osType == 0 ? "iOS" : "Android"));
        } else {
            System.out.println("Install regular version for " + (osType == 0 ? "iOS" : "Android"));
        }
    }

    // task 3

    public static int calculateDeliveryDays(int distance) {
        return distance / 50;
    }
}

