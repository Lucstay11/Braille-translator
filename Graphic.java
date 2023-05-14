import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphique extends JFrame implements KeyListener {
    private Traducteur brailleController; // we instantiate the Traducteur class that we will use below

    // textInputArea - user input (text to be translated)
    // brailleArea - text translated to braille
    private JTextArea textInputArea, brailleArea;

    public Graphique(){
        // Add the window title
        super("Braille translator");

        // set the size of the frame to 540x760 pixels
        setSize(new Dimension(540, 760));

        // prevent the graphical interface from being resized
        setResizable(false);

        // setting the layout to null allows us to manually position and size the components in our graphical interface
        setLayout(null);

        // quit the program when the graphical interface is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set the background color
        getContentPane().setBackground(Color.decode("#264653"));

        // Place the graphical interface in the center of the screen when executed
        setLocationRelativeTo(null);

        brailleController = new Traducteur();
        addGraphicalContent();

    }

    private void addGraphicalContent(){

        JLabel titleLabel = new JLabel("Translate your text to braille");

        // modify the font size and boldness of the label's font
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        // change the text's font color to white
        titleLabel.setForeground(Color.WHITE);

        // center the text (relative to the width of its container)
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // set the x, y position, and width and height dimensions
        titleLabel.setBounds(0, 0, 540, 100);

        // text input
        JLabel textInputLabel = new JLabel("Text:");
        textInputLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        textInputLabel.setForeground(Color.WHITE);
        textInputLabel.setBounds(20, 100, 200, 30);

        textInputArea = new JTextArea();
        textInputArea.setFont(new Font("Dialog", Font.PLAIN, 18));

        // listen to key presses whenever we type in this text area
        textInputArea.addKeyListener(this);
        textInputArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // make words go to the next line after reaching the end of the text area
        textInputArea.setLineWrap(true);

        // make sure that when words wrap, the word doesn't get split
        textInputArea.setWrapStyleWord(true);

        // add a scroll bar
        JScrollPane textInputScroll = new JScrollPane(textInputArea);
        textInputScroll.setBounds(20, 132, 484, 236);

        // braille input
        JLabel brailleInputLabel = new JLabel("Braille translation:");
        brailleInputLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        brailleInputLabel.setForeground(Color.WHITE);
        brailleInputLabel.setBounds(20, 390, 200, 30);

        brailleArea = new JTextArea();
        brailleArea.setFont(new Font("Dialog", Font.PLAIN, 18));
        brailleArea.setEditable(false);
        brailleArea.setLineWrap(true);
        brailleArea.setWrapStyleWord(true);
        brailleArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Add a scroll bar
JScrollPane brailleScroll = new JScrollPane(brailleArea);
brailleScroll.setBounds(20, 430, 484, 236);

// Add to the graphical interface
add(titreLabel);
add(textInputLabel);
add(textInputScroll);
add(brailleInputLabel);
add(brailleScroll);

@Override
public void keyTyped(KeyEvent e) {

}

@Override
public void keyPressed(KeyEvent e) {

}

@Override
public void keyReleased(KeyEvent e) {
// Ignore Shift key press
if(e.getKeyCode() != KeyEvent.VK_SHIFT){
// Get input text
String inputText = textInputArea.getText();
int inputTextSize = textInputArea.getText().length();
// Update graphical interface with translated text!
    brailleArea.setText(brailleController.traduireToBraille(inputText));
  }
}
