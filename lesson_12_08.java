public class lesson_12_08 {
    //В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
    //Затем округли полученное значение, используя статический метод round класса Math.
    //Результат выведи на экран.

    public static void main(String[] args) {
        String string = "12.84";
        double d = Double.parseDouble(string);
        int i = (int) Math.round(d);
        System.out.println(i);
    }
}
