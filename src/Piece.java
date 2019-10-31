public abstract class Piece {

  private int value;
  private boolean isWhite;

  abstract void move();

  public Piece(int value, boolean isWhite) {
    setValue(value);
    setWhite(isWhite);
  }

  @Override
  public String toString() {
    return this.getClass().toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    Piece p = (Piece) o;
    if (getValue() == p.getValue() && isWhite == p.isWhite) return true;
    return false;
  }

  public int getValue() {
    return value;
  }

  public boolean isWhite() {
    return isWhite;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setWhite(boolean white) {
    isWhite = white;
  }
}
