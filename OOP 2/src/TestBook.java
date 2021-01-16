public class TestBook {
    public static void main(String[] args){
        Author author = new Author("Saltok", "sn@gmail.com", 'f');
        System.out.println(author);
        Book book = new Book("Best", author, 20.00, 100);
        System.out.println(book);
        book.setPrice(10.00);
        book.setQty(90);
        System.out.println("Info about book");
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getAuthor().getEmail());
        Book book2 = new Book("Best2", new Author("John", "j@gmail.com", 'm'), 10);
        System.out.println(book2);
        System.out.println(book2.getAuthor().getName());
        System.out.println(book2.getAuthor().getEmail());
    }
}
