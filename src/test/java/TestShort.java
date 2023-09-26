        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.params.provider.ValueSource;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex10 {

    @Test
    public void testshortphrase() {
        String phraseLong = "test1 test2 test3";
        String phraseShort = "test1";
        int actualLength = phraseLong.length();
        int actualLength2 = phraseShort.length();
        System.out.println(actualLength);

        assertTrue(actualLength > 15, "Short: " + actualLength);
    }


}
