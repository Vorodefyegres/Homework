package Homework9;

public class Book {
    private String title;

    public static void main(String[] args) {
        Book myBook = new Book("The Catcher in the Rye");
        Description bookDescription = myBook.new Description();
        bookDescription.display();
    }
    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public class Description {
        public void display() {
            System.out.println("Название: " + title);
        }
    }
}