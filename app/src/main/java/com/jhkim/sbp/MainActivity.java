package com.jhkim.sbp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jhkim.sbp.databinding.ActivityMainBinding;
import com.jhkim.sbp.model.User;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    public FirebaseDatabase database = FirebaseDatabase.getInstance();
    public DatabaseReference myRef = database.getReference("message");

    ReadWriteHelpers rwHelpers = new ReadWriteHelpers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /**
         *
         */
        binding.dbWrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = "44";
                String email = "44";
                String userId = "lee";
                String password = "pwd1";
                // 사용자 추가
                rwHelpers.writeNewUser(userName, userId, password, email);
            }
        });
    }

    /**
     * DB에 데이터 넣기
     *
     * @param view
     */
    public void showadss(View view) {
        myRef.setValue("Hello, World!");
    }

//    public void writeNewUser(String userId, String name, String email) {
//        name = "1";
//        email = "2";
//        userId = "kim";
//        User user = new User(name, email);
//
//        database.getReference().child("users").child(userId).setValue(user);
//
//    }

    // Read from the database
    /**
     * DB에서 데이터 읽기
     *
     * @param view
     */
    public void readData(View view) {
        myRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d("데이터READ", "Value is: " + value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w("데이터READ", "Failed to read value.", error.toException());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }
}