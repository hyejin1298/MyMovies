package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movies> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovieList);
        alMovieList = new ArrayList<>();
        Movies item1 = new Movies("The Avangers" , "2012" , "pg13" , "Action|Sci-Fi" , "15/12/2014" , "Golden Village - Bishan" , "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army."  );

        Movies item2 = new Movies("Planes" , "2013" , "pg" , "Animation | Comedy" , "15/5/2015" , "Cathay - AMK Hub" , "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race."  );


        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this , R.layout.movie_item , alMovieList);

        lvMovie.setAdapter(caMovie);


lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //String des = alMovieList.get(i);
      if(i == 0){


        Intent intent = new Intent (getBaseContext() , Main2Activity.class);
        //intent.putExtra("value" , "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army. \n\n\n"  + "Watched on: " + alMovieList.get(0).getWatched_on() + "\n In theatre : " + alMovieList.get(0).getIn_theatre());
         // Movies item1 = new Movies("The Avangers" , "2012" , "pg13" , "Action|Sci-Fi" , "15/12/2014" , "Golden Village - Bishan" , "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army."  );
        //  intent.putExtra("movie" ,  item1);
          intent.putExtra("value" , alMovieList.get(0).getTitle()+ alMovieList.get(0).getYear());
        startActivity(intent);
      }

      else if  (i == 1){
          Intent intent = new Intent (getBaseContext() , Main2Activity.class);
          intent.putExtra("value" , "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race. \n\n\n" +
                  "Watched on: " +

                  alMovieList.get(1).getWatched_on() + "\n In theatre : " + alMovieList.get(1).getIn_theatre());
          startActivity(intent);

      }

    }
});


        //caMovie = new CustomAdapter(this , R.layout.movie_item , alMovieList);

    }
}
