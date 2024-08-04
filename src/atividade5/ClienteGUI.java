import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteGUI {
    private JFrame frame;
    private JTextField textFieldRG;
    private JTextField textFieldCPF;
    private JTextField textFieldNome;
    private JTextField textFieldTelefone;
    private JButton btnSave;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnSearch;

    public ClienteGUI() {
        frame = new JFrame("Cadastro de Cliente");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblRG = new JLabel("RG:");
        lblRG.setBounds(10, 20, 80, 25);
        frame.add(lblRG);

        textFieldRG = new JTextField();
        textFieldRG.setBounds(100, 20, 160, 25);
        frame.add(textFieldRG);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setBounds(10, 60, 80, 25);
        frame.add(lblCPF);

        textFieldCPF = new JTextField();
        textFieldCPF.setBounds(100, 60, 160, 25);
        frame.add(textFieldCPF);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 100, 80, 25);
        frame.add(lblNome);

        textFieldNome = new JTextField();
        textFieldNome.setBounds(100, 100, 160, 25);
        frame.add(textFieldNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 140, 80, 25);
        frame.add(lblTelefone);

        textFieldTelefone = new JTextField();
        textFieldTelefone.setBounds(100, 140, 160, 25);
        frame.add(textFieldTelefone);

        btnSave = new JButton("Salvar");
        btnSave.setBounds(10, 180, 80, 25);
        frame.add(btnSave);

        btnUpdate = new JButton("Alterar");
        btnUpdate.setBounds(100, 180, 80, 25);
        frame.add(btnUpdate);

        btnDelete = new JButton("Excluir");
        btnDelete.setBounds(190, 180, 80, 25);
        frame.add(btnDelete);

        btnSearch = new JButton("Pesquisar");
        btnSearch.setBounds(280, 180, 80, 25);
        frame.add(btnSearch);

        frame.setVisible(true);

        // Eventos dos botões
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para salvar cliente
                saveCliente();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para alterar cliente
                updateCliente();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para excluir cliente
                deleteCliente();
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pesquisar cliente por CPF
                searchCliente();
            }
        });
    }

    private void saveCliente() {
        // Lógica para salvar cliente
        String rg = textFieldRG.getText();
        String cpf = textFieldCPF.getText();
        String nome = textFieldNome.getText();
        String telefone = textFieldTelefone.getText();
    }

    private void updateCliente() {
        // Lógica para alterar cliente
        String rg = textFieldRG.getText();
        String cpf = textFieldCPF.getText();
        String nome = textFieldNome.getText();
        String telefone = textFieldTelefone.getText();
    }

    private void deleteCliente() {
        // Excluir cliente
        String cpf = textFieldCPF.getText();
    }

    private void searchCliente() {
        // Pesquisar cliente por CPF
        String cpf = textFieldCPF.getText();
    }

    public static void main(String[] args) {
        new ClienteGUI();
    }
}

