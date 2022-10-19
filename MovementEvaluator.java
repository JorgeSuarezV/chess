import java.util.List;

public interface MovementEvaluator {
    boolean isValidMove(Board board, Move move);

    List<Coordinate> getValidMoves(Board board);
}
