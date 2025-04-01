package things;

import world.World;

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
}