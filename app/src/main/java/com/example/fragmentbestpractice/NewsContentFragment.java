package com.example.fragmentbestpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {
    private View view;

    //onCreateView传递布局
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container,false);
        return view;
    }

    //refresh方法用于刷新页面的内容和标题
    public void refresh(String newsTitle, String newsContent){
        View visibilityLayout = view.findViewById(R.id.visibility_layout);//建立布局
        visibilityLayout.setVisibility(View.VISIBLE);//可视化布局
        TextView newsTitleText = (TextView)view.findViewById(R.id.news_title);//创建控件
        TextView newsContentText = (TextView)view.findViewById(R.id.news_content);//创建控件
        newsTitleText.setText(newsTitle);//设置标题
        newsContentText.setText(newsContent);//设置内容
    }
}
