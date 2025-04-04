package tiil.thigk2.nguyenthanhhieu;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button bntChucnang2 = (Button) findViewById(R.id.btnchucnang2);

        bntChucnang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChucnang2 = new Intent(MainActivity.this, Activity_2.class);
                startActivity(iChucnang2);
            }
        });

        Button bntChucnang3 = (Button) findViewById(R.id.btnchucnang3);

        bntChucnang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChucnang3 = new Intent(MainActivity.this, Activity_3.class);
                startActivity(iChucnang3);
            }
        });

        Button bntAboutme = (Button) findViewById(R.id.btnaboutme);

        bntAboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAboutme = new Intent(MainActivity.this, AboutMe.class);
                startActivity(iAboutme);
            }
        });

        Button bntChucnang4 = (Button) findViewById(R.id.btnchucnang4);

        bntChucnang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChucnang4 = new Intent(MainActivity.this, Activity_4.class);
                startActivity(iChucnang4);
            }
        });

    }
}