package student;

public class HogwartsStudent {

    protected int powerOfMagic;

    protected int transgressionDistance;

    public HogwartsStudent(int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int calculateBaseAbilitiesSum() {
        return powerOfMagic + transgressionDistance;
    }

    public void baseCompare(HogwartsStudent hogwartsStudent) {
        int sum1 = calculateBaseAbilitiesSum();
        int sum2 = hogwartsStudent.calculateBaseAbilitiesSum();

        if (sum1 > sum2) {
            System.out.println("Student1 > Student2");
        } else if (sum1 < sum2) {
            System.out.println("Student1 < Student2");
        } else {
            System.out.println("Student1 == Student2");

        }

    }
}
