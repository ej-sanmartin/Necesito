package edu.esanmartinjrfordham.necesito;

/**
 *  {@link Post} Post class describes the Posts that a user makes, which include
 *  what the user has, what the user wants, how far away the user is, and that user's
 *  score (5 star scales)
 */
public class Post {

    // What the post's user has
    private String mUserHas;

    // What the post's user wants
    private String mUserWants;

    // Where the post's user is located - where the user viewing the post is located (in km)
    private int mUserDistance;

    // The post's user's score
    private int mUserScore = INITIAL_SCORE;

    // Constant value that represents a 0 star values for a new, unrated user
    private static final int INITIAL_SCORE = 0;

    /**
     * Create a new Post object.
     *
     * @param userHas      is what the user advertises as having from spinner options
     * @param userWants    is what the user wants as chosen from spinner options
     * @param userDistance is where the user is located (in km)
     * @param userScore    is the user's score on a five star scale (initially will be 0)
     */
    public Post(String userHas, String userWants, int userDistance, int userScore) {
        mUserHas = userHas;
        mUserWants = userWants;
        mUserDistance = userDistance;
        mUserScore = userScore;
    }

    /**
     * Get what the user has
     */
    public String getUserHas() {
        return mUserHas;
    }

    /**
     * Get what the user wants
     */
    public String getUserWants() {
        return mUserWants;
    }

    /**
     * Get user's distance
     */
    public int getUserDistance() {
        return mUserDistance;
    }

    /**
     * Get user's score
     */
    public int getUserScore() { return mUserScore ; }
}