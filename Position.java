public class Position {

    Coordinate coordinate;
    Piece piece = null;

    public Position(int x, int y) {
        this.coordinate = new Coordinate(x, y);
    }

    public Position(Coordinate coordinate, Piece piece) {
        this.coordinate = coordinate;
        this.piece = piece;
    }

    public int getX() {
        return coordinate.getX();
    }

    public int getY() {
        return coordinate.getY();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
