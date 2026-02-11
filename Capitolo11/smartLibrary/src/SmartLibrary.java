import java.util.ArrayList;

public class SmartLibrary {
    private ArrayList<LibraryResource> resources;

    public SmartLibrary() {
        resources = new ArrayList<>();
    }

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    public boolean removeResource(LibraryResource resource) {
        return resources.remove(resource);
    }
    public int getResourceCount() {
        return resources.size();
    }

    public ArrayList<LibraryResource> getDownloadableResources() {
        ArrayList<LibraryResource> downloadableResources = new ArrayList<>();

        for (LibraryResource res : resources) {
            if (res instanceof Downloadable) {
                downloadableResources.add(res);
            }
        }

        return downloadableResources;
    }
}
