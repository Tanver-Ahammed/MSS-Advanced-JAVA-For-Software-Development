package constructor;

public class Toyota extends Car {
    private String speed;
    private String seats;

    public Toyota() {
        System.out.println("Empty Toyota Constructor");
    }

    public Toyota(int d, int w, String c, String t, String m, String speed, String seats) {
        super(d, w, c, t, m);
        this.speed = speed;
        this.seats = seats;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String toString() {
        String description = super.toString() +
                "Seat(s) : "+getSeats()+"\nSpeed : "+getSpeed()+"\n";
        return description;
    }
}
