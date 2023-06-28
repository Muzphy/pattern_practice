package templateMethod.graduation;

public abstract class Collage {

    public final void graduateFromCollage(){
        enroll();
        exam();
        thesis();
        graduate();
    }

    private void enroll(){
        System.out.println("get enrolled into the collage.");
    }

    public abstract void exam();

    public abstract void thesis();

    private void graduate(){
        System.out.println("graduate from the collage.");
    }
}
