package aula_04;

public class Professor extends Pessoa  {

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;
    public void calcularSalario(){
        salario = 300 * 40;

    }
}
