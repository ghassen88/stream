package person;

public class PersonTest {





    public static void main(String[] args) {


        Person p1 = new Person("tata");
        Person p2 = new Person("toto");
        Person p3 = new Person("titi");
        System.out.println(Person.nbrTotalPerson);
        //System.out.println(p1.nom);
        //System.out.println(p1.age);
       //p1.setAge(34);

        System.out.println(p1.getAge());


    }
}
