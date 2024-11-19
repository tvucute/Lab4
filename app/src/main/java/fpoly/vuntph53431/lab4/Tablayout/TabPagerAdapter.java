package fpoly.vuntph53431.lab4.Tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fpoly.vuntph53431.lab4.fragment.HomeFragment;
import fpoly.vuntph53431.lab4.fragment.MovieFragment;
import fpoly.vuntph53431.lab4.fragment.MusicFragment;

public class TabPagerAdapter extends FragmentStateAdapter {

    public static final String[] titles = new String[]{"Home", "Music", "Movie"};
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new MusicFragment();
            case 2: return new MovieFragment();
        }
        return new HomeFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
