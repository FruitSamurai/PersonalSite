import com.github.fruitsamurai.Application;
import com.github.fruitsamurai.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fanshion on 2017/5/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class EmailTest {

    @Autowired
    private MailService mailService;

    private String to = "424019980@qq.com";

    @Test
    public void sendSimpleMail(){
        mailService.sendSimpleMail(to,"主题：简单邮件","测试邮件内容");
    }

    @Test
    public void sendAttachmentsMail() {
        mailService.sendAttachmentsMail(to, "主题：带附件的邮件", "有附件，请查收！", "F:\\1.txt");
    }
}
