package com.wrightcontrol.criminalintent.app.crime;

import android.support.v4.app.Fragment;
import com.wrightcontrol.criminalintent.app.R;
import com.wrightcontrol.criminalintent.app.abstraction.SingleFragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected int getLayout() {
        return R.layout.fragment_container;
    }

    @Override
    protected int getContainerID() {
        return R.id.fragment_container;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }


}
