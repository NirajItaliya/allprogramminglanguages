package com.example.makecoding.CLanguage;

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

import com.example.makecoding.MainActivity;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.makecoding.Adapter.HomeAdapter;
import com.example.makecoding.makecoding.Adapter.HomeDataModel;

import java.util.ArrayList;


public class FragmentC extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_c);
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
                com.example.makecoding.CLanguage.FragmentC s = com.example.makecoding.CLanguage.FragmentC.this;
                Intent a1 = new Intent(s, webview.class);
                for (a = position; a <= position; a++) {
                    a1.putExtra("web", "file:///android_asset/c/test/" + (position+1) + ".html");
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
        CDataList.add(new HomeDataModel("2. Number is odd or even"));
        CDataList.add(new HomeDataModel("3. Calculate the sum of odd and even number"));
        CDataList.add(new HomeDataModel("4. Integer is positive or negative "));
        CDataList.add(new HomeDataModel("5. Number of integers divisible by 5 "));
        CDataList.add(new HomeDataModel("6. Integers M & N and swap their values "));
        CDataList.add(new HomeDataModel("7. Integers and check if they are equal "));
        CDataList.add(new HomeDataModel("8. Sum of digits in a given number  "));
        CDataList.add(new HomeDataModel("9. Find the biggest of three numbers "));
        CDataList.add(new HomeDataModel("10. Reverse a given number "));
        CDataList.add(new HomeDataModel("11. Reverse a number and check if it is a palindrome "));
        CDataList.add(new HomeDataModel("12. Sum of two binary numbers "));
        CDataList.add(new HomeDataModel("13. Multiplication of two binary numbers "));
        CDataList.add(new HomeDataModel("14. Armstrong number "));
        CDataList.add(new HomeDataModel("15. Perfect number "));
        CDataList.add(new HomeDataModel("16. Armstrong number from 1 to 1000 "));
        CDataList.add(new HomeDataModel("17. Add two complex numbers"));
        CDataList.add(new HomeDataModel("18. Fibonacci series "));
        CDataList.add(new HomeDataModel("19. Sum of first fifity natural numbers "));
        CDataList.add(new HomeDataModel("20. Swap numbers using bitwise XOR operation "));
        CDataList.add(new HomeDataModel("21. Year is a leap year "));
        CDataList.add(new HomeDataModel("22. Program to illustrate pass by reference "));
        CDataList.add(new HomeDataModel("23. Program to illustrate pass by value"));
        CDataList.add(new HomeDataModel("24. Program to display functions without using the main function "));
        CDataList.add(new HomeDataModel("25. Sum of digits of a number using recurrsion "));
        CDataList.add(new HomeDataModel("26. Reverse of a number using recurrsion"));
        CDataList.add(new HomeDataModel("27. Sum of N numbers using recurrsion "));
        CDataList.add(new HomeDataModel("28. Number is prime or not using recurrsion"));
        CDataList.add(new HomeDataModel("29. Binary equivalent of an integer using recurrsion"));
        CDataList.add(new HomeDataModel("30. Sum of array elements using pointer"));
        CDataList.add(new HomeDataModel("31. Largest two numbers in a given array"));
        CDataList.add(new HomeDataModel("32. Accept an array and swap elements using pointers"));
        CDataList.add(new HomeDataModel("33. Addtion and substraction and trace of 2 matrices"));
        CDataList.add(new HomeDataModel("34. Transpose of a given matrix"));
        CDataList.add(new HomeDataModel("35. Product of two matrices"));
        CDataList.add(new HomeDataModel("36. Check if two matrices are equal"));
        CDataList.add(new HomeDataModel("37. Check if the given matrix is a identity matrix "));
        CDataList.add(new HomeDataModel("38. Check if the given string is palindrome"));
        CDataList.add(new HomeDataModel("39. Check string is palindrome using recurrsion"));
        CDataList.add(new HomeDataModel("40. Check if the substring is present in the given"));
        CDataList.add(new HomeDataModel("41. Find length of the string without using built-in-function"));
        CDataList.add(new HomeDataModel("42. Number of vowels and consonants in a sentence"));
        CDataList.add(new HomeDataModel("43. Reverse the string using recurrsion"));
        CDataList.add(new HomeDataModel("44. Replace lowercase characters by uppercase and visa-versa"));
        CDataList.add(new HomeDataModel("45. Delete all repeated words in string"));
        CDataList.add(new HomeDataModel("46. Find the length of the string using recurrsion"));
        CDataList.add(new HomeDataModel("47. Find the highest frequency character in the string"));
        CDataList.add(new HomeDataModel("48. Program to find a possible subsets of a string"));
        CDataList.add(new HomeDataModel("49. Program to count number of unique words"));
        CDataList.add(new HomeDataModel("50. Program to check whether two strings are anagrams"));
        CDataList.add(new HomeDataModel("51. Bubble sort"));
        CDataList.add(new HomeDataModel("52. Insertion sort"));
        CDataList.add(new HomeDataModel("53. Selection sort"));
        CDataList.add(new HomeDataModel("54. Quick sort"));
        CDataList.add(new HomeDataModel("55. Heap sort"));
        CDataList.add(new HomeDataModel("56. LSDradix sort"));
        CDataList.add(new HomeDataModel("57. Shell sort "));
        CDataList.add(new HomeDataModel("58. Binary search"));
        CDataList.add(new HomeDataModel("59. Linear search"));
        CDataList.add(new HomeDataModel("60. Pyramid pattern"));
        CDataList.add(new HomeDataModel("61. Pattern of numbers"));
        CDataList.add(new HomeDataModel("62. Number of pyramids"));
        CDataList.add(new HomeDataModel("63. Reverse pyramid"));
        CDataList.add(new HomeDataModel("64. Diamond pattern"));
        CDataList.add(new HomeDataModel("65. Print pasacl's triangle "));
        CDataList.add(new HomeDataModel("66. Print floyd Triangle"));
        CDataList.add(new HomeDataModel("67. Implement a stack"));
        CDataList.add(new HomeDataModel("68. Implement a queue"));
        CDataList.add(new HomeDataModel("69. Implement priority queue"));
        CDataList.add(new HomeDataModel("70. Stack operations using dynamic memory"));
        CDataList.add(new HomeDataModel("71. Simple linked list"));
        CDataList.add(new HomeDataModel("72. Read a linked list in reverse "));
        CDataList.add(new HomeDataModel("73. Doubly linked list"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private com.example.makecoding.CLanguage.FragmentC.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final com.example.makecoding.CLanguage.FragmentC.ClickListener clickListener) {
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
                startActivity(new Intent(FragmentC.this, MainActivity.class));
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