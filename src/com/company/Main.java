package com.company;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] persons = new Hogwarts[]{
                new Gryffindor("Harry", "Potter", "Gryffindor", 98,
                        76,99, 99, 98),
                new Gryffindor("Hermione", "Granger", "Gryffindor", 91,
                        54, 89, 98, 84),
                new Gryffindor("Ronald", "Weasley", "Gryffindor", 87,
                        79, 93, 87, 99),
                new Slytherin("Draco", "Malfoy", "Slytherin", 91,
                        87, 93, 91, 99, 99, 100),
                new Slytherin("Graham", "Montague", "Slytherin", 75,
                        50, 67, 67, 45, 23, 45),
                new Slytherin("Gregory", "Goyle", "Slytherin", 59,
                        65, 67, 83, 63, 30, 46),
                new Hufflepuff("Zacharias", "Smith", "Hufflepuff", 87,
                        65, 76, 98, 87),
                new Hufflepuff("Cedric", "Diggory", "Hufflepuff", 76,
                        65, 65, 87, 56),
                new Hufflepuff("Justin", "Finch-Fletchley", "Hufflepuff", 65,
                        47, 68, 87, 56),
                new Ravenclaw("Cho", "Chang", "Ravenclaw", 87,
                        56, 87, 98, 69, 66),
                new Ravenclaw("Padma", "Patil", "Ravenclaw", 76,
                        52, 78, 32, 45, 67),
                new Ravenclaw("Marcus", "Belby", "Ravenclaw", 67,
                        56, 87, 24, 56, 78)};

        persons[0].setMagicPower(100);

        PrintService.print(persons);
        Method.compareToGryffindor((Gryffindor) persons[1], (Gryffindor) persons[2]);
        Method.compareToSlytherin((Slytherin) persons[3], (Slytherin) persons[4]);
        Method.compareToHufflepuff((Hufflepuff) persons[6], (Hufflepuff) persons[8]);
        Method.compareToRavenclaw((Ravenclaw) persons[9], (Ravenclaw) persons[11]);
        Method.compareToAllStudents(persons[0], persons[3]);
    }
}