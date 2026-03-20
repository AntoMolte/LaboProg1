public class ContentProvider {
    private String name;
    private String licenseCode;

    public ContentProvider(String name, String licenseCode) {
        this.name = name;
        this.licenseCode = licenseCode;
    }

    public String getInfo() {
        return "Provider: " + name + " (Code: " + licenseCode + ")";
    }
}

