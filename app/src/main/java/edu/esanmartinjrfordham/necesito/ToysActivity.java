package edu.esanmartinjrfordham.necesito;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToysActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_list);

        // Create a list of posts
        // Be sure to connect database here, currently inputting fake/ filler data and posts
        final ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Toys", "Food", 3, 4));
        posts.add(new Post("Toys", "Water", 1, 5));
        posts.add(new Post("Toys", "Clothes", 2, 2));

        // Create an {@link PostAdapter}, whose data source is a list of {@link Post}s. The
        // adapter knows how to create list items for each item in the list.
        PostAdapter adapter = new PostAdapter(this, posts);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // post_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Post} in the list.
        listView.setAdapter(adapter);
    }
}
