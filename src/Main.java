import Transport.Car;
import Transport.CarTools;
import Transport.Car.Key;
import Transport.Car.Insurance;
import Transport.Bus;
import com.sun.jdi.connect.Transport;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Car LadaGranta = new Car("Lada", "Granta", 1.7, "желтый", "Россия", 2015, "МКПП", "Седан", "Х355ОР178", 5, false, new Key(),new Insurance(), 180);
        Car AudiA8 = new Car("Audi", "A8 50 L", 3.0, "черный", "Германия", 2020, "РКПП", "седан", "В323УА178", 4, true, new Key(true, true),new Insurance(),250);
        Car BMWZ8 = new Car("BMW", "Z8", 3.0, "черный", "Германия", 2021, "АКПП", "купе", "Р579ОН777", 2, false, new Key(false, true), new Insurance(),280);
        Car KiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", "Южная Корея", 2018, "АКПП", "кроссовер", "Р379ОН799", 5, false, new Key(false, true), new Insurance(),170);
        Car HyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", "Южная Корея", 2016, "МКПП", "седан", "В258УА777", 4, false, new Key(),new Insurance(LocalDate.now(),15000, "123456789"), 190);

        System.out.println(AudiA8);
        System.out.println(LadaGranta);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HyundaiAvante);


        System.out.println(CarTools.validRegistrationDigital(LadaGranta));
        CarTools.needToUseWinterTires(BMWZ8);


        Bus MAZ101 = new Bus("МАЗ", "101", "Росссия", 1994, "синий", 100);
        Bus MAZ103 = new Bus("Маз", "103", "Росссия", 2008, "черный", 110);
        Bus MAZ104 = new Bus("Маз", "104", "Росссия", 2005, "белый", 120);
        System.out.println(MAZ101);
        System.out.println(MAZ103);
        System.out.println(MAZ104);


    }
}