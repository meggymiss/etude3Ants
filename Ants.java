import java.util.Scanner;
public class Ants {
    int x;
    int y;
    char currState;
    char[] directions;
    char[] newState;

    public void readIn() {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter initial state");
        this.currState = reader.nextChar() ; // need something that deals with not allowing spaces
    }
    public void initAnt (char currState, char[] directions, char[] newState) {
        
    }
    public void output() {
        
}
