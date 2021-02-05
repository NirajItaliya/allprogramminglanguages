package com.example.makecoding.kotlin;
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

import androidx.annotation.Nullable;
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

public class kotlinCB extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kotlin_cb);
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


        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {

            @Override
            public void onClick(View view, int position) {
                kotlinCB s = kotlinCB.this;
                int a;
                Intent a1 = new Intent(s, webview.class);
                for(a=position; a<=position; a++)
                {
                    a1.putExtra("web", "file:///android_asset/kotlin/data/" + (position+25) + ".html");
                    startActivity(a1);
                }

            }
            @Override
            public void onLongClick(View view, int position) {
            }
        }));

    }

    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1.Kotlin Array"));
        CDataList.add(new HomeDataModel("2.Kotlin String Functions"));
        CDataList.add(new HomeDataModel("3.Exception Handling"));
        CDataList.add(new HomeDataModel("4.Kotlin try and catch"));
        CDataList.add(new HomeDataModel("5.Multiple catch"));
        CDataList.add(new HomeDataModel("6.Nested try block"));
        CDataList.add(new HomeDataModel("7.Kotlin finally block"));
        CDataList.add(new HomeDataModel("8.Kotlin Throw keyword"));
        CDataList.add(new HomeDataModel("9.Kotlin Null Safety"));
        CDataList.add(new HomeDataModel("10.Kotlin Smart cast"));
        CDataList.add(new HomeDataModel("11.Unsafe and safe cast"));
        CDataList.add(new HomeDataModel("12.Kotlin Elvis Operator"));
        CDataList.add(new HomeDataModel("13.Mutable Array"));
        CDataList.add(new HomeDataModel("14.Kotlin Collection"));
        CDataList.add(new HomeDataModel("15.Kotlin List Interface"));
        CDataList.add(new HomeDataModel("16.Kotlin Mutable List"));
        CDataList.add(new HomeDataModel("17.Kotlin ArrayList"));
        CDataList.add(new HomeDataModel("18.Array List: arrayListOf()"));
        CDataList.add(new HomeDataModel("19.Kotlin Map Interface"));
        CDataList.add(new HomeDataModel("20.Kotlin HashMap"));
        CDataList.add(new HomeDataModel("21.HashMap:hashMapOf()"));
        CDataList.add(new HomeDataModel("22.Mutable Map Interface"));
        CDataList.add(new HomeDataModel("23.Kotlin Set Interface"));
        CDataList.add(new HomeDataModel("24.MutableSet Interface"));
        CDataList.add(new HomeDataModel("25.Kotlin HashSet class"));
        CDataList.add(new HomeDataModel("26.Kotlin Annotation"));
        CDataList.add(new HomeDataModel("27.Kotlin Reflection"));
        CDataList.add(new HomeDataModel("28.Class and Object"));
        CDataList.add(new HomeDataModel("29.Nested And Inner class"));
        CDataList.add(new HomeDataModel("30.Kotlin Constructor "));
        CDataList.add(new HomeDataModel("31.Visibility Modifier "));
        CDataList.add(new HomeDataModel("32.Kotlin Inheritance"));
        CDataList.add(new HomeDataModel("33.Abstract Class"));
        CDataList.add(new HomeDataModel("34.Kotlin Interface"));
        CDataList.add(new HomeDataModel("35.Data Class"));
        CDataList.add(new HomeDataModel("36.Sealed class"));
        CDataList.add(new HomeDataModel("37.Extensio Function"));
        CDataList.add(new HomeDataModel("38.Kotlin Generics"));
        CDataList.add(new HomeDataModel("39.Kotlin Ranges"));
        CDataList.add(new HomeDataModel("40.Kotlin Working Ranges"));
        CDataList.add(new HomeDataModel("41.Kotlin utility Function"));
        CDataList.add(new HomeDataModel("42.calling java code from Kotlin"));
        CDataList.add(new HomeDataModel("43.Kotlin code from java"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener) {
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
                startActivity(new Intent(kotlinCB.this, MainActivity.class));
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