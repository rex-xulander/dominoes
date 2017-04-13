import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Rex on 4/13/17.
 */
public class Player {

    public String name;
    private int score;

    protected Hand hand;

    protected void sortHand() {
        hand.sort();
    }

    public Player() {
        this.name = "No Name";
        this.score = 0;
        this.hand = new Hand();
        return;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new Hand();
        return;
    }

    public class Hand extends ArrayList<Piece> {

        final static short HAND_SIZE = 7;
            //Collections.sort(this, new PieceComparator());

        public void print() {
            if (this == null) return;

            for(Piece piece : this) {
                piece.print();
            }

            return;
        }
        private void sort() {
            Collections.sort(this, new PieceComparator());
        }

        public Hand() {
            super();
            return;
        }
    }
}