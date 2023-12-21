import java.time.LocalDate;

class dz1 {
    //task 1
    public static void main(String[] args) {
        checkLeapYear(2020); // Пример вызова метода с годом 2020
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}

    //task 2
    class Main {
        public static void main(String[] args) {
            suggestAppVersion(1, 2015);
        }

        public static void suggestAppVersion(int osType, int releaseYear) {
            int currentYear = LocalDate.now().getYear();
            String osName = osType == 0 ? "iOS" : "Android";

            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для " + osName);
            } else {
                System.out.println("Установите обычную версию приложения для " + osName);
            }
        }

        //task 3
        public static class m {
            public static void main(String[] args) {
                suggestAppVersion(1, 2015);
            }

            public static void suggestAppVersion(int osType, int releaseYear) {
                int currentYear = LocalDate.now().getYear();
                String osName = osType == 0 ? "iOS" : "Android";

                if (releaseYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для " + osName);
                } else {
                    System.out.println("Установите обычную версию приложения для " + osName);
                }
            }
        }
    }


        





