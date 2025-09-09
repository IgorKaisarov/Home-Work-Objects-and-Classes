
public class Main {
    public static void main(String[] args) {

        Author author = new Author("Антуан де сент", "Экзюпери");
        Author author1 = new Author("Бернар", "Вербер");

        Book book = new Book("Маленький принц", author, 1943);
        Book book1 = new Book("Муравьи", author1, 1990);

        book1.setYear(1991);
        System.out.println("Книга: " + book1.getName() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", год публикации: " + book1.getYear());
        System.out.println("Книга: " + book.getName() + ", Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ", год публикации: " + book.getYear());


    }
}