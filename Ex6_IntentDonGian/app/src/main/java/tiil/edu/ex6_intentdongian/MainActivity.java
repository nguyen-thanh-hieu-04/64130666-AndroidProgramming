package tiil.edu.ex6_intentdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutMH2;
    Button nutMH3;

    void TimDieuKhien(){
        nutMH2 = (Button) findViewById(R.id.btnMH2);
        nutMH3 = (Button) findViewById(R.id.btnMH3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimDieuKhien();
        nutMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMH2 = new Intent(MainActivity.this, MH2Activity.class);
                startActivity(intentMH2);
            }
        });

        nutMH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMH3 = new Intent(MainActivity.this, MH3Activity.class);
                startActivity(intentMH3);

            }
        });
    }
}