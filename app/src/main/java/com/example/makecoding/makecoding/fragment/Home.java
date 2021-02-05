package com.example.makecoding.makecoding.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.makecoding.CLanguage.FragmentA;
import com.example.makecoding.CLanguage.FragmentB;
import com.example.makecoding.CLanguage.FragmentC;
import com.example.makecoding.R;
import com.example.makecoding.WebView.webview;
import com.example.makecoding.makecoding.Adapter.HomeAdapter;
import com.example.makecoding.makecoding.Adapter.HomeDataModel;
import com.example.makecoding.makecoding.GridView.GriadAdapter;
import com.example.makecoding.makecoding.GridView.Item;

import java.util.ArrayList;

import io.supercharge.shimmerlayout.ShimmerLayout;


public class Home extends Fragment  {
    private static final String EXTRA_TEXT = "text";
    private RecyclerView recyclerView;
    private ArrayList<Item> arrayList;
    private GriadAdapter gridAdapter;

    public static Home createFor(String text) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(EXTRA_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.Cpp);
        arrayList = new ArrayList<>();

        arrayList.add(new Item(R.drawable.clogo));
        arrayList.add(new Item(R.drawable.cpplogo));
        arrayList.add(new Item(R.drawable.javalogo));
        arrayList.add(new Item(R.drawable.pythonlogo));
        arrayList.add(new Item(R.drawable.kotalin));
        arrayList.add(new Item(R.drawable.share));


        gridAdapter = new GriadAdapter(getActivity(), arrayList);
        recyclerView.setAdapter(gridAdapter);

        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        recyclerView.addOnItemTouchListener(new Home.RecyclerTouchListener(getActivity(), recyclerView, new Home.ClickListener() {

            @Override
            public void onClick(View view, int position) {
                FragmentActivity a= getActivity();
                switch (position) {
                    case 0:
                        startActivity(new Intent(a, CLanguage.class));
                        break;
                    case 1:
                        startActivity(new Intent(a, CppLanguage.class));
                        break;
                    case 2:
                        startActivity(new Intent(a, JavaProgramming.class));
                        break;
                    case 3:
                        startActivity(new Intent(a, Python.class));
                        break;
                    case 4:
                        startActivity(new Intent(a, kotlin.class));
                        break;
                    case 5:
                        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                        String app_url = "https://play.google.com";
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                        break;
                }

            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));

        return view;

    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private Home.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final Home.ClickListener clickListener) {
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
}
