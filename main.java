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


    while(true){
        printOpt();
        System.out.print("choice: ");
        String choice = scan.nextLine();
        switch(choice.charAt(0)){
            case 'w':
            p.moveUp();
            break;
            case 'a':
            p.moveLeft();
            break;
            case 's':
            p.moveDown();
            break;
            case 'd':
            p.moveRight();
            break;
            case 'i':
            w.world[p.x][p.y].inspect();
            break;
            case 'q':
            scan.close();
            return;
            default:
            System.out.println("no move!");
        }
        System.out.print("\r");
        w.printWorld(p);

    }
}

private void printOpt(){
    System.out.println("[w]: move up\n[s]: move down\n[a]: move left\n[d]: move right\n[i]: inspect\n[q]: quit\n");
}