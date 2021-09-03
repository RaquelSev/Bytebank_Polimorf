//Gerente é um Funcionário, herda da class Funcionário
public class Gerente extends Funcionario {
    
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
       if(this.senha == senha){
           return true;
       } else {
           return false;
       }
    }

    //Reescrita do método - mesmo nome, mesmo retorno, mesmos parametros e mesma visibilidade - da classe mãe
    public double getBonificacao(){
        System.out.println("Chamando metodo bonificacao GERENTE");
        return super.getBonificacao() + super.getSalario(); //this é definido em cada classe, super quer dizer que vem da classe mãe - subir na hierarquia.  
    }
}
