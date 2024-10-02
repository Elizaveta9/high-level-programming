###### Задание: Модель студента

### Student

Класс `Student` - студент со следующими атрибутами:
- `String name`: Имя;
- `LocalDateTime birthDate`: Дата и время рождения;
- `String group`: Группа;
- `int studentId`: Индивидуальный номер;
- `double averageScore`: Средний балл.

### Конструктор
- `Student(String name, LocalDateTime birthDate, String group, int studentId, double averageScore)`: Конструктор с парамерами. Инициализирует студента с переданными параметрами;

### Методы

- `getAge()`: Возвращает подсчитанный возраст студента.
- `toString()`: Возвращает строковое представление объекта.
- `isExcellentStudent`:
- геттеры и сеттеры;

### Что делает программа

В классе Main инициализируются два кота с помощью разных конструкторов и информация о них выводится в консоль.

### Запуск проекта из директории task1-1:
1. mvn package
2. java -jar target/task1-1-1.0-SNAPSHOT.jar
