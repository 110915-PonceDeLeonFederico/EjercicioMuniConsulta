package principal;

public class Municipalidad {
    private Plan[] planes;
    
    public Municipalidad(int tamanio){
        planes=new Plan[tamanio];
    }
    public void agregarPlan(Plan plan){
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]==null) {
                planes[i]=plan;
                break;//Una vez q almaceno el plan sale del for y del metodo.
            }
        }
    }
    public int cantidadPlanesPagados(){
        int cantidad=0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]!=null) {
                if (planes[i].estaPagadoTotalmente()) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
    public double promedioIntereses(){
        double totalIntereses=0;
        int contadorPlanes=0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]!=null) {
                totalIntereses+=planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
        }
        return (double)totalIntereses/contadorPlanes;
    }
    public double sumatoriaDeuda(){
        double sumDeuda=0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]!=null) {
                sumDeuda+=planes[i].getDeuda();
            }
        }
        return sumDeuda;
    }
    public String listadoPagosContribuyente(String nombre){
        String listPagoCont="";
        for (int i = 0; i < planes.length; i++) {
            if (planes[i]!= null) {
                listPagoCont=planes[i].getNombre();
            }
        }
        return listPagoCont;
    }
}
