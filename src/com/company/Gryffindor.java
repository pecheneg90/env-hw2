package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, String faculty, int magicPower, int transgressionDistance,
                      int nobility, int honor, int courage) {
        super(name, surname, faculty, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility <= 0 || nobility > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor <= 0 || honor > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if (courage <= 0 || courage > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Благородство: " + nobility
                + ", Честь: " + honor
                + ", Храбрость: " + courage
                + ".";
    }
}