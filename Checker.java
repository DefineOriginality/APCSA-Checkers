public class Checker {
    // Position of the checker on the board
    private int x;
    private int y;
    private final String color; // "red" or "black"

    // Constructor to initialize the checker position
    public Checker(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Method to move the checker to a new position
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Method to get the current position of the checker
    public int[] getPosition() {
        return new int[]{x, y};
    }

    public String getColor() {
        return color;
    }
}
