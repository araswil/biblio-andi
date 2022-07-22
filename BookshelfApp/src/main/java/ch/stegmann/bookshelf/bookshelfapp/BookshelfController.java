package ch.stegmann.bookshelf.bookshelfapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BookshelfController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Willkommen im Bücherregal");
    }
}