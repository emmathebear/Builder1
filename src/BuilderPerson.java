public class BuilderPerson {
    private String firstName,
            lastName,
            age,
            address = "not declared";

    public BuilderPerson firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BuilderPerson lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public BuilderPerson age(String age) {
        this.age = age;
        return this;
    }

    public BuilderPerson address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address);
    }

    BuilderPerson() {
    }

}
