public class Main {
    public static void main(String[] args) {
        TextEditor editor = new BasicTextEditor();
        TextEditor spellCheckEditor = new SpellCheckDecorator(editor);

        System.out.println(spellCheckEditor.edit());  // Outputs: Basic Text + Spell Check
    }
}
