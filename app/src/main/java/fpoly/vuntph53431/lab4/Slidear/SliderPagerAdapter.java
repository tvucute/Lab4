package fpoly.vuntph53431.lab4.Slidear;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fpoly.vuntph53431.lab4.fragment.SliderFragment;



public class SliderPagerAdapter extends FragmentStateAdapter {
    public static final int NUMBER_PAGE = 5;
    public SliderPagerAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        SliderFragment sliderFragment = new SliderFragment();
        Bundle bundle = new Bundle();
        bundle.putString("content", "Slider " + position + 1);
        sliderFragment.setArguments(bundle);

        return sliderFragment;
    }

    @Override
    public int getItemCount() {
        return NUMBER_PAGE;
    }
}
