package GenerativePatterns.factoryPattern;

public class DigitalWatchMaker implements WatchMaker {
    //конкретный производитель цифровых часов
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
