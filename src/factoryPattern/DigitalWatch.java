package factoryPattern;

import java.util.Date;

public class DigitalWatch implements Watch {
    //Класс, который показывает текущее цифровое время, реализует интерфейс Watch
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
