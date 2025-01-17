import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LoginApp extends Application {

    private boolean passwordVisible = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        TextField visiblePasswordField = new TextField();
        visiblePasswordField.setManaged(false); // Hide initially
        visiblePasswordField.setVisible(false);

        Button eyeButton = new Button("👁️");
        eyeButton.setOnAction(e -> {
            if (passwordVisible) {
                passwordField.setText(visiblePasswordField.getText());
                visiblePasswordField.setVisible(false);
                visiblePasswordField.setManaged(false);
                passwordField.setVisible(true);
                passwordVisible = false;
            } else {
                visiblePasswordField.setText(passwordField.getText());
                passwordField.setVisible(false);
                visiblePasswordField.setVisible(true);
                visiblePasswordField.setManaged(true);
                passwordVisible = true;
            }
        });

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            if (emailField.getText().equals("test@example.com") &&
                passwordField.getText().equals("password123")) {
                showDashboard(primaryStage);
            } else {
                System.out.println("Invalid login");
            }
        });

        // Layout
        VBox layout = new VBox(10, emailField, passwordField, visiblePasswordField, eyeButton, loginButton);
        Scene scene = new Scene(layout, 300, 200);

        // Set up the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Page");
        primaryStage.show();
    }

    private void showDashboard(Stage primaryStage) {
        Button complainButton = new Button("Register a Complaint");
        Button detailsButton = new Button("College Details");
        Button feesButton = new Button("Fees");

        HBox layout = new HBox(10, complainButton, detailsButton, feesButton);
        Scene dashboardScene = new Scene(layout, 600, 400);

        primaryStage.setScene(dashboardScene);
        primaryStage.setTitle("Dashboard");
    }
}
