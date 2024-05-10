package student;

public class HufflepuffStudent extends HogwartsStudent {

    public HufflepuffStudent(int powerOfMagic, int transgressionDistance, int hardworking, int loyal) {
        super(powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    private int hardworking;
    private int loyal;
    private int honest;

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int calculateAbilitiesSum() {
        return hardworking + loyal + honest;
    }

    public void compare(HufflepuffStudent student) {
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
