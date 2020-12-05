import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void bonusMilesLimitForRegistered_1() {
        BonusService service = new BonusService();
        // подготавливаем данные:

        long amount = 1000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }


    @Test
    void bonusMilesLimitForNotRegistered_2() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }


    @Test
    void BonusMilesLimitRegisteredAndOverLimit_3() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void BonusMilesLimitForNoRegisteredAndOverLimit_4() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void BonusMilesLimitForNoRegisteredAndLimit_5() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        ;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

}