//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // int ticketPrice = 13676;
        // int milesPerRub = 20;
        //int bonus = ticketPrice / milesPerRub;

        // System.out.println("Количество начисленных бонусов " + bonus);

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Количество начисленных бонусов: " +miles);




    }
}