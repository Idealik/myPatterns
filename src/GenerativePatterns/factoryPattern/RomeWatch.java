package GenerativePatterns.factoryPattern;

public class RomeWatch implements Watch{
    //Класс, который показывает римское время, реализует интерфейс Watch
    @Override
    public void showTime() {
        System.out.println("Rome time XX-XX-V");
    }
}
