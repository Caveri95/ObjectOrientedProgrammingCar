package Transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private String color;
    private final String country;
    private double engineVolume;
    private final int year;
    private String gearBox;
    private final String bodyType;
    private  String registrationNumber;
    private final int numberOfSeats;
    private boolean WinterTyre;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, String country, int year, String gearBox,
               String bodyType, String registrationNumber, int numberOfSeats, boolean winterTyre, Key key, Insurance insurance) {

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
        WinterTyre = winterTyre;
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
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               String country,
               int year
               ) {
        this(brand,
                model,
                engineVolume,
                color, country,
                year,
                "МКПП",
                "данных нет",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance());
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
            return  "автозапуск - " + autorunEngine +
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
            return  "Страховка закончит свое действие - " + endsOfInsurance +
                    ", стоимость страховки - " + costOfInsurance +
                    ", номер страхового полиса - " + numberOfInsurance;
        }
    }
    @Override
    public String toString() {
        return  "марка - " + brand +
                ", модель - " + model +
                ", цвет кузова - " + color +
                ", страна сборки - " + country +
                ", объем двигателя - " + engineVolume + "л." +
                ", год выпуска - " + year +
                ", тип коробки передач - " + gearBox +
                ", тип кузова - " + bodyType +
                ", государственный регистрационный знак - " + registrationNumber +
                ", количесвто посадочных мест - " + numberOfSeats +
                ", зимняя резина - " + isWinterTyre() +
                "  " + getKey() +
                "  " + getInsurance();
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
    public double getEngineVolume() {
        return engineVolume;
    }
    public int getYear() {
        return year;
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

    public void setColor(String color) {
        this.color = color;
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
        WinterTyre = winterTyre;
    }
    public boolean isWinterTyre() {
        return WinterTyre;
    }
}

