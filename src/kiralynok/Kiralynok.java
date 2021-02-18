package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
        //4.Feladat:
        System.out.println("Ez a negyedik feladatnak a megvalósítása:");
        Tabla tabla=new Tabla('#');
        tabla.megjelenit();
        
        //6. feladat:
        System.out.println("Ez a a hatodik feladatnak a megvalósítása");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
