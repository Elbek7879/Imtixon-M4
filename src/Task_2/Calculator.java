package Task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calculator {

    public static void main(String[] args) {

        // bir oyda necha soat ishlagani
        int shanba = 6 * 4;
        int yakshanba = 9 * 4;
        int umumiyBirOyda = shanba + yakshanba;
        System.out.println("Bir oyda: " + umumiyBirOyda);

        // umumiy ish soati 2019-yil 1-martdan 2024-yil 30-sentabrgacha 67 oy mavjud
        int opshi = umumiyBirOyda * 67;
        System.out.println("Umumiy ish soati: " + opshi);

//==============================================================================================================//

        LocalDate boshi = LocalDate.of(2019,3,1);
        LocalDate oxiri = LocalDate.of(2024,9,30);

        int summa = 0;

        while (!boshi.isAfter(oxiri)){
            DayOfWeek dayOfWeek = boshi.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY){
                summa = summa + 6;
            } else if (dayOfWeek == DayOfWeek.SUNDAY) {
                summa = summa + 9;
            }
            boshi = boshi.plusDays(1);
        }
        System.out.println("Ofshi ish soati => " + summa);
    }



}

