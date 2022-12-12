public class Car {

    String brand;
    String model;
    String color;
    String country;
    double engineVolume;
    int year;

    public Car(String brand, String model, double engineVolume, String color, String country, int year) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }
    @Override
    public String toString() {
        return  "марка - " + brand +
                ", модель - " + model +
                ", цвет кузова - " + color +
                ", страна сборки - " + country +
                ", объем двигателя - " + engineVolume + "л." +
                ", год выпуска - " + year;
    }
}

