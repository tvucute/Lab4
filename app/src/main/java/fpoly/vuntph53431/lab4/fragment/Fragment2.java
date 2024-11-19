package fpoly.vuntph53431.lab4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import fpoly.vuntph53431.lab4.R;


public class Fragment2 extends Fragment {

    EditText edtcontent2;
    Button btnSend2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        edtcontent2 = view.findViewById(R.id.edtcontent2);
        btnSend2 = view.findViewById(R.id.btnSend2);

        btnSend2.setOnClickListener(view1 -> {
            String content2 = edtcontent2.getText().toString().trim();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

            Fragment1 fragment1 =(Fragment1)  fragmentManager.findFragmentById(R.id.frg1);
            fragment1.edtcontent1.setText(content2);
        });
        return view;
    }
}
