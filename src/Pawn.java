public class Pawn extends Piece {

  private boolean promote;
  private Piece newPiece;

  public Pawn(boolean isWhite) {
    super(1, isWhite);
  }

  public void promote(Piece newPiece) {
    setPromote(true);
    setNewPiece(newPiece);
  }

  @Override
  public void move() {
    System.out.println("Forward 1");
  }

  @Override
  public String toString() {
    return "King{value='=" + getValue() + "\'" + "}";
  }

  @Override
  public boolean equals(Object o) {
    Pawn p = (Pawn) o;
    if ((isPromote() && !p.isPromote()) || (!isPromote() && p.isPromote())) return false;
    if ((isPromote() && p.isPromote())) return super.equals(p.getNewPiece());
    return super.equals(p);
  }

  public boolean isPromote() {
    return promote;
  }

  public Piece getNewPiece() {
    return newPiece;
  }

  public void setPromote(boolean promote) {
    this.promote = promote;
  }

  public void setNewPiece(Piece newPiece) {
    this.newPiece = newPiece;
  }
}
