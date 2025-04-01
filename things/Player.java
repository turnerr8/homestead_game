package things;

import java.util.Scanner;

import world.World;
import tiles.Floor;
import tiles.Tile;

public class Player {
    World w;
    public int x;
    public int y;
    public String name;
    public char avatar;

    public Player(int x, int y, World w) {
        this.x = x;
        this.y = y;
        this.name = "Player";
        this.w = w;
        this.avatar = '^';
        
    }

    public void setNewCoords(int newX, int newY){
        this.x = newX;
        this.y= newY;
    }

    //movements
    public void moveUp(){
        int newX = this.x;
        int newY = this.y-1;
        if(newY>0 && w.world[newX][newY].isWalkable){

            this.setNewCoords(newX, newY);
            
        }
        this.avatar = '^';
    }

    public void moveDown(){
        int newX = this.x;
        int newY = this.y+1;
        if(newY < w.worldSize&& w.world[newX][newY].isWalkable){
           
            this.setNewCoords(newX, newY);

        }
        this.avatar = 'v';
    }
    public void moveLeft(){
        int newX = this.x-1;
        int newY = this.y;
        if(newX > 0 && w.world[newX][newY].isWalkable){
           
            this.setNewCoords(newX, newY);

        }
        this.avatar = '<';
    }

    public void moveRight(){
        int newX = this.x+1;
        int newY = this.y;
        if(newX < w.worldSize && w.world[newX][newY].isWalkable){
          
            this.setNewCoords(newX, newY);

        }
        this.avatar = '>';
    }

    
// print player options and get input
    public int getOpt(Scanner s){

        Floor cur = (Floor) w.world[this.x][this.y];
        System.out.println("[w]: move up\n[s]: move down\n[a]: move left\n[d]: move right\n[i]: inspect\n[f]: inspect ahead\n[q]: quit\n");
        for(int i = 0; i < cur.getContains().size(); i++){
            cur.getContains().get(i).getInteraction();
        }
        System.out.print("choice: ");

        String choice = s.nextLine();
        switch(choice.charAt(0)){
            case 'w':
            this.moveUp();
            break;
            case 'a':
            this.moveLeft();
            break;
            case 's':
            this.moveDown();
            break;
            case 'd':
            this.moveRight();
            break;
            case 'i':
            w.world[this.x][this.y].inspect();
            break;
            case 'q':
            s.close();
            return 1;
            default:
            System.out.println("no move!");
            
        }
        

        return 0;
    }
}