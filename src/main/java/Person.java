



public class Person {


    private final String name;
    private final int age;
    private final Sexe sexe;


    public Person(String name, int age, Sexe sexe) {
        this.name = name;
        this.age = age;
        this.sexe = sexe;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexe=" + sexe +
                '}';
    }
}
