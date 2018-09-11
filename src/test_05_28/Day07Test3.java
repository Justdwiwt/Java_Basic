package test_05_28;

public class Day07Test3 {
    public static void main(String[] args) {
        Role m1 = new Magicer("1", 5);
        Role s1 = new Soldier("2", 8);
        Role m2 = new Magicer("3", 3);
        Role s2 = new Soldier("4", 6);
        Role m3 = new Magicer("5", 9);
        Team team = new Team();
        team.addMember(m1);
        team.addMember(s1);
        team.addMember(m2);
        team.addMember(s2);
        team.addMember(m3);
        System.out.println(team.attackSum());
    }
}

class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public int attack() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Magicer extends Role {
    private int level;

    public Magicer(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public int attack() {
        return level * 5;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1 || level > 10) {
            System.out.println("error");
            return;
        }
        this.level = level;
    }
}

class Soldier extends Role {
    private int hurt;

    public Soldier(String name, int hurt) {
        super(name);
        this.hurt = hurt;
    }

    @Override
    public int attack() {
        return hurt;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}

class Team {
    private Role[] roles = new Role[6];
    int index = 0;

    public void addMember(Role role) {
        if (index >= 6) {
            System.out.println("error");
            return;
        }
        roles[index] = role;
        index++;
    }

    public int attackSum() {
        int attack = 0;
        for (Role role : roles)
            if (role != null)
                attack += role.attack();
        return attack;
    }
}