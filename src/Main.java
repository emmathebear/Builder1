public class Main {
    public static void main(String[] args) {
        Person person = (new BuilderPerson()
                .firstName("Gianni")
                .lastName("Rossi")
                .age("45")
                .address("Via della marina 2, Trapani")
                .build());
        Person person2 = (new BuilderPerson()
                .firstName("Maria")
                .lastName("Giovanna")
                .age("32")
                .build());
        System.out.println(person);
        System.out.println(person2);
    }
}
