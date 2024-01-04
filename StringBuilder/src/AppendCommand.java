public class AppendCommand implements Command {
    private StringBuilder sb;
    private String appendStr;

    public AppendCommand(StringBuilder sb, String str) {
        this.sb = sb;
        this.appendStr = str;
    }

    @Override
    public void execute() {
        sb.append(appendStr);
    }

    @Override
    public void undo() {
        sb.delete(sb.length() - appendStr.length(), sb.length());
    }
}
