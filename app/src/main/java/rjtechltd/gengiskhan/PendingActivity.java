package rjtechltd.gengiskhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending);
    }

    public void clickHome(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void clickBookings(View view){
        Intent intent = new Intent(this, BookingsActivity.class);
        startActivity(intent);
    }

    public void clickAttendance(View view){
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }

    public void clickFeedback(View view){
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }

    //public void clickReport(View view){
    //    Intent intent = new Intent(this, ReportActivity.class);
    //    startActivity(intent);
    //}
}
