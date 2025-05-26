// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import compu.Computer;
public class Main {

    public static void main(String[] args) throws Exception {

        Computer ma= new Computer();
        ma.setEncender();
        ma.setEncender();
        ma.setModelo("Licuadora");
        ma.setApagar();

        System.out.println(ma.getModelo());
        System.out.println(ma.getMarca());
        System.out.println(ma.getStatus());







    }
}