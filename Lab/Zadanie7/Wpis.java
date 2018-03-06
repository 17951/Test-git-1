import java.util.ArrayList;
import java.util.List;

public class Wpis {
private String title,content;
private List<Komentarz> comments=new ArrayList<>();

public Wpis(String title,String content) {
	this.title=title;
	this.content=content;
}

public void add(Komentarz comment) {
	comments.add(comment);
}
public String toString() {
StringBuilder sb=new StringBuilder();
sb.append("\nWpis: ");
sb.append("\nTytul: " +title);
sb.append("\nTresc: "+content+"\n");
sb.append("\n "+comments+"\n");
return sb.toString();
}
}
