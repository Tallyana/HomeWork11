public class Main {
    //Реализуйте метод, который получает в качестве параметра год,
    // а затем проверяет, является ли он високосным, и выводит результат в консоль.
    //*Эту проверку вы уже реализовывали в задании по условным операторам.*
    //Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
    //Результат программы выведите в консоль. Если год високосный,
    // то должно быть выведено “*номер года
    //   —* високосный год”. Если год не високосный, то,
    //   соответственно: “*номер года —* не **високосный год”

    public static void findOutLeapYear() {
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным");
        }
    }
    public static void main(String[] args) {
        findOutLeapYear();
    }
}
    //Напишите метод, куда подаются два параметра: тип операционной системы
    // (ОС) ( 0 — iOS или 1 — Androd) и год выпуска устройства.
    //Текущий год можно получить таким способом:int currentYear = LocalDate.now().getYear();
//В результате программа должна выводить в консоль в зависимости от исходных данных,
// какую версию приложения (обычную или lite) и для какой ОС (Android или iOS)
// нужно установить пользователю.
    public static void installOs() {
        int clientOs = 0;
        int clientDeviceYear = 2019;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылкe .");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылкe .");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылкe .");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылкe .");
            }
        }
        public static void main (String[]args){
            installOs();
        }
    }
}
