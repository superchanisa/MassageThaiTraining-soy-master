package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Come extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.come);

    }   // Main Method

    public void clickButton7(View view) {
        startActivity(new Intent(Come.this, MainHub.class));
        Log.d("7jan", "Click button7");
    }



}   // Main Class
