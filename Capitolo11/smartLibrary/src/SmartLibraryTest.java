import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartLibraryTest {
    @Test
    public void shouldIncreasePopularityWhenPointsArePositive() {
        // Arrange
        EBook ebook = new EBook("Test Book", 10);

        // Act
        int newPopularity = ebook.boostPopularity(10);

        // Assert
        assertEquals(20, newPopularity);
    }

    @Test
    void shouldCapPopularityAtOneHundred() {
        // Arrange
        EBook ebook = new EBook("Test Book", 90);

        // Act
        int newPopularity = ebook.boostPopularity(50);

        // Assert
        assertEquals(100, newPopularity);
    }

    @Test
    void shouldNotChangePopularityWhenPointsAreNegative() {
        // Arrange
        EBook ebook = new EBook("Test Book", 40);

        // Act
        int newPopularity = ebook.boostPopularity(-10);

        // Assert
        assertEquals(40, newPopularity);
    }


}