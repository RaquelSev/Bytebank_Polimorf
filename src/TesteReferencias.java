public class TesteReferencias {

    public static void main(String[] args) {

        Funcionario g3 = new Gerente();//Todo Gerente é um funcionario
       
        // Mas nem todo FUncionario é gerente, ou seja, seria incorreto usar:
        //Gerente g3 = new Funcionario ();

        g3.setNome("Marcos");
        String nome = g3.getNome();

        //Se eu chamar um método do gerente, ele nao funciona, so os que estao em funcionario
        //Exemplo o método autentica pois a referencia é funcionario
        //Polimorfismo - duas referencias para o mesmo objeto - duas formas de chegar no mesmo objeto

        System.out.println(nome);

        Gerente g4 = new Gerente();
        g4.setNome("Marcos");
        g4.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);
        
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer ds = new Designer();
        ds.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g4);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(ds);

        System.out.println(controle.getSoma());
    }
}
