###### Задание: Книги и авторы

## BankAccount

Класс `Author` - автор со следующими атрибутами:
- `String name`: Имя;
- `int birthYear`: Год рождения;

### Конструктор
- `Author(String name, int birthYear)`: Конструктор с параметрами. Инициализирует автора с переданными параметрами;

### Методы
- геттеры и сеттеры;
- `toString()`: Возвращает строковое представление объекта;

## Book

Класс `Book` - книга со следующими атрибутами:
- `Author author`: Автор;
- `String title`: Название книиги;

### Конструктор
- `Book(Author author, String title)`: Конструктор с параметрами. Инициализирует книгу с переданными параметрами;

### Методы
- геттеры и сеттеры;
- `toString()`: Возвращает строковое представление объекта;

### Что делает программа

В классе Main сначала инициализируются автор (Пушкин) и две его книги, после чего инициализируется книга Рея Брэдбери.

### Запуск проекта из директории task3-1:
1. mvn package
2. java -jar target/task3-1-1.0-SNAPSHOT.jar
