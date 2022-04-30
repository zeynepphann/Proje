package D08_KitapYonetimi;

public class Books {
    private String bookName;
    private String authorName;
    private int bookPrice;

    public Books(String bookName, String authorName, int bookPrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookPrice=" + bookPrice
                ;
    }
}
