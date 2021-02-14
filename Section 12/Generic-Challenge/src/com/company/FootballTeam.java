package com.company;

public class FootballTeam extends Team {
    public FootballTeam(String name) {
        super(name);
    }

    @Override
    public int getScore() {
        return super.getWin() * 3 + super.getTied();
    }
}
