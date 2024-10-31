public class Doctor extends SalariedEmployee {
    private String Specialty;
    private double Visit_fee;

    public Doctor(String fn,String ln,String hd,double s,String specialty,double visit_fee)
    {
        super(fn,ln,hd,s);
        setSpecialty(specialty);
        setVisit_fee(visit_fee);
    }

    public double getVisit_fee() {
        return Visit_fee;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public void setVisit_fee(double visit_fee) {
        Visit_fee = visit_fee;
    }
}
