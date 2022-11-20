import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import java.awt.*;

public class HTMLView extends JPanel {
    private static HTMLView instance = null;

    public static HTMLView getInstance() {
        if (instance == null)
            instance = new HTMLView();
        return instance;
    }

    public JTree jt;
    public DefaultMutableTreeNode html;
    public DefaultTreeModel treeModel;


    private HTMLView() {
        html = new DefaultMutableTreeNode("html");
//        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
//        style.add(color);
//        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
//        color.add(green);
        treeModel = new DefaultTreeModel(html);
        jt = new JTree(treeModel);
        jt.setEditable(true);
        setLayout(new BorderLayout());
        add(jt, BorderLayout.CENTER);

    }

    public void addTag(String text) {
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(text);
        treeModel.insertNodeInto(childNode, (MutableTreeNode) jt.getLastSelectedPathComponent(), ((MutableTreeNode) jt.getLastSelectedPathComponent()).getChildCount());
    }
}
