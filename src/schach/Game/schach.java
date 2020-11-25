package schach.Game;

import schach.Board.BoardPosition;
import schach.Exception.GameException;
import schach.Exception.StatusException;
import schach.SchachPiece.Piece;


public interface schach {


    SchachColour pick(String username, SchachColour colour) throws GameException, StatusException;
    Piece setPiece(String username,SchachColour colour , BoardPosition position, Piece piece) throws GameException, StatusException;

    Piece pieceAt(BoardPosition X,BoardPosition Y);

}
