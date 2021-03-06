package rs.ac.uns.ftn.ssluzba.gui.view;

import javax.swing.Action;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import rs.ac.uns.ftn.ssluzba.gui.controller.listenersandactions.ThisAbstractAction;

/**
 * @author rammba
 * @implNote extends {@link JMenuBar}, singleton
 */
@SuppressWarnings("serial")
public class MenuBar extends JMenuBar{

	private static JMenuBar instance = null;
	public static JMenuBar getInstance()
	{
		if(instance == null)	instance = new MenuBar();
		return instance;
	}
	
	private MenuBar()
	{
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		
		file.setMnemonic(KeyEvent.VK_F);
		edit.setMnemonic(KeyEvent.VK_E);
		help.setMnemonic(KeyEvent.VK_H);
		
		ThisAbstractAction aNew = new ThisAbstractAction("new");
		aNew.putValue(Action.NAME, "New");
		ThisAbstractAction aClose = new ThisAbstractAction("close");
		ThisAbstractAction aEdit = new ThisAbstractAction("edit");
		aEdit.putValue(Action.NAME, "Edit");
		ThisAbstractAction aDelete = new ThisAbstractAction("delete");
		aDelete.putValue(Action.NAME, "Delete");
		ThisAbstractAction aHelp = new ThisAbstractAction("help");
		ThisAbstractAction aAbout = new ThisAbstractAction("about");
		
		file.add(aNew);
		file.add(aClose);
		edit.add(aEdit);
		edit.add(aDelete);
		help.add(aHelp);
		help.add(aAbout);
		
		this.setBackground(CenterBox.getInstance().getBackground()); //light blue, same as inactive tab color in centerbox
		
		this.add(file);
		this.add(edit);
		this.add(help);
	}

}
