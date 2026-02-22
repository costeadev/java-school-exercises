package exams.mar2024.ej2;

public class Main {
    public static void main(String[] args) {

        CriaturaMistica[] criaturas = {
            new Dragon("Paco", 69, 10),
            new Unicornio("Samuel", 777, 47),
                new Unicornio("Guillermo", 666, 69),
            new Elfo("Frieren", 300, 7)
        };

        for (CriaturaMistica c : criaturas) {
            c.describirCriatura();
            System.out.println();
            if (c instanceof Elfo elfo) {
                elfo.activarPoder();
            }
        }
    }
}
