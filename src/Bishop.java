public class Bishop extends Piece {

  public Bishop(boolean isWhite) {
    super(3, isWhite);
  }

  @Override
  void move() {
    System.out.println("Diagonally");
  }

  @Override
  public String toString() {
    return "Bishop{value='=" + getValue() + "\'" + "}";
  }
}
