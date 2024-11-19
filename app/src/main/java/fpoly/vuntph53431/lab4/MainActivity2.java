package fpoly.vuntph53431.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn1 = findViewById(R.id.btnBai1);
        btn2 = findViewById(R.id.btnBai2);
        btn3 = findViewById(R.id.btnBai3);

        btn4 = findViewById(R.id.btnBai4);

        btn1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, Bai1.class);
            startActivity(intent);
        });

        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, Bai2.class);
            startActivity(intent);
        });

        btn3.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this, SliderActivity.class));
        });
        btn4.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this, TablayoutActivity.class));
        });

    }
}
