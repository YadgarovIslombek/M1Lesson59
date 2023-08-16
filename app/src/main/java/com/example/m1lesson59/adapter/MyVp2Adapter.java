package com.example.m1lesson59.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.m1lesson59.model.ChatModel;
import com.example.m1lesson59.ui.ChatFragment;

import java.util.List;

public class MyVp2Adapter extends FragmentStateAdapter {
//    private List<String> strings;
private List<Fragment>fragmentList;

    //1 constructor yan
    //biza 2 chi ni ishlatdik


    public MyVp2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, List<Fragment> fragmentList) {
        super(fragmentManager, lifecycle);
//        this.strings = strings;
        this.fragmentList = fragmentList;
    }



    @Override
    public int getItemCount() {
        return fragmentList.size();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }


//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return strings.get(position);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        return ChatFragment.newInstance(strings.get(position));
//    }
//public MyVp2Adapter(@NonNull FragmentManager fm, List<String> strings) {
//    super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );
//    this.strings = strings;
//}

//    @Override
//    public int getCount() {
//        return strings.size();
//    }
}
