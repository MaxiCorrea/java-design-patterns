package designpatterns.abstractfactory.lookandfeel.widget;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public abstract class WidgetPanel extends JPanel {

  private static final long serialVersionUID = 1L;

  private static final int GRID_ROWS = 5;
  private static final int GRID_COLS = 4;
  private static final int HGAP = 5;
  private static final int VGAP = 5;

  private static final int TOP = 5;
  private static final int LEFT = 5;
  private static final int BOTTOM = 5;
  private static final int RIGHT = 5;

  public WidgetPanel() {
    setLayout(new GridLayout(GRID_ROWS, GRID_COLS, HGAP, VGAP));
    setBorder(new EmptyBorder(TOP, LEFT, BOTTOM, RIGHT));
  }

}
