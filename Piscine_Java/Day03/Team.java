package Day03;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName = null;
    private List<Day03.Astronaut> astroList = new ArrayList<Day03.Astronaut>();
    public Team(String nameOfTeam) {
        teamName = nameOfTeam;
    }

    public String getName() {
        return (teamName);
    }

    public void add(Day03.Astronaut newAstro) {
        if (newAstro != null) {
            astroList.add(newAstro);
        }
    }

    public void remove(Day03.Astronaut astronaut) {
        if (astronaut == null)
            return;
        for (int i = 0; i < astroList.size(); i++) {
            if (astroList.get(i).equals(astronaut)) {
                astroList.remove(i);
            }
        }
    }

    public int countMembers() {
        return (astroList.size());
    }

    public void showMembers() {
        if (astroList.size() == 0)
            return;
        System.out.print(teamName + ":");
        for (int i = 0; i < astroList.size(); i++) {
            if (astroList.get(i).getDestination() != null)
                System.out.print(" " + astroList.get(i).getName() + " on mission");
            else
                System.out.print(" " + astroList.get(i).getName() + " on standby");
            if (i == (astroList.size() - 1))
                System.out.println(".");
            else
                System.out.print(",");
        }
    }

    public void doActions () {
        System.out.println(teamName + ": Nothing to do.");
    }

    public void doActions(Object marsObject) {
        for (int i = 0; i < astroList.size(); i++) {
            astroList.get(i).doActions(marsObject);
        }
    }
}
