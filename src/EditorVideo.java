public class EditorVideo extends Funcionario {
   
    public double getBonificacao() {
        System.out.println("Método editor de video");
        return super.getBonificacao() + 100  ;
    }
}
