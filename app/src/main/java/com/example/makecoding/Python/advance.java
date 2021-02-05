package com.example.makecoding.Python;

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

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.makecoding.CLanguage.FragmentA;
import com.example.makecoding.MainActivity;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.makecoding.Adapter.HomeAdapter;
import com.example.makecoding.makecoding.Adapter.HomeDataModel;

import java.util.ArrayList;

public class advance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = findViewById(R.id.recycler_view_ca);
        homeAdapter = new HomeAdapter(CDataList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        StudentDataPrepare();
        recyclerView.setAdapter(homeAdapter);

        recyclerView.addOnItemTouchListener(new advance.RecyclerTouchListener(getApplicationContext(), recyclerView, new advance.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                advance s = advance.this;
                int a;
                Intent a1 = new Intent(s, webview.class);

                for (a = position; a <= position; a++) {
                    a1.putExtra("web", "file:///android_asset/python/data/" + (position + 25) + ".html");
                    startActivity(a1);
                }

            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1.Python String"));
        CDataList.add(new HomeDataModel("2.String Funct6ion and Method"));
        CDataList.add(new HomeDataModel("3.Python List"));
        CDataList.add(new HomeDataModel("4.Python Tuple"));
        CDataList.add(new HomeDataModel("5.Python Dictionary"));
        CDataList.add(new HomeDataModel("6.Python Functions"));
        CDataList.add(new HomeDataModel("7.Python Input And Output"));
        CDataList.add(new HomeDataModel("8.Python Module"));
        CDataList.add(new HomeDataModel("9.Python OOPs Concepts"));
        CDataList.add(new HomeDataModel("10.Python Object"));
        CDataList.add(new HomeDataModel("11.Python Constructors"));
        CDataList.add(new HomeDataModel("12.Python Inheritance"));
        CDataList.add(new HomeDataModel("13.Python Multileveled Inheritance"));
        CDataList.add(new HomeDataModel("14.Python Multiple Inheritance"));
        CDataList.add(new HomeDataModel("15.Python Polymorphism"));
        CDataList.add(new HomeDataModel("16.Python Exception Handling"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private advance.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final advance.ClickListener clickListener) {
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
                startActivity(new Intent(advance.this, MainActivity.class));
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