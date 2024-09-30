package factories;

import ui.Button;
import ui.DarkThemeButton;
import ui.DarkThemeTextField;
import ui.TextField;

public class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }

    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}