import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Ants {
    int x;
    int y;
    char currState;
    char[] directions;
    char[] newState;
    int numberIterations; 

    public void readIn() {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter initial state");
        this.currState = reader.nextChar() ; // need something that deals with not allowing spaces
        for (int i =0; i<5; i++) {
            this.directions[i] = reader.nextChar(); // should set the directions command
        }
        for (int i =0; i<5; i++) {
            this.directions[i] = reader.nextChar(); // should set the directions command
        }
    }
    public void initAnt (char currState, char[] directions, char[] newState) {
        
    }
    public char output() {
        char[] totalarray;
        System.out.println(" ");// currState (has been changed) + directions[] + newStates
        Sytem.out.println("# " + x + " " + y);
    }
    public void run (int iterations) {
        Map<int, int> x = new HashMap<int int>;
        Map<int, char> y = new HashMap<int, char>;
        for (int i=0; i<iterations; i++) {
            
           
        }
        
}
