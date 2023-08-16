package com.example.m1lesson59.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.m1lesson59.adapter.MyVp2Adapter;
import com.example.m1lesson59.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<String> textList;
    private List<Fragment> fragmentList;
    private MyVp2Adapter myVp2Adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();


//        myVp2Adapter = new MyVp2Adapter(getSupportFragmentManager(),getLifecycle(), textList);
        myVp2Adapter = new MyVp2Adapter(getSupportFragmentManager(),getLifecycle(),fragmentList);
        binding.vp.setAdapter(myVp2Adapter);
        new TabLayoutMediator(binding.tab, binding.vp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(textList.get(position));
            }
        }).attach();
    }

    private void loadData() {
        textList = new ArrayList<>();
        textList.add("Chats");
        textList.add("Group");
        textList.add("Channel");
        textList.add("Bots");
        textList.add("Students");


        fragmentList = new ArrayList<>();
        fragmentList.add(new ChatFragment());
        fragmentList.add(new GroupFragment());
        fragmentList.add(new BotFragment());
    }
}