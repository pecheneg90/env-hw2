package com.company;

public class Hogwarts {
    private final String name;
    private final String surname;
    private String faculty;
    private int magicPower;
    private int transgressionDistance;
    static int counter;
    final int id;

    public Hogwarts(String name, String surname, String faculty, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.id = counter+1;
        counter++;
    }

    public String getName() {
        return name + " " + surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty; }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower <= 0 || magicPower > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance <= 0 || transgressionDistance > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.transgressionDistance = transgressionDistance;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return getId()
                + ". "
                + "Имя: " + getName()
                + ", Факультет: " + getFaculty()
                + ", Магия: " + getMagicPower()
                + ", Трансгрессия: " + getTransgressionDistance();
    }
}