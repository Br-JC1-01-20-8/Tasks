package jc01_2020.test02;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper {

    public static Employee getEmployee() throws IOException, ClassNotFoundException {
        Повар cook = new Повар();
        cook.setName("Вениамин Коротышкин");
        cook.setDepartment(Department.A2);
        cook.setStartDate(LocalDate.now().minusYears(1));
        cook.setEndDate(null);
        cook.setRewards(getRewards());
        return cook;
    }

    private static List<Reward> getRewards() {
        return new ArrayList<>(Arrays.asList(
                new Reward(LocalDate.of(2015, 4, 10), "Мастер-шеф завтраков"),
                new Reward(LocalDate.of(209, 7, 7), "Мишленовская звезда"),
                new Reward(LocalDate.of(2018, 11, 15), "Шеф-повар кафе \"У Ашота\""),
                new Reward(LocalDate.of(2014, 8, 22), "Гуру омлета"),
                new Reward(LocalDate.of(2015, 1, 21), "Сертификат жареной картошечки")
        ));
    }

}
