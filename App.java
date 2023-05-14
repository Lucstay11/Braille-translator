import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // We invoke later because it ensures that the GUI is created and updated in a thread-safe way
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Graphique().setVisible(true);
            }
        });
    }
}
