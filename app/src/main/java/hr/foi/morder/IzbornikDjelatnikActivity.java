package hr.foi.morder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IzbornikDjelatnikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izbornik_djelatnik);
    }

    public void OnClickViewOrders(View view) {
    }

    public void OnClickSignOut(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}