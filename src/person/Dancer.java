package person;

public class Dancer extends Person {
        private String typesDances;

        public Dancer(String name, String surName, int age) {
            super(name, surName, age);
        }

        public Dancer() {

        }

        public void dancing(){
            System.out.println("Бийлейт");
        }

        public Dancer(String name, String surName, int age, String genre) {
            super(name, surName, age);
            this.typesDances = genre;
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
                    super.toString()+ " ";
        }
    }


