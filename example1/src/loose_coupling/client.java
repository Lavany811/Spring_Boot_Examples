package loose_coupling;

public class client {
    public static void main(String[] args) {
        traveller trvellller = new traveller();
        car cars = new car();
        cycle cycles = new cycle();
        bike bikes = new bike();
        trvellller.ivechicle = cars;
        trvellller.trvel();
        trvellller.ivechicle = bikes;
        trvellller.trvel();
//        trvellller.ivechicle = cycles;
//        trvellller.trvel();;

    }
}
