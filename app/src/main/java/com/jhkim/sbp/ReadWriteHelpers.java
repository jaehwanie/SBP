package com.jhkim.sbp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jhkim.sbp.model.User;

public class ReadWriteHelpers {

    // [START declare_database_ref]
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    // [END declare_database_ref]

    /**
     * 새로운 사용자 추가
     * @param userName 사용자 이름
     * @param userId 사용자 ID
     * @param password 패스워드
     * @param email 이메일
     */
    public void writeNewUser(String userName, String userId, String password, String email) {
        User user = new User(userName, userId, password, email);
        mDatabase.getReference().child("users").child(userId).setValue(user);

    }

}
