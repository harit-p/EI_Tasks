public class SpellCheckDecorator implements TextEditor {
    private final TextEditor editor;

    public SpellCheckDecorator(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public String edit() {
        return editor.edit() + " + Spell Check";
    }
}
