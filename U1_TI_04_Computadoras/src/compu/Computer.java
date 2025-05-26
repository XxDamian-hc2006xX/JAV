package compu;

public class Computer {

    private String marca = "HP";
    private String modelo;
    private boolean encendida = false;


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncender() {
        if (encendida == false) {
            System.out.println("Encendiendo...");
            this.encendida = true;

        }
    }
    public void setApagar() {
        if (encendida == true) {
            System.out.println("Apagando...");
            this.encendida = false;
        }
    }

    public String getMarca() {
        return marca;
    }
    public boolean getStatus() {
        return encendida;
    }



}
