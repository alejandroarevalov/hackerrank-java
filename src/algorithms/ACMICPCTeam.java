package algorithms;

import java.util.List;

public class ACMICPCTeam {

    public static List<Integer> acmTeam(List<String> topic) {
        int maxTeams = 0;
        int maxTopics = 0;

        for (int i = 0; i < topic.size(); i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                String topics1 = topic.get(i);
                String topics2 = topic.get(j);
                int topicsKnownByTeamIJ = calculateTotalTopics(topics1, topics2);
                if (topicsKnownByTeamIJ > maxTopics) {
                    maxTopics = topicsKnownByTeamIJ;
                    maxTeams = 1;
                } else if (topicsKnownByTeamIJ == maxTopics) {
                    maxTeams++;
                }
            }
        }

        return List.of(maxTopics, maxTeams);
    }

    public static int calculateTotalTopics(String topics1, String topics2) {
        int totalTopics = 0;
        for (int i = 0; i < topics1.length(); i++) {
            if (topics1.charAt(i) == '1' || topics2.charAt(i) == '1') {
                totalTopics++;
            }
        }
        return totalTopics;
    }

    public static void main(String[] args) {
        System.out.println(acmTeam(List.of("10101", "11110", "00010")));
        System.out.println(acmTeam(List.of("10101", "11100", "11010", "00101")));
    }
}
