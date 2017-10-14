package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = formate.format(cal.getTime());
        System.out.println(formatted);
    }
}
