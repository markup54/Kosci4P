package com.example.kosci4p;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> widokiKosci = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        widokiKosci.add(findViewById(R.id.imageView));
        widokiKosci.add(findViewById(R.id.imageView2));
        widokiKosci.add(findViewById(R.id.imageView3));
        widokiKosci.add(findViewById(R.id.imageView4));
        widokiKosci.add(findViewById(R.id.imageView5));
        widokiKosci.add(findViewById(R.id.imageView6));

        //losuj(3);
    }
    private void losuj(int ile){
        for (int i=0;i<ile;i++){
            Kosc kosc = new Kosc();
            widokiKosci.get(i).setImageResource(kosc.getIdObrazka());
        }
        for(int i = ile; i<widokiKosci.size();i++){
            Kosc kosc =new Kosc();
            kosc.setWidoczne(false);
            widokiKosci.get(i).setImageResource(kosc.getIdObrazka());
            widokiKosci.get(i).setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ile_kosci,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ile1:
                losuj(1);
                return true;
            case R.id.ile2:
                losuj(2);
                return true;
            case R.id.ile3:
                losuj(3);
                return true;
            case R.id.ile4:
                losuj(4);
                return true;
                case R.id.ile5:
                losuj(5);
                return true;
            case R.id.ile6:
                losuj(6);
                return true;
        }
        return true;

    }
}