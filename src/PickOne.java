import javafx.scene.control.Alert.AlertType;
import javafx.application.Application;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.control.ChoiceDialog;

public class PickOne extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("admin!");
        choices.add("faculty!");
        choices.add("staff!");
        choices.add("student!");
        choices.add("guest!");

        String defaultOption = choices.get(4);
        @SuppressWarnings("unchecked")
        ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choices);// allows the user to use interact with the program
        choiceDialog.setTitle("User");
        choiceDialog.setHeaderText("Please select your account type.");
        @SuppressWarnings("unchecked")
        Optional<String> result = choiceDialog.showAndWait();

        String selected = result.get();
        Alert alert = new Alert(AlertType.INFORMATION);// Displays the infroamtion
        alert.setTitle("Time to select");
        alert.setHeaderText("Welcome!");
        switch(selected) {
            case "admin!":// The case
                alert.setContentText("WELCOME ADMINSTARTOR");

                break;
            case "faculty!":
                alert.setContentText("WELCOME FACULTY");
                break;

            case "staff!":
                alert.setContentText("WELCOME STAFF");
                break;

            case "student!":
                alert.setContentText("WELCOME STUDENT");
                break;

            case "guest1":
                alert.setContentText("WELCOME GUEST");
                break;


            default:
                alert.setContentText("What is your identity");

        }

        alert.showAndWait();

    }

    public static void main(String [] args) {
        launch(args);
    }
}
