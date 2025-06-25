### Задача: "Универсальный конвертер температур"

Реализуйте класс TemperatureConverter, который может конвертировать температуры между разными шкалами (Цельсий, Фаренгейт, Кельвин). Класс должен использовать дженерики для обеспечения типобезопасности.

# Требования:

1. Создайте enum Scale с вариантами: CELSIUS, FAHRENHEIT, KELVIN

2. Реализуйте класс Temperature<T extends Scale> с:
 - Поле value (double)
 - Поле scale (тип T)
 - Конструктор и геттеры

3. Реализуйте класс TemperatureConverter с методом:
```
public <S extends Scale, D extends Scale> Temperature<D> convert(
    Temperature<S> source, 
    Class<D> targetScale
)
```

4. Реализуйте логику конвертации для всех комбинаций шкал
```
Temperature<Scale.CELSIUS> celsius = new Temperature<>(100, Scale.CELSIUS);
TemperatureConverter converter = new TemperatureConverter();

// Конвертация в Фаренгейт
Temperature<Scale.FAHRENHEIT> fahrenheit = 
    converter.convert(celsius, Scale.FAHRENHEIT.class);

// Конвертация в Кельвин
Temperature<Scale.KELVIN> kelvin = 
    converter.convert(celsius, Scale.KELVIN.class);

System.out.println("Исходная: " + celsius.getValue() + " C");
System.out.println("Фаренгейт: " + fahrenheit.getValue() + " F");
System.out.println("Кельвин: " + kelvin.getValue() + " K");
```

Ожидаемый вывод:
```
Исходная: 100.0 C
Фаренгейт: 212.0 F
Кельвин: 373.15 K
```

Подсказки:
1. Формулы конвертации:
 - C -> F: (value * 9/5) + 32
 - F -> C: (value - 32) * 5/9
 - C -> K: value + 273.15
 - K -> C: value - 273.15

2. В методе convert используйте проверки типа через instanceof или switch по типу шкалы

3. Для возвращаемого значения создавайте новый экземпляр Temperature с целевой шкалой