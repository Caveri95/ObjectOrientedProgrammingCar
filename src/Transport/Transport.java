package Transport;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private final String country;
    private final int year;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, String country, int year, String color, int maxSpeed) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "данных нет";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "данных нет";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "данных нет";
        }

        if (year > 0) {
            this.year = year;
        } else {
            this.year = 0;
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "данных нет";
        }

        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "данных нет";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    @Override
    public String toString() {
        return  "Марка - " + brand +
                ", модель - " + model +
                ", страна сборки - " + country +
                ", год выпуска - " + year +
                ", цвет кузова - " + color +
                ", максимальная скорость - " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return year == transport.year &&
                maxSpeed == transport.maxSpeed &&
                Objects.equals(brand, transport.brand) &&
                Objects.equals(model, transport.model) &&
                Objects.equals(country, transport.country) &&
                Objects.equals(color, transport.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, country, year, color, maxSpeed);
    }
}
