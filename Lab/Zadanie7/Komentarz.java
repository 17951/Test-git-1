import java.time.LocalDate;

public class Komentarz {
private String author,content;
private LocalDate date;

public Komentarz(String author,String content) {
	this.author=author;
	this.content=content;
	this.date=LocalDate.now();
}

public String getAuthor() {
	return author;
}

public String getContent() {
	return content;
}

public LocalDate getDate() {
	return date;
}

public String toString(){
return "Komentarz \nAutor: "+author+"\nZawartosc: "+content+" Data: "+date;
}

}
