package Attractions;

import Visitors.Visitor;

public class Rollercoster extends Attraction  implements ISecurity{

    private int minimumAge;
    private int minimumHeight;

    public Rollercoster(String name, int rating) {
        super(name, rating);
        this.minimumAge = 12;
        this.minimumHeight = 145;
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {

        if(visitor.getAge() >= this.minimumAge && visitor.getHeight() >= this.minimumHeight
        ) {
            return true;
        }
        return false;
    }
}
