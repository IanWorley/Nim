import java.util.Scanner;

public class Game {

  Game() {
    Player player_one = new Player();
    Player player_two = new Player();
    player_start(player_one, player_two);
    Board gameBoard = new Board();
    while (gameBoard.getGamePieces() != 1) {
      if (player_one.getTurn()) {

        makePlay(player_one, gameBoard);
        player_one.setTurn(false);
        player_two.setTurn(true);
      } else {
        makePlay(player_one, gameBoard);
        player_two.setTurn(false);
        player_one.setTurn(true);
      }
    }
    if (!player_one.getTurn()){
      System.out.println(player_one.getName() + "Wins");
    }
    else{
      System.out.println(player_two.getName() + " Wins");
    }

  }

  public void player_start(Player p1, Player p2) {
    int num = (int) Math.random() * (2 - 1 + 1) + 1;
    if (num % 2 == 0) {
      p1.setTurn(true);
    } else {
      p2.setTurn(true);
    }
  }

  public void makePlay(Player p, Board board) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pick a number between 1 - " + board.getGamePieces() / 2  + " :");
    int num = sc.nextInt();
    while (!(num > 1) && !(num <= board.getGamePieces() / 2)) {
      System.out.println("Pick a number between 1 - " + board.getGamePieces() / 2  + " :");
      num = sc.nextInt();
    }
    board.setGamePieces(board.getGamePieces() - num);
    board.makeBoardDisplay();
  }
}
