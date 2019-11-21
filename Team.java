public class Team {
    String teamName;
    Skills[] teamRunner;

    public Skills[] getTeamRunner() {
        return teamRunner;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamRunner = new Skills[]{
                new robot("r2d2", 12, 10),
                new humans("Jon Snow", 5, 5),
                new Cat("Salem", 10, 1),
                new robot("Bender", 100, 100)};
    }

    public void teamPresent() {
        for (Skills s : teamRunner) {
            s.presentation();
        }

    }


    public void showResultOfTeam() {
        for (Skills s : teamRunner) {
            if (s.onTrack()) {
                s.result();
            }

        }
    }
}