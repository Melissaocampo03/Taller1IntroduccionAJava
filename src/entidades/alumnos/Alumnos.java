package entidades.alumnos;

public class Alumnos {

    private double notaseguimiento;
    private double notaparcial;
    private double notaexamen;

    public void setNotaSeguimiento(double notaseguimiento) {
        this.notaseguimiento = notaseguimiento;
    }

    public double getNotaSeguimiento() {
        return notaseguimiento;
    }

    public void setNotaParcial(double notaparcial) {
        this.notaparcial = notaparcial;
    }

    public double getNotaparcial() {
        return notaparcial;
    }

    public void setNotaExamen(double notaexamen) {
        this.notaexamen = notaexamen;
    }

    public double getNotaexamen() {
        return notaexamen;
    }
    public double calificacionfinal(){
        return ((this.getNotaSeguimiento()*0.4)+(this.getNotaparcial()*0.3)+(this.getNotaexamen()*0.3));
    }
}
