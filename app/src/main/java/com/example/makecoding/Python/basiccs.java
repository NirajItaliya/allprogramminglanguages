package com.example.makecoding.Python;

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
import com.example.makecoding.MainActivity;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.makecoding.Adapter.HomeAdapter;
import com.example.makecoding.makecoding.Adapter.HomeDataModel;

import java.util.ArrayList;

public class basiccs extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basiccs);
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

        recyclerView.addOnItemTouchListener(new basiccs.RecyclerTouchListener(getApplicationContext(), recyclerView, new basiccs.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                basiccs s = basiccs.this;
                int a;
                Intent a1 = new Intent(s, webview.class);

                for (a = position; a <= position; a++) {
                    a1.putExtra("web", "file:///android_asset/python/data/" + (position + 1) + ".html");
                    startActivity(a1);
                }
            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1.Python Tutorial Introduction"));
        CDataList.add(new HomeDataModel("2.Python Introduction"));
        CDataList.add(new HomeDataModel("3.Python Featurs "));
        CDataList.add(new HomeDataModel("4.Python History "));
        CDataList.add(new HomeDataModel("5.Python Version "));
        CDataList.add(new HomeDataModel("6.Python Application Area "));
        CDataList.add(new HomeDataModel("7.How to Install Python "));
        CDataList.add(new HomeDataModel("8.Setting Path in Python "));
        CDataList.add(new HomeDataModel("9.Hello, World "));
        CDataList.add(new HomeDataModel("10.Python Variable "));
        CDataList.add(new HomeDataModel("11.Python Keywords "));
        CDataList.add(new HomeDataModel("12.Python Identifiers "));
        CDataList.add(new HomeDataModel("13.Python Literals "));
        CDataList.add(new HomeDataModel("14.Python Operators "));
        CDataList.add(new HomeDataModel("15.Python Comments "));
        CDataList.add(new HomeDataModel("16.Python If statement "));
        CDataList.add(new HomeDataModel("17.Python If Else statement "));
        CDataList.add(new HomeDataModel("18.Python Else If statement "));
        CDataList.add(new HomeDataModel("19.Python Nested If statement "));
        CDataList.add(new HomeDataModel("20.Python For loop "));
        CDataList.add(new HomeDataModel("21.Python While loop "));
        CDataList.add(new HomeDataModel("22.Python Break "));
        CDataList.add(new HomeDataModel("23.Python Continue statement "));
        CDataList.add(new HomeDataModel("24.Python Pass "));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private basiccs.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final basiccs.ClickListener clickListener) {
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
                startActivity(new Intent(basiccs.this, MainActivity.class));
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