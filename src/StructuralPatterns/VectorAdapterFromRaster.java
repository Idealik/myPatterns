package StructuralPatterns;

public class VectorAdapterFromRaster extends RasterGraphics implements IVectorGraphics{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawCircle() {
        drawRasterCircle();
    }
}