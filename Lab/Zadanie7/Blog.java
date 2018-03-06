import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
	private ArrayList<Wpis> notes = new ArrayList<>();
	private String title;

	public Blog(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void add(Wpis note) {
		notes.add(note);
	}

	public String toString() {
		return "Blog pod tytulem\n" + title + " \n" + notes;
	}

	public Wpis mostPopular() {
		int max = 0;
		Wpis result = null;
		for (Wpis x : notes) {
			int count = x.numberOfComments();
			if (count > max) {
				result = x;
				max = count;
			}

		}
		return result;
	}

	public List<Wpis> mostPopulars() {

		return null;

	}

	public Komentarz lastComment() {
		List<Komentarz> allComments = new ArrayList();
		for (Wpis wpis : notes) {
			allComments.addAll(wpis.listaKomentarzy());
		}
		Komentarz result = allComments.get(0);
		for (Komentarz kom : allComments) {
			LocalDate d1 = kom.getDate();
			LocalDate d2 = result.getDate();
			if (d1.isAfter(d2)) {
				result = kom;
			}
		}

		// Komentarz result = null;
		// long min = Long.MAX_VALUE;
		// LocalDate cur = LocalDate.now();
		// for (Wpis wpis : notes) {
		// for (Komentarz kom : wpis.listaKomentarzy()) {
		// LocalDate data = kom.getDate();
		// long x = cur.until(data, ChronoUnit.MINUTES);
		// if (x < min) {
		// min = x;
		// result = kom;
		// }
		// }
		// }
		return result;

	}

}
