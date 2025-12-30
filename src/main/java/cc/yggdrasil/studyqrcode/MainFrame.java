package cc.yggdrasil.studyqrcode;

import org.springframework.stereotype.Component;

import javax.swing.JFrame;

@Component
public class MainFrame extends JFrame
{
    private final MainPanel mainPanel;

    public MainFrame(final MainPanel mainPanel)
    {
        this.mainPanel = mainPanel;

        setTitle("QR Code Generator");
        setSize(480, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void run()
    {
        add(mainPanel);
        setVisible(true);
    }
}
