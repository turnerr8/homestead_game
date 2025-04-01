import things.Player;
import world.World;

public void main(String[] args) {
    System.out.println("hello world");
    int worldSize = 10;
    World w = new World(10);
    w.create();
    w.Greet();
    Player p = new Player(worldSize/2, worldSize/2, w);
    Scanner scan = new Scanner(System.in);
    w.printWorld(p);

    int opt = 0;
    while(opt == 0){
        opt = p.getOpt(scan);
        
        
        w.printWorld(p);
        
    }
    
}

