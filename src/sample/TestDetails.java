package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.junit.Test;
import org.junit.Assert;

public class TestDetails {

    @FXML
    private TextField userPassword;
    @Test public void TestPassword(){
        Assert.assertTrue(PasswordValidator.isValid("jjbd@@548vbkn"));

    }
    @FXML
    private TextField userEmail;
    @Test public void TestEmail(){
        Assert.assertTrue(EmailValidator.isValid("example@mail.com"));

    }

}
