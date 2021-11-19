package tests;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class ExamenTest {


    public static void main(String[] args) {

   String name="je suis une chaine de carctere ";
   String name1 = new String("je suis ghassen développeur java kafka ");
        System.out.println(name);
        System.out.println(name1);
        Scanner scanner =new Scanner(System.in);
       System.out.println("entrter la matiere concerne :");
       Examen examen = new Examen();
        String matiere = scanner.nextLine();
        examen.afficherMessage(matiere);
        scanner.close();

    }
}
