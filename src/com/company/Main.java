package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(20);
        plate.info();

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Гарфилд",6, false);
        catsArray[1] = new Cat("Барсик",5, false);
        catsArray[2] = new Cat("Толстяк",15, false);
        catsArray[3] = new Cat("Марсэль",7, false);
        catsArray[4] = new Cat("Мелкий",2, false);

        for (Cat cat : catsArray) {
            cat.eat(plate);
            System.out.println(cat.toString());
            plate.info();

        }


        // Проверяем осталась ли еда в тарелке после цикла кормежки всех наших котов. Если пусто, то миска автоматически подсыпает еще корма.
        plate.checkFood();
        plate.info();


    }
}
