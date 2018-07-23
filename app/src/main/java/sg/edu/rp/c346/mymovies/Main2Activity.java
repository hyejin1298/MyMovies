package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView tvDes;
    ListView lvMovie;
    CustomAdapter caMovie;
    ArrayList<Movies> alMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvMovie = findViewById(R.id.listViewMovieList);
        alMovieList = new ArrayList<>();


        alMovieList = new ArrayList<>();
        Movies item1 = new Movies("The Avangers" , "2012" , "pg13" , "Action|Sci-Fi" , "15/12/2014" , "Golden Village - Bishan" , "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army."  );

        Movies item2 = new Movies("Planes" , "2013" , "pg" , "Animation | Comedy" , "15/5/2015" , "Cathay - AMK Hub" , "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race."  );


        alMovieList.add(item1);
        alMovieList.add(item2);
        caMovie = new CustomAdapter(this , R.layout.movie_item , alMovieList);

       lvMovie.setAdapter(caMovie);

        tvDes = findViewById(R.id.textViewDes);

        Intent intentReceived = getIntent();
      //  Movies movie = (Movies) intentReceived.getSerializableExtra("movie");
        // tvDes.setText(movie.toString());
       String value = intentReceived.getStringExtra("value" );
       tvDes.setText(value);


    }
}
