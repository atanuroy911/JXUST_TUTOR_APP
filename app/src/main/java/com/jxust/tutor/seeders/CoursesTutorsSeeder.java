package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the courses_tutors database table
 */
public class CoursesTutorsSeeder {

    /**
     * Function that connects courses with tutors in the DB
     * @param db
     */
    public static void insert(DBHelper db){
        db.coursesTutors.insertCoursesTutors(1, 1);
        db.coursesTutors.insertCoursesTutors(1, 2);
        db.coursesTutors.insertCoursesTutors(1,3);
        db.coursesTutors.insertCoursesTutors(3,10);
        db.coursesTutors.insertCoursesTutors(4,5);
        db.coursesTutors.insertCoursesTutors(4,9);
        db.coursesTutors.insertCoursesTutors(2,6);
        db.coursesTutors.insertCoursesTutors(2,7);
        db.coursesTutors.insertCoursesTutors(2,8);
        db.coursesTutors.insertCoursesTutors(5,4);
        db.coursesTutors.insertCoursesTutors(5,11);
    }
}
