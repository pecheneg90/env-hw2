package com.company;

public class Method {
    public static void compareToGryffindor(Gryffindor person1, Gryffindor person2) {
        int comparePerson1 = person1.getNobility() + person1.getHonor() + person1.getCourage();
        int comparePerson2 = person2.getNobility() + person1.getHonor() + person1.getCourage();
        if (comparePerson1 > comparePerson2) {
            System.out.println(person1.getName() + " лучший Гриффиндорец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Гриффиндорец, чем " + person1.getName());
        }
    }

    public static void compareToSlytherin(Slytherin person1, Slytherin person2) {
        int comparePerson1 = person1.getAmbition() + person1.getCunning()
                + person1.getDetermination() + person1.getResourcefulness()
                + person1.getLustForPower();
        int comparePerson2 = person2.getAmbition() + person2.getCunning()
                + person2.getDetermination() + person2.getResourcefulness()
                + person2.getLustForPower();
        if (comparePerson1 > comparePerson2) {
            System.out.println(person1.getName() + " лучший Слизеринец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Слизеринец, чем " + person1.getName());
        }
    }

    public static void compareToHufflepuff(Hufflepuff person1, Hufflepuff person2) {
        int comparePerson1 = person1.getDiligence() + person1.getHonesty() + person1.getLoyalty();
        int comparePerson2 = person2.getDiligence() + person2.getHonesty() + person2.getLoyalty();
        if (comparePerson1 > comparePerson2) {
            System.out.println(person1.getName() + " лучший Пуффендуец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Пуффендуец, чем " + person1.getName());
        }
    }

    public static void compareToRavenclaw(Ravenclaw person1, Ravenclaw person2) {
        int comparePerson1 = person1.getCreativity() + person1.getMind() + person1.getWisdom() + person2.getWit();
        int comparePerson2 = person2.getCreativity() + person2.getMind() + person2.getWisdom() + person2.getWit();
        if (comparePerson1 > comparePerson2) {
            System.out.println(person1.getName() + " лучший Когтевранец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Когтевранец, чем " + person1.getName());
        }
    }

    public static void compareToAllStudents(Hogwarts person1, Hogwarts person2) {
        int comparePerson1 = person1.getMagicPower() + person1.getMagicPower();
        int comparePerson2 = person2.getMagicPower() + person2.getMagicPower();
        if (comparePerson1 > comparePerson2) {
            System.out.println(person1.getName() + " обладает большей мощностью магии, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " обладает большей мощностью магии, чем " + person1.getName());
        }
    }
}