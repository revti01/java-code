class Pen{
    String colour;
    String type; // ballpoint;ge

    public void write (){
        System.out.println("writing something");
    }

    public void printcolour(){
        System.out.println(this.colour);
    }

}
public class oops1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "red";
        pen2.type = "ball";

        pen1.printcolour();
        pen2.printcolour();
    }
    
}
