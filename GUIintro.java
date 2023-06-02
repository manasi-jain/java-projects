import javax.swing.JOptionPane;

public class GUIintro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null, "Hey " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "You are " + age +" years old");
    }
}
