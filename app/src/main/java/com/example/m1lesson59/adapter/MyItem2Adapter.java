package com.example.m1lesson59.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m1lesson59.databinding.TelegramChatItemBinding;
import com.example.m1lesson59.model.ChatModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyItem2Adapter extends RecyclerView.Adapter<MyItem2Adapter.VH> {
    private List<ChatModel> chatModelList;

    public MyItem2Adapter(List<ChatModel> chatModelList) {
        this.chatModelList = chatModelList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(TelegramChatItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Picasso.get().load(chatModelList.get(position).getImg()).into(holder.binding.profileImage);
        holder.binding.name.setText(chatModelList.get(position).getName());
        holder.binding.message.setText(chatModelList.get(position).getMsg());
        holder.binding.date.setText(chatModelList.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }

    public static class VH extends RecyclerView.ViewHolder{
        public TelegramChatItemBinding binding;
        public VH(@NonNull TelegramChatItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
