package com.example.kosci4p;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> widokiKosci = new ArrayList<>();
    ArrayList<Kosc> kosci = new ArrayList<>();
    Button button;
    int ile_wybranych_koscu = 0;

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
        for(int i =0 ; i<6;i++) {
            kosci.add(new Kosc());
        }
        //losuj(3);
        button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        losuj(ile_wybranych_koscu);
                    }
                }
        );
    }
    private void losuj(int ile){
        for (int i=0;i<ile;i++){
            kosci.get(i).setWartosc();
            widokiKosci.get(i).setImageResource(kosci.get(i).getIdObrazka());
            widokiKosci.get(i).setVisibility(View.VISIBLE);
        }
        for(int i = ile; i<widokiKosci.size();i++){

            kosci.get(i).setWidoczne(false);
            widokiKosci.get(i).setImageResource(kosci.get(i).getIdObrazka());
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
        ile_wybranych_koscu = item.getItemId() - R.id.ile1 +1;
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