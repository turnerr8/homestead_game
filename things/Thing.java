package things;


public class Thing {
    public int x;
    public int y;
    private String name;
    public boolean isWalkable;
    public Thing(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Thing(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
