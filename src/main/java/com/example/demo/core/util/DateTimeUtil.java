package com.example.demo.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
public final class DateTimeUtil {

    public static final String DATE_FORMAT="yyyy-MM-dd";

    public static final String DATE_TIME_FORMAT="yyyy-MM-dd HH:mm:ss";

    /**
     * 取年份
     * @param date
     * @return
     */
    public static int getYear(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    /**
     * 取年份
     * @param date
     * @return
     */
    public static int getMonth(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }


    /**
     * 取日期
     * @param date
     * @return
     */
    public static int getDate(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DATE);
    }


    /**
     * 转日期对象
     * @param sourse
     * @return
     */
    public static Date parseDateFormat(String sourse){
        return parse(sourse,DATE_FORMAT);
    }

    /**
     * 转日期对象
     * @param sourse
     * @return
     */
    public static Date parseDateTimeFormat(String sourse){
        return parse(sourse,DATE_TIME_FORMAT);
    }

    /**
     * 日期转字符串
     * @param date
     * @return
     */
    public static String dateFormat(Date date){
        return format(date,DATE_FORMAT);
    }

    /**
     * 日期转字符串
     * @param date
     * @return
     */
    public static String dateTimeFormat(Date date){
        return format(date,DATE_TIME_FORMAT);
    }
    /**
     * 日期转字符串
     * @param date
     * @param format
     * @return
     */
    public static String format(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return  simpleDateFormat.format(date);
    }
    /**
     * 转日期对象
     * @param sourse
     * @param format
     * @return
     */
    public static Date parse(String sourse,String format){
        Date date=null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            date= simpleDateFormat.parse(sourse);
        } catch (ParseException e) {
        }
        return date;
    }
}
