package person;

public class Dancer extends Person {

    private String typesDances;


    public Dancer(String name, String surName, int age, String typesDances) {
        super(name, surName, age);
        this.typesDances = typesDances;
    }

    public Dancer() {

    }

    public void dancing() {
        System.out.println("Бийлейт");
    }

    public String getTypesDances() {
        return typesDances;
    }

    public void setTypesDances(String typesDances) {
        this.typesDances = typesDances;
    }

    @Override
    public String toString() {
        return "Dancer-" +
                "genre:" + typesDances + '\'' +
                super.toString() + " ";
    }
}


