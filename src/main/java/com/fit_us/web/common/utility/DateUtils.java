package com.fit_us.web.common.utility;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate parseDate(String date){
        return LocalDate.parse(date);
    }
}
