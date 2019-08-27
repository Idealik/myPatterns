package GenerativePatterns;

public class Singleton {
    //плохо тестировать (антипаттерн?)
    //Гарантирует наличие единственного экземпляра класса.
    //Предоставляет глобальную точку доступа
    //Когда в программе должен быть единственный экземпляр какого-то класса, доступный всем клиентам
    //(например, общий доступ к базе данных из разных частей программы).
    //Когда вам хочется иметь больше контроля над глобальными переменными.
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        System.out.println("GenerativePatterns.Singleton was created");
        return new Singleton();
    }

}
