package rjtechltd.gengiskhan;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnLogin(View v){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if(netInfo != null && netInfo.isConnectedOrConnecting()){
            Toast.makeText(this, "Yes you are connected", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(this, "No you are not connected", Toast.LENGTH_LONG).show();
    }

    public void onButtonClicked(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
