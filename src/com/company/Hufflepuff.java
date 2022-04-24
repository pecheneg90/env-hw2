package com.company;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, String faculty, int magicPower, int transgressionDistance,
                      int diligence, int loyalty, int honesty) {
        super(name, surname, faculty, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (diligence <= 0 || diligence > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty <= 0 || loyalty > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty <= 0 || honesty > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Трудолюбие: " + diligence
                + " Верность: " + loyalty
                + ", Честность: " + honesty
                + ".";
    }
}