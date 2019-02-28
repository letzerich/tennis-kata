package com.pairgood;

public class TennisScorer {

    private int serverScore = 0;
    private int receiverScore = 0;

    public TennisScorer(int serverScore, int receiverScore) {
        this.serverScore = serverScore;
        this.receiverScore = receiverScore;
    }

    public int getServerScore() {
        return serverScore;
    }

    public int getReceiverScore() {
        return receiverScore;
    }

    public void serverWon() {
        serverScore += 15;
    }

    public void receiverWon() {
        receiverScore += 15;
    }
}
