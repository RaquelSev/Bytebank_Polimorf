public class ControleBonificacao {

    private double soma;

    //Como gerente e editor de video sao funcionarios, posso usar a referencia mais generica para usar o método - eles herdam
    //O metodo que será chamado sera o da classe que está chamando
    public void registra(Funcionario g){
        double bonif = g.getBonificacao();
        this.soma += bonif;
     }

    public double getSoma(){
        return soma;
    }
}