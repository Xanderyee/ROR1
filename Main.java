import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
	JFrame frame = new JFrame("Risk of Rain");
	Panel canvas = new Panel();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_ClOSE);

	frame.add(canvas);
	frame.pack();

	frame.setVisible(true);
	canvas.run();
    }
}
