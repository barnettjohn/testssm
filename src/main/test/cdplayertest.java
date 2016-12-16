import com.zqw.testspring.config.CdConfig;
import com.zqw.testspring.intf.Disc;
import com.zqw.testspring.intf.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import static  org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by UFGOV on 2016/12/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdConfig.class)
public class cdplayertest {
    @Autowired
    private Disc yogaLin;
    @Autowired
    private Player cdPlayer;
    @Test
    public void  cdsisnotnull(){
        assertNotNull(yogaLin);
    }
    @Test
    public void play(){
        cdPlayer.play();
    }

}
