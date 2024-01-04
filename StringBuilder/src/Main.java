public class Main {
    public static void main(String[] args) {
        // Using CustomStringBuilder with undo
        CustomStringBuilder csb = new CustomStringBuilder();
        csb.append("Hello, ").append("world!");
        System.out.println(csb);
        csb.undo();
        System.out.println(csb);

        ObservableStringBuilder osb = new ObservableStringBuilder();
        osb.addObserver(new CustomStringBuilderObserver());
        osb.append("Hello, ");
    }
}
