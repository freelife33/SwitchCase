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

    EditText number;    //EditText nesnesi oluşturuyoruz.
    Button button;      //Button nesnesi oluşturuyoruz.
    TextView textView;  //TextView nesnesi oluşturuyoruz.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            number = findViewById(R.id.editTextNumber_Ay);     // Layout'ta oluşturduğumuz EditText nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.
            button = findViewById(R.id.button_Onayla);         // Layout'ta oluşturduğumuz Button nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.
            textView = findViewById(R.id.textView);            // Layout'ta oluşturduğumuz TextView nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.


            return insets;
        });


    }

    // Burada layoutta oluşturduğumuz butonun onclick özelliğine atadığımız metodu tanımlıyoruz.
    public void Onayla(View view) {
        int ay = Integer.parseInt(number.getText().toString()); //Layout'taki EditText'ten (kullanıcıdan) gelen sayıyı aldık. Integere çevirdik ve ay değişkenine atadık.
        String ayAdi = "";  // Boş bir string değişkeni oluşturuyoruz.
        number.setText("");
        switch (ay) {                        // Gelen değeri switch case ile kontrol ediyoruz.
            case 1:                          // Gelen değer 1 ise
                ayAdi = "Ocak";              // Oluşturduğumuz string değişkene ocak yazıyoruz.
                break;                       // Kodumuzu bitiriyoruz.
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
            default:                               // Switch case dışında bir değer girilirse default çalışır.
                ayAdi = "Hatalı Giriş";            // TextView'e hata mesajı yazıyoruz.
                break;
        }
        textView.setText(ayAdi);                   // Layout'taki TextView'e ayAdi değişkenini yazıyoruz.


    }

}