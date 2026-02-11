public abstract class LibraryResource {

    protected String title;
    protected int popularityIndex; // 0 - 100

    public LibraryResource(String title, int popularityIndex) {
        this.title = title;
        if (popularityIndex < 0) {
            this.popularityIndex = 0;
        } else if (popularityIndex > 100) {
            this.popularityIndex = 100;
        } else {
            this.popularityIndex = popularityIndex;
        }
    }

    public int boostPopularity(int points) {
        if (points > 0) {
            popularityIndex += points;
            if (popularityIndex > 100) {
                popularityIndex = 100;
            }
        }
        return popularityIndex;
    }

    public abstract String getUsageTerms();
}
