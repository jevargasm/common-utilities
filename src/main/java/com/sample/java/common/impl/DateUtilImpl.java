package com.sample.java.common.impl;

import com.sample.java.common.DateUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtilImpl implements DateUtil {
    @Override
    public String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }
}
