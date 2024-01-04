public class CustomStringBuilderObserver implements Observer {
    @Override
    public void update() {
        System.out.println("StringBuilder has been modified!");
    }
}
