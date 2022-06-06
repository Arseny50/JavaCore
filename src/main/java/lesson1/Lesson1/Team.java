package lesson1.Lesson1;

public class Team {
    private String name;
    private MemberOfTeam[] people;

    public Team(String name, MemberOfTeam[] people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public MemberOfTeam[] getPeople() {
        return people;
    }
}
