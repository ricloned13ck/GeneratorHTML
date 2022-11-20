import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class ActionListenerAdd implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String addon = (String) Buttons.getInstance().comboBox.getSelectedItem();
        List<String> b = Arrays.asList(Buttons.getInstance().items);
        System.out.println(b.contains(HTMLView.getInstance().jt.getLastSelectedPathComponent().toString()));
        System.out.println(HTMLView.getInstance().jt.getLastSelectedPathComponent().getClass());
        if (HTMLView.getInstance().jt.getLastSelectedPathComponent() == null) {
            JOptionPane.showMessageDialog(MainWindow.getInstance(), "Выберите куда вставляем тэг");
        } else {
            if (!b.contains(HTMLView.getInstance().jt.getLastSelectedPathComponent().toString()))
            if (addon == "Текст" && !b.contains(HTMLView.getInstance().jt.getLastSelectedPathComponent().toString())) {
                JOptionPane.showMessageDialog(MainWindow.getInstance(), "Вы не можете вставить текст в текст");
            } else if (addon == "Текст") {
                String text = JOptionPane.showInputDialog(MainWindow.getInstance(),"Введите текст");
                HTMLView.getInstance().addTag(text);
            }
            else{
                HTMLView.getInstance().addTag(addon);
            }
        }
    }
}
