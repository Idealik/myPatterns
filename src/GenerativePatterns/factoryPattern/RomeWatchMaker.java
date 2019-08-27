package GenerativePatterns.factoryPattern;

public class RomeWatchMaker implements WatchMaker {
    //конкретный производитель римских часов
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
