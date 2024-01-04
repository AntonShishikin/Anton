import java.util.Stack;

public class CustomStringBuilder {
    private StringBuilder sb = new StringBuilder();
    private Stack<Command> commands = new Stack<>();

    public CustomStringBuilder append(String str) {
        Command command = new AppendCommand(sb, str);
        commands.push(command);
        command.execute();
        return this;
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
