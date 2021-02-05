package com.company;

public class Cat {
        private String name;
        private int appetite;
        private boolean full; //сытость


    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    //исключить отрицательное количество еды и зафиксировать сытость кота
    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            setFull(true);
        } else {
            System.out.println("В тарелке недостаточно еды для кота.");
            setFull(false);
        }

    }

    public void setFull(boolean full) {
        this.full = full;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", full=" + full +
                '}';
    }


}
