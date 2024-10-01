package edu.katkova;

public class Main {
    public static void main(String[] args) {
        // Определение автора (Пушкин)
        Author pushkin = new Author("А.С. Пушкин", 1799);

        // Определение книг Пушкина
        Book bookEvgeniyOnegin = new Book(pushkin, "Евгений Онегин");
        System.out.println(bookEvgeniyOnegin);
        Book bookDubrovskiy = new Book(pushkin, "Дубровский");
        System.out.println(bookDubrovskiy);

        // Определение книги "Вино из одуванчиков"
        Book bookDandelionWine = new Book(new Author("Рей Брэдбери", 1920), "Вино из одуванчиков");
        System.out.println(bookDandelionWine);
    }
}
