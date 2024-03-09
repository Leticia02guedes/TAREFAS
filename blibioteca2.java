public class blibioteca2 {

import java.util.ArrayList;
import java.util.List;

// Classe Livro
class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

// Classe Usuario
class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Aluno
class Aluno extends Usuario {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}

// Classe Professor
class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}

// Classe Biblioteca
class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
    }

    public void listarUsuarios() {
        System.out.println("Lista de Usuários:");
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Aluno) {
                Aluno aluno = (Aluno) usuario;
                System.out.println("Aluno: " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            } else if (usuario instanceof Professor) {
                Professor professor = (Professor) usuario;
                System.out.println(
                        "Professor: " + professor.getNome() + " (Departamento: " + professor.getDepartamento() + ")");
            }
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("Java Programming", "John Smith");
        Livro livro2 = new Livro("Python Programming", "Alice Johnson");

        // Criando alguns usuários
        Aluno aluno1 = new Aluno("João", 12345);
        Aluno aluno2 = new Aluno("Maria", 67890);
        Professor professor1 = new Professor("Carlos", "Ciência da Computação");

        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros e usuários à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarUsuario(aluno1);
        biblioteca.adicionarUsuario(aluno2);
        biblioteca.adicionarUsuario(professor1);

        // Listando livros e usuários da biblioteca
        biblioteca.listarLivros();
        System.out.println();
        biblioteca.listarUsuarios();
    }
}

}
