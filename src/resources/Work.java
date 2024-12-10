package resources;

public class Work {
    public static void main (String[] args) {
        // Создаем объект Employee{
        Employee cleaner = new Employee("Никола","Тесла", 20,"Уборщик");
        Employee driver = new Employee("Илон","Маск", 25,"Водитель");
        Employee manager = new Employee("Тони","Монтана", 30,"Управляющий");
        Employee security = new Employee("Пабло","Эскобар", 50,"Охраник");

        // Выводим информацию о сотруднике
        cleaner.displayInfo();
        System.out.println("Пришел, Убрал, Пообедал 30 м, Ушел с работы");
        driver.displayInfo();
        System.out.println("Пришел, Поводил, Пообедал 40 м, Ушел с работы");
        manager.displayInfo();
        System.out.println("Пришел, Поуправлял, Пообедал 20 м, Ушел с работы");
        security.displayInfo();
        System.out.println("Пришел, Поохранял, Пообедал 60 м, Ушел с работы");
    }
}

class Employee {
    // Поля класса
    private String name;
    private String lastName;
    private int age;
    private String position;


    // Конструктор класса
    public Employee(String name, String lastName, int age, String position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;


    }

    // Метод для вывода информации о сотруднике
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);


        System.out.println();
    }

}

