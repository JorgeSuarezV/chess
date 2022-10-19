import java.util.List;

public class ClasicRookMovementEvaluator implements MovementEvaluator {

    @Override
    public boolean isValidMove(Board board, Move move) {
        List<Position> actualPositions = board.getHistory().get(board.getHistory().size()-1);
        for (int i = move.getFrom().getX(); i < board.getSize();) {
            if (Board.getPosition())
        }
    }

    @Override
    public List<Coordinate> getValidMoves(Board board) {
        return null;
    }
}
