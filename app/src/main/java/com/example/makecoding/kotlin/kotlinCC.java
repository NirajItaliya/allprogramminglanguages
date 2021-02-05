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


public class kotlinCC extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kotlin_cc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = findViewById(R.id.recycler_view_cb);
        homeAdapter = new HomeAdapter(CDataList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        StudentDataPrepare();
        recyclerView.setAdapter(homeAdapter);


        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            int a;

            @Override
            public void onClick(View view, int position) {
                kotlinCC s = kotlinCC.this;
                Intent a1 = new Intent(s, webview.class);
                for (a = position; a <= position; a++) {
                    a1.putExtra("web", "file:///android_asset/kotlin/test/" + (position+1) + ".html");
                    startActivity(a1);
                }
            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));

    }

    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1.Hello World"));
        CDataList.add(new HomeDataModel("2.Print an Integer"));
        CDataList.add(new HomeDataModel("3.Add two integers"));
        CDataList.add(new HomeDataModel("4.Multiply two floating Point Numbers"));
        CDataList.add(new HomeDataModel("5.Compute Quotient and remainder"));
        CDataList.add(new HomeDataModel("6.swap two numbers"));
        CDataList.add(new HomeDataModel("7.Find ASCII value of a character"));
        CDataList.add(new HomeDataModel("8.Find the Largest Among Three Numbers"));
        CDataList.add(new HomeDataModel("9.Alphabet is Vowel or Consonant"));
        CDataList.add(new HomeDataModel("10.Number is even or odd"));
        CDataList.add(new HomeDataModel("11.Find all roots of a Quadratic Equations"));
        CDataList.add(new HomeDataModel("12.Check leap year"));
        CDataList.add(new HomeDataModel("13.Positive or Negative"));
        CDataList.add(new HomeDataModel("14.Whether a character is Alphabet or Not"));
        CDataList.add(new HomeDataModel("15.Sum of Natural Numbers"));
        CDataList.add(new HomeDataModel("16.Factorial of a number"));
        CDataList.add(new HomeDataModel("17.Generate multiplication table"));
        CDataList.add(new HomeDataModel("18.Fibonacci series"));
        CDataList.add(new HomeDataModel("19.GCD of two numbers"));
        CDataList.add(new HomeDataModel("20.LCM of two numbers"));
        CDataList.add(new HomeDataModel("21.Display characters from A to Z"));
        CDataList.add(new HomeDataModel("22.Count Number of Digits in an integer"));
        CDataList.add(new HomeDataModel("23.Reverse a number"));
        CDataList.add(new HomeDataModel("24.Power of a number"));
        CDataList.add(new HomeDataModel("25.Palindrome Number"));
        CDataList.add(new HomeDataModel("26.Prime Number"));
        CDataList.add(new HomeDataModel("27.Armstrong number"));
        CDataList.add(new HomeDataModel("28.Factors of a number"));
        CDataList.add(new HomeDataModel("29.Sum of natural numbers using recursion"));
        CDataList.add(new HomeDataModel("30.GCD of two numbers using recursion"));
        CDataList.add(new HomeDataModel("31.Binary number to Decimal"));
        CDataList.add(new HomeDataModel("32.Decimal number to Binary"));
        CDataList.add(new HomeDataModel("33.Decimal to Octal"));
        CDataList.add(new HomeDataModel("34.Octal to Decimal"));
        CDataList.add(new HomeDataModel("35.Binary to Octal"));
        CDataList.add(new HomeDataModel("36.Octal to Binary"));
        CDataList.add(new HomeDataModel("37.Reverse a sentence using recursion"));
        CDataList.add(new HomeDataModel("38.Calculate standard deviation"));
        CDataList.add(new HomeDataModel("39.Add two Matrix using Multi-dimensional Array"));
        CDataList.add(new HomeDataModel("40.Multiply two Matrix Using Multi_dimensional arrays"));
        CDataList.add(new HomeDataModel("41.Print Floyds Triangle"));
        CDataList.add(new HomeDataModel("42.Pyramid using numbers"));
        CDataList.add(new HomeDataModel("43.Pascals triangle"));
        CDataList.add(new HomeDataModel("44.Get Current Date/Time"));
        CDataList.add(new HomeDataModel("45.Add Two Dates"));
        CDataList.add(new HomeDataModel("46.Get current Date/Time"));
        CDataList.add(new HomeDataModel("47.Check if a String is numerate"));
        CDataList.add(new HomeDataModel("48.Power using recursion"));
        CDataList.add(new HomeDataModel("49.create String from file"));
        CDataList.add(new HomeDataModel("50.Join Two Lists"));
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
                startActivity(new Intent(kotlinCC.this, MainActivity.class));
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