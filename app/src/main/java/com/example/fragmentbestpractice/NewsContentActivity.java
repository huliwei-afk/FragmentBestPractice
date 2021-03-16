package com.example.fragmentbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NewsContentActivity extends AppCompatActivity {

    //actionStart方法里创建intent和获取数据键值对
    public static void actionStart(Context context, String newsTitle, String newsContent){
        Intent intent = new Intent(context, NewsContentActivity.class);
        intent.putExtra("news_title",newsTitle);//放数据
        intent.putExtra("news_content",newsContent);//放数据
        context.startActivity(intent);//启动活动
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);
        Intent intent = getIntent();//得到intent对象
        String newsTitle = intent.getStringExtra("news_title");//由键获值
        String newsContent = intent.getStringExtra("news_content");//由键获值
        NewsContentFragment newsContentFragment = (NewsContentFragment)getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);//活动中获取碎片实例
        newsContentFragment.refresh(newsTitle,newsContent);//刷新界面
    }

}
