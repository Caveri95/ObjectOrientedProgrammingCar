package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private double engineVolume;
    private boolean WinterTyre;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, String country, int year, String gearBox,
               String bodyType, String registrationNumber, int numberOfSeats, boolean winterTyre, Key key, Insurance insurance, int maxSpeed) {
        super(brand, model, country, year, color, maxSpeed);

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (gearBox != null && !gearBox.isEmpty() && !gearBox.isBlank()) {
            this.gearBox = gearBox;
        } else {
            this.gearBox = "данных нет";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "данных нет";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "x000xx000";
        }
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 5;
        }
        this.WinterTyre = winterTyre;
        if (key != null) {
            this.key = key;
        } else {
            this.key = new Key();
        }
        if (insurance != null) {
            this.insurance = insurance;
        } else {
            this.insurance = new Insurance();
        }
    }

    public static class Key {
        private final boolean autorunEngine;
        private final boolean freeKey;

        public Key(boolean autorunEngine, boolean freeKey) {
            this.autorunEngine = autorunEngine;
            this.freeKey = freeKey;
        }

        public Key() {
            this(false, false);
        }

        public boolean isAutorunEngine() {
            return autorunEngine;
        }

        public boolean isFreeKey() {
            return freeKey;
        }

        @Override
        public String toString() {
            return "автозапуск - " + autorunEngine +
                    ", бесключевой доступ - " + freeKey;
        }
    }

    public static class Insurance {
        private final LocalDate endsOfInsurance;
        private final double costOfInsurance;
        private final String numberOfInsurance;

        public Insurance(LocalDate endsOfInsurance, int costOfInsurance, String numberOfInsurance) {
            if (endsOfInsurance == null) {
                this.endsOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.endsOfInsurance = endsOfInsurance;
            }
            this.costOfInsurance = costOfInsurance;
            if (numberOfInsurance != null && !numberOfInsurance.isEmpty() && !numberOfInsurance.isBlank()) {
                this.numberOfInsurance = numberOfInsurance;
            } else {
                this.numberOfInsurance = "000000000";
            }
        }

        public Insurance() {
            this(null, 0, "000000000");
        }

        public LocalDate getEndsOfInsurance() {
            return endsOfInsurance;
        }

        public double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }

        public void chekInsurance(LocalDate endsOfInsurance) {
            if (endsOfInsurance.isBefore(LocalDate.now()) || endsOfInsurance.equals(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void chekNumberInsurance() {
            if (numberOfInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        @Override
        public String toString() {
            return "Страховка закончит свое действие - " + endsOfInsurance +
                    ", стоимость страховки - " + costOfInsurance +
                    ", номер страхового полиса - " + numberOfInsurance;
        }
    }
    @Override
    public String toString() {
        return  "марка - " + getBrand() +
                ", модель - " + getModel()+
                ", цвет кузова - " + getColor() +
                ", страна сборки - " + getCountry() +
                ", объем двигателя - " + engineVolume + "л." +
                ", год выпуска - " + getYear() +
                ", тип коробки передач - " + gearBox +
                ", тип кузова - " + bodyType +
                ", государственный регистрационный знак - " + registrationNumber +
                ", количесвто посадочных мест - " + numberOfSeats +
                ", зимняя резина - " + isWinterTyre() +
                " " + getKey() +
                " " + getInsurance() +
                ", максимальная скорость - " + getMaxSpeed();
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public String getGearBox() {
        return gearBox;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }
    public void setGearBox(String gearBox) {
        if (gearBox != null && !gearBox.isEmpty() && !gearBox.isBlank()) {
            this.gearBox = gearBox;
        } else {
            this.gearBox = "данных нет";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTyre(boolean winterTyre) {
        this.WinterTyre = winterTyre;
    }
    public boolean isWinterTyre() {
        return WinterTyre;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 &&
                getYear() == car.getYear() &&
                numberOfSeats == car.numberOfSeats &&
                WinterTyre == car.WinterTyre &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getCountry(), car.getCountry()) &&
                Objects.equals(gearBox, car.gearBox) &&
                Objects.equals(bodyType, car.bodyType) &&
                Objects.equals(registrationNumber, car.registrationNumber) &&
                Objects.equals(key, car.key) &&
                Objects.equals(insurance, car.insurance) &&
                Objects.equals(getMaxSpeed(), car.getMaxSpeed());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getBrand(),
                getModel(),
                getColor(),
                getCountry(),
                engineVolume,
                getYear(),
                gearBox,
                bodyType,
                registrationNumber,
                numberOfSeats,
                WinterTyre,
                key,
                insurance,
                getMaxSpeed());
    }
}

