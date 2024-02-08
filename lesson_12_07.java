public class lesson_12_07 {
    //Статические методы
    //Кроме статических переменных, в классах могут быть и статические методы.

    //Обычные методы привязаны к объектам (экземплярам) класса и могут обращаться к обычным-переменным класса
    //(а также к статическим переменным и методам).
    //Статические же методы привязаны к статическому объекту класса и могут обращаться только к статическим переменным
    //и/или другим статическим методам класса.

    //Чтобы вызвать обычный метод у класса, сначала нужно создать объект этого класса, а только потом вызвать метод у объекта.
    //Вызвать обычный метод не у объекта, а у класса нельзя.

    //Вызвать нестатический метод у класса нельзя!
    //public class DataInfo
    //{
    //   public int getValue()
    //   {
    //      return 100;
    //   }
    //}
    //
    //public class Solution
    //{
    //   public static void main(String[] args)
    //   {
    //      System.out.println(DataInfo.getValue()); // тут будет ошибка!
    //   }
    //}

    //А чтобы вызвать статический метод, достаточно чтобы просто существовал статический объект класса
    //(который всегда существует после загрузки класса в память). Именно поэтому метод main() — статический.
    //Он привязан к статическому объекту класса, для его вызова не нужно создавать никакие объекты.

    //Чтобы объявить метод статическим, нужно перед заголовком метода написать ключевое слово static. Общий вид этой конструкции такой:
    //static тип имя(параметры)
    //{
    //   КОД МЕТОДА
    //}

    //Чтобы вызвать статический метод из другого класса, нужно указать имя класса перед именем статического метода.
    //Общий вид этой конструкции такой:
    //Тип имя = ИмяКласса.имяМетода(параметры)
    public static void main(String args[])
    {
        Solution.test();
    }

}
class Solution {
    static int a = 2;
    static int b = 3;
    public static void test()
    {
        int d = 2/0;
        int x = Math.min(a, b);

    }
}

