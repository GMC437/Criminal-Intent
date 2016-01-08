package com.wrightcontrol.criminalintent.app.crime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.wrightcontrol.criminalintent.app.R;
import com.wrightcontrol.criminalintent.app.model.Crime;

/**
 * Created by Grant on 08/01/2016.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mCrimeTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime, container, false);
        instantiateWidgets(view);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    public void instantiateWidgets(View v) {
        mCrimeTitle = (EditText) v.findViewById(R.id.crime_title_edit_text);
        mCrimeTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
