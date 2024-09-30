package factories;

import ui.Button;
import ui.TextField;

public interface UIFactory {
    Button createButton();
    TextField createTextField();
}