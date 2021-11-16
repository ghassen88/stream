import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Person> people = getPeople();




    List<Person> females = new ArrayList<>();
    //utilisation des boucles
//    for(Person person :people){
//
//
//        if(person.getSexe().equals(Sexe.FEMME)){
//            females.add(person);
//        }
//        females.forEach(System.out::println);
//        System.out.println(females);
//
//    }
        //utilisation des streams
        //filter
        List<Person> females1 = people.stream().filter(x->x.getSexe().equals(Sexe.FEMME)).collect(Collectors.toList());
        //females1.forEach(System.out::println);
        //sort
        List<Person> list1 = people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
            .collect(Collectors.toList());
        list1.forEach(System.out::println);

        //ALL Match
        Boolean allMatch = people.stream().allMatch(x->x.getAge() >12);
        System.out.println(allMatch);

        Boolean allMatch1 = people.stream().allMatch(x->x.getAge() >20);
        System.out.println(allMatch1);
        //Any Match
        Boolean allMatch2 = people.stream().anyMatch(x->x.getAge() >12);
        System.out.println(allMatch2);
        //None Match
        Boolean allMatch3 = people.stream().noneMatch(x->x.getName().equals("asma"));
        System.out.println(allMatch3);
        //Max
        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        //Min
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        //Group
        Map<Sexe,List<Person>> group= people.stream().collect(Collectors.groupingBy(Person::getSexe));
        //group.forEach(System.out::println);
        group.forEach((Sexe,people1)->{
            System.out.println(Sexe);
            System.out.println(people1);

              });

    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("ghassen",33,Sexe.HOMME),
                new Person("amine",19,Sexe.HOMME),
                new Person("souad",21,Sexe.FEMME),
                new Person("salah",56,Sexe.HOMME),
                new Person("amina",22,Sexe.FEMME),
                new Person("amen",37,Sexe.HOMME),
                new Person("rihab",27,Sexe.FEMME)


        );
    }

}