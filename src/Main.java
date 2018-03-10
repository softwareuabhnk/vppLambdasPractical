import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
        //Predicate<Book> myLambda = book -> book.getTitle().toLowerCase().contains("men");
		
		// Passing the the lambda directly in to the function
		List<Book> foundBooks = bc.findBooksWithStream(book -> book.getTitle().toLowerCase().contains("men"));
	
		for (Book nextBook : foundBooks) {
			System.out.println ("ID " + nextBook.getId() + " Title " + nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		
		
		// Write it into a single line
		bc.findBooksWithStream(book -> book.getTitle().toLowerCase().contains("men")).forEach((System.out::println));
		
		Map<Integer, String> bookMap = bc.findBookTitles(book -> book.getTitle().toLowerCase().contains("men"));
		
		bookMap.forEach((k,v) -> System.out.println(k + "  :  " + v));
		
		System.out.print(bc.howManyMatchingBooks(b -> b.getAuthor().startsWith("A")));
		
	}
}
