public enum RoomType {

    SINGLE(1, 10.00),
    DOUBLE(2, 20.00),
    TRIPLE(3, 30.00),
    FAMILY(4, 40.00),
    CONFERENCE(10, 100.00),
    DININGROOM(30, 0.0);

    private final int capacity;
    private final double roomRate;

    RoomType(int capacity, double roomRate) {
        this.capacity = capacity;
        this.roomRate = roomRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getRoomRate(){
        return this.roomRate;
    }

}
