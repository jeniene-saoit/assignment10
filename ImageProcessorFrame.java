package assign10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.sun.net.httpserver.Filter;

public class ImageProcessorFrame extends JFrame implements ActionListener {
	// ADD NECESSARY PRIVATE INSTANCE VARIABLES 
	// -> variables that accessed also outside of constructor
	
	/**
	 * STEP 4 - CONSTRUCTOR: make "empty GUI"
	 * 	- set contents of frame to be ImagePanel object
	 * 	- (for now) use hard-coded filename for image file
	 * 
	 * STEP 6 - MENU: options for opening image file and saving filtered image
	 * 	- use *JMenuBar* for placement in frame
	 * 	- text of menu/options should be meaningful and user friendly
	 * 
	 * STEP 7 - ACTIONLISTENER: us ActionListener to handle menu item events
	 */
	public ImageProcessorFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ImageProcessor");
		
		// make panel - help organize components (main panel and image panel)
			Image foxImage = new Image("fox.png");
			ImagePanel imagePanel = new ImagePanel(foxImage);
		
		/**
		 * CREATING THE MENU:
		 * JMenuBar: bar that contains all the elements (menus)
		 * JMenu: each menu on the bar -- File, Filters
		 * JMenuItem: each element of the menu
		 * 	- File: Open new image file..., Save filtered image file...
		 * 	- Filters: 5 filters we choose
		 */
		// making the menu bar
		JMenuBar menuBar = new JMenuBar(); 
		setJMenuBar(menuBar);
		
		// making and adding menus
		JMenu file = new JMenu("File");
		JMenu filters = new JMenu("Filters");
		menuBar.add(file);
		menuBar.add(filters);
		
		// making and adding file menu items
		JMenuItem newImage = new JMenuItem("Open new image file...");
		JMenuItem saveImage = new JMenuItem("Save filtered image file...");
		file.add(newImage);
		file.add(saveImage);
		
		// making and adding filter menu items
		JMenuItem redBlueSwap = new JMenuItem("Red-blue swap");
		JMenuItem blackAndWhite = new JMenuItem("Black and white");
		JMenuItem rotateClockwise = new JMenuItem("Rotate clockwise");
		JMenuItem randomizePixels = new JMenuItem("Randomize pixels");
		JMenuItem brightenImage = new JMenuItem("Brighten image");
		filters.add(redBlueSwap);
		filters.add(blackAndWhite);
		filters.add(rotateClockwise);
		filters.add(randomizePixels);
		filters.add(brightenImage);
		
		// add ActionListeners to components
		file.addActionListener(this);
		newImage.addActionListener(this);
		saveImage.addActionListener(this);
		
		filters.addActionListener(this);
		redBlueSwap.addActionListener(this);
		blackAndWhite.addActionListener(this);
		randomizePixels.addActionListener(this);
		brightenImage.addActionListener(this);
		
		// adding components to panel
		add(imagePanel);
		
	}
	
	/**
	 * STEP 7 - ACTIONPERFORMED: handle events on menu items
	 * 	a) use *JFileChooser* present dialog window for user to navigate files
	 * 	- use *FileNameExtensionFilter* to only open file with : 
 * 		.jpg - .jpeg - .png - .bmp - .gif
	 * 	- use .jpg file extension for writing filtered image to file
	 *  - user cancels dialog window, display message with 
	 *  *JOptionPane.showMessageDialog* and return to application
	 *  
	 *  b) user selects to new open image file 
	 *  - create new *ImagePanel* for selected file and update to display 
	 *  image with code in instructions
	 *  
	 *  c) find way for code to open and read image file:
	 *  - getting string from *File* object with *getAbsolutePath*
	 *  - updating *Image* constructor to take *File* parameter
	 *  
	 *  d) let user resize frame freely -- dimensions 
	 *  don't need to match image exactly
	 *  
	 *  e) undo setting of frame's contents in *ImageProcessorFrame* 
	 *  constructor -- should begin with no image displayed
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		JMenuItem source = (JMenuItem)event.getSource();
		String text = source.getText();
		
		// handling different item events
		if (text.equals("Open new image file...")) {
			// code for opening new image file
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "bmp", "gif");
			chooser.setFileFilter(filter);
			int returnVal = chooser.showOpenDialog(getParent());
			if (returnVal  == JFileChooser.APPROVE_OPTION) {
				System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
			}
			
		} else if (text.equals("Save filtered image file...")) {
			// code for saving filtered image file
			
		} else if (text.equals("Red-blue swap")) {
			// code for red-blue swap filter
			
		} else if (text.equals("Black and white")) {
			// code for black and white filter
			
		} else if (text.equals("Rotate clockwise")) {
			// code for rotate clockwise filter
			
		} else if (text.equals("Randomize pixels")) {
			// code for randomize pixels filter
			
		} else if (text.equals("Brighten image")) {
			// code for brighten image filter
			
		}
	}
	
	
	/**
	 * STEP 8 - IMAGE FILTERS: provide at least 5 image filters
	 */
	
	/**
	 * STEP 9 - ADD GUI COMPONENTS: add components that allow user 
	 * to select image filter to apply
	 * - once filter selected, frame update to display filtered image
	 */
	
	/**
	 * STEP 10 - TOOL TIP: add brief description for each image filter
	 */
	
	/**
	 * STEP 11 - ENABLE/DISABLE GUI COMPONENTS:
	 * - not possible select image filter before image file opened
	 * - not possible select save-file before file opened and filter applied
	 */
	
	private static final long serialVersionUID = 1L;
}