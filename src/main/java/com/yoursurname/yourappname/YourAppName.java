package com.yoursurname.yourappname;

import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.paint.Color;
        import javafx.stage.Stage;

/**
 *Your app name
 * <p>
 * Here give short description for you app.
 *
 *
 * @author  Name Surname
 * @version 1.0
 * @since   Year.Month.Day
 */
public class YourAppName extends Application
{

    /**
     *
     * @param primaryStage is provided by JavaFX. It is your first and main "window"
     *
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {

        /**
         *  Dont change much here. Point to your main fxml file. If you wish to have multiple controllers
         *  and views they can all be referenced from this main fxml view. Checkout README for more info
         */
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Example.fxml"));

        Scene scene = new Scene(root, 600, 400, Color.WHITE);

        primaryStage.setTitle("Name your app");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}