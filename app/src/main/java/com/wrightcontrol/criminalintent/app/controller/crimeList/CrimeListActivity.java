package com.wrightcontrol.criminalintent.app.controller.crimeList;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.wrightcontrol.criminalintent.app.R;
import com.wrightcontrol.criminalintent.app.controller.abstraction.SingleFragmentActivity;
import com.wrightcontrol.criminalintent.app.controller.crime.CrimeFragment;
import com.wrightcontrol.criminalintent.app.controller.crimePager.CrimePagerActivity;
import com.wrightcontrol.criminalintent.app.model.Crime;

/**
 * Created by Grant on 10/01/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks, CrimeFragment.Callbacks {
    @Override
    protected int getLayout() {
        return R.layout.fragment_container_master_detail;
    }

    @Override
    protected int getContainerID() {
        return R.id.fragment_container;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    public void onCrimeSelected(Crime crime) {
        if (findViewById(R.id.detail_fragment_container) == null) {
            Intent intent = CrimePagerActivity.newIntent(this, crime.getId());
            startActivity(intent);
        } else {
            Fragment newDetail = CrimeFragment.newInstance(crime.getId());

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }
    }

    @Override
    public void onCrimeUpdated(Crime crime) {
        CrimeListFragment listFragment = (CrimeListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container);
        listFragment.updateUI();
    }
}
