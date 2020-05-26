package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de planes:");
        int tamanio=sc.nextInt();
        Municipalidad muni = new Municipalidad(tamanio);
        for (int i = 0; i < tamanio; i++) {
            sc.nextLine();
            System.out.print("Ingrese el nombre del contribuyente "+(i+1)+":");
            String nombre=sc.nextLine();
            System.out.print("Ingrese la deuda de "+nombre+" :");
            float deuda=sc.nextFloat();
            System.out.print("Ingrese la cantidad de cuotas del plan: ");
            int cuotas=sc.nextInt();
            Plan p=new Plan(nombre,deuda,cuotas);

        //CARGA DE DATOS POR PARTE DEL USUARIO
        
            System.out.print("Ingrese demora del pago: ");
            int demora=sc.nextInt();
            System.out.print("Ingrese importe del pago: ");
            float importe=sc.nextFloat();
            System.out.print("Ingrese intereses Adicionales: ");
            float interesesAdicionales=sc.nextFloat();

            Pago pa=new Pago(demora,importe,interesesAdicionales);
        
            muni.agregarPlan(p);
        
            System.out.println("La cantidad de planes pagados totalmente es de: "+muni.cantidadPlanesPagados());
            System.out.println("La sumatoria de deudas es de: "+muni.sumatoriaDeuda());
            System.out.println("Listado de Contribuyentes: "+muni.listadoPagosContribuyente(nombre));
            System.out.println("El promedio de intereses pagados por los contribuyentes es de: "+muni.promedioIntereses());
            System.out.println("Listado de pagos: "+pa.toString());
        }
    }
    
}