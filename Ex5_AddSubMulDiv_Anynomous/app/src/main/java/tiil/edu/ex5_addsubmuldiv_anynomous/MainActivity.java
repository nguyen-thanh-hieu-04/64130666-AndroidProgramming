package tiil.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien(){
        EditText editTextSo1 =(EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 =(EditText)findViewById(R.id.edtSo2);
        EditText editTextKQ= (EditText)findViewById(R.id.edtKetQua);
        nutCong =(Button) findViewById(R.id.btnCong);
        nutTru =(Button) findViewById(R.id.btnTru);
        nutNhan =(Button) findViewById(R.id.btnNhan);
        nutChia =(Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        View.OnClickListener bolangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyCong();

            }
        };
        nutCong.setOnClickListener(bolangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();

            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               XuLyNhan();

            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();

            }
        });
    }

    public void XuLyCong(){

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        float soA= Float.parseFloat(soThu1);
        float soB= Float.parseFloat(soThu2);

        float Tong= soA + soB;

        String chuoiKQ= String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyTru(){

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        float soA= Float.parseFloat(soThu1);
        float soB= Float.parseFloat(soThu2);

        float Hieu= soA - soB;

        String chuoiKQ= String.valueOf(Hieu);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(){

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        float soA= Float.parseFloat(soThu1);
        float soB= Float.parseFloat(soThu2);

        float Tich= soA * soB;

        String chuoiKQ= String.valueOf(Tich);
        editTextKQ.setText(chuoiKQ);

    }

    public void XuLyChia(){

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();

        float soA= Float.parseFloat(soThu1);
        float soB= Float.parseFloat(soThu2);

        float Thuong= soA / soB;

        String chuoiKQ= String.valueOf(Thuong);
        editTextKQ.setText(chuoiKQ);

    }
}
