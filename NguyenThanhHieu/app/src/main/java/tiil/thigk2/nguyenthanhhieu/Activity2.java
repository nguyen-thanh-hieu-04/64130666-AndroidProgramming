package tiil.thigk2.nguyenthanhhieu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    private EditText edtGiuaky, edtCuoiky, edtKetqua;
    private Button btnTinhDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        edtGiuaky = findViewById(R.id.edtGiuaky);
        edtCuoiky = findViewById(R.id.edtCuoiky);
        edtKetqua = findViewById(R.id.edtKetqua);
        btnTinhDiem = findViewById(R.id.btnTinhDiem);

        // Xử lý khi nhấn nút tính điểm
        btnTinhDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhDiemTrungBinh();
            }
        });
    }

    private void tinhDiemTrungBinh() {
        String strGiuaky = edtGiuaky.getText().toString();
        String strCuoiky = edtCuoiky.getText().toString();

        // Kiểm tra nếu người dùng chưa nhập điểm
        if (strGiuaky.isEmpty() || strCuoiky.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ điểm!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Chuyển đổi điểm từ chuỗi sang số
            float diemGiuaky = Float.parseFloat(strGiuaky);
            float diemCuoiky = Float.parseFloat(strCuoiky);

            // Kiểm tra điểm có hợp lệ không (0 - 10)
            if (diemGiuaky < 0 || diemGiuaky > 10 || diemCuoiky < 0 || diemCuoiky > 10) {
                Toast.makeText(this, "Điểm phải từ 0 đến 10!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Tính điểm trung bình
            float diemTrungBinh = (diemGiuaky * 0.5f) + (diemCuoiky * 0.5f);

            // Hiển thị kết quả
            edtKetqua.setText(String.format("%.2f", diemTrungBinh));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng nhập đúng định dạng số!", Toast.LENGTH_SHORT).show();
        }
    }
}
