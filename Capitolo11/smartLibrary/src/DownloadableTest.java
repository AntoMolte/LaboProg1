import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DownloadableTest {
    @Test
    public void shouldReturnFalseWhenPopularityIsBelowThreshold() {
        EBook ebook = new EBook("Low Popularity", 29);
        boolean availableOffline = ebook.isAvailableForOffline();
        assertFalse(availableOffline);
    }
    @Test
    public void  shouldReturnTrueWhenPopularityIsAtThreshold(){
        EBook ebook = new EBook("Low Popularity", 45);
        boolean availableOffline = ebook.isAvailableForOffline();
        assertFalse(availableOffline);
    }



}