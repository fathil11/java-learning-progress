package com.company;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int win;
    private int lose;
    private int tied;

    public Team(String name) {
        this.name = name;
        this.win = 0;
        this.lose = 0;
        this.tied = 0;
    }

    public String getName() {
        return name;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getTied() {
        return tied;
    }

    public void versus(Team opponent, int score, int opponentScore){
        if(score > opponentScore){
            this.win++;
        } else if(score < opponentScore){
            this.lose++;
        } else{
            this.tied++;
        }

        if(opponent != null){
            opponent.versus(null, opponentScore, score);
        }
    }

    public abstract int getScore();

    @Override
    public int compareTo(Team team) {
        if(this.getScore() > team.getScore()){
            return -1;
        } else if(this.getScore() < team.getScore()){
            return 1;
        } else{
            return 0;
        }
    }
}
