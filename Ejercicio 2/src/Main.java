import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DocenteInvestigador d = new DocenteInvestigador();

        System.out.print("Codigo ");
        d.setCodigo(sc.nextLine());

        System.out.print("Nombre ");
        d.setNombre(sc.nextLine());

        System.out.print("Edad ");
        d.setEdad(sc.nextInt());

        System.out.print("Horas de clase ");
        d.setHorasClase(sc.nextInt());

        System.out.print("Valor por hora ");
        d.setValorHora(sc.nextDouble());

        System.out.print("Publicaciones ");
        d.setPublicaciones(sc.nextInt());

        PersonaAcademica p = d;

        p.mostrarDatos();
        p.describirRol();
        System.out.println("Pago final " + p.calcularPago());

        DocenteInvestigador ref = (DocenteInvestigador) p;
        System.out.println("Pago con bono extra " + ref.calcularPago(50));
    }
}