import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EkspresTest {

    @Test
    public void shouldHaveCorrectInitialState() {
        Ekspres ekspres = new Ekspres();

        assertThat(ekspres.getIloscWody()).isEqualTo(10);
        assertThat(ekspres.getIloscKawy()).isEqualTo(10);
        assertThat(ekspres.getIloscMleka()).isEqualTo(5);
    }
}
