package person;

public class Singer extends Person {

    private String genre;

    public Singer(String name, String surName, int age, String genre) {
        super(name, surName, age);
        this.genre = genre;
    }

    public Singer() {

    }

    public void sings() {
        System.out.println("Ырдайт");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Singer-" +
                "typesDances:" + genre + '\'' +
                super.toString() + " ";
    }
}


