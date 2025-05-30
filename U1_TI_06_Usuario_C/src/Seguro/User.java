package Seguro;

public class User {
    private String username;
    private String password = "";


    public String getUsername() {

        return username;
    }
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Username incorrecto");
        } else {
            this.username = username;
        }

    }
    public String getPassword() {

        return password;
    }
    public void setPassword(String password) {
         boolean mayuscula = false;
         boolean minuscula = false;
         boolean digito = false;

        if (password == null || password.length() < 8) {
            System.out.println("Debe tener 8 caracteres");

        }else{
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    mayuscula=true;
                }
                else if (Character.isLowerCase(c)) {
                    minuscula=true;
                }
                else if (Character.isDigit(c)) {
                    digito=true;

                }
            }
            if(mayuscula && minuscula && digito ){
                System.out.println("La contraseña es correcta");
                this.password = password;
            }else {
                System.out.println("La contraseña debe de tener mayúscula, minusculas y digitos");
            }

        }




    }
    public boolean checkPassword(String intento) {
        return password != null && password.equals(intento);



    }

}
