import java.math.BigDecimal;
import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {

    King king = new King(true);
    Queen queen = new Queen(true);
    Knight knight = new Knight(true);
    Bishop bishop = new Bishop(true);
    Rook rook = new Rook(true);
    Pawn pawn = new Pawn(true);

    ArrayList<Piece> pieceList = new ArrayList<>();
    pieceList.add(pawn);
    pieceList.add(knight);
    pieceList.add(bishop);
    pieceList.add(rook);
    pieceList.add(queen);
    pieceList.add(king);

    for (Piece p : pieceList) {
      p.move();
    }

    System.out.println("");

    Pawn p1 = new Pawn(true);
    p1.promote(queen);
    Pawn p2 = new Pawn(true);
    Pawn p3 = new Pawn(false);
    Pawn p4 = new Pawn(false);
    p4.promote(queen);
    Pawn p5 = new Pawn(true);
    p5.promote(knight);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));
  }
}
