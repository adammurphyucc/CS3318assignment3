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
    private Text actionTarget;
    @FXML
    private TextField userPassword;
    @FXML
    private Button loginButton;
    @FXML
    private TextField userEmail;

    @Test public void TestPassword(){
        Assert.assertTrue(PasswordValidator.isValid(userPassword.getText()));

    }

    @Test public void TestEmail(){
        Assert.assertTrue(EmailValidator.isValid(userEmail.getText()));
    }

    public void TestValidity(){
        try {
            TestPassword();
            TestEmail();
            userEmail.setDisable(true);
            userPassword.setDisable(true);
            loginButton.setDisable(true);
            actionTarget.setText("Account Sign Up Successful");
        } catch (AssertionError e) {
            actionTarget.setText("Format Error: At least one of email/password");
            // I thought that this assertionError would catch the failed TestEmail() test too, but it ony does a TestPassword() - Not sure why
        }
    }
}
