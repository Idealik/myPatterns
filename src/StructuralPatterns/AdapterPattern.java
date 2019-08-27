package StructuralPatterns;

public class AdapterPattern {

}

//Есть класс, который рисует в векторной графике, но есть также класс, рисующий в растровой
//Интерфейс векторной графики не совпадает, поэтому нужен адаптер, который наследует интерфейс векторной графики
//вызывая в них методы растровой графики


class VectorGraphics implements IVectorGraphics {
    @Override
    public void drawLine() {
        System.out.println("Draw vector line");
    }

    @Override
    public void drawCircle() {
        System.out.println("Draw vector circle");
    }
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Draw raster line");
    }
    void drawRasterCircle(){
        System.out.println("Draw raster circle");
    }
}

