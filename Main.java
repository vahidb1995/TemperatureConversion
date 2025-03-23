import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Temperature Conversion");
    frame.setSize(320, 220);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);

    JLabel fahrenheit = new JLabel("Fahrenheit");
    JLabel celsius = new JLabel("Celsius");
    fahrenheit.setBounds(30,29, 80, 20);
    celsius.setBounds(30,89, 60, 20);

    JTextField fahrenheitText = new JTextField();
    JTextField celsiusText = new JTextField();

    fahrenheitText.setBounds(120, 30, 130, 20 );
    celsiusText.setBounds(120, 90, 130, 20 );

    JButton convert = new JButton("Convert");
    convert.setBounds(130, 130, 80, 30);

    frame.add(fahrenheit);
    frame.add(fahrenheitText);
    frame.add(celsius);
    frame.add(celsiusText);
    frame.add(convert);



  }
  public double temperature(double temperature, String  unit) {
    if (unit.equals("fahrenheit")) {
      return temperature * 1.8 + 32;
    } else if (unit.equals("celsius")) {
      return temperature * 0.9 + 32;
    } else { return temperature;}
  }
}
