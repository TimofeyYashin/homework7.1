package Pro.sky.java.course1.homework1;
public class Main {
    public static void main(String args[]) {
      Author author = new Author("Федор", "Достоевский");
      Author author1 = new Author("Александр", "Пушкин");
      Book book = new Book("Бесы", author, 1870);
      Book book1 = new Book("Дубровский", author1,1841);
      book.setPublicationYear(1879);
    }
}


