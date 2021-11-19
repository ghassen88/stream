package tasks;




public class Task {
    public String description ="ghassen";
    public boolean completed =false;
    public String title;

    public Task() {

    }

    public Task(String description,String title) {
        this.description = description;
        this.title= title;
    }

    public void completed(){
        completed =true;
    }
    public void afficherTitle(String title){
        System.out.printf("afficher le title %s " ,title);
    }
}
