public class BonusServiceTest {

    void shouldCalcForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

          service.calculate(amount, registered);
    }
}
