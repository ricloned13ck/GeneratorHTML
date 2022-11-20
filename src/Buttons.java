import javax.swing.*;
import java.awt.*;

public class Buttons extends JPanel {
    private static Buttons instance = null;

    public static Buttons getInstance() {
        if (instance == null)
            instance = new Buttons();
        return instance;
    }

    private JButton addon = new JButton("+");
    public String[] items = {"html","head", "title", "link", "style", "body", "div", "span", "p", "Текст"};

    public JComboBox comboBox = new JComboBox(items);

    public Buttons() {
        setLayout(new GridLayout(1, 2));
        comboBox.setEditable(true);
        addon.addActionListener(new ActionListenerAdd());
        add(comboBox);
        add(addon);
    }

}
