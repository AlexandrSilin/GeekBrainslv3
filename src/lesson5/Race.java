package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    private int winner = -1;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        if (this.winner == -1) {
            this.winner = winner;
            System.out.println("WIN " + winner);
        }
    }
}
