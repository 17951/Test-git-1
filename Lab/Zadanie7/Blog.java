import java.util.ArrayList;

public class Blog {
 private ArrayList<Wpis> notes=new ArrayList<>();
 private String title;
 public Blog(String title) {
	 this.title=title;
 }
 
 public String getTitle() {
	return title;
}
public void add(Wpis note) {
	 notes.add(note);
}


public String toString() {
	return "Blog pod tytulem\n"+ title+" \n"+notes;
}

}