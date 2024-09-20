package M7_DesignPatterns.Task4_DecoratorPattern.Real_EX;

// Step 1: Create the Component interface
interface Text {
    String getText();
}
// Step 2: Create the Concrete Component class
class PlainText implements Text {
    private String text;
    public PlainText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
// Step 3: Create the Decorator class
abstract class TextDecorator implements Text {
    protected Text decoratedText;
    public TextDecorator(Text text) {
        this.decoratedText = text;
    }
    public String getText() {
        return decoratedText.getText();
    }
}
// Step 4: Create Concrete Decorators
class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text text) {
        super(text);
    }
    public String getText() {
        return "<b>" + decoratedText.getText() + "</b>";
    }
}
class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text text) {
        super(text);
    }
    public String getText() {
        return "<i>" + decoratedText.getText() + "</i>";
    }
}
class UnderlineTextDecorator extends TextDecorator {
    public UnderlineTextDecorator(Text text) {
        super(text);
    }
    public String getText() {
        return "<u>" + decoratedText.getText() + "</u>";
    }
}
// Step 5: Use the decorators
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, World!");
        System.out.println(text.getText());
        text = new BoldTextDecorator(text);
        System.out.println(text.getText());
        text = new ItalicTextDecorator(text);
        System.out.println(text.getText());
        text = new UnderlineTextDecorator(text);
        System.out.println(text.getText());
    }
}