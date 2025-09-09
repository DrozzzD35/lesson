
## Инструкция
Выберите один правильный ответ для каждого вопроса

---

## Блок 1: ArrayList

### Вопрос 1
Какой метод используется для добавления элемента в конец ArrayList?

a) `insert(element)`  
b) `add(element)`  
c) `append(element)`  
d) `push(element)`

Ответ: b. add добавляет элемент в конец списка

### Вопрос 2
Как получить элемент по индексу 3 из ArrayList?

a) `list.getElement(3)`  
b) `list.get(3)`  
c) `list.element(3)`  
d) `list[3]`

ответ: b, get получает элемент по индексу

### Вопрос 3
Какой метод возвращает количество элементов в ArrayList?

a) `length()`  
b) `count()`  
c) `size()`  
d) `capacity()`

ответ: c, возвращает количество элементов списка 

### Вопрос 4
Как удалить элемент по индексу 2 из ArrayList?

a) `list.delete(2)`  
b) `list.remove(2)`  
c) `list.erase(2)`  
d) `list.pop(2)`

ответ: b, удаляет элемент по индексу

### Вопрос 5
Какой метод проверяет, содержит ли ArrayList определенный элемент?

a) `has(element)`  
b) `includes(element)`  
c) `contains(element)`  
d) `exists(element)`

ответ: c, выдаёт булин значение, говорит о наличии или отсутствие элемента

### Вопрос 6
Как вставить элемент "Java" на позицию 1 в ArrayList?

a) `list.insert(1, "Java")`  
b) `list.add(1, "Java")`  
c) `list.put(1, "Java")`  
d) `list.place(1, "Java")`

ответ: b, add выставляет элемент на указанную позицию

### Вопрос 7
Какой метод заменяет элемент на определенной позиции?

a) `replace(index, element)`  
b) `change(index, element)`  
c) `set(index, element)`  
d) `update(index, element)`

ответ: с, cet заменяет элемент на указанной позиции

### Вопрос 8
Как проверить, пуст ли ArrayList?

a) `list.isEmpty()`  
b) `list.isNull()`  
c) `list.hasElements()`  
d) `list.size() == 0`

ответ: a, булин значение, указывает пустой ли список

### Вопрос 9
Какой метод очищает все элементы из ArrayList?

a) `list.clear()`  
b) `list.removeAll()`  
c) `list.delete()`  
d) `list.empty()`

ответ: a, clear очищает список

### Вопрос 10
Как найти индекс первого вхождения элемента "Hello"?

a) `list.findIndex("Hello")`  
b) `list.indexOf("Hello")`  
c) `list.search("Hello")`  
d) `list.position("Hello")`

ответ: b, находить индекс первого вхождения элемента

---

## Блок 2: HashMap

### Вопрос 11
Как добавить пару ключ-значение в HashMap?

a) `map.add(key, value)`  
b) `map.insert(key, value)`  
c) `map.put(key, value)`  
d) `map.set(key, value)`

ответ: c, put добавляет пару в мапу

### Вопрос 12
Как получить значение по ключу "name" из HashMap?

a) `map.getValue("name")`  
b) `map.get("name")`  
c) `map.find("name")`  
d) `map["name"]`

ответ: b, get выдаёт значение по ключу

### Вопрос 13
Какой метод проверяет, содержит ли HashMap определенный ключ?

a) `containsKey(key)`  
b) `hasKey(key)`  
c) `includesKey(key)`  
d) `existsKey(key)`

ответ: a, проверяет содержит ли мапа указанный ключ

### Вопрос 14
Как удалить элемент по ключу "age" из HashMap?

a) `map.delete("age")`  
b) `map.remove("age")`  
c) `map.erase("age")`  
d) `map.pop("age")`

ответ: b, удаляет элемент по ключу

### Вопрос 15
Какой метод возвращает количество пар ключ-значение в HashMap?

a) `map.length()`  
b) `map.count()`  
c) `map.size()`  
d) `map.capacity()`

ответ: c, возвращает размер мапы

### Вопрос 16
Как проверить, содержит ли HashMap определенное значение?

a) `map.hasValue(value)`  
b) `map.containsValue(value)`  
c) `map.includesValue(value)`  
d) `map.existsValue(value)`

ответ: b, булин значение, проверяет содержится ли указанное значение в мапе

### Вопрос 17
Какой метод возвращает все ключи HashMap?

a) `map.getKeys()`  
b) `map.keys()`  
c) `map.keySet()`  
d) `map.allKeys()`

ответ: с, возвращает все ключи мапы

### Вопрос 18
Как получить все значения из HashMap?

a) `map.getValues()`  
b) `map.values()`  
c) `map.allValues()`  
d) `map.valueSet()`

правильный ответ: b
ответ: d, возвращает все значения мапы

### Вопрос 19
Что вернет метод `get()`, если ключ не найден в HashMap?

a) `0`  
b) `""` (пустая строка)  
c) `null`  
d) `false`

ответ: c, вернёт null

### Вопрос 20
Как очистить все элементы из HashMap?

a) `map.clear()`  
b) `map.removeAll()`  
c) `map.delete()`  
d) `map.empty()`

ответ: a, очищает мапу

---


## Дополнительные важные методы для изучения

### ArrayList:
- `addAll()` - добавляет все элементы из другой коллекции
- `removeAll()` - удаляет все элементы, содержащиеся в другой коллекции
- `lastIndexOf()` - находит индекс последнего вхождения элемента
- `subList()` - создает представление части списка
- `toArray()` - преобразует список в массив

### HashMap:
- `putAll()` - добавляет все элементы из другой карты
- `replace()` - заменяет значение только если ключ существует
- `entrySet()` - возвращает множество пар ключ-значение
- `getOrDefault()` - возвращает значение или значение по умолчанию
- `putIfAbsent()` - добавляет элемент только если ключа нет