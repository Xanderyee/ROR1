import javax.swing.JFrame;


// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// public class Main
//
// Main class of the project
//
public class Main {
    public static void main(String[] args) {
	JFrame frame = new JFrame("Risk of Rain");
	Panel canvas = new Panel();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.add(canvas);
	frame.pack();

	frame.setVisible(true);
	canvas.run();
    }
}
// end: public class Main