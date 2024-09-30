package edu.katkova;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(new Author("А.С. Пушкин", 1799), "Евгений Онегин");
        Book book2 = new Book(new Author("Рей Брэдбери", 1920), "Вино из одуванчиков");
        System.out.println(book1);
        System.out.println(book2);
    }
}
