    package com.project.home.moviereview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_movieList = (TextView) findViewById(R.id.textViewMovieList);

        String[] MoviesArray = {
            "Phanthom",
            "Home Alone 3",
            "Black PAnther",
            "Selma",
            "Jumanji",
            "Avengers",
            "Phanthom",
            "Home Alone 3",
            "Black PAnther",
            "Selma",
            "Avengers",
            "Phanthom",
            "Home Alone 3",
            "Black PAnther",
            "Selma"
        };

        for(String MovieString : MoviesArray)
            tv_movieList.append(MovieString + "\n\n\n");
    }
}
