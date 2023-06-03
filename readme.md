## Java и Spring Boot  
### Цель:  
Cоздать небольшое приложение на базе Spring Boot.  
### Задание:  
Магазин, торгующий компьютерами и комплектующими со следующим типом товаров:  
* Настольные компьютеры  
* Ноутбуки  
* Мониторы  
* Жесткие диски 

Каждый товар имеет следующие свойства:  
* номер серии  
* производитель  
* цена  
* количество единиц продукции на складе  

Дополнительные свойства:  
* Настольные компьютеры имеют форм-фактор: десктопы, неттопы, моноблоки  
* Ноутбуки подразделяются по размеру: 13, 14, 15, 17 дюймовые  
* Мониторы имеют диагональ  
* Жесткие диски имеют объем 

Необходимо реализовать back-end приложение, которое имеет RESTful HTTP методы выполняющие:  
1. Добавление товара  
1. Редактирование товара  
1. Просмотр всех существующих товаров по типу  
1. Просмотр товара по идентификатору  

В качестве базы данных использовать in memory database, например H2
Для проверки результата, присылайте ссылку на репозиторий на GitHub, в котором
размещен код проекта. В README.md файле репозитория должна быть подробная
инструкция по запуску приложения.

### Результат:  

## Результат
### Запуск проекта
java -jar shop_test-EasyBot-0.0.1-SNAPSHOT.jar

### Приложена postman коллекция со всеми доступными операциями для user и admin
EasyBot_test_task.postman_collection.json

### Сервер
http://localhost:8084

### БД H2
http://localhost:8084/h2-console  
пользователь: admin  
пароль: -

### Тесты
Написаны только для DesktopController, для остальных Контроллеров аналогичны


## Реализованные запросы

### Добавить "Настольный компьютер"
**POST**  
http://localhost:8084/desktops  

``
{
"serialNumber": "ABC123",
"manufacturer": "Apple",
"price": 1500.0,
"quantity": 10,
"formFactor": "desktop"
}
``

### Просмотр товара "Настольный компьютер" по ID
**GET**  
http://localhost:8084/desktops/1

### Редактировать "Настольный компьютер" по ID
**PUT**  
http://localhost:8084/desktops/1

``
{
"serialNumber": "ABC123",
"manufacturer": "Apple",
"price": 1500.0,
"quantity": 10,
"formFactor": "desktop"
}
``
### Получить все товары типа "Настольный компьютер"
**GET**  
http://localhost:8084/desktops


### Добавить "Жесткий диск"
**POST**  
http://localhost:8084/hard-disks

``
{
"serialNumber": "ABC123",
"manufacturer": "Apple",
"price": 1500.0,
"quantity": 10,
"capacity": 1024
}
``

### Просмотр товара "Жесткий диск" по ID
**GET**  
http://localhost:8084/hard-disks/1

### Редактировать "Жесткий диск" по ID
**PUT**  
http://localhost:8084/hard-disks/1

``
{
"serialNumber": "ABC123",
"manufacturer": "Apple",
"price": 1500.0,
"quantity": 10,
"capacity": "1024"
}
``
### Получить все товары типа "Жесткий диск"
**GET**  
http://localhost:8084/hard-disks

### Добавить "Ноутбук"
**POST**  
http://localhost:8084/laptops

``
{
"serialNumber": "ABC123",
"manufacturer": "HP",
"price": 1500.0,
"quantity": 10,
"screenSize": 17
}
``

### Просмотр товара "Ноутбук" по ID
**GET**  
http://localhost:8084/laptops/1

### Редактировать "Ноутбук" по ID
**PUT**  
http://localhost:8084/laptops/1

``
{
"serialNumber": "ABC123",
"manufacturer": "HP",
"price": 1500.0,
"quantity": 10,
"screenSize": 17
}
``
### Получить все товары типа "Ноутбук"
**GET**  
http://localhost:8084/laptops


### Добавить "Монитор"
**POST**  
http://localhost:8084/monitors

``
{
"serialNumber": "ABC123",
"manufacturer": "NEC",
"price": 1500.0,
"quantity": 10,
"diagonal": 17
}
``

### Просмотр товара "Монитор" по ID
**GET**  
http://localhost:8084/monitors/1

### Редактировать "Монитор" по ID
**PUT**  
http://localhost:8084/monitors/1

``
{
"serialNumber": "ABC123",
"manufacturer": "NEC",
"price": 1500.0,
"quantity": 10,
"diagonal": 17
}
``
### Получить все товары типа "Монитор"
**GET**  
http://localhost:8084/monitors
