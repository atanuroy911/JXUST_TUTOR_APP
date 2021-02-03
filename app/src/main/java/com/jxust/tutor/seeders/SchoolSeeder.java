package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the schools database table
 */
public class SchoolSeeder {

    /**
     * Function that inserts dummy schools into the DB
     * insert format: school_name, locationID, school_type
     * @param db
     */
    public static void insert(DBHelper db){
        db.school.insert("Jiangxi University of Science and Technology (West Campus)",3,"University");
        db.school.insert("Jiangxi University of Science and Technology (Main Campus)",1,"University");
        db.school.insert("Jiangxi University of Science and Technology (Golden Campus)",2,"University");
    }
}
