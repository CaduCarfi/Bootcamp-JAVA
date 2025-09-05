public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 30) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar pet é necessário limpa-la");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há nenhum pet na máquina para remover.");
            return;
        }

        String petName = this.pet.getName(); // salva o nome ANTES de remover
        this.clean = this.pet.isClean();
        this.pet = null;

        System.out.println("O pet " + petName + " foi removido da máquina");
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }

}
