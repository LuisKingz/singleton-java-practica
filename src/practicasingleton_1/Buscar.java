package practicasingleton_1;

public class Buscar {

    private static Buscar objUnico;
    private String[][] datos = {{"Luis", "Acevedo", "12/12/1998", "123asd"},
                                {"David", "Ramirez", "10/10/1998", "456zxc"},
                                {"Alejandro", "Figueroa", "05/05/1995", "789qwe"}};

    private Buscar() {
    }

    public static Buscar getInstance() {
        if (objUnico == null) {
            objUnico = new Buscar();
        }
        return objUnico;
    }

    public void buscarCurp(String nombre, String apellido, String fecha) {
        for (int i = 0; i < datos.length; i++) {
            // for (int j = 0; j < datos[i].length; j++) {
            if (datos[i][0].equals(nombre) && datos[i][1].equals(
                    apellido) && datos[i][2].equals(fecha)) {
                System.out.println("Curp: " + datos[i][3]);
                break;
            }
            //  }
        }

    }
}
