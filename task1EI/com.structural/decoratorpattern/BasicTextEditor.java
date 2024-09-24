import java.util.logging.Logger;

public class BasicTextEditor implements TextEditor {
    private static final Logger logger = Logger.getLogger(BasicTextEditor.class.getName());

    @Override
    public String edit() {
        logger.info("Basic text editor is running");
        return "Basic Text";
    }
}
