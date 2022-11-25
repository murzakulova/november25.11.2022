package main;

import person.Dancer;
import person.Programmer;
import person.Singer;

public class Main {
    public static void main(String[] args) {
        // Programmer
        Programmer programmer = new Programmer();
        programmer.setDesktop("Айкен");
        programmer.setSurName("Мурзакулова");
        programmer.setAge(17);
        programmer.setDesktop("hp");
        programmer.slip();
        programmer.programing();
        System.out.println(programmer);
        // Dancer
        Dancer dancer = new Dancer();
        dancer.setName("Артыгай");
        dancer.setSurName("Болотова");
        dancer.setAge(22);
        dancer.setTypesDances("Социальные танцы");
        dancer.slip();
        dancer.dancing();
        System.out.println(dancer);
        // Singer
        Singer singer = new Singer();
        singer.setName("Жазгул");
        singer.setSurName("Манасова");
        singer.setAge(20);
        singer.setGenre("гитара");
        singer.slip();
        singer.sings();
        System.out.println(singer);
    }
}
