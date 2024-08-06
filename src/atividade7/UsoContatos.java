import java.util.ArrayList;
import java.util.Scanner;

abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return "Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "\nAniversário: " + aniversario;
    }

    public abstract String imprimirContato();

}

class Amigo extends Contato {
    private int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }
    public void setGrau(int grau) {
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String grauAmizade = switch (grau) {
            case 1 -> "Melhor Amigo";
            case 2 -> "Amigo";
            case 3 -> "Conhecido";
            default -> "";
        };
        return imprimirBasico() + "\nGrau: " + grauAmizade;
    }
}

class Familia extends Contato {
    private String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nParentesco: " + parentesco;
    }
}

class ColegasDeTrabalho extends Contato {
    private String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nRelacionamento de trabalho: " + tipo;
    }
}

public class UsoContatos {
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int opcao = scanner.nextInt();
            if (opcao == 8) {
                break;
            }

            switch (opcao) {
                case 1:
                    int subtipo = scanner.nextInt();

                    String nome = scanner.next();
                    String apelido = scanner.next();
                    String email = scanner.next();
                    String aniversario = scanner.next();

                    switch (subtipo) {
                        case 1:
                            int grau = scanner.nextInt();
                            listaContatos.add(new Amigo(nome, apelido, email, aniversario, grau));
                            break;
                        case 2:
                            String parentesco = scanner.next();
                            listaContatos.add(new Familia(nome, apelido, email, aniversario, parentesco));
                            break;
                        case 3:
                            String tipo = scanner.next();
                            listaContatos.add(new ColegasDeTrabalho(nome, apelido, email, aniversario, tipo));
                            break;
                    }
                    break;

                case 2:
                    for (Contato contato : listaContatos) {
                        System.out.println(contato.imprimirContato());
                    }
                    break;

                case 3:
                    for (Contato contato : listaContatos) {
                        if (contato instanceof Familia) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 4:
                    for (Contato contato : listaContatos) {
                        if (contato instanceof Amigo) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 5:
                    for (Contato contato : listaContatos) {
                        if (contato instanceof ColegasDeTrabalho) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 6:
                    for (Contato contato : listaContatos) {
                        if ((contato instanceof Amigo && ((Amigo) contato).getGrau() == 1) ||
                                (contato instanceof Familia && ((Familia) contato).getParentesco().equals("irmão")) ||
                                (contato instanceof ColegasDeTrabalho && ((ColegasDeTrabalho) contato).getTipo().equals("colega"))) {
                            System.out.println(contato.imprimirContato());
                        }
                    }
                    break;

                case 7:
                    int indice = scanner.nextInt();
                    System.out.println(listaContatos.get(indice-1).imprimirContato());
                    break;
            }
        }
    }
}
