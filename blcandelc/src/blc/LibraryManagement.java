package blc;

public class LibraryManagement {
	private String bookTitle;
	private int bookId;
	private boolean isAvailable;
	public static String libraryName = "SumitLibrary";
	public static String libraryAddress = "Daudpur";

	public void setBookDetails(String title, int id, boolean available) {
		bookTitle = title;
		bookId = id;
		isAvailable = available;

	}
}
