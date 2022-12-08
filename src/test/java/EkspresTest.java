import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EkspresTest {

    @Test
    public void shouldHaveCorrectInitialState() {
        // given
        Ekspres ekspres = new Ekspres();

        // when
        int iloscWody = ekspres.getIloscWody();
        int iloscKawy = ekspres.getIloscKawy();
        int iloscMleka = ekspres.getIloscMleka();

        // then
        assertThat(iloscWody).isEqualTo(10);
        assertThat(iloscKawy).isEqualTo(10);
        assertThat(iloscMleka).isEqualTo(5);
    }

    @Test
    public void przygotujNapoj_napojMoznaPrzygotowac_pomniejszoneZasoby() {
        // given
        Napoj moznaPrzygotowac = new Napoj("mozna", 1, 1, 1);
        Ekspres ekspres = new Ekspres();
        int expectedIloscKawy = ekspres.getIloscKawy() - moznaPrzygotowac.getKawa();
        int expectedIloscMleka = ekspres.getIloscMleka() - moznaPrzygotowac.getMleko();
        int expectedIloscWody = ekspres.getIloscWody() - moznaPrzygotowac.getWoda();

        // when
        ekspres.przygotujNapoj(moznaPrzygotowac);
        int iloscWody = ekspres.getIloscWody();
        int iloscKawy = ekspres.getIloscKawy();
        int iloscMleka = ekspres.getIloscMleka();

        // then
        assertThat(iloscWody).isEqualTo(expectedIloscWody);
        assertThat(iloscKawy).isEqualTo(expectedIloscKawy);
        assertThat(iloscMleka).isEqualTo(expectedIloscMleka);
    }

    @Test
    public void przygotujNapoj_napojZaDuzoMleka_niePomniejszoneZasoby() {
        // given
        Napoj zaDuzoMleka = new Napoj("za duzo mleka", 0, 0, 100);
        Ekspres ekspres = new Ekspres();
        int expectedIloscKawy = ekspres.getIloscKawy();
        int expectedIloscMleka = ekspres.getIloscMleka();
        int expectedIloscWody = ekspres.getIloscWody();

        // when
        ekspres.przygotujNapoj(zaDuzoMleka);
        int iloscWody = ekspres.getIloscWody();
        int iloscKawy = ekspres.getIloscKawy();
        int iloscMleka = ekspres.getIloscMleka();

        // then
        assertThat(iloscWody).isEqualTo(expectedIloscWody);
        assertThat(iloscKawy).isEqualTo(expectedIloscKawy);
        assertThat(iloscMleka).isEqualTo(expectedIloscMleka);
    }

    @Test
    public void uzupelnijSkladniki_zasobnikiPelne() {
        // given
        Napoj moznaPrzygotowac = new Napoj("mozna", 1, 1, 1);
        Ekspres ekspres = new Ekspres();
        int expectedIloscKawy = ekspres.getIloscKawy();
        int expectedIloscMleka = ekspres.getIloscMleka();
        int expectedIloscWody = ekspres.getIloscWody();

        // when
        ekspres.przygotujNapoj(moznaPrzygotowac);
        ekspres.uzupelnijSkladniki();
        int iloscWody = ekspres.getIloscWody();
        int iloscKawy = ekspres.getIloscKawy();
        int iloscMleka = ekspres.getIloscMleka();

        // then
        assertThat(iloscWody).isEqualTo(expectedIloscWody);
        assertThat(iloscKawy).isEqualTo(expectedIloscKawy);
        assertThat(iloscMleka).isEqualTo(expectedIloscMleka);
    }
}
