package com.example.makecoding.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.example.makecoding.CPPanguage.FragmentCA;
import com.example.makecoding.MainActivity;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.makecoding.Adapter.HomeAdapter;
import com.example.makecoding.makecoding.Adapter.HomeDataModel;

import java.util.ArrayList;

public class javaA extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = findViewById(R.id.recycler_view_c);
        homeAdapter = new HomeAdapter(CDataList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        StudentDataPrepare();
        recyclerView.setAdapter(homeAdapter);

        recyclerView.addOnItemTouchListener(new javaA.RecyclerTouchListener(getApplicationContext(), recyclerView, new javaA.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                javaA s = javaA.this;
                int a;
                Intent a1 = new Intent(s, webview.class);
                for(a=position; a<=position; a++)
                {
                    a1.putExtra("web", "file:///android_asset/java/data/basic/" + (position+1) + ".htm");
                    startActivity(a1);
                }
            }
            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1.Java Introduction"));
        CDataList.add(new HomeDataModel("2.History of Java"));
        CDataList.add(new HomeDataModel("3.Features of Java"));
        CDataList.add(new HomeDataModel("4.C++ vs Java"));
        CDataList.add(new HomeDataModel("5.How to set path in Java"));
        CDataList.add(new HomeDataModel("6.First Java Program|Hello World Example"));
        CDataList.add(new HomeDataModel("7.Internal Details of Hello Java Program"));
        CDataList.add(new HomeDataModel("8.Difference between JDK,JRE,and JVM "));
        CDataList.add(new HomeDataModel("9.JVM(Java Virtual Machine)Architecture"));
        CDataList.add(new HomeDataModel("10.Java Variables"));
        CDataList.add(new HomeDataModel("11.Data Type in Java"));
        CDataList.add(new HomeDataModel("12.Unicode System"));
        CDataList.add(new HomeDataModel("13.Operators in Java"));
        CDataList.add(new HomeDataModel("14.Java If-else Statement"));
        CDataList.add(new HomeDataModel("15.Java Switch Statement"));
        CDataList.add(new HomeDataModel("16.For Loops in Java"));
        CDataList.add(new HomeDataModel("17.Java do-while loop"));
        CDataList.add(new HomeDataModel("18.Java Break Statement"));
        CDataList.add(new HomeDataModel("19.Java Comments"));
        CDataList.add(new HomeDataModel("20.Java Command Line Arguments"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private javaA.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final javaA.ClickListener clickListener) {
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
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Drawable drawable = item.getIcon();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        switch (item.getItemId()) {
            case R.id.btn_edit:
                startActivity(new Intent(javaA.this, MainActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
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