package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the courses database table
 */
public class CourseSeeder {

    /**
     * Function that inserts dummy courses into the DB
     * @param db
     */
    public static void insert(DBHelper db){
        db.course.insert("Mobile App Development","CSCI4176");
        db.course.insert("Discrete Mathematics","MATH2112");
        db.course.insert("Digital Image Processing","CST3342");
        db.course.insert("Assembly Language","CSCI2121");
        db.course.insert("Design and Analysis of Algorithms","CSCI3110");
        db.course.insert("Operating Systems","CSCI3120");
        db.course.insert("Software Engineering","CSCI3130");
        db.course.insert("Object Oriented and Generic Programming","CSCI3132");
        db.course.insert("PhP Web Development","CSCI3136");
        db.course.insert("Computer Networking","CSCI3171");
        db.course.insert("Probability and Statistics","STAT2060");
    }
}