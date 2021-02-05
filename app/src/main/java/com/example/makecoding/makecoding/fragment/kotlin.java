package com.example.makecoding.makecoding.fragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.example.makecoding.CLanguage.FragmentA;
import com.example.makecoding.CLanguage.FragmentB;
import com.example.makecoding.CLanguage.FragmentC;
import com.example.makecoding.MainActivity;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.kotlin.kotlinCA;
import com.example.makecoding.kotlin.kotlinCB;
import com.example.makecoding.kotlin.kotlinCC;
import com.example.makecoding.makecoding.GridView.GriadAdapter;
import com.example.makecoding.makecoding.GridView.GriadAdapter2;
import com.example.makecoding.makecoding.GridView.Item;
import com.example.makecoding.makecoding.GridView.Item2;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class kotlin extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Item> arrayList;
    private GriadAdapter gridAdapter;
    private RecyclerView recyclerView2;
    private ArrayList<Item2> recyclerList2;
    private GriadAdapter2 gridAdapter2;
    private Menu menu;
    public View view;
    private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_clanguage);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        setTitle("Kotlin");

        recyclerView = (RecyclerView) findViewById(R.id.Cpp);
        arrayList = new ArrayList<>();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        arrayList.add(new Item(R.drawable.basiclogo));
        arrayList.add(new Item(R.drawable.advancelogo));
        arrayList.add(new Item(R.drawable.practicelogo));
        arrayList.add(new Item(R.drawable.qalogo));


        gridAdapter = new GriadAdapter(this, arrayList);
        recyclerView.setAdapter(gridAdapter);

        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView2 = (RecyclerView) findViewById(R.id.Cpp2);
        recyclerList2 = new ArrayList<Item2>();
        recyclerList2.add(new Item2(R.drawable.codinga));

        gridAdapter2 = new GriadAdapter2(kotlin.this,recyclerList2);
        recyclerView2.setAdapter(gridAdapter2);

        GridLayoutManager manager2 = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(manager2);


        gridAdapter = new GriadAdapter(this, arrayList);
        recyclerView.setAdapter(gridAdapter);

        recyclerView2.addOnItemTouchListener(new CLanguage.RecyclerTouchListener(getApplicationContext(), recyclerView, new CLanguage.ClickListener() {

            @Override
            public void onClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent a1 = new Intent(kotlin.this, webview.class);
//                        a1.putExtra("web", "https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjIwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS4gXG4gKiBwbGF5LmtvdGxpbmxhbmcub3JnIFxuICovXG5cbmZ1biBtYWluKCkge1xuICAgIHByaW50bG4oXCJIZWxsbywgd29ybGQhISFcIilcbn0ifQ==");
                        a1.putExtra("web", "https://rextester.com/l/kotlin_online_compiler");
                        startActivity(a1);
                        break;

                }

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        recyclerView.addOnItemTouchListener(new kotlin.RecyclerTouchListener(getApplicationContext(), recyclerView, new kotlin.ClickListener() {

            @Override
            public void onClick(View view, int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(kotlin.this, kotlinCA.class));
                        break;
                    case 1:
                        startActivity(new Intent(kotlin.this, kotlinCB.class));
                        break;
                    case 2:
                        startActivity(new Intent(kotlin.this, kotlinCC.class));
                        break;
                    case 3:
                        Intent a1 = new Intent(kotlin.this, webview.class);
                        a1.putExtra("web", "file:///android_asset/kotlin/que_ans/kotlin_interview_que_ans.html");
                        startActivity(a1);
                        break;
                }

            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));

    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private kotlin.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final kotlin.ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildAdapterPosition(child));
                    }
                }
            });
        }


        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildAdapterPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
