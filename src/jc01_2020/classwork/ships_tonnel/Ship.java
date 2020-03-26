package jc01_2020.classwork.ships_tonnel;

public class Ship {
    private Type type;
    private Size size;

    public Ship(Type type, Size size){
        this.type=type;
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }
}
