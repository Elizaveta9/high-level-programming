###### Задание: Знакомство с классом

### Cat

Класс `Cat` отражает кота со следующими атрибутами:
- `String name`: Имя кота;
- `String color`: Цвет кота;
- `double weightKg`: Вес кота в килограммах;
- `int age`: Возраст кота.

### Конструкторы

- `Cat()`: Конструктор по умолчанию, который инициализирует кота с дефолтными значениями (`name = "John"` и `color = "invisible"`);
- `Cat(String name, String color, double weightKg, int age)`: Конструктор с парамерами. Инициализирует кота с переданными параметрами.

### Методы

- геттеры и сеттеры;
- `toString()`: Возвращает строковое представление объекта.

### Что делает программа

В классе Main инициализируются два кота с помощью разных конструкторов и информация о них выводится в консоль.

### Запуск проекта из директории task1-1:
1. mvn package
2. java -jar target/task1-1-1.0-SNAPSHOT.jar
