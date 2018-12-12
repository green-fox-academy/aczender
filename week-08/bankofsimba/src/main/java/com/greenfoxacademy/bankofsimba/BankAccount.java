package com.greenfoxacademy.bankofsimba;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private Boolean king;

    public BankAccount(String name, Double balance, String animalType, Boolean king) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
    }


    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Boolean getKing() {
        return king;
    }

    public void setKing(Boolean itAKing) {
        king = itAKing;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
