package templateMethod.graduation;

public class EngineeringDepartment extends Collage {
    @Override
    public void exam() {
        System.out.println("finish exams in Engineering Department.");
    }

    @Override
    public void thesis() {
        System.out.println("finish a thesis in Engineering Department.");
    }
}
