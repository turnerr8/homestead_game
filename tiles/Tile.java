package tiles;

public abstract class Tile {
    private int x;
    private int y;
    public String type;
    public boolean isWalkable;
    private boolean _canBePlacedOn;
    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }

    public char printTile(){
        return this.type.charAt(0);
    }

    public boolean getCanBePlacedOn(){
        return this._canBePlacedOn;
    }

    public void setCanBePlacedOn(boolean bool){
        this._canBePlacedOn = bool;
    }
    public abstract void inspect();
}
