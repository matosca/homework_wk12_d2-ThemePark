package Stalls;

import Attractions.ISecurity;
import Visitors.Visitor;

public class TobaccoStall extends Stall  implements ISecurity {

    private int minimumAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minimumAge = 18;
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {

        if (visitor.getAge() >= this.minimumAge) {
            return true;
        }
        return false;
    }
}
