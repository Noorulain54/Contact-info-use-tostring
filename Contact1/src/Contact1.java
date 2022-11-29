
public class Contact1 {
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String phone;


    public Contact1(String fn, String ln, String ad, String em, String ph){
      firstname=fn;
      lastname= ln;
        address=ad;
        email=em;
        phone = ph;

    }

    //getters //setters
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String fn)
    {this.firstname =fn; }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String ln){this.lastname=ln;}
    public String setPhone(String ph) {
        return this.phone = ph;
    }
    public String getPhone() {
        return phone;
    }
    public String setEmail(String em) {
        return this.email = em;
    }
    public String getEmail() {
        return email;
    }
    public String setAddress(String ad) {
        return this.address= ad;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return("firstname : " +firstname+"\n lastname : "+lastname+"\naddress : " +address+"\n email : " +email+"\n phone : "+phone);}

}


