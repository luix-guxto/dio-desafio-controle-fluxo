class DesafioControleFluxo{
    public static void main(String[] args) {
        System.out.println("Insira o primeiro parametro:");
        Integer numero1 = lerNumero();
        System.out.println("Insira o segundo parametro deve ser maior que o primeiro:");
        Integer numero2 = lerNumero();

        try{
            contar(numero1, numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static Integer lerNumero(){
        boolean numeroValido = false;
        while(!numeroValido){
            try{
                System.out.println("Digite um numero: ");
                Integer numero = Integer.parseInt(System.console().readLine());
                return numero;
            }catch(NumberFormatException e){
                System.out.println("Numero invalido, tente novamente.");
                numeroValido = false;
            }
        }
        return 0;
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm < parametroDois){
            for(int i = 0; i <= parametroDois-parametroUm; i++){
                System.out.println("Imprimindo o numero: "+i);
            }
        }else{
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
    }
}
