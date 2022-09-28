package br.pucminas.iecpucminas_javavskotlin;

public class EstudantePuc {
    private String uid;
    private String primeiroNome;
    private String ultimoNome;
    private String idade;

    public EstudantePuc(String uid,
                        String primeiroNome,
                        String ultimoNome,
                        String idade) {
        this.uid = uid;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.idade = idade;
    }

    public EstudantePuc() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstudantePuc)) return false;

        EstudantePuc that = (EstudantePuc) o;

        if (!getUid().equals(that.getUid())) return false;
        if (!getPrimeiroNome().equals(that.getPrimeiroNome())) return false;
        if (!getUltimoNome().equals(that.getUltimoNome())) return false;
        return getIdade().equals(that.getIdade());
    }

    @Override
    public int hashCode() {
        int result = getUid().hashCode();
        result = 31 * result + getPrimeiroNome().hashCode();
        result = 31 * result + getUltimoNome().hashCode();
        result = 31 * result + getIdade().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EstudantePuc{" +
                "uid='" + uid + '\'' +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}