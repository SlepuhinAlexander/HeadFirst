package headfirst.chapter18.listings.l04;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    JPanel getGuiPanel();
}
