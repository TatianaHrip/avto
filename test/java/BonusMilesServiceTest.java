import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }

}