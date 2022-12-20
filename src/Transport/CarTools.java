package Transport;

import java.time.LocalDate;

public class CarTools {
    public static boolean validRegistrationDigital (Car car) {
        String letters = "А, В, Е, К, М, Н, О, Р, С, Т, У, Х";
        return letters.contains(car.getRegistrationNumber().substring(0,1)) &&
                letters.contains(car.getRegistrationNumber().substring(4,5)) &&
                letters.contains(car.getRegistrationNumber().substring(5,6)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(1)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(2)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(3)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(6)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(7)) &&
                Character.isDigit(car.getRegistrationNumber().charAt(8));
    }

    public static void needToUseWinterTires(Car car) {
        boolean tyres = (LocalDate.now().getMonthValue() == 12 ||
                LocalDate.now().getMonthValue() == 1 ||
                LocalDate.now().getMonthValue() == 2) &&
                !car.isWinterTyre();
       System.out.println("Машина: " + car.getBrand() + " " + car.getModel() +
                ". Месяц сейчас: " + LocalDate.now().getMonthValue() +
                ". Установлена ли на машине сейчас зимняя резина: " +
                car.isWinterTyre() + ". Требуется ли замена резины: " + tyres);
    }
}

