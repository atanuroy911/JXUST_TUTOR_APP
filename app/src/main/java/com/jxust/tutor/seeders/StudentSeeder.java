package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the students database table
 */
public class StudentSeeder {

    /**
     * Function that inserts dummy student accounts into the DB.
     * Insert format: schoolId, profilePic, firstName, lastName, email, password.
     * @param db
     */
    public static void insert(DBHelper db){
        db.student.insert(1, null, "Sakahawat", "Hossain", "sk@gmail.com", "sk123");
        db.student.insert(3, null, "Atanu", "Roy", "atanuroy911@gmail.com", "digimon123");
        db.student.insert(2, null, "Khaya", "Sambo", "khayasambo@gmail.com", "khaya123");
        db.student.insert(4, null, "Sazedul", "Haque", "sajedulhaque12@gmail.com", "saze1998");
        db.student.insert(5, null, "Rawnak", "Ahmed", "safwanahmed42@gmail.com", "tasmia<3");
    }
}
