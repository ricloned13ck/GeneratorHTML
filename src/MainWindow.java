import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static MainWindow instance = null;

    public static MainWindow getInstance() {
        if (instance == null)
            instance = new MainWindow();
        return instance;
    }

    private Buttons buttons= Buttons.getInstance();
    private HTMLView htmlView;
    private JButton save = new JButton("Сохранить");

    private MainWindow() {
        setTitle("Super Puper Program");
        setSize(600,600);
        setLocation(650,250);

        setLayout(new BorderLayout());
        add(buttons,BorderLayout.NORTH);
        htmlView = HTMLView.getInstance();
        add(htmlView,BorderLayout.CENTER);
        add(save,BorderLayout.SOUTH);

        setVisible(true);
    }
}
