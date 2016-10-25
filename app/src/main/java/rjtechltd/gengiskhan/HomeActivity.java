package rjtechltd.gengiskhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onButtonClickedBookings(View view){
        Intent intent = new Intent(this, BookingsActivity.class);
        startActivity(intent);
    }

    public void onButtonClickedAttendance(View view){
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }

    public void onButtonClickedFeedback(View view){
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }

    //public void onButtonClickedReport(View view){
      //  Intent intent = new Intent(this, ReportActivity.class);
      //  startActivity(intent);
    //}

    public void onButtonClickedLogout(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
