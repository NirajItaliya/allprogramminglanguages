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

public class javaC extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = findViewById(R.id.recycler_view_cc);
        homeAdapter = new HomeAdapter(CDataList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        StudentDataPrepare();
        recyclerView.setAdapter(homeAdapter);

        recyclerView.addOnItemTouchListener(new javaC.RecyclerTouchListener(getApplicationContext(), recyclerView, new javaC.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                javaC s = javaC.this;
                int a;
                Intent a1 = new Intent(s, webview.class);
                for(a=position; a<=position; a++)
                {
                    a1.putExtra("web", "file:///android_asset/java/test/" + (position+1) + ".html");
                    startActivity(a1);
                }
            }
            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1. Average of numbers using array "));
        CDataList.add(new HomeDataModel("2. Check Even or Odd number "));
        CDataList.add(new HomeDataModel("3. Display first n prime numbers"));
        CDataList.add(new HomeDataModel("4. Number is prime or not "));
        CDataList.add(new HomeDataModel("5. Reverse a String using Recursion "));
        CDataList.add(new HomeDataModel("6. Reverse a number using while "));
        CDataList.add(new HomeDataModel("7. Reverse a number using for Loop"));
        CDataList.add(new HomeDataModel("8. Reverse a number using recursion "));
        CDataList.add(new HomeDataModel("9. Sum of Natural Numbers "));
        CDataList.add(new HomeDataModel("10. Positive or Negative Number "));
        CDataList.add(new HomeDataModel("11. Check whether the input year is leap or not "));
        CDataList.add(new HomeDataModel("12. ASCII code of a character "));
        CDataList.add(new HomeDataModel("13. Convert decimal to hexadecimal"));
        CDataList.add(new HomeDataModel("14. Convert decimal to binary"));
        CDataList.add(new HomeDataModel("15. Decimal to Binary using Stack "));
        CDataList.add(new HomeDataModel("16. Binary to decimal conversion "));
        CDataList.add(new HomeDataModel("17. Decimal to octal conversion"));
        CDataList.add(new HomeDataModel("18. Get IP address "));
        CDataList.add(new HomeDataModel("19. Find duplicate Characters in a String "));
        CDataList.add(new HomeDataModel("20. Generate random number 0TP "));
        CDataList.add(new HomeDataModel("21. Print Floyds triangle "));
        CDataList.add(new HomeDataModel("22. Check palindrome string using recursion "));
        CDataList.add(new HomeDataModel("23. Check palindrome string using Stack "));
        CDataList.add(new HomeDataModel("24. Find factorial of a given number using recursion "));
        CDataList.add(new HomeDataModel("25. Sum the elements of an array "));
        CDataList.add(new HomeDataModel("26. Calculate Area of Rectangle "));
        CDataList.add(new HomeDataModel("27. Calculate area of Square"));
        CDataList.add(new HomeDataModel("28. Calculate area of Triangle "));
        CDataList.add(new HomeDataModel("29. Calculate area and circumference of circle "));
        CDataList.add(new HomeDataModel("30. Bubble sort "));
        CDataList.add(new HomeDataModel("31. Linear search "));
        CDataList.add(new HomeDataModel("32. Binary search "));
        CDataList.add(new HomeDataModel("33. Convert a char array to a string "));
        CDataList.add(new HomeDataModel("34. Display Fibonacci Series using loops"));
        CDataList.add(new HomeDataModel("35. Make a Calculator using Switch Case "));
        CDataList.add(new HomeDataModel("36. Check Vowel or Consonant using Switch Case "));
        CDataList.add(new HomeDataModel("37. Find largest of three Numbers"));
        CDataList.add(new HomeDataModel("38. Swap two numbers using Bitwise XOR Operator "));
        CDataList.add(new HomeDataModel("39. Check Armstrong Number "));
        CDataList.add(new HomeDataModel("40. Find GCD of Two Numbers "));
        CDataList.add(new HomeDataModel("41. Quick sort Algorithm"));
        CDataList.add(new HomeDataModel("42. Radix sort Algorithm "));
        CDataList.add(new HomeDataModel("43. Merge sort Algorithm "));
        CDataList.add(new HomeDataModel("44. Heap sort Algorithm "));
        CDataList.add(new HomeDataModel("45. Selection Sort Algorithm "));
        CDataList.add(new HomeDataModel("46. Insertion sort Algorithm "));
        CDataList.add(new HomeDataModel("47. CountingSort Algorithm "));
        CDataList.add(new HomeDataModel("48. Simple pyramid pattern"));
        CDataList.add(new HomeDataModel("49. Printing star Triangle "));
        CDataList.add(new HomeDataModel("50. Printing numbers Triangle"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private javaC.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final javaC.ClickListener clickListener) {
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
                startActivity(new Intent(javaC.this, MainActivity.class));
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