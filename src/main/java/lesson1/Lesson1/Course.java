package lesson1.Lesson1;

public class Course {

    private int courseRun;
    private int courseSwim;
    private double courseJump;

    public Course(int courseRun, int courseSwim, double courseJump) {
        this.courseRun = courseRun;
        this.courseSwim = courseSwim;
        this.courseJump = courseJump;
    }

    public String competition(Team team) {
        String result = "Имя команды: " + team.getName() + " " + '\n';
        for (MemberOfTeam memberOfTeam : team.getPeople()) {
            result += "Имя члена команды: " + memberOfTeam.getName() + " " + '\n';
            if (memberOfTeam.getRun() >= courseRun) result += "Дистанция бега преодолена " + '\n';
            if (memberOfTeam.getSwim() >= courseSwim) result += "Дистанция заплыва преодолена " + '\n';
            if (memberOfTeam.getJump() >= courseJump) result += "Прыжок выполнен успешно " + '\n';
        }
        return result;
    }
}