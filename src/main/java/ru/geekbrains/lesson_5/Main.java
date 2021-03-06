package ru.geekbrains.lesson_5;

public class Main {
    public static void main(String[] args) {
        
        final int NUMBER_OF_EMPLOYEE = 5;

        Employee[] employee = new Employee[NUMBER_OF_EMPLOYEE];

        employee[0] = new Employee("Постыжий Иван Осипович",
                "Умывальников начальник", "direvann@ok.de", 88123,15000 , 19);
        employee[1] = new Employee("Ударный Олег Вениаминович",
                "Главный грузчик", "bumbum@kp.ru",656588 ,216000 ,91);
        employee[2] = new Employee("Ласковый Михаил Потапович",
                "Водитель детских велосипедов", "lampotap@ya.vru", 1118525, 60000,81);
        employee[3] = new Employee("Ушной Олег Валерьянович",
                "Торговец мечтами", "OValUshnoy@kaktotak.ru", 4475886, 300000, 25);
        employee[4] = new Employee("Расплескалов Дмитрий Маликович",
                "Дегустатор оскорблений", "malikov_oficial@sibmail.com", 161852,10000 , 41);

        for (Employee empl : employee) {
            if (empl.getAge() > 40) System.out.println(empl.getInfo());
        }
    }
}
