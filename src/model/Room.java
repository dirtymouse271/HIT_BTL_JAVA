package model;

public class Room {
    private int room_id;
    private int room_number;
    private String room_type;
    private double room_price;
    private Status room_status;

    public Room() {
    }

    public Room(int room_id, int room_number, String room_type, double room_price, Status room_status) {
        this.room_id = room_id;
        this.room_number = room_number;
        this.room_type = room_type;
        this.room_price = room_price;
        this.room_status = room_status;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }

    public Status getRoom_status() {
        return room_status;
    }

    public void setRoom_status(Status room_status) {
        this.room_status = room_status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", room_number=" + room_number +
                ", room_type='" + room_type + '\'' +
                ", room_price=" + room_price +
                ", room_status='" + room_status + '\'' +
                '}';
    }
}
