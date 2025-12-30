package cc.yggdrasil.studyqrcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.SwingUtilities;

@SpringBootApplication
public class StudyQrcodeApplication
{

    static void main(String[] args)
    {
        final ConfigurableApplicationContext ctx = new SpringApplicationBuilder(StudyQrcodeApplication.class)
                .headless(false)
                .run(args);

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = ctx.getBean(MainFrame.class);
            mainFrame.run();
        });
    }
}
