package GenerativePatterns;

public class BuilderPatternCar {

    //задаем параметры машины
    private String name;
    private String color;
    private int maxSpeed;

    private BuilderPatternCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public static class Builder {
        //задаем параметры для строителя
        private String name;
        private String color;
        private int maxSpeed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public BuilderPatternCar build(){
            return new BuilderPatternCar(this);
        }
    }

}
