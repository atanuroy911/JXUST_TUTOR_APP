package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the locations database table
 */
public class LocationSeeder {

    /**
     * Function that inserts dummy locations into the DB
     * @param db
     */
    public static void insert(DBHelper db){
        db.location.insert("86 Hongqi Avenue, Ganzhou");
        db.location.insert("156 Kejia Avenue, Ganzhou");
        db.location.insert("34 Songcheng Road, Ganzhou");
    }
}
