package Attractions;

import Visitors.Visitor;

public class Playground extends Attraction  implements ISecurity {

    private int maximumAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maximumAge = 15;
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {

        if (visitor.getAge() <= this.maximumAge){
            return true;
        }
        return false;
    }
}
