package com.jhkim.sbp;

import com.google.firebase.database.DatabaseReference;
import com.jhkim.sbp.model.User;

public class ReadAndWriteSnippets {

    // [START declare_database_ref]
    private DatabaseReference mDatabase;
    // [END declare_database_ref]

    // [START rtdb_write_new_user]
    public void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);

        mDatabase.child("users").child(userId).setValue(user);
    }
    // [END rtdb_write_new_user]

}
