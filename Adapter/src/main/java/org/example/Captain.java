package org.example;

public final class Captain {
    private RowingBoat rowingBoat;
    public Captain(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }
    void row(){
        rowingBoat.row();
    }
}
