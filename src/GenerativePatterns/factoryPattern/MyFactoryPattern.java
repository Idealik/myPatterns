package GenerativePatterns.factoryPattern;

public class MyFactoryPattern {

    public MyFactoryPattern(String watchType){
        //пусть у нас буджет производитель часов, здесь мы указываем, какие конкретно часы он производит
        WatchMaker maker  = getWatchByType(watchType);
        //создаем интерфейс и говорим произодителю, создай их! Тем самым, все, что ниже, больше не меняется, меняется только maker
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    private static WatchMaker getWatchByType(String type){
        if(type.equals("digital")){
            return new DigitalWatchMaker();
        }
        else if (type.equals("rome")){
            return new RomeWatchMaker();
        }

        throw new RuntimeException("Не поддреживается производство таких часов " + type);
    }


}