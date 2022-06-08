import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn.services.BonusService;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources="/bonusService.csv")

    public void shouldCalcExactBonus(long expected, long amount, boolean registered) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
