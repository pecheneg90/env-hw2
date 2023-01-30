package com.company;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, String faculty, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, faculty, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning <= 0 || cunning > 101) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination <= 0 || determination > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition <= 0 || ambition > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness <= 0 || resourcefulness > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower <= 0 || lustForPower > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Хитрость: " + cunning
                + " Решительность: " + determination
                + ", Амбициозность: " + ambition
                + ", Находчивость: " + resourcefulness
                + ", Жажда власти: " + lustForPower + ".";
    }
}