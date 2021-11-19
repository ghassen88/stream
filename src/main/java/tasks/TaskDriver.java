package tasks;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class TaskDriver {


    public static void main(String[] args) {
        Task tache1 =new Task("fait ton travai" ,"amine");
        Task tache2 =new Task("bon travail les garçons","salah");
        tache1.completed();
        System.out.println(tache1.completed);
      System.out.println(tache2.description);
      tache1.afficherTitle(tache1.title);
    }
}
