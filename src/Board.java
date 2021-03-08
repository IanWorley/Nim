import java.util.ArrayList;

public class Board {

  private int gamePieces;
  private String piece;
  private ArrayList<String> boardDisplay = new ArrayList<String>();

  public Board() {
    this.gamePieces = (int) Math.random() * (50 - 10 + 1) + 10;
    this.piece = "|";
  }


  public ArrayList<String> getBoardDisplay() {
    return boardDisplay;
  }

  public void setBoardDisplay(ArrayList<String> boardDisplay) {
    this.boardDisplay = boardDisplay;
  }

  public void makeBoardDisplay() {
    this.boardDisplay.clear();

    for (int i = 0; i < this.gamePieces; i++) {
      this.boardDisplay.add(this.piece);
    }
  }

  public String getPiece() {
    return piece;
  }

  public void setPiece(String piece) {
    this.piece = piece;
  }

  public int getGamePieces() {
    return gamePieces;
  }

  public void setGamePieces(int gamePieces) {
    this.gamePieces = gamePieces;
  }
}
