package headfirst.chapter16.listings.l06;

import java.util.Comparator;
import java.util.TreeSet;

public class BookCompareTest {
    public static void main(String[] args) {
        new BookCompareTest().go();
    }

    public void go() {
        Book b1 = new Book("How cats work");
        Book b2 = new Book("Build up your body again");
        Book b3 = new Book("Finding emo");
        TreeSet<Book> tree = new TreeSet<>(new BookCompare());
        tree.add(new Book("How cats work"));
        tree.add(new Book("Finding emo"));
        tree.add(new Book("Build up your body again"));
        System.out.println(tree);
    }
}

class BookCompare implements Comparator<Book> {
    @Override
    public int compare(Book one, Book two) {
        return one.title.compareTo(two.title);
    }

}

class Book implements Comparable<Book> {

    String title;

    public Book(String t) {
        title = t;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
