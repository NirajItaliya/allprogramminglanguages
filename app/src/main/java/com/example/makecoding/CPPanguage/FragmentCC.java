package com.example.makecoding.CPPanguage;
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


public class FragmentCC extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cc);
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
                FragmentCC s = FragmentCC.this;
                Intent a1 = new Intent(s, webview.class);
                for (a = position; a <= position; a++) {
                    a1.putExtra("web", "file:///android_asset/cpp/Test/" + (position+1) + ".html");
                    startActivity(a1);
                }
            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));

    }

    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1. hello world"));
        CDataList.add(new HomeDataModel("2. print number entered by user"));
        CDataList.add(new HomeDataModel("3. Add two integers "));
        CDataList.add(new HomeDataModel("4. Find quotient and remainder"));
        CDataList.add(new HomeDataModel("5. Find the size of int, float, double and char"));
        CDataList.add(new HomeDataModel("6. Swap numbers using temporary variable"));
        CDataList.add(new HomeDataModel("7. Swap numbers without using temporary variable"));
        CDataList.add(new HomeDataModel("8. Number is even or odd"));
        CDataList.add(new HomeDataModel("9. Check whether the character is vowel or not"));
        CDataList.add(new HomeDataModel("10. Largest number among three numbers"));
        CDataList.add(new HomeDataModel("11. Find all roots of a quadratic equation"));
        CDataList.add(new HomeDataModel("12. Sum of natural numbers"));
        CDataList.add(new HomeDataModel("13. Check leap year)"));
        CDataList.add(new HomeDataModel("14. Find factorial"));
        CDataList.add(new HomeDataModel("15. Generate multiplication table"));
        CDataList.add(new HomeDataModel("16. Fibonacci series"));
        CDataList.add(new HomeDataModel("17. find GCD"));
        CDataList.add(new HomeDataModel("18. Find LCM"));
        CDataList.add(new HomeDataModel("19. Reverse an integer"));
        CDataList.add(new HomeDataModel("20. Power of a number"));
        CDataList.add(new HomeDataModel("21. Find ASCII value of a character"));
        CDataList.add(new HomeDataModel("22. Number is palindrome or not"));
        CDataList.add(new HomeDataModel("23. Number is prime or not"));
        CDataList.add(new HomeDataModel("24. Armstrong number "));
        CDataList.add(new HomeDataModel("25. Sum of natural numbers using recurrsion"));
        CDataList.add(new HomeDataModel("26. factorial of a number using recurrsion"));
        CDataList.add(new HomeDataModel("27. Find GCD using recurrsion "));
        CDataList.add(new HomeDataModel("28. convert binary number to decimal and visa-versa"));
        CDataList.add(new HomeDataModel("29. convert octal number to decimal and visa-versa"));
        CDataList.add(new HomeDataModel("30. convert binary number to octal"));
        CDataList.add(new HomeDataModel("31. Reverse a sentence using recurrsion"));
        CDataList.add(new HomeDataModel("32. calculate power using recurrsion"));
        CDataList.add(new HomeDataModel("33. calculate standard deviation"));
        CDataList.add(new HomeDataModel("34. Add two matrix using multi-dimension arrays"));
        CDataList.add(new HomeDataModel("35. Multiply two matrix using multi-dimension arrays"));
        CDataList.add(new HomeDataModel("36. Transpose of a matrix"));
        CDataList.add(new HomeDataModel("37. Find frequency of characters in s string"));
        CDataList.add(new HomeDataModel("38. Find length of a string"));
        CDataList.add(new HomeDataModel("39. Print half-pyramid using *"));
        CDataList.add(new HomeDataModel("40. print half pyramid using number"));
        CDataList.add(new HomeDataModel("41. Print floyd's triangle"));
        CDataList.add(new HomeDataModel("42. Bubble sort"));
        CDataList.add(new HomeDataModel("43. Selection sort"));
        CDataList.add(new HomeDataModel("44. bucket sort"));
        CDataList.add(new HomeDataModel("45. Shell sort "));
        CDataList.add(new HomeDataModel("46. Insertion sort"));
        CDataList.add(new HomeDataModel("47. quick sort "));
        CDataList.add(new HomeDataModel("48. merge sort"));
        CDataList.add(new HomeDataModel("49. Binary search algorithm"));
        CDataList.add(new HomeDataModel("50. Linear search algorithm"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private FragmentCC.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final FragmentCC.ClickListener clickListener) {
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
                startActivity(new Intent(FragmentCC.this, MainActivity.class));
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