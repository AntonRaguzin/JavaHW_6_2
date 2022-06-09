import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldCalcBonus(long amount, boolean registered, long expectedBonus) {

        BonusService service = new BonusService();

        long actualBonus = service.bonusCalc(amount, registered);

        Assertions.assertEquals(expectedBonus, actualBonus);
    }

}
