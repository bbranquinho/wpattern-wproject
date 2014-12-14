package org.wproject.desktop.application.window;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import org.wproject.desktop.application.components.CategoryGridPanel;
import org.wproject.desktop.application.interfaces.ICategoryWindow;
import org.wproject.server.utils.service.interfaces.ICategoryService;

@Named
public class CategoryWindow implements ICategoryWindow {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	@Inject
	public CategoryWindow(ICategoryService categoryService) {
		initialize(categoryService);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ICategoryService categoryService) {
		frame = new JFrame();
		frame.setBounds(100, 100, 623, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));

		CategoryGridPanel categoryGridPanel = new CategoryGridPanel(categoryService);
		frame.getContentPane().add(categoryGridPanel, "cell 0 0,grow");
	}

	@Override
	public void showWindow() {
		this.frame.setVisible(true);
	}

	@Override
	public void hideWindow() {
		this.frame.setVisible(false);
	}

}
