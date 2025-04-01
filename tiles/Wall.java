package tiles;

public class Wall extends Tile {

    public Wall(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
        this.isWalkable = false;
        this.type = "wall";
        this.setCanBePlacedOn(false);
    }

    public void inspect(){
        System.out.println("how did you get here?");
    }
    
}
