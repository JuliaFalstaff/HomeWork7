package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }

    public void setFood(int food){
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void checkFood() {
        if (food < 35) {
            setFood(food + 35);
            System.out.println("В тарелку добавлено еще еды в размере 35 ед. (минимальное количество еды, необходимое для всех котов)");
        }
    }


    public int getFood() {
        return food;
    }



}
