package frogger;

public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }

    // Check if the position is valid
    public boolean isValidPosition(int position) {
        return position >= 0 && position < occupied.length;
    }

    // Check if the position is occupied
    public boolean isOccupied(int position) {
        return occupied[position];
    }
}
