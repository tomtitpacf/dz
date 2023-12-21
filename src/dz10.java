public class dz10 {
    public static void main(String[] args) {

        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // task 2

        fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);

        // task 3

        fullName = "Иванов Семён Семёнович";
        String correctedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
    }
}
