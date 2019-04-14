package Airport;

import java.util.Date;

public class BoardingPass {

    private Date dateExpire;
    private int number;

    public BoardingPass(Date dateExpire, int number) {
        this.dateExpire = dateExpire;
        this.number = number;
    }

    public BoardingPass(int i) {
        this.dateExpire = dateExpire;
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
