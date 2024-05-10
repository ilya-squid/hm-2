import student.GryffindorStudent;
import student.HufflepuffStudent;
import student.SlytherinStudent;

public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent (90,90,100,100,100);
        System.out.println(harryPotter);

        GryffindorStudent hermioneGranger = new GryffindorStudent(100,100,100,80,70);

        SlytherinStudent dracoMalfoy = new SlytherinStudent(90,90,100,100,100, 100);

        HufflepuffStudent cedricDiggory = new HufflepuffStudent(100,100,100, 100);

        harryPotter.compare(hermioneGranger);
        harryPotter.baseCompare(hermioneGranger);
        harryPotter.baseCompare(dracoMalfoy);
        hermioneGranger.baseCompare(cedricDiggory);

    }
}