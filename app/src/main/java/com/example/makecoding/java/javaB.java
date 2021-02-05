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

public class javaB extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeDataModel> CDataList = new ArrayList<>();
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_b);
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

        recyclerView.addOnItemTouchListener(new javaB.RecyclerTouchListener(getApplicationContext(), recyclerView, new javaB.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                javaB s = javaB.this;
                int a;
                Intent a1 = new Intent(s, webview.class);
                for(a=position; a<=position; a++)
                {
                    a1.putExtra("web", "file:///android_asset/java/data/advance/" + (position+1) + ".htm");
                    startActivity(a1);
                }
            }
            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    private void StudentDataPrepare() {
        CDataList.add(new HomeDataModel("1. Java 0OPs Concepts"));
        CDataList.add(new HomeDataModel("2. Java Naming conventions"));
        CDataList.add(new HomeDataModel("3. Objects and Classes in Java"));
        CDataList.add(new HomeDataModel("4. Constructors in Java"));
        CDataList.add(new HomeDataModel("5. Java static keyword "));
        CDataList.add(new HomeDataModel("6. this keyword in javaa "));
        CDataList.add(new HomeDataModel("7. Inheritance in Java "));
        CDataList.add(new HomeDataModel("8. Aggregation in Java "));
        CDataList.add(new HomeDataModel("9. Method Overloading in Java "));
        CDataList.add(new HomeDataModel("10. Method Overriding in Java"));
        CDataList.add(new HomeDataModel("11. Covariant Return Type "));
        CDataList.add(new HomeDataModel("12. Super Keyword in Java"));
        CDataList.add(new HomeDataModel("13. Instance initializer block"));
        CDataList.add(new HomeDataModel("14. Final Keyword In Java"));
        CDataList.add(new HomeDataModel("15. Polymorphism in Java"));
        CDataList.add(new HomeDataModel("16. Static Binding and Dynamic Binding"));
        CDataList.add(new HomeDataModel("17. Java instanceof"));
        CDataList.add(new HomeDataModel("18. Abstract class in Java"));
        CDataList.add(new HomeDataModel("19. Interface in Java "));
        CDataList.add(new HomeDataModel("20. Difference between abstract class and interface "));
        CDataList.add(new HomeDataModel("21. Java Package "));
        CDataList.add(new HomeDataModel("22. Access Modifiers in java"));
        CDataList.add(new HomeDataModel("23. Encapsulation in Java "));
        CDataList.add(new HomeDataModel("24. Object class in Java "));
        CDataList.add(new HomeDataModel("25. Wrapper class in Java"));
        CDataList.add(new HomeDataModel("26. Call by Value and Call by Reference in Java "));
        CDataList.add(new HomeDataModel("27. Java Strictfp Keyword"));
        CDataList.add(new HomeDataModel("28. Java Array "));
        CDataList.add(new HomeDataModel("29. Java String"));
        CDataList.add(new HomeDataModel("30. Immutable String in Java"));
        CDataList.add(new HomeDataModel("31. Java String compare "));
        CDataList.add(new HomeDataModel("32. String Concatenation in Java "));
        CDataList.add(new HomeDataModel("33. Substring in Java "));
        CDataList.add(new HomeDataModel("34. Java String class methods "));
        CDataList.add(new HomeDataModel("35. Java toString() method "));
        CDataList.add(new HomeDataModel("36. Java StringBuffer class "));
        CDataList.add(new HomeDataModel("37. Java StringBuilder class"));
        CDataList.add(new HomeDataModel("39. Exception Handling in Java"));
        CDataList.add(new HomeDataModel("40. Java try block "));
        CDataList.add(new HomeDataModel("41. Java Multi catch block"));
        CDataList.add(new HomeDataModel("42. Java Nested try block "));
        CDataList.add(new HomeDataModel("43. Java finally block "));
        CDataList.add(new HomeDataModel("44. Java throw keyword "));
        CDataList.add(new HomeDataModel("45. Java Exception propagation "));
        CDataList.add(new HomeDataModel("46. Java throws keyword "));
        CDataList.add(new HomeDataModel("47. Difference between throw and throws in Java "));
        CDataList.add(new HomeDataModel("48. Difference between final, finally and finalize "));
        CDataList.add(new HomeDataModel("49. Java Custom Exception "));
        CDataList.add(new HomeDataModel("50. Java l/O Tutorial "));
        CDataList.add(new HomeDataModel("51. Java FileOutputStream Class "));
        CDataList.add(new HomeDataModel("52. Java FileInputStream Class "));
        CDataList.add(new HomeDataModel("53. Java FilePermission Class "));
        CDataList.add(new HomeDataModel("54. Java Writer "));
        CDataList.add(new HomeDataModel("55. Java Reader "));
        CDataList.add(new HomeDataModel("56. Java File Class "));
        CDataList.add(new HomeDataModel("57. Java Scanner Class "));
        CDataList.add(new HomeDataModel("58. Multithreading in Java "));
        CDataList.add(new HomeDataModel("59. Life cycle of a Thread (Thread States) "));
        CDataList.add(new HomeDataModel("60. How to create thread "));
        CDataList.add(new HomeDataModel("61. Thread Scheduler in Java "));
        CDataList.add(new HomeDataModel("62. Sleep method in java "));
        CDataList.add(new HomeDataModel("63. The join) method"));
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private javaB.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final javaB.ClickListener clickListener) {
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
                startActivity(new Intent(javaB.this, MainActivity.class));
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