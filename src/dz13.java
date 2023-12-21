 class librAapr {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("Jane", "Smith");

        Book book1 = new Book("Book One", author1, 2000);
        Book book2 = new Book("Book Two", author2, 2010);

        System.out.println("Book 1: " + book1.getTitle() + " by " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", published in " + book1.getPublicationYear());

        System.out.println("Book 2: " + book2.getTitle() + " by " +
                book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", published in " + book2.getPublicationYear());


        book1.setPublicationYear(2022);

        System.out.println("Updated Book 1: " + book1.getTitle() + " by " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", published in " + book1.getPublicationYear());
    }
}
