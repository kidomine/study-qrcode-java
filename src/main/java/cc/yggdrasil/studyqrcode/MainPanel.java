package cc.yggdrasil.studyqrcode;

import org.springframework.stereotype.Component;

import javax.swing.JPanel;
import java.awt.BorderLayout;

@Component
public class MainPanel extends JPanel
{
    public MainPanel(QrCodeForm qrCodeForm)
    {
        setLayout(new BorderLayout());
        add(qrCodeForm.$$$getRootComponent$$$());
    }
}
