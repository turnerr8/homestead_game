package things;

import world.World;

public class Tree extends Thing {

    public Tree(int x, int y, World w) {
        super(x, y);
        this.isWalkable = false;
        this.setName("Tree");
        //TODO Auto-generated constructor stub
    }

    @Override
    public void getInteraction() {
        // TODO Auto-generated method stub
        System.out.println("[c]: chop tree\n") ;
    }
    
}
