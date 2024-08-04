import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btnCliente = new JButton("Cadastro de Cliente");
        btnCliente.setBounds(50, 20, 200, 25);
        frame.add(btnCliente);

        JButton btnChamado = new JButton("Realização de Chamado");
        btnChamado.setBounds(50, 60, 200, 25);
        frame.add(btnChamado);

        frame.setVisible(true);

        btnCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClienteGUI();
            }
        });

        btnChamado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ChamadoGUI();
            }
        });
    }
}
