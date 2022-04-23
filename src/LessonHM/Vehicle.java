package LessonHM;

public class Vehicle {
    private double tankVolume;
    private double petrolAmount;

 public Vehicle(){

 }

    public Vehicle(double tankVolume, double petrolAmount) {
        this.tankVolume = tankVolume;
        this.petrolAmount = petrolAmount;


    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void arrive() {
        Base.peopleOnBase++;
        Base.vehiclesOnBase++;
    }

    public boolean leave() {
        if (Base.peopleOnBase < 1) {
            return false;
        }
        if (Base.vehiclesOnBase < 1) {
            return false;
        }
        double needsPetrol = petrolAmount - tankVolume;
        if (needsPetrol > Base.petrolOnBase){
            return false;

        }
        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - needsPetrol;
        return true;
    }
}
