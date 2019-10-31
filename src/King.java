public class King extends Piece {

  public King(boolean isWhite) {
    super(1000, isWhite);
  }

  @Override
  void move() {
    System.out.println("One square");
  }

  @Override
  public String toString() {
    return "King{value='=" + getValue() + "\'" + "}";
  }
}
