### Задание 1

Создать класс Pair<K, V> , который будет хранить пару «ключ-значение». У класса должны быть:

- Поля `key` и `value`.

- Конструктор, принимающий `K key`, `V value`.

- Методы-геттеры для получения ключа и значения.

- Метод `toString()`, возвращающий строковое представление пары.

**Шаги :

2. Создайте класс Pair с дженериками.

4. Проверьте работу класса (создайте в main() объект Pair, например Pair<String, Integer>).


### Задание 2

Создать метод countGreaterThan(T[] array, T elem), который возвращает 
количество элементов в массиве, 
больших чем elem .

Условие: у `T` должен быть верхний параметр `<T extends Comparable<T>>`, 
чтобы сравнение `array[i].compareTo(elem)` было корректным.
**Шаги :

2. Объявите метод public static <T extends Comparable<T>> int countGreaterThan(T[] array, T elem).

4. Реализуйте логику подсчёта.

6. Проверьте метод на разных массивах (строки, числа и т.д.).