class Archon {
    public void burst(){
        System.out.println("Using Elemental Burst");
    }
}
class Raiden extends Archon {
    @Override
    public void burst(){
        System.out.println("Inazuma Shines Eternal!");
    }

}
public class Polymorphism {

    public static void main(String[] args){
        Raiden obj = new Raiden();
        obj.burst();

    }
}
