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


public class Fragment1 extends Fragment {

    EditText edtcontent1;
    Button btnSend1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        edtcontent1 = view.findViewById(R.id.edtcontent1);
        btnSend1 = view.findViewById(R.id.btnSend1);

        btnSend1.setOnClickListener(view1 ->    {
            String content1 = edtcontent1.getText().toString().trim();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

            Fragment2 fragment2 =(Fragment2)  fragmentManager.findFragmentById(R.id.frg2);
            fragment2.edtcontent2.setText(content1);
        });
        return view;
    }
}
