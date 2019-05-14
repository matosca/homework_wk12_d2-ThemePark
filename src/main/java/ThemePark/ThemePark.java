package ThemePark;

import Stalls.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.reviews = new ArrayList<>();
    }

    public int countReviews(){
        return reviews.size();
    }

    public ArrayList<IReviewed> getAllReviews() {
        return reviews;
    }


}
