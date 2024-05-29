public class BonusMilesService {
    public int calculate(int ticketPrice, int milesPerRub) {
        int result;
        result = ticketPrice / milesPerRub;
        return result;


    }
}
