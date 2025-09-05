import java.util.Scanner;

public class Main {

    private final static Scanner  scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");


        var option = -1;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1: petMachine.takeAShower();
                    break;
                case 2: setWater();
                    break;
                case 3: setShampoo();
                    break;
                case 4: verifyWater();
                    break;
                case 5: verifyShampoo();
                    break;
                case 6: checkIfHasPetInMachine();
                    break;
                case 7: setPetInPetMachine();
                    break;
                case 8: petMachine.removePet();
                    break;
                case 9: petMachine.wash();
                    break;
                case 0: System.exit(0);
                    break;
                default: System.out.println("Opção Inválida");
                    break;
            }
        } while (true);
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento " + amount + " litro(s) de água");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento " + amount + " litro(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while(name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}