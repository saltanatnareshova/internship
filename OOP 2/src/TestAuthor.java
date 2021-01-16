public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Saltok", "sn@gmail.com", 'f');
        System.out.println(author);
        author.setEmail("new@gmail.com");
        System.out.println("name "+author.getName());
        System.out.println("email "+author.getEmail());
        System.out.println("gender "+author.getGender());

    }
}
