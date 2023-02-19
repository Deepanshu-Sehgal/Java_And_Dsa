package Object_oriented_programming.Interface;

public class Interface_oops {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
}

interface ChessPlayer {
    void moves();

}

class Queen implements ChessPlayer {

    @Override
    public void moves() {
        System.out.println("up ,down, left, right,diagonal");
    }
}

class Rook implements ChessPlayer {

    @Override
    public void moves() {
        System.out.println("up down right left");
    }
}

class King implements ChessPlayer {
    @Override
    public void moves() {
        System.out.println("up down left right diagonal");
    }
}
