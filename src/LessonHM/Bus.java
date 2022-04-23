package LessonHM;

public class Bus extends Vehicle{
    private int peopleCount;
    private int maxPeople;

    public Bus(){

    }
    public Bus(int people, int maxPeople, double petrol, double maxPetrol){
        super(maxPetrol, petrol);
        this.peopleCount = people;
        this.maxPeople = maxPeople;

    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.peopleOnBase = Base.peopleOnBase + peopleCount;

    }

    @Override
    public boolean leave() {
        if (Base.peopleOnBase < 1) {
            return false;
        }
        if (Base.vehiclesOnBase < 1) {
            return false;
        }
        double needsPetrol = getTankVolume() - getPetrolAmount();
        if (needsPetrol > Base.petrolOnBase){
            return false;

        }
        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - needsPetrol;

        int needsPeople = maxPeople - peopleCount;
        if (Base.peopleOnBase >= needsPeople) {
            Base.peopleOnBase = Base.peopleOnBase - needsPeople;

        }else  {
            Base.peopleOnBase = 0;
        }
        return true;
    }

}
