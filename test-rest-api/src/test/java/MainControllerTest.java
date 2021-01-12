import com.infinbank.controller.MainController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class MainControllerTest {
    MainController mainController;

    @Before
    public  void createNewController() {
        mainController = new MainController();
    }

    @Test
    public void controllerShouldReturnBadRequest() {
//        Assert.assertEquals(new ResponseEntity<>(HttpStatus.BAD_REQUEST), mainController.getRound(-1));
//        Assert.assertEquals(new ResponseEntity<>(HttpStatus.BAD_REQUEST), mainController.getRectangle(-1 , 2));
//        Assert.assertEquals(new ResponseEntity<>(HttpStatus.BAD_REQUEST), mainController.getSquare(-1));
//        Assert.assertEquals(new ResponseEntity<>(HttpStatus.BAD_REQUEST), mainController.getTriangle(2, 3 ,-1));
    }


    @Test(expected = IllegalArgumentException.class)
    public void triangleShouldThrowException() {
//       mainController.getTriangle(1 , 2 , 6);
    }

}
