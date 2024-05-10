package student;

public class SlytherinStudent extends HogwartsStudent {

    public SlytherinStudent(int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness) {
        super(powerOfMagic, transgressionDistance);
        Cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    private int Cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return Cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "Cunning=" + Cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public int calculateAbilitiesSum() {
        return Cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compare(SlytherinStudent student) {
        int sum1 = calculateAbilitiesSum();
        int sum2 = student.calculateAbilitiesSum();

        if (sum1 > sum2) {
            System.out.println("Student1 > Student2");
        } else if (sum1 < sum2) {
            System.out.println("Student1 < Student2");
        } else {
            System.out.println("Student1 == Student2");

        }
    }
}
