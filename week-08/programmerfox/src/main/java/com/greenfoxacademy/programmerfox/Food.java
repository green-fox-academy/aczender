package com.greenfoxacademy.programmerfox;

public class Food {
    private String food;
    private String drink;

    public Food(String food, String drink) {
        this.food = food;
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
