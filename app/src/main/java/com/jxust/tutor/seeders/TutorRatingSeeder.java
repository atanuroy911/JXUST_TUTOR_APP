package com.jxust.tutor.seeders;

import com.jxust.tutor.models.DBHelper;

/**
 * DB seeders for tutor ratings.
 */

public class TutorRatingSeeder {

    /**
     * Function that inserts dummy tutor ratings into the DB.
     * Insert format: rating, studentId, tutorId.
     *
     * @param db
     */
    public static void insert(DBHelper db) {

        //base rating = 4
        db.tutorRating.insert((float) 4.5, 1, 1);
        db.tutorRating.insert((float) 3, 2, 1);
        db.tutorRating.insert((float) 3.5, 3, 1);
        db.tutorRating.insert((float) 4.5, 4, 1);
        db.tutorRating.insert((float) 5, 5, 1);


        //base rating = 4.5
        db.tutorRating.insert((float) 4.5, 2, 2);
        db.tutorRating.insert((float) 5, 3, 2);
        db.tutorRating.insert((float) 5, 5, 2);
        db.tutorRating.insert((float) 3.75, 6, 2);
        db.tutorRating.insert((float) 4.25, 9, 2);

        //base rating = 4.1
        db.tutorRating.insert((float) 4.5, 1, 3);
        db.tutorRating.insert((float) 4, 3, 3);
        db.tutorRating.insert((float) 4, 5, 3);
        db.tutorRating.insert((float) 4, 7, 3);
        db.tutorRating.insert((float) 4, 8, 3);

        //base rating = 3.5
        db.tutorRating.insert((float) 3.5, 1, 4);
        db.tutorRating.insert((float) 4, 2, 4);
        db.tutorRating.insert((float) 4, 5, 4);
        db.tutorRating.insert((float) 3, 7, 4);
        db.tutorRating.insert((float) 3, 8, 4);

        //base rating = 4
        db.tutorRating.insert((float) 4, 2, 5);
        db.tutorRating.insert((float) 4, 3, 5);
        db.tutorRating.insert((float) 4, 4, 5);
        db.tutorRating.insert((float) 5, 7, 5);
        db.tutorRating.insert((float) 3, 6, 5);


    }

}
