package rs.ac.uns.ftn.ssluzba.gui.view.modify;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public interface IHighlight {
	public static final Border defaultBorder = new TextField().getBorder(),  highlightBorder = BorderFactory.createLineBorder(java.awt.Color.RED);
	public void maybeHighlight();
	public void setBorder(Border border);
}