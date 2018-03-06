
public class Test {
	public static void main(String[] args) {
		Blog b=new Blog("Blog programistyczny");
		Wpis w1=new Wpis("Ruby","Co nowego w Ruby");
		Wpis w2=new Wpis("Python","Co nowego w Python");
		Wpis w3=new Wpis("Fortran","Co nowego w Fortran");

		Komentarz kom=new Komentarz("Janek", "Bardzo fajne");
		Komentarz kom1=new Komentarz("Tadek", "Bardzo niefajne");

		//dodanie komentarzy do wpisow
		w1.add(kom);
		w2.add(kom1);
		//dodanie wpisow do bloga
		b.add(w1);
		b.add(w2);
		b.add(w3);
	
		System.out.println(b);

	
	}
}
