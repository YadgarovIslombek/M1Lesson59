package com.example.m1lesson59.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m1lesson59.R;
import com.example.m1lesson59.adapter.MyItem2Adapter;
import com.example.m1lesson59.databinding.FragmentCahtBinding;
import com.example.m1lesson59.model.ChatModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    String s;
   private List<ChatModel> chatModelList;
   private MyItem2Adapter myItem2Adapter;

    public ChatFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ChatFragment newInstance(String s) {
        ChatFragment fragment = new ChatFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, s);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            s = getArguments().getString(ARG_PARAM1);

        }
    }



    private FragmentCahtBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        loadData();
        myItem2Adapter = new MyItem2Adapter(chatModelList);

        binding = FragmentCahtBinding.inflate(inflater, container, false);
        binding.rec.setAdapter(myItem2Adapter);
        return binding.getRoot();
    }
    private void loadData() {
        chatModelList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chatModelList.add(new ChatModel("Otabek","Salom","23/12/2023","https://media.istockphoto.com/id/1061797472/photo/portrait-of-a-happy-young-man-with-two-fingers-around-his-eye.jpg?s=612x612&w=0&k=20&c=GIxBs2hmCU3HrUpEUbeF70dL3fzjDv6KAfXnITxtOpA=" ));
            chatModelList.add(new ChatModel("Bobur","Salom","23/12/2023","https://media.istockphoto.com/id/1061797472/photo/portrait-of-a-happy-young-man-with-two-fingers-around-his-eye.jpg?s=612x612&w=0&k=20&c=GIxBs2hmCU3HrUpEUbeF70dL3fzjDv6KAfXnITxtOpA="));
            chatModelList.add(new ChatModel("Mustafo","Salom","23/12/2023","https://media.istockphoto.com/id/1061797472/photo/portrait-of-a-happy-young-man-with-two-fingers-around-his-eye.jpg?s=612x612&w=0&k=20&c=GIxBs2hmCU3HrUpEUbeF70dL3fzjDv6KAfXnITxtOpA="));
            chatModelList.add(new ChatModel("Maqsadbek","Salom","23/12/2023","https://media.istockphoto.com/id/1061797472/photo/portrait-of-a-happy-young-man-with-two-fingers-around-his-eye.jpg?s=612x612&w=0&k=20&c=GIxBs2hmCU3HrUpEUbeF70dL3fzjDv6KAfXnITxtOpA="));

        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}