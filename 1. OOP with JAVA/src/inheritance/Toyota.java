package inheritance;

public class Toyota extends Car {
    private String speed;
    private String seats;

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
                "Seat(s) : "+getSeats()+"\nSpeed : "+getSpeed();
        return description;
    }
}
