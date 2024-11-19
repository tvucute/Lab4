package fpoly.vuntph53431.lab4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import fpoly.vuntph53431.lab4.fragment.ContactFragment;
import fpoly.vuntph53431.lab4.fragment.HomeFragment;

public class Bai1 extends AppCompatActivity {
    FrameLayout frameLayout;
    Button btnHome, btnContact;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        frameLayout = findViewById(R.id.frContent);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);
        fragmentManager = getSupportFragmentManager();
        btnHome.setOnClickListener(view -> {
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.frContent, homeFragment).commit();

        });

        btnContact.setOnClickListener(view -> {
            ContactFragment contactFragment = new ContactFragment();
            fragmentManager.beginTransaction().replace(R.id.frContent, contactFragment).commit();
        });
    }
}
