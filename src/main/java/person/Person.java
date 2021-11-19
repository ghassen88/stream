package person;



public class Person {

    public String nom;
    private  int age;
     static int nbrTotalPerson =0;

    public Person(String nom) {
        this.nom = nom;
        nbrTotalPerson ++;
    }







    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age *365 ;
    }

    public void setAge(int age) {
        if(age <15) {
            System.out.println("interdit pour le 15 ans");
        }else {
            this.age = age;
        }
    }
}
