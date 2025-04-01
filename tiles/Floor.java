package tiles;

import java.util.ArrayList;
import java.util.Stack;

import things.Thing;

public class Floor extends Tile {
    private Stack<Thing> contains;


    public Floor(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
        this.isWalkable = true;
        this.type = "dirt";
        this.setCanBePlacedOn(true);
        contains = new Stack<Thing>();
    }

    //override of printTile, checks whether the tile contains something ie Player
    //if so, print the first char of THAT title rather than 'd'
    @Override
    public char printTile() {
        if(contains.size()>0){
            return contains.peek().getName().charAt(0);
        } else {
            return type.charAt(0);
        }
    }

    public Stack<Thing> getContains(){
        return this.contains;
    }

    public void placeObject(Thing obj){
        contains.push(obj);
    }
    public void removeObject(Thing obj){
        contains.remove(obj);
    }

    public void inspect(){
        System.out.printf(
        """
                .        ~ ..~  . `
                -~  @ .., ^-- . ~  `
                .        ~ ..~  . `
                -~  @ .., ^-- . ~  `
                -~  @ .., ^-- . ~  `
                .        ~ ..~  . `
                -~  @ .., ^-- . ~  `

                ground: %s
                """
                        ,this.type);

                        

        if(!this.contains.empty()){
            System.out.printf("contains: %s\n", this.contains.peek().getInfo());
        }
        
               
    }
    
}
