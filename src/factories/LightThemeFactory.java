package factories;

import ui.Button;
import ui.LightThemeButton;
import ui.LightThemeTextField;
import ui.TextField;

public class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public TextField createTextField() {
        return new LightThemeTextField();
    }
}