import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TemperatureConversion implements ActionListener {

    JTextField fahrenheitText;
    JTextField celsiusText;
    JButton convert;
    JButton clear;
    public void creatFrame() {
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

        fahrenheitText = new JTextField();
        celsiusText= new JTextField();

        fahrenheitText.setBounds(120, 30, 130, 20 );
        celsiusText.setBounds(120, 90, 130, 20 );

        clear = new JButton("Clear");
        clear.setBounds(40, 130, 80, 30);

        convert= new JButton("Convert");
        convert.setBounds(130, 130, 80, 30);

        frame.add(fahrenheit);
        frame.add(fahrenheitText);
        frame.add(celsius);
        frame.add(celsiusText);
        frame.add(convert);
        frame.add(clear);

        convert.addActionListener(this);
        clear.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == convert) {
            converting();
        }
        if(e.getSource() == clear) {
            clear();
        }
    };
    public void clear() {
        fahrenheitText.setText("");
        celsiusText.setText("");
    }
    public void converting() {
        if (!fahrenheitText.getText().isEmpty()) {
            double temperature = Double.parseDouble(fahrenheitText.getText());
            celsiusText.setText("" + (temperature -32) * 0.55 );
        } else if (!celsiusText.getText().isEmpty()) {
            double temperature = Double.parseDouble(celsiusText.getText());
            fahrenheitText.setText("" + (temperature * 1.8 + 32) );
        } else {
            fahrenheitText.setText("");
            celsiusText.setText("");
        }
    }
}