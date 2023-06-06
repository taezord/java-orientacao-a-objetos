package handsOnOne;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(70, 1.75);
        Paciente paciente2 = new Paciente(55, 1.60);
        Paciente paciente3 = new Paciente(99, 1.80);

        System.out.println("Paciente 1:");
        System.out.println("IMC: " + paciente1.formatarIMC(paciente1.calcularIMC()));
        System.out.println("Diagnóstico: " + paciente1.diagnostico());

        System.out.println("\nPaciente 2:");
        System.out.println("IMC: " + paciente2.formatarIMC(paciente2.calcularIMC()));
        System.out.println("Diagnóstico: " + paciente2.diagnostico());

        System.out.println("\nPaciente 3:");
        System.out.println("IMC: " + paciente3.formatarIMC(paciente3.calcularIMC()));
        System.out.println("Diagnóstico: " + paciente3.diagnostico());
    }
}