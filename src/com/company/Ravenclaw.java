package com.company;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, String faculty,
                     int magicPower, int transgressionDistance, int mind,
                     int wisdom, int wit, int creativity) {
        super(name, surname, faculty, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        if (mind <= 0 || mind > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom <= 0 || wisdom > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit <= 0 || wit > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity <= 0 || creativity > 100) {
            throw new IllegalArgumentException("некорректно введена характеристика");
        }
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Ум: " + mind
                + " Мудрость: " + wisdom
                + ", Остроумие: " + wit
                + ", Творчество" + creativity + ".";
    }
}