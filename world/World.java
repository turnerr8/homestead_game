package world;

import java.util.Random;

import things.Player;
import things.Thing;
import things.Tree;
import tiles.Floor;
import tiles.Tile;
import tiles.Wall;

public class World {
    public Tile[][] world;
    public int worldSize;
    public World(int worldSize){
        this.worldSize = worldSize;
        
    }
    public void Greet(){
        System.out.printf("New World %dx%d:\n",worldSize, worldSize );
    }

    //Generate the new map with random walls or floors
    //always make the "center" a floor as we will spawn the player on that tile
    public void create(){
        Random rand = new Random();
        world = new Tile[worldSize][worldSize];
        for(int x = 0; x < worldSize; x++){
            for(int y =0; y<worldSize; y++){
                world[x][y]= new Floor(x, y);
                boolean treeProb = (rand.nextInt(5)== 0);
                if(treeProb){
                    placeObject(new Tree(x, y), x, y);
                }

                /*int r = rand.nextInt(2);
                switch(r){
                    case 0:
                        world[x][y]= new Floor(x, y);
                        break;
                    case 1:
                        world[x][y] = new Wall(x, y);
                        break;
                    default:
                        System.out.println("We shouldnt be here");
                 }*/
            }
        }
        world[worldSize/2][worldSize/2] = new Floor(worldSize/2, worldSize/2);
    }
    public void placeObject(Thing obj, int x, int y){
        if(!world[x][y].getCanBePlacedOn()){
            System.out.println("Uh Oh! Looks like you cant place that there!");
            return;
        }
        ((Floor) world[x][y]).placeObject(obj);
    }
    //prints world as a grid with each tile containing a 'w' for wall or a 'd' for dirt
    //if the tile contains something, the first letter of the title of that object should be displayed
    //
    public void printWorld(Player p){
        for(int y = 0; y < worldSize; y++) {
            

            for (int x =0; x< worldSize; x++) {
              if(x== p.x && y== p.y) {
                System.out.printf("| \u001B[31m%s\u001B[0m ", p.avatar);
              } else {
                System.out.printf("| %s ", world[x][y].printTile());

              }
            }
            System.out.print("|");
            System.out.printf("\n");
            printLine();
            System.out.printf("\n");

        }
    }

    //simply prints a line between each row of tiles
    private void printLine(){
        for(int i =0; i <(worldSize*4)+1; i++){
            System.out.print("-");
        }
    }
}
