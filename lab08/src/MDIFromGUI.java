import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane dp;
    private JInternalFrame[] frames = new JInternalFrame[3];
    private JMenuBar mb;
    private JMenu m1, m2, m3, mi1;
    private JMenuItem mi2, mi3, mi4, smi1, smi2;

    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        dp = new JDesktopPane();
        mb = new JMenuBar();
        m1 = new JMenu("File");
        mi1 = new JMenu("New");
        smi1 = new JMenuItem("Window");
        smi2 = new JMenuItem("Message");
        mi1.add(smi1);
        mi1.addSeparator();
        mi1.add(smi2);
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        m1.addSeparator();
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        fr.setJMenuBar(mb);

        for (int i = 0; i < 3; i++) {
            frames[i] = new JInternalFrame("Application 0" + (i+1), true, true, true, true);
            frames[i].add(new JLabel());
            frames[i].setSize(300, 300);
            frames[i].setLocation(200 + 400*i, 400);
            frames[i].setVisible(true);
            dp.add(frames[i]);
        }

        dp.setBackground(Color.black);
        fr.add(dp, BorderLayout.CENTER);
        fr.setExtendedState(MAXIMIZED_BOTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
