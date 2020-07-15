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
        Map<int, int> x = new HashMap<int int>; // maps/hash tables that store x coordinates 
        Map<int, char> y = new HashMap<int, char>;//that point to y coordinates, that point to a char holding the state
        for (int i=0; i<iterations; i++) {
            if (x.containsKey(x) && y.containsKey(y)) {
                char c = y.get(y); // will this work if there are multiple values of y?
                //do what the rule is for c
                // change what direction is
            }
            else{
                //do the default state
                //add the new value into the dictionary
                //  if (x.containsKey(x)){
                x.put(x, y);
                y.put(y, state); // something like this
          
            }
           newX(direction);
           newY(direction);// updating thes values with these mutator methods
        }  
    }
    public void newX (char dir) {
        if (dir=='W') {
            this.x=this.x-1;
        }
        else if (dir == 'E') {
            this.x = this.x+1;
        } //would it be better to be returing an int??
        
    }
    public void newY (char dir) {
        if (dir=='S') {
            this.y=this.y-1;
        }
        else if (dir == 'E') {
            this.y = this.y+1;
        } //would it be better to be returing an int??
        
    }
}

