package lesson1.Lesson1;

public class competitionInAction {

    public static void main(String args[]) {
        MemberOfTeam[] memberOfTeam = new MemberOfTeam[4];
        memberOfTeam[0] = new MemberOfTeam("Иван", 1000, 500, 1.75);
        memberOfTeam[1] = new MemberOfTeam("Алексей", 1200, 700, 2.10);
        memberOfTeam[2] = new MemberOfTeam("Алёна", 850, 460, 1.65);
        memberOfTeam[3] = new MemberOfTeam("Ольга", 1000, 900, 1.89);

        Team team = new Team("Атлант", memberOfTeam);

        memberOfTeam[0].memberOfTeamInfo();
        memberOfTeam[1].memberOfTeamInfo();
        memberOfTeam[2].memberOfTeamInfo();
        memberOfTeam[3].memberOfTeamInfo();

        Course course = new Course(800, 500, 1.75);
        String result = course.competition(team);
        System.out.println(result);
    }
}
