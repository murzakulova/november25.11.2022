package person;

public class Programmer extends Person {
        private String desktop;

        public Programmer(String name, String surName, int age) {
            super(name, surName, age);
        }

        public Programmer() {
            super();
        }

        public void programing() {
            System.out.println("Программалайт");
        }


        public Programmer(String name, String surName, int age, String desktop) {
            super(name, surName, age);
            this.desktop = desktop;
        }

        public String getDesktop() {
            return desktop;
        }

        public void setDesktop(String desktop) {
            this.desktop = desktop;
        }

        @Override
        public String toString() {
            return "Programmer-" +
                    "desktop:" + desktop + '\'' +
                    super.toString() + " ";
        }
    }


