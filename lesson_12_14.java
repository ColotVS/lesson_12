public class lesson_12_14 {
    //Статические классы

    //Статические вложенные классы можно использовать вне своего родительского класса.
    //Если у такого класса стоит модификатор доступа public, его можно использовать в любом месте программы.
    //Такие классы фактически ничем не отличаются от любого обычного класса. Хотя есть пара отличий.

    //Имя класса
    //Если вы хотите обратиться к статическому вложенному классу не из его класса-родителя, а из другого места в программе,
    //вам нужно будет указать имя класса: оно состоит из имени класса родителя и имени вложенного класса. Общий вид этого имени такой:
    //КлассРодитель.ВложенныйКласс

    //Класс родитель	            Вложенный класс	        Полное имя вложенного класса
    //com.javarush.Solution         Point                   com.javarush.Solution.Point
    //java.util.Map                 Entry                   java.util.Map.Entry
    //java.util.Files               DirectoryStream         java.util.Files.DirectoryStream
    //java.nio.WindowsPath          Closeable               java.nio.WindowsPath.Closeable

    //Создание объекта
    //Создать объект вложенного статического класса очень легко. Выглядит это так:
    //КлассРодитель.ВложенныйКласс имя = new КлассРодитель.ВложенныйКласс();

    //Обращение к статическим методам
    //Если у статического класса есть статические методы, обращаться к ним можно точно так же,
    //как к статическим методам обычных классов (только имя класса теперь двойное).
    //КлассРодитель.ВложенныйКласс.статическийМетод();

    //Обращение к статическим переменным
    //Обращаться к публичным статическим переменным вложенного класса тоже легко:
    //КлассРодитель.ВложенныйКласс.имяСтатическойПеременной

    //Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
    //Для этого создай внутренний статический (вложенный) класс Calculator и перенеси в него методы add, subtract, multiply и divide.
    //Не забудь подкорректировать их вызовы.

    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        lesson_12_14.Calculator.add(a, b);
        lesson_12_14.Calculator.subtract(a, b);
        lesson_12_14.Calculator.multiply(a, b);
        lesson_12_14.Calculator.divide(a, b);
    }


    public static class Calculator{
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
