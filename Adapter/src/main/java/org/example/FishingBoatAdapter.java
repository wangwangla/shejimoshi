package org.example;

public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat boat = new FishingBoat();
    @Override
    public void row() {
        boat.sail();
    }
}
