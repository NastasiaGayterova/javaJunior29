package LessonHM;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(19.5, 60);

// get
        System.out.println( v.getPetrolAmount() );
        System.out.println( v.getTankVolume() );
        System.out.println();

// init
        Base.vehiclesOnBase = 49;
        Base.peopleOnBase = 99;
        Base.petrolOnBase = 1000.0;
        Base.goodsOnBase  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehiclesOnBase );
        System.out.println( Base.peopleOnBase );
        System.out.println( Base.peopleOnBase );
        System.out.println( Base.goodsOnBase );
        System.out.println();

// arrive
        v.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehiclesOnBase );	// arrived
        System.out.println( Base.peopleOnBase );

        System.out.println( Base.petrolOnBase );	// same
        System.out.println( Base.goodsOnBase );
        System.out.println();

// leave
        v.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehiclesOnBase );	// left
        System.out.println( Base.peopleOnBase );

// should be 1000-(60-19.5)
        System.out.println( Base.petrolOnBase );	// changed!

        System.out.println( Base.goodsOnBase );	// same
        System.out.println();
    }
}
