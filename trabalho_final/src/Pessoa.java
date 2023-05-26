public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private float peso;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String email, float peso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
