import java.util.Scanner;

public class Player {

  private String name;
  private int score;
  private boolean turn;

  Player() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    this.setName(sc.nextLine());
    this.setScore(0);
    this.setTurn(false);
  }

  public boolean getTurn() {
    return turn;
  }

  public void setTurn(boolean turn) {
    this.turn = turn;
  }

  Player(String name, int score) {
    this.setName(name);
    this.setScore(score);
    this.setScore(0);
    this.setTurn(false);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }

  public void addScore() {
    this.score += 1;
  }
}
