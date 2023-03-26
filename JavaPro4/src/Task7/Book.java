package Task7;

import java.util.Objects;

public class Book implements Comparable<Book>{
    int price;
    String author;
    String title;

    public Book(int price, String author, String title) {
        this.price = price;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return price == book.price && author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, author, title);
    }

    @Override
    public int compareTo(Book o) {
        return o.price-price;
    }
}
