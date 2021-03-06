import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame {
    public JTextField txtCampo1 = new JTextField(10);
    public JLabel etiquetaSuma = new JLabel("+");
    public JTextField txtCampo2 = new JTextField(10);
    public JButton btnSumar = new JButton("Sumar");
    public JButton btnRestar = new JButton("Restar");
    public JTextField txtRespuesta = new JTextField(10);

    public Vista() {
        JPanel panelCalculadora = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        panelCalculadora.add(txtCampo1);
        panelCalculadora.add(etiquetaSuma);
        panelCalculadora.add(txtCampo2);
        panelCalculadora.add(btnSumar);
        panelCalculadora.add(btnRestar);
        panelCalculadora.add(txtRespuesta);

        this.add(panelCalculadora);
    }

    public int getTxtCampo1() {
        return Integer.parseInt(txtCampo1.getText());
    }

    public int getTxtCampo2() {
        return Integer.parseInt(txtCampo2.getText());
    }

    public int getTxtRespuesta() {
        return Integer.parseInt(txtRespuesta.getText());
    }

    public void setTxtRespuesta(int n) {
        txtRespuesta.setText(Integer.toString(n));
    }

    public void mensajeError(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
