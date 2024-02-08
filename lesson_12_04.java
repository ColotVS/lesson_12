public class lesson_12_04 {
    //Отличие статических и нестатических переменных

    //Нестатические (обычные) переменные класса объявляются точно так же, как статические, только без ключевого слова static.
    //Чем же отличаются обычные и статические переменные?
    //Обычные переменные класса привязаны к объектам своего класса (экземплярам класса),
    //статические переменные — к статическому объекту класса.
    //Если экземпляров класса несколько, в каждом из них существует своя копия нестатических (обычных) переменных класса.
    //Статические переменные класса всегда находятся внутри статического объекта класса и существуют только в одном экземпляре.
    //Обращаться к обычным переменным класса (полям класса) можно только имея ссылку на объект класса.
    //Ну или в методах внутри этого же класса.

    //Обращение к полю класса с использованием ссылки на объект класса
    //public class DataInfo
    //{
    //   public int value = 100;
    //}
    //
    //public class Solution
    //{
    //   public static void main(String[] args)
    //   {
    //      DataInfo info = new DataInfo();
    //      System.out.println(info.value);
    //   }
    //}

    //Обращаться к статическим переменным можно откуда угодно (с учетом модификаторов видимости):
    //из обычных методов, из статических методов того же класса, из методов других классов и т.п.

    //Обращение к статическому полю класса не используя ссылку на объект класса
    //public class DataInfo
    //{
    //   public static int value = 100;
    //}
    //
    //public class Solution
    //{
    //   public static void main(String[] args)
    //   {
    //      System.out.println(DataInfo.value);
    //   }
    //}
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
    }
}
    //Устройство в памяти:
    //Допустим, у нас есть класс Person с 4 полями: два статических, а два — нет.
class Person
{
    public static int count = 0;
    public static int sum = 0;
    public int age = 0;
    public String name;
}
    //Сразу после загрузки класса
    //Когда Java-машина завершит загрузку класса Person, в памяти у нас будет наблюдаться такая картина:
    //Будет существовать статический объект класса Person с полями int count = 0 и int sum = 0;

    //После создания первого объекта
    //Если мы создадим объект класса Person, картинка станет такой.
    //Будет существовать статический объект класса Person с полями int count = 0 и int sum = 0;
    //и нестатический объект класса Person c полями int age = 0 и String name;

    //Нужно больше объектов.
    //Давайте создадим еще два объекта, типа Person.
    //У каждого объекта есть собственная переменная age и name, а переменные count и sum общие для всех объектов