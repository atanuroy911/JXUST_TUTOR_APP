package com.jxust.tutor.seeders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.jxust.tutor.models.DBHelper;

/**
 * DB Seeders class for Tutoring Sessions.
 */
public class TutoringSessionSeeder {

    /**
     * Function that inserts dummy tutoring sessions into the DB.
     * Insert format: studentId, tutorId, locationId, title.
     * @param db
     */
    public static void insert(DBHelper db){


        DateFormat timeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        GregorianCalendar calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 5);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 11);
        calendarStartTime.set(Calendar.MONTH, 2);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 25);

        GregorianCalendar calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 5);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 12);
        calendarEndTime.set(Calendar.MONTH, 2);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 25);

        String startTime = timeFormatter.format(calendarStartTime.getTime());
        String endTime = timeFormatter.format(calendarEndTime.getTime());

        db.tutoringSession.insert(1,1,1,1,"Meeting at Starbucks at Bubugao", startTime, endTime);

        calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 1);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 11);
        calendarStartTime.set(Calendar.MONTH, 2);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 25);

        calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 1);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 12);
        calendarEndTime.set(Calendar.MONTH, 2);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 25);
        startTime = timeFormatter.format(calendarStartTime.getTime());
        endTime = timeFormatter.format(calendarEndTime.getTime());
        db.tutoringSession.insert(2,1,1,1,"Meeting at English Corner beside Architecture building", startTime, endTime);

        calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 7);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 11);
        calendarStartTime.set(Calendar.MONTH, 2);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 25);

        calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 7);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 12);
        calendarEndTime.set(Calendar.MONTH, 2);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 25);
        startTime = timeFormatter.format(calendarStartTime.getTime());
        endTime = timeFormatter.format(calendarEndTime.getTime());
        db.tutoringSession.insert(1,1,2,1,"Meeting at Canteen on Main Campus", startTime, endTime);
        calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 3);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 11);
        calendarStartTime.set(Calendar.MONTH, 2);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 25);

        calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 3);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 12);
        calendarEndTime.set(Calendar.MONTH, 2);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 25);
        startTime = timeFormatter.format(calendarStartTime.getTime());
        endTime = timeFormatter.format(calendarEndTime.getTime());
        db.tutoringSession.insert(3,1,1,1,"Meeting at Karado Coffee", startTime, endTime);
        db.tutoringSession.insert(2,5,2,1,"Meeting at JXUST library", startTime, endTime);
        db.tutoringSession.insert(1,3,1,1,"Meeting at Public Library 4th floor", startTime, endTime);
        db.tutoringSession.insert(1,5,1,1,"Meeting at Dept. of Information Engineering", startTime, endTime);
        db.tutoringSession.insert(1,4,1,1,"Meeting at JXUST Student Union Building", startTime, endTime);

        calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 20);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 11);
        calendarStartTime.set(Calendar.MONTH, 5);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 25);

        calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 20);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 12);
        calendarEndTime.set(Calendar.MONTH, 5);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 25);
        startTime = timeFormatter.format(calendarStartTime.getTime());
        endTime = timeFormatter.format(calendarEndTime.getTime());
        db.tutoringSession.insert(1,1,2,1,"Meeting at MixC Starbucks Coffee", startTime, endTime);
        db.tutoringSession.insert(1,3,4,1,"Meeting at Public Library", startTime, endTime);
        db.tutoringSession.insert(1,5,4,1,"Meeting at Public Library", startTime, endTime);
        db.tutoringSession.insert(1,2,3,1,"Meeting at Public Library", startTime, endTime);

        calendarStartTime = new GregorianCalendar();
        calendarStartTime.set(Calendar.DAY_OF_MONTH, 29);
        calendarStartTime.set(Calendar.HOUR_OF_DAY, 4);
        calendarStartTime.set(Calendar.MONTH, 2);
        calendarStartTime.set(Calendar.YEAR, 2020);
        calendarStartTime.set(Calendar.MINUTE, 00);

        calendarEndTime = new GregorianCalendar();
        calendarEndTime.set(Calendar.DAY_OF_MONTH, 29);
        calendarEndTime.set(Calendar.HOUR_OF_DAY, 4);
        calendarEndTime.set(Calendar.MONTH, 2);
        calendarEndTime.set(Calendar.YEAR, 2020);
        calendarEndTime.set(Calendar.MINUTE, 30);
        startTime = timeFormatter.format(calendarStartTime.getTime());
        endTime = timeFormatter.format(calendarEndTime.getTime());

        db.tutoringSession.insert(1,1,2,1,"Meeting at BBG Starbucks Coffee", startTime, endTime);
    }
}
