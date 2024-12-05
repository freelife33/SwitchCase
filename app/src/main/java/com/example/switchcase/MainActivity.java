package com.example.switchcase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    EditText number;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            number = findViewById(R.id.editTextNumber_Ay);
            button = findViewById(R.id.button_Onayla);
            textView = findViewById(R.id.textView);


            return insets;
        });


    }

    public void Onayla(View view) {
        int ay = Integer.parseInt(number.getText().toString());
        String ayAdi = "";
        number.setText("");
        switch (ay) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = "Şubat";
                break;
            case 3:
                ayAdi = "Mart";
                break;
            case 4:
                ayAdi = "Nisan";
                break;
            case 5:
                ayAdi = "Mayıs";
                break;
            case 6:
                ayAdi = "Haziran";
                break;
            case 7:
                ayAdi = "Temmuz";
                break;
            case 8:
                ayAdi = "Ağustos";
                break;
            case 9:
                ayAdi = "Eylül";
                break;
            case 10:
                ayAdi = "Ekim";
                break;
            case 11:
                ayAdi = "Kasım";
                break;
            case 12:
                ayAdi = "Aralık";
                break;
            default:
                ayAdi = "Hatalı Giriş";
                break;
        }
        textView.setText(ayAdi);


    }

}