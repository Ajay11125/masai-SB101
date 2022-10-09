package SB101_day1_assignment;

class Emplyee_Bean implements Comparable<Emplyee_Bean>{
        private int EmpId;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    private String EmpName;
        private String Address;
        private int Salary;
        public Emplyee_Bean(int empid,String empName,String address,int Salary){
            this.EmpId=empid;
            this.EmpName=empName;
            this.Address=address;
            this.Salary=Salary;
        }

    @Override
    public String toString() {
        return "{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", Address='" + Address + '\'' +
                ", Salary=" + Salary +
                '}'+ '\n';
    }

    @Override
    public int compareTo(Emplyee_Bean obj) {
            Emplyee_Bean S1=this;
            Emplyee_Bean S2= obj;
            if(S1.getEmpId()> S2.getEmpId()){
                return +1;
            } else if (S1.getEmpId()< S2.getEmpId()){
                return -1;
            }
            else{
                return 0;
            }

    }

}
