import java.util.*;

public class FootballLeagueSimulator {

    public static void main(String[] args) {

        String[] clubs = new String[] { "Manchester United (MUTD)", "Chelsea (CLSE)", "Newcastle United (NCSU)",
                "Everton (EVTN)", "Psybergate FC (PSY)", "Football Club Of TheYear(FCTY)" };
        String[] matchResults = new String[] { "FCTY(8)-MUTD(2)", "CLSE(0)-PSY(4)", "NCSU(1)-FCTY(1)",
                "EVTN(1)-CLSE(1)" };

        String[] columns = new String[] { "Clubs", "MP", "W", "D", "L", "GF", "GA", "GD", "Pts" };

        simulateGameWeek(clubs, matchResults);
    }

    private static void simulateGameWeek(String[] clubs, String[] matchResults) {

        List<Club> tableRow = new ArrayList<>();
        Map<String, Integer> team = new HashMap<>();
        Club club = new Club();

        for (int i = 0; i < matchResults.length; i++) {

            String match = matchResults[i];

            String homeTeam, awayTeam;
            int awaygoal = 0, homegoal = 0;
            String[] arrayOf = match.split("-");
            for (int o = 0; o < arrayOf.length; o++) {
                homeTeam = arrayOf[o];
                awayTeam = arrayOf[0 + 1];

                for (int s = 0; s < homeTeam.length(); s++) {

                    if (Character.isDigit(homeTeam.charAt(s))) {
                        team.put(homeTeam.replaceAll("\\p{P}", ""), Character.getNumericValue(homeTeam.charAt(s)));
                        homegoal = Character.getNumericValue(homeTeam.charAt(s));

                    }

                }
                for (int z = 0; z < awayTeam.length(); z++) {
                    if (Character.isDigit(awayTeam.charAt(z))) {
                        team.put(awayTeam.replaceAll("\\p{P}", ""), Character.getNumericValue(homeTeam.charAt(z)));
                        awaygoal = Character.getNumericValue(homeTeam.charAt(z));
                    }
                }

                if (homegoal > awaygoal) {
                    club.setW(1);
                    club.setGF(homegoal);
                    club.setL(0);
                    club.setMP(1);
                    club.setPts(3);
                    club.setGD(homegoal - awaygoal);
                }

                System.out.println(club.toString());

            }

        }

    }

}
