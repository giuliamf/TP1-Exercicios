import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChamadoGUI {
    private JFrame frame;
    private JTextField textFieldData;
    private JTextField textFieldTipo;
    private JTextField textFieldOrigem;
    private JTextField textFieldDestino;
    private JTextField textFieldPartida;
    private JTextField textFieldRetorno;
    private JTextField textFieldKmInicial;
    private JTextField textFieldKmFinal;
    private JTextField textFieldValorTotal;
    private JButton btnSave;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnSearch;

    public ChamadoGUI() {
        frame = new JFrame("Realização de Chamado");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 20, 80, 25);
        frame.add(lblData);

        textFieldData = new JTextField();
        textFieldData.setBounds(100, 20, 160, 25);
        frame.add(textFieldData);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(10, 60, 80, 25);
        frame.add(lblTipo);

        textFieldTipo = new JTextField();
        textFieldTipo.setBounds(100, 60, 160, 25);
        frame.add(textFieldTipo);

        JLabel lblOrigem = new JLabel("Origem:");
        lblOrigem.setBounds(10, 100, 80, 25);
        frame.add(lblOrigem);

        textFieldOrigem = new JTextField();
        textFieldOrigem.setBounds(100, 100, 160, 25);
        frame.add(textFieldOrigem);

        JLabel lblDestino = new JLabel("Destino:");
        lblDestino.setBounds(10, 140, 80, 25);
        frame.add(lblDestino);

        textFieldDestino = new JTextField();
        textFieldDestino.setBounds(100, 140, 160, 25);
        frame.add(textFieldDestino);

        JLabel lblPartida = new JLabel("Horário de partida:");
        lblPartida.setBounds(10, 180, 80, 25);
        frame.add(lblPartida);

        textFieldPartida = new JTextField();
        textFieldPartida.setBounds(100, 180, 160, 25);
        frame.add(textFieldPartida);

        JLabel lblRetorno = new JLabel("Retorno:");
        lblRetorno.setBounds(10, 220, 80, 25);
        frame.add(lblRetorno);

        textFieldRetorno = new JTextField();
        textFieldRetorno.setBounds(100, 220, 160, 25);
        frame.add(textFieldRetorno);

        JLabel lblKmInicial = new JLabel("Km Inicial:");
        lblKmInicial.setBounds(10, 260, 80, 25);
        frame.add(lblKmInicial);

        textFieldKmInicial = new JTextField();
        textFieldKmInicial.setBounds(100, 260, 160, 25);
        frame.add(textFieldKmInicial);

        JLabel lblKmFinal = new JLabel("Km Final:");
        lblKmFinal.setBounds(10, 300, 80, 25);
        frame.add(lblKmFinal);

        textFieldKmFinal = new JTextField();
        textFieldKmFinal.setBounds(100, 300, 160, 25);
        frame.add(textFieldKmFinal);

        JLabel lblValorTotal = new JLabel("Valor Total:");
        lblValorTotal.setBounds(10, 340, 80, 25);
        frame.add(lblValorTotal);

        textFieldValorTotal = new JTextField();
        textFieldValorTotal.setBounds(100, 340, 160, 25);
        frame.add(textFieldValorTotal);

        btnSave = new JButton("Salvar");
        btnSave.setBounds(10, 380, 80, 25);
        frame.add(btnSave);

        btnUpdate = new JButton("Alterar");
        btnUpdate.setBounds(100, 380, 80, 25);
        frame.add(btnUpdate);

        btnDelete = new JButton("Excluir");
        btnDelete.setBounds(190, 380, 80, 25);
        frame.add(btnDelete);

        btnSearch = new JButton("Pesquisar");
        btnSearch.setBounds(280, 380, 80, 25);
        frame.add(btnSearch);

        frame.setVisible(true);

        // Eventos dos botões
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para salvar chamado
                saveChamado();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para alterar chamado
                updateChamado();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para excluir chamado
                deleteChamado();
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para pesquisar chamado por data
                searchChamado();
            }
        });
    }

    private void saveChamado() {
        // Lógica para salvar chamado
        String data = textFieldData.getText();
        String tipo = textFieldTipo.getText();
        String origem = textFieldOrigem.getText();
        String destino = textFieldDestino.getText();
        float partida = Float.parseFloat(textFieldPartida.getText());
        float retorno = Float.parseFloat(textFieldRetorno.getText());
        double kmInicial = Double.parseDouble(textFieldKmInicial.getText());
        double kmFinal = Double.parseDouble(textFieldKmFinal.getText());
        double valorTotal = Double.parseDouble(textFieldValorTotal.getText());
        // Salvar no banco de dados ou lista
    }

    private void updateChamado() {
        // Lógica para alterar chamado
        String data = textFieldData.getText();
        String tipo = textFieldTipo.getText();
        String origem = textFieldOrigem.getText();
        String destino = textFieldDestino.getText();
        float partida = Float.parseFloat(textFieldPartida.getText());
        float retorno = Float.parseFloat(textFieldRetorno.getText());
        double kmInicial = Double.parseDouble(textFieldKmInicial.getText());
        double kmFinal = Double.parseDouble(textFieldKmFinal.getText());
        double valorTotal = Double.parseDouble(textFieldValorTotal.getText());
        // Atualizar no banco de dados ou lista
    }

    private void deleteChamado() {
        // Lógica para excluir chamado
        String data = textFieldData.getText();
        // Excluir do banco de dados ou lista
    }

    private void searchChamado() {
        // Lógica para pesquisar chamado por data
        String data = textFieldData.getText();
        // Buscar no banco de dados ou lista
    }

    public static void main(String[] args) {
        new ChamadoGUI();
    }
}
