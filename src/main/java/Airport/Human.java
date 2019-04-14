package Airport;

public  class Human {
    protected String name;
    protected String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human (){

        this. name = "";
        this.surname = "";
    }


    public void setName(String newName) {name = newName;}
    public String getName(){ return name;}
    public void setSurname(String newSurname){surname = newSurname;}
    public String getSurname(){ return surname;}

}
