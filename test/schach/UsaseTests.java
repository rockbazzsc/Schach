package schach;

import org.junit.Assert;
import org.junit.Test;
import schach.Board.Board;
import schach.Board.BoardPosition;
import schach.Exception.GameException;
import schach.Exception.StatusException;
import schach.Game.SchachColour;
import schach.Game.schach;
import schach.SchachPiece.Piece;
import schach.SchachPiece.Rook;

import static org.junit.Assert.assertNull;

public class UsaseTests {
    public static final String BOB = "Bob";
    public static final String PETER ="Peter";
    public static final String MAX = "Max";
    private Rook room;

    public schach getSchach(){
        return null;
    }

    @Test
    public void GoodTest1() throws GameException, StatusException {
        schach schh = this.getSchach();
        SchachColour bobColour = schh.pick(BOB, SchachColour.WHITE);
        Assert.assertEquals(SchachColour.WHITE,bobColour);
    }

    @Test
    public void GoodTest2()throws GameException,StatusException{
        schach schh = this.getSchach();
        SchachColour bob = schh.pick(BOB,SchachColour.WHITE);
        SchachColour peter = schh.pick(PETER,SchachColour.BLACK);
        Assert.assertEquals(SchachColour.WHITE,bob);
        Assert.assertEquals(SchachColour.BLACK,peter);

    }

    @Test
    public void goodTest3() throws GameException, StatusException {
        schach schh = this.getSchach();
        SchachColour bob = schh.pick(BOB, SchachColour.WHITE);
        SchachColour peter = schh.pick(PETER, SchachColour.WHITE);
        Assert.assertEquals(SchachColour.WHITE, bob);
        Assert.assertEquals(SchachColour.BLACK, peter);
    }

    public void goodTest4() throws GameException, StatusException {
        schach shh = this.getSchach();
        SchachColour bob = shh.pick(BOB, SchachColour.WHITE);
        SchachColour peter = shh.pick(PETER, SchachColour.WHITE);
        Assert.assertEquals(SchachColour.BLACK, bob);
        Assert.assertEquals(SchachColour.WHITE, peter);
    }

    @Test(expected = StatusException.class)
    public void badPick1() throws GameException, StatusException {
        schach shh = this.getSchach();
        SchachColour bob = shh.pick(BOB, SchachColour.WHITE);
        SchachColour peter = shh.pick(PETER, SchachColour.BLACK);
        SchachColour max = shh.pick(MAX, SchachColour.BLACK);
        Assert.assertEquals(SchachColour.BLACK, bob);
        Assert.assertEquals(SchachColour.WHITE, peter);
        Assert.assertEquals(SchachColour.BLACK,max);

    }

    @Test
    public void goodTest5() throws GameException, StatusException {
        schach shh = this.getSchach();
        SchachColour bob = shh.pick(BOB, SchachColour.WHITE);
        SchachColour peter = shh.pick(PETER, SchachColour.BLACK);

        BoardPosition position= new BoardPosition("A", 3);
        Assert.assertFalse(shh.setPiece(BOB,SchachColour.WHITE, position ,Piece.Rook));
    }

    @Test(expected = GameException.class)
    public void OutOfBounds() throws GameException, StatusException {
        schach shh = this.getSchach();
        SchachColour bob = shh.pick(BOB, SchachColour.WHITE);
        SchachColour peter = shh.pick(PETER, SchachColour.BLACK);

        BoardPosition position = new BoardPosition("W", 99);

       Object a= shh.setPiece(BOB,SchachColour.WHITE, position ,Piece.King)   ;
        Assert.assertEquals(a,null);
    }

    @Test
    public void checkForPieceOnBoard() {
        schach shh = this.getSchach();
        BoardPosition position = new BoardPosition("W", 99);
        Piece tempPiece = shh.setPiece(BOB,SchachColour.WHITE, position ,Piece.King);
        Piece nullPiece1 = shh.pieceAt(xEmptyPosition, yEmptyPosition);
        Piece nullPiece2 = shh.pieceAt(BoardPosition.X, BoardPosition.Y);
        assertNull(nullPiece1);
        assertNull(nullPiece2);
    }


}

