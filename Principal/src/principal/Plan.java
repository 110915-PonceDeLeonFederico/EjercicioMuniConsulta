
package principal;

public class Plan {
    private String nombre;
    private float deuda;
    private int cuotas;
    private Pago[] pagos;
    
    public Plan(String nombre, float deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos=new Pago[cuotas];//Dimensiono el tamaño del vector de pagos
    }
    public String getNombre() {
        return nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }
    public void agregarPago(Pago pago){
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i]= pago;
                break;
            }
        }
    }
    public boolean estaPagadoTotalmente(){
        boolean estaPago=true;
        
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i]==null) {
                estaPago=false;
                break;
            }
        }
        return estaPago; 
    }
    public double sumaInteresesCobrados(){
        double sumaIntereses=0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i]!=null) {
                if (pagos[i].getDemora()>0) {
                    sumaIntereses+=pagos[i].getDemora()*pagos[i].getInteresesAdicionales()*pagos[i].getImporte();
                }
            }
            
        }
        return sumaIntereses;
    }
    public int cantidadPagos(){
        return pagos.length;
    }
    
    
    
    
}