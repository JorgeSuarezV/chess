import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<List<Position>> history;
    private final int size;

    public Board(int size1) {
        size = size1;
        List<List<Position>> history1 = new ArrayList<>();
        history1.add(generatePositions(size));
        history = history1;
    }

    private List<Position> generatePositions(int size) {
        List<Position> positionList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                positionList.add(new Position(i,j));
            }
        }
        return positionList;
    }

    public List<List<Position>> getHistory() {
        return history;
    }


    public int getSize() {
        return size;
    }

    public static @Nullable Piece getPosition(@NotNull List<Position> actualState, Coordinate coordinate){
        for (Position position : actualState) {
            if (position.getY() == coordinate.getY() && position.getX() == coordinate.getX())
                return position.getPiece();
        }
        return null;
    }
}
