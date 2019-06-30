package com.company.v8.output;

import javax.swing.*;
import java.awt.*;

public class GuiOutput implements Outputs {
    @Override
    public void show(String str) {

        JOptionPane.showMessageDialog(null,str);
    }
}
