public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("задание №5");
        String fullName = "Иванов Иван Иванович";
        int index1 = fullName.indexOf(' ');
        int index2 = fullName.lastIndexOf(' ');
        String lastName = fullName.substring(0, index1);
        String name = fullName.substring(index1+1,index2);
        String secondName = fullName.substring(index2+1);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Имя сотрудника - " + name);
        System.out.println("Отчество сотрудника - " + secondName);


    }

    public static void task2() {
        System.out.println("задание №6");
    }

    public static void task3() {
        System.out.println("задание №7");
    }

    public static void task4() {
        System.out.println("задание №8");
    }
}