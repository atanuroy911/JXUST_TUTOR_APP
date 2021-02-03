package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * Seeder for the locations database table
 */
public class TutorSeeder {

    /**
     * Function that inserts dummy tutor accounts into the DB.
     * Insert format: locationId, schoolId, profilePic, firstName, lastName, email, password, rate.
     * @param db
     */
    public static void insert(DBHelper db) {

        db.tutor.insert(1, 2, "1", "Dr Ata Jahangir", "Moshayedi", "drajm@yahoo.com", "ajm123", 100, (float) 5.0, 493);
        db.tutor.insert(2, 3, "2", "Dr Xu", "Qing", "qingxu@163.com", "xu123", 100, (float) 4.8, 451);
        db.tutor.insert(2, 2, "3", "Dr Wei", "Lee", "weili@jxust.edu.cn", "wei123", 90, (float) 4.5, 220);
        db.tutor.insert(3, 1, "4", "Md Asim", "Khattak", "asim@yahoo.com", "asim123", 50, (float) 3.5, 397);
        db.tutor.insert(1, 2, "5", "Dr Soroosh", "Mahmoodi", "soroosh@gmail.com", "soroosh123", 95, (float) 4.6, 446);


    }
}