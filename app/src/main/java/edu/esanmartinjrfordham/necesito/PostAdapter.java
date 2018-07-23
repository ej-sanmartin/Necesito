package edu.esanmartinjrfordham.necesito;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends ArrayAdapter<Post>  {
    /**
     * Create a new {@link PostAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param posts is the list of {@link Post}s to be displayed.
     */
    public PostAdapter(Context context, ArrayList<Post> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View postItemView = convertView;
        if (postItemView == null) {
            postItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.post_item, parent, false);
        }

        // Get the {@link Post} object located at this position in the list
        Post currentPost = getItem(position);

        // Find the TextView in the post_item.xml layout with the ID has_text_view.
        TextView hasTextView = (TextView) postItemView.findViewById(R.id.has_text_view);
        // Set what the user has
        hasTextView.setText("Has: " + currentPost.getUserHas());

        // Find the TextView in the post_item.xml layout with the ID wants_text_view.
        TextView wantsTextView = (TextView) postItemView.findViewById(R.id.wants_text_view);
        // Set what the user wants
        wantsTextView.setText("Wants: " + currentPost.getUserWants());

        /**
         * For future development, use UserInfo activity to determine where the user searching
         * is looking from. Then, for each item, look at where the post was originally posted from.
         * Finally, find the distance between these two points and round to nearest kilometer.
         */
        // Find the TextView in the post_item.xml layout with the ID distance_text_view.
        TextView distanceTextView = (TextView) postItemView.findViewById(R.id.distance_text_view);
        // Gets the user's approximate distance from where the original poster is from
        distanceTextView.setText(currentPost.getUserDistance() + "km Away");

        /**
         * For future development, set up backend to also store a user's score. Initially
         * a new user will have a score of 0/5 but it should be indicated that 1 is the lowest
         * rated score one could receive, not 0 which is the default score. Also, aff deature to
         * add scoring system
         */
        // Find the TextView in the post_item.xml layout with the ID score_text_view.
        TextView scoreTextView = (TextView) postItemView.findViewById(R.id.score_text_view);
        // Gets the user's approximate distance from where the original poster is from
        scoreTextView.setText(currentPost.getUserScore() + "/5");

        // Return the whole post item layout (containing 4 TextViews) so that it can be shown in
        // the ListView.
        return postItemView;
    }
}
