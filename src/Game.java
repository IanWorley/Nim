import java.util.Scanner;

public class Game {

  Game() {
    Player player_one = new Player();
    Player player_two = new Player();
    player_start(player_one, player_two);
    Board gameBoard = new Board();
    while (gameBoard.getGamePieces() != 1) {
      System.out.println(gameBoard.getBoardDisplay());
      if (player_one.getTurn()) {
        makePlay(player_one, gameBoard);
        player_one.setTurn(false);
        player_two.setTurn(true);
      } else {
        makePlay(player_two, gameBoard);
        player_two.setTurn(false);
        player_one.setTurn(true);
      }
    }
    if (!player_one.getTurn()) {
      System.out.println(player_one.getName() + "Wins");
      player_one.addScore();
    } else {
      System.out.println(player_two.getName() + "Wins");
      player_two.addScore();
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
    System.out.println("It is now " + p.getName() + " Turn.");
    Scanner sc = new Scanner(System.in);
    while (board.getGamePieces() != 1) {
      System.out.println("Pick a number between 1 - " +  board.getGamePieces() / 2 + " :");
      int num = sc.nextInt();
      if (num <= board.getGamePieces() / 2 && num >= 1) {
        board.setGamePieces(board.getGamePieces() - num);
        board.makeBoardDisplay();
        break;
      }

    }
  }
}
