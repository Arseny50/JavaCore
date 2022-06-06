package lesson1.Lesson1;

public class MemberOfTeam {
    private String name;
    private int run;
    private int swim;
    private double jump;

    public MemberOfTeam(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }

    public void memberOfTeamInfo() {
        System.out.println("Член команды : " + name + " может пробежать " + run + " м , можеть проплыть " + swim +
                " м , может прыгнуть на " + jump + " м");
        System.out.println("----------------");
    }

}
