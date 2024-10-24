package structuralDesignPatterns;
/*
Proxy: It provides a placeholder or surrogate for another object to control
        access to it.

Example: A proxy to control access to RealImage object!

 */

interface Image{
    void display();
}

class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }
    private void loadFromDisk(){
        System.out.println("Loading : " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying : " + fileName);
    }
}

class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
public class ProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("TEST_IMAGE.jpg");

        // image is loaded from disk only once!
        image.display();// loading and displaying image
        image.display(); // displaying image (without loading)
    }
}
