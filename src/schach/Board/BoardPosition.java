package schach.Board;


public class BoardPosition{
    private final String xCoordinate;
    private final int yCoordinate;

    public BoardPosition(String xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    String getXCoordinate(){
        return this.xCoordinate;
    }
    int getYCoordinate(){
        return this.yCoordinate;
    }
}